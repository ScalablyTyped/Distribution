package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a mapping from locales to translations of a given string. Each property is an optional five-character Facebook locale code of the form xx_XX.
  * See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale codes.
  */
trait LocalizationsDict
  extends /* x */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object LocalizationsDict {
  @scala.inline
  def apply(StringDictionary: /* x */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null): LocalizationsDict = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[LocalizationsDict]
  }
}

