package typings.formatjsEcma402Abstract.numberMod

import typings.formatjsEcma402Abstract.anon.FnCallValue
import typings.std.Intl.PluralRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumberFormatInternal extends NumberFormatDigitInternalSlots {
  
  var boundFormat: js.UndefOr[FnCallValue] = js.native
  
  var compactDisplay: NumberFormatOptionsCompactDisplay = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: NumberFormatOptionsCurrencyDisplay = js.native
  
  var currencySign: NumberFormatOptionsCurrencySign = js.native
  
  var dataLocale: String = js.native
  
  var dataLocaleData: NumberFormatLocaleInternalData = js.native
  
  var locale: String = js.native
  
  @JSName("notation")
  var notation_NumberFormatInternal: NumberFormatOptionsNotation = js.native
  
  var numberingSystem: String = js.native
  
  var pl: PluralRules = js.native
  
  var signDisplay: NumberFormatOptionsSignDisplay = js.native
  
  var style: NumberFormatOptionsStyle = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: NumberFormatOptionsUnitDisplay = js.native
  
  var useGrouping: Boolean = js.native
}
object NumberFormatInternal {
  
  @scala.inline
  def apply(
    compactDisplay: NumberFormatOptionsCompactDisplay,
    currencyDisplay: NumberFormatOptionsCurrencyDisplay,
    currencySign: NumberFormatOptionsCurrencySign,
    dataLocale: String,
    dataLocaleData: NumberFormatLocaleInternalData,
    locale: String,
    minimumIntegerDigits: Double,
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    pl: PluralRules,
    roundingType: NumberFormatRoundingType,
    signDisplay: NumberFormatOptionsSignDisplay,
    style: NumberFormatOptionsStyle,
    unitDisplay: NumberFormatOptionsUnitDisplay,
    useGrouping: Boolean
  ): NumberFormatInternal = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], dataLocale = dataLocale.asInstanceOf[js.Any], dataLocaleData = dataLocaleData.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], pl = pl.asInstanceOf[js.Any], roundingType = roundingType.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatInternal]
  }
  
  @scala.inline
  implicit class NumberFormatInternalOps[Self <: NumberFormatInternal] (val x: Self) extends AnyVal {
    
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
    def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = this.set("currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = this.set("currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocale(value: String): Self = this.set("dataLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLocaleData(value: NumberFormatLocaleInternalData): Self = this.set("dataLocaleData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = this.set("notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = this.set("numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPl(value: PluralRules): Self = this.set("pl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = this.set("signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: NumberFormatOptionsStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = this.set("unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundFormat(value: FnCallValue): Self = this.set("boundFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundFormat: Self = this.set("boundFormat", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
  }
}
