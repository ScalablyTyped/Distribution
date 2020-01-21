package typings.expoLocalization.localizationTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Localization extends js.Object {
  var isRTL: Boolean
  var isoCurrencyCodes: js.UndefOr[js.Array[String]] = js.undefined
  var locale: String
  var locales: js.Array[String]
  var region: js.UndefOr[String] = js.undefined
  var timezone: String
}

object Localization {
  @scala.inline
  def apply(
    isRTL: Boolean,
    locale: String,
    locales: js.Array[String],
    timezone: String,
    isoCurrencyCodes: js.Array[String] = null,
    region: String = null
  ): Localization = {
    val __obj = js.Dynamic.literal(isRTL = isRTL.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], locales = locales.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    if (isoCurrencyCodes != null) __obj.updateDynamic("isoCurrencyCodes")(isoCurrencyCodes.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Localization]
  }
}

