package typings.formatjsIntlNumberformat.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Intl.NumberFormatOptions & @formatjs/intl-utils.@formatjs/intl-utils.NumberFormatDigitOptions & {  localeMatcher :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsLocaleMatcher | undefined,   style :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsStyle | undefined,   compactDisplay :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsCompactDisplay | undefined,   currencyDisplay :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsCurrencyDisplay | undefined,   currencySign :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsCurrencySign | undefined,   notation :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsNotation | undefined,   signDisplay :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsSignDisplay | undefined,   unit :string | undefined,   unitDisplay :@formatjs/intl-numberformat.@formatjs/intl-numberformat/src/types.NumberFormatOptionsUnitDisplay | undefined,   numberingSystem :string | undefined} */
@js.native
trait NumberFormatOptions extends js.Object {
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.native
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] = js.native
  var localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] = js.native
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: js.UndefOr[NumberFormatOptionsNotation] = js.native
  var numberingSystem: js.UndefOr[String] = js.native
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] = js.native
  var style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] = js.native
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object NumberFormatOptions {
  @scala.inline
  def apply(
    currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher],
    style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle]
  ): NumberFormatOptions = {
    val __obj = js.Dynamic.literal(currencyDisplay = currencyDisplay.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatOptions]
  }
  @scala.inline
  implicit class NumberFormatOptionsOps[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
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
    def setCurrencyDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay]): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocaleMatcher(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher]): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompactDisplay: Self = this.set("compactDisplay", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySign: Self = this.set("currencySign", js.undefined)
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotation: Self = this.set("notation", js.undefined)
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    @scala.inline
    def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = this.set("signDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignDisplay: Self = this.set("signDisplay", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitDisplay: Self = this.set("unitDisplay", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
  
}

