package typings.expressValidator.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsCurrencyOptions extends js.Object {
  var allow_decimal: js.UndefOr[Boolean] = js.native
  var allow_negative_sign_placeholder: js.UndefOr[Boolean] = js.native
  var allow_negatives: js.UndefOr[Boolean] = js.native
  var allow_space_after_digits: js.UndefOr[Boolean] = js.native
  var allow_space_after_symbol: js.UndefOr[Boolean] = js.native
  var decimal_separator: js.UndefOr[String] = js.native
  var digits_after_decimal: js.UndefOr[js.Array[Double]] = js.native
  var negative_sign_after_digits: js.UndefOr[Boolean] = js.native
  var negative_sign_before_digits: js.UndefOr[Boolean] = js.native
  var parens_for_negatives: js.UndefOr[Boolean] = js.native
  var require_decimal: js.UndefOr[Boolean] = js.native
  var require_symbol: js.UndefOr[Boolean] = js.native
  var symbol: js.UndefOr[String] = js.native
  var symbol_after_digits: js.UndefOr[Boolean] = js.native
  var thousands_separator: js.UndefOr[String] = js.native
}

object IsCurrencyOptions {
  @scala.inline
  def apply(): IsCurrencyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsCurrencyOptions]
  }
  @scala.inline
  implicit class IsCurrencyOptionsOps[Self <: IsCurrencyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_decimal(value: Boolean): Self = this.set("allow_decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_decimal: Self = this.set("allow_decimal", js.undefined)
    @scala.inline
    def setAllow_negative_sign_placeholder(value: Boolean): Self = this.set("allow_negative_sign_placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_negative_sign_placeholder: Self = this.set("allow_negative_sign_placeholder", js.undefined)
    @scala.inline
    def setAllow_negatives(value: Boolean): Self = this.set("allow_negatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_negatives: Self = this.set("allow_negatives", js.undefined)
    @scala.inline
    def setAllow_space_after_digits(value: Boolean): Self = this.set("allow_space_after_digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_space_after_digits: Self = this.set("allow_space_after_digits", js.undefined)
    @scala.inline
    def setAllow_space_after_symbol(value: Boolean): Self = this.set("allow_space_after_symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_space_after_symbol: Self = this.set("allow_space_after_symbol", js.undefined)
    @scala.inline
    def setDecimal_separator(value: String): Self = this.set("decimal_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimal_separator: Self = this.set("decimal_separator", js.undefined)
    @scala.inline
    def setDigits_after_decimalVarargs(value: Double*): Self = this.set("digits_after_decimal", js.Array(value :_*))
    @scala.inline
    def setDigits_after_decimal(value: js.Array[Double]): Self = this.set("digits_after_decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits_after_decimal: Self = this.set("digits_after_decimal", js.undefined)
    @scala.inline
    def setNegative_sign_after_digits(value: Boolean): Self = this.set("negative_sign_after_digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative_sign_after_digits: Self = this.set("negative_sign_after_digits", js.undefined)
    @scala.inline
    def setNegative_sign_before_digits(value: Boolean): Self = this.set("negative_sign_before_digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegative_sign_before_digits: Self = this.set("negative_sign_before_digits", js.undefined)
    @scala.inline
    def setParens_for_negatives(value: Boolean): Self = this.set("parens_for_negatives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParens_for_negatives: Self = this.set("parens_for_negatives", js.undefined)
    @scala.inline
    def setRequire_decimal(value: Boolean): Self = this.set("require_decimal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_decimal: Self = this.set("require_decimal", js.undefined)
    @scala.inline
    def setRequire_symbol(value: Boolean): Self = this.set("require_symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire_symbol: Self = this.set("require_symbol", js.undefined)
    @scala.inline
    def setSymbol(value: String): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setSymbol_after_digits(value: Boolean): Self = this.set("symbol_after_digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol_after_digits: Self = this.set("symbol_after_digits", js.undefined)
    @scala.inline
    def setThousands_separator(value: String): Self = this.set("thousands_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousands_separator: Self = this.set("thousands_separator", js.undefined)
  }
  
}

