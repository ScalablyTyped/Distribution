package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsDecimalOptions extends js.Object {
  var decimal_digits: js.UndefOr[String] = js.undefined
  var force_decimal: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[AlphanumericLocale] = js.undefined
}

object IsDecimalOptions {
  @scala.inline
  def apply(
    decimal_digits: String = null,
    force_decimal: js.UndefOr[Boolean] = js.undefined,
    locale: AlphanumericLocale = null
  ): IsDecimalOptions = {
    val __obj = js.Dynamic.literal()
    if (decimal_digits != null) __obj.updateDynamic("decimal_digits")(decimal_digits.asInstanceOf[js.Any])
    if (!js.isUndefined(force_decimal)) __obj.updateDynamic("force_decimal")(force_decimal.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsDecimalOptions]
  }
}

