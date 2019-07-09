package typings
package expressDashValidatorLib.srcOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsCurrencyOptions extends js.Object {
  var allow_decimal: js.UndefOr[scala.Boolean] = js.undefined
  var allow_negative_sign_placeholder: js.UndefOr[scala.Boolean] = js.undefined
  var allow_negatives: js.UndefOr[scala.Boolean] = js.undefined
  var allow_space_after_digits: js.UndefOr[scala.Boolean] = js.undefined
  var allow_space_after_symbol: js.UndefOr[scala.Boolean] = js.undefined
  var decimal_separator: js.UndefOr[java.lang.String] = js.undefined
  var digits_after_decimal: js.UndefOr[js.Array[scala.Double]] = js.undefined
  var negative_sign_after_digits: js.UndefOr[scala.Boolean] = js.undefined
  var negative_sign_before_digits: js.UndefOr[scala.Boolean] = js.undefined
  var parens_for_negatives: js.UndefOr[scala.Boolean] = js.undefined
  var require_decimal: js.UndefOr[scala.Boolean] = js.undefined
  var require_symbol: js.UndefOr[scala.Boolean] = js.undefined
  var symbol: js.UndefOr[java.lang.String] = js.undefined
  var symbol_after_digits: js.UndefOr[scala.Boolean] = js.undefined
  var thousands_separator: js.UndefOr[java.lang.String] = js.undefined
}

object IsCurrencyOptions {
  @scala.inline
  def apply(
    allow_decimal: js.UndefOr[scala.Boolean] = js.undefined,
    allow_negative_sign_placeholder: js.UndefOr[scala.Boolean] = js.undefined,
    allow_negatives: js.UndefOr[scala.Boolean] = js.undefined,
    allow_space_after_digits: js.UndefOr[scala.Boolean] = js.undefined,
    allow_space_after_symbol: js.UndefOr[scala.Boolean] = js.undefined,
    decimal_separator: java.lang.String = null,
    digits_after_decimal: js.Array[scala.Double] = null,
    negative_sign_after_digits: js.UndefOr[scala.Boolean] = js.undefined,
    negative_sign_before_digits: js.UndefOr[scala.Boolean] = js.undefined,
    parens_for_negatives: js.UndefOr[scala.Boolean] = js.undefined,
    require_decimal: js.UndefOr[scala.Boolean] = js.undefined,
    require_symbol: js.UndefOr[scala.Boolean] = js.undefined,
    symbol: java.lang.String = null,
    symbol_after_digits: js.UndefOr[scala.Boolean] = js.undefined,
    thousands_separator: java.lang.String = null
  ): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_decimal)) __obj.updateDynamic("allow_decimal")(allow_decimal)
    if (!js.isUndefined(allow_negative_sign_placeholder)) __obj.updateDynamic("allow_negative_sign_placeholder")(allow_negative_sign_placeholder)
    if (!js.isUndefined(allow_negatives)) __obj.updateDynamic("allow_negatives")(allow_negatives)
    if (!js.isUndefined(allow_space_after_digits)) __obj.updateDynamic("allow_space_after_digits")(allow_space_after_digits)
    if (!js.isUndefined(allow_space_after_symbol)) __obj.updateDynamic("allow_space_after_symbol")(allow_space_after_symbol)
    if (decimal_separator != null) __obj.updateDynamic("decimal_separator")(decimal_separator)
    if (digits_after_decimal != null) __obj.updateDynamic("digits_after_decimal")(digits_after_decimal)
    if (!js.isUndefined(negative_sign_after_digits)) __obj.updateDynamic("negative_sign_after_digits")(negative_sign_after_digits)
    if (!js.isUndefined(negative_sign_before_digits)) __obj.updateDynamic("negative_sign_before_digits")(negative_sign_before_digits)
    if (!js.isUndefined(parens_for_negatives)) __obj.updateDynamic("parens_for_negatives")(parens_for_negatives)
    if (!js.isUndefined(require_decimal)) __obj.updateDynamic("require_decimal")(require_decimal)
    if (!js.isUndefined(require_symbol)) __obj.updateDynamic("require_symbol")(require_symbol)
    if (symbol != null) __obj.updateDynamic("symbol")(symbol)
    if (!js.isUndefined(symbol_after_digits)) __obj.updateDynamic("symbol_after_digits")(symbol_after_digits)
    if (thousands_separator != null) __obj.updateDynamic("thousands_separator")(thousands_separator)
    __obj.asInstanceOf[IsCurrencyOptions]
  }
}

