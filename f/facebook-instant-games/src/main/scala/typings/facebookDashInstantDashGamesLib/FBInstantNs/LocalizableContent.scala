package typings
package facebookDashInstantDashGamesLib.FBInstantNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a string with localizations and a default value to fall back on.
  */
trait LocalizableContent extends js.Object {
  /**
    * The default value of the string to use if the viewer's locale is not a key in the localizations object.
    */
  var default: java.lang.String
  /**
    *  Specifies what string to use for viewers in each locale. See https://origincache.facebook.com/developers/resources/?id=FacebookLocales.xml for a complete list of supported locale values.
    */
  var localizations: LocalizationsDict
}

