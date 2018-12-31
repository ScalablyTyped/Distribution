package typings
package expressDashValidatorLib.checkCheckMod.ValidatorOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defaults to
  * {
  *   symbol: '$',
  *   require_symbol: false,
  *   allow_space_after_symbol: false,
  *   symbol_after_digits: false,
  *   allow_negatives: true,
  *   parens_for_negatives: false,
  *   negative_sign_before_digits: false,
  *   negative_sign_after_digits: false,
  *   allow_negative_sign_placeholder: false,
  *   thousands_separator: ',',
  *   decimal_separator: '.',
  *   allow_space_after_digits: false
  * }
  */
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

