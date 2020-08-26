package typings.formatjsIntlNumberformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Intl.ResolvedNumberFormatOptions & std.Pick<@formatjs/intl-numberformat.@formatjs/intl-numberformat.NumberFormatInternal, 'currencySign' | 'unit' | 'unitDisplay' | 'notation' | 'compactDisplay' | 'signDisplay'> */
@js.native
trait ResolvedNumberFormatOptions extends js.Object {
  var compactDisplay: NumberFormatOptionsCompactDisplay = js.native
  var currency: js.UndefOr[String] = js.native
  var currencyDisplay: js.UndefOr[String] = js.native
  var currencySign: NumberFormatOptionsCurrencySign = js.native
  var locale: String = js.native
  var maximumFractionDigits: Double = js.native
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  var minimumFractionDigits: Double = js.native
  var minimumIntegerDigits: Double = js.native
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  var notation: NumberFormatOptionsNotation = js.native
  var numberingSystem: String = js.native
  var signDisplay: NumberFormatOptionsSignDisplay = js.native
  var style: String = js.native
  var unit: js.UndefOr[String] = js.native
  var unitDisplay: NumberFormatOptionsUnitDisplay = js.native
  var useGrouping: Boolean = js.native
}

object ResolvedNumberFormatOptions {
  @scala.inline
  def apply(
    compactDisplay: NumberFormatOptionsCompactDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    signDisplay: NumberFormatOptionsSignDisplay,
    style: String,
    unitDisplay: NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  @scala.inline
  implicit class ResolvedNumberFormatOptionsOps[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
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
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = this.set("notation", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = this.set("signDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setCurrencyDisplay(value: String): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyDisplay: Self = this.set("currencyDisplay", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
  
}

