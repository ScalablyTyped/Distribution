package typings.formatjsEcma402Abstract.numberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Intl.NumberFormatOptions & @formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatDigitOptions & {  localeMatcher :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsLocaleMatcher | undefined,   style :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsStyle | undefined,   compactDisplay :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsCompactDisplay | undefined,   currencyDisplay :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsCurrencyDisplay | undefined,   currencySign :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsCurrencySign | undefined,   notation :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsNotation | undefined,   signDisplay :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsSignDisplay | undefined,   unit :string | undefined,   unitDisplay :@formatjs/ecma402-abstract.@formatjs/ecma402-abstract/lib/types/number.NumberFormatOptionsUnitDisplay | undefined,   numberingSystem :string | undefined} */
@js.native
trait NumberFormatOptions extends js.Object {
  
  var compactDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.native
  
  var currencySign: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign] = js.native
  
  var localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] = js.native
  
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  
  var notation: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation] = js.native
  
  var numberingSystem: js.UndefOr[String] = js.native
  
  var signDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay] = js.native
  
  var style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay] = js.native
  
  var useGrouping: js.UndefOr[Boolean] = js.native
}
object NumberFormatOptions {
  
  @scala.inline
  def apply(
    compactDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign],
    localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher],
    notation: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation],
    signDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay],
    style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay]
  ): NumberFormatOptions = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any])
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
    def setCompactDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay]): Self = this.set("compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay]): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySign(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign]): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcher(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher]): Self = this.set("localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation]): Self = this.set("notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay]): Self = this.set("signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay]): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
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
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberingSystem: Self = this.set("numberingSystem", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
}
