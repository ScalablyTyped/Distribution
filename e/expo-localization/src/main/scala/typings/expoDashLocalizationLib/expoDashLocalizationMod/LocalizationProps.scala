package typings
package expoDashLocalizationLib.expoDashLocalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProps extends js.Object {
  /**
    * Country code for your device
    */
  var country: js.UndefOr[java.lang.String | scala.Null]
  /**
    * This will return `true` if the current language is Right-to-Left
    */
  var isRTL: scala.Boolean
  /**
    * A list of all the supported ISO codes
    */
  var isoCurrencyCodes: js.UndefOr[js.Array[java.lang.String] | scala.Null]
  /**
    * Native device language, returned in standard format. ex: `en-US`, `es-US`
    */
  var locale: java.lang.String
  /**
    * List of all the native languages provided by the user settings. These are returned in the order the user defines in their native settings
    */
  var locales: js.Array[java.lang.String]
  /**
    * The current time zone in display format. ex: `America/Los_Angeles`
    */
  var timezone: java.lang.String
}

