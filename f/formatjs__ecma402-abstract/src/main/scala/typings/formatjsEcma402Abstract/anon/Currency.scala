package typings.formatjsEcma402Abstract.anon

import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsCompactDisplay
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsCurrencySign
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsNotation
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsStyle
import typings.formatjsEcma402Abstract.libTypesNumberMod.NumberFormatOptionsUnitDisplay
import typings.formatjsEcma402Abstract.libTypesNumberMod.UseGroupingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currency extends StObject {
  
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.undefined
  
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] = js.undefined
  
  var notation: NumberFormatOptionsNotation
  
  var numberingSystem: String
  
  var style: NumberFormatOptionsStyle
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] = js.undefined
  
  var useGrouping: js.UndefOr[UseGroupingType] = js.undefined
}
object Currency {
  
  inline def apply(notation: NumberFormatOptionsNotation, numberingSystem: String, style: NumberFormatOptionsStyle): Currency = {
    val __obj = js.Dynamic.literal(notation = notation.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
    
    inline def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setNotation(value: NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: UseGroupingType): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
