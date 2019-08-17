package typings.facebookDashInstantDashGames

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FBInstantNs {
  import org.scalablytyped.runtime.StringDictionary

  type DataObject = StringDictionary[js.Any]
  type IncrementObject = StringDictionary[Double]
  /**
    * Represents a mapping from locales to translations of a given string. Each property is an optional five-character Facebook locale code of the form xx_XX.
    * See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale codes.
    */
  type LocalizationsDict = StringDictionary[String]
  type SignedPurchaseRequest = String
  type StatsObject = StringDictionary[Double]
}
