package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompactDisplay extends StObject {
  
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.native
  
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] = js.native
  
  var notation: NumberFormatOptionsNotation = js.native
  
  var numberingSystem: String = js.native
  
  var style: NumberFormatOptionsStyle = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] = js.native
  
  var useGrouping: Boolean = js.native
}
object CompactDisplay {
  
  @scala.inline
  def apply(
    notation: NumberFormatOptionsNotation,
    numberingSystem: String,
    style: NumberFormatOptionsStyle,
    useGrouping: Boolean
  ): CompactDisplay = {
    val __obj = js.Dynamic.literal(notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompactDisplay]
  }
  
  @scala.inline
  implicit class CompactDisplayMutableBuilder[Self <: CompactDisplay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
  }
}
