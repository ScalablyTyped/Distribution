package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type DataObject = StringDictionary[Any]

type IncrementObject = StringDictionary[Double]

/**
  * Represents a mapping from locales to translations of a given string. Each property is an optional five-character Facebook locale code of the form xx_XX.
  * See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale codes.
  */
type LocalizationsDict = StringDictionary[String]

/**
  * A function that will get called when user requested to capture a screenshot.
  *
  * @since 7.1
  */
type ScreenshotProvider = js.Function1[/* submitAsync */ ScreenshotSubmitter, Unit]

/**
  * A function that allows the game to submit a screenshot.
  *
  * @since 7.1
  */
type ScreenshotSubmitter = js.Function1[/* payload */ ScreenshotPayload, js.Promise[Unit]]

type SignedPurchaseRequest = String

type StatsObject = StringDictionary[Double]
