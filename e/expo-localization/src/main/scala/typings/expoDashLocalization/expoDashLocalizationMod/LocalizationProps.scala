package typings.expoDashLocalization.expoDashLocalizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalizationProps extends js.Object {
  /**
    * Country code for your device
    */
  var country: js.UndefOr[String | Null] = js.undefined
  /**
    * This will return `true` if the current language is Right-to-Left
    */
  var isRTL: Boolean
  /**
    * A list of all the supported ISO codes
    */
  var isoCurrencyCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  /**
    * Native device language, returned in standard format. ex: `en-US`, `es-US`
    */
  var locale: String
  /**
    * List of all the native languages provided by the user settings. These are returned in the order the user defines in their native settings
    */
  var locales: js.Array[String]
  /**
    * The current time zone in display format. ex: `America/Los_Angeles`
    */
  var timezone: String
}

object LocalizationProps {
  @scala.inline
  def apply(
    isRTL: Boolean,
    locale: String,
    locales: js.Array[String],
    timezone: String,
    country: String = null,
    isoCurrencyCodes: js.Array[String] = null
  ): LocalizationProps = {
    val __obj = js.Dynamic.literal(isRTL = isRTL, locale = locale, locales = locales, timezone = timezone)
    if (country != null) __obj.updateDynamic("country")(country)
    if (isoCurrencyCodes != null) __obj.updateDynamic("isoCurrencyCodes")(isoCurrencyCodes)
    __obj.asInstanceOf[LocalizationProps]
  }
}

