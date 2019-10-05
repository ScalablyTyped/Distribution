package typings.expoDashLocalization.expoDashLocalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-localization", "Localization")
@js.native
object Localization extends js.Object {
  /**
    * Country code for your device
    */
  val country: js.UndefOr[String | Null] = js.native
  /**
    * This will return `true` if the current language is Right-to-Left
    */
  val isRTL: Boolean = js.native
  /**
    * A list of all the supported ISO codes
    */
  val isoCurrencyCodes: js.UndefOr[js.Array[String] | Null] = js.native
  /**
    * Native device language, returned in standard format. ex: `en-US`, `es-US`
    */
  val locale: String = js.native
  /**
    * List of all the native languages provided by the user settings. These are returned in the order the user defines in their native settings
    */
  val locales: js.Array[String] = js.native
  /**
    * The current time zone in display format. ex: `America/Los_Angeles`
    */
  val timezone: String = js.native
  /**
    * Android only, on iOS changing the locale settings will cause all the apps to reset
    */
  def getLocalizationAsync(): js.Promise[LocalizationProps] = js.native
}

