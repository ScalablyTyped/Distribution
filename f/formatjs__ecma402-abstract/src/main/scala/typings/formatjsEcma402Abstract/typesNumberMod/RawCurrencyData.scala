package typings.formatjsEcma402Abstract.typesNumberMod

import typings.formatjsEcma402Abstract.anon.RecordDecimalFormatNumLDM1000
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawCurrencyData extends StObject {
  
  var accounting: String
  
  var currencySpacing: CurrencySpacingData
  
  var short: js.UndefOr[RecordDecimalFormatNumLDM1000] = js.undefined
  
  var standard: String
  
  var unitPattern: String
}
object RawCurrencyData {
  
  inline def apply(accounting: String, currencySpacing: CurrencySpacingData, standard: String, unitPattern: String): RawCurrencyData = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], currencySpacing = currencySpacing.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], unitPattern = unitPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCurrencyData]
  }
  
  extension [Self <: RawCurrencyData](x: Self) {
    
    inline def setAccounting(value: String): Self = StObject.set(x, "accounting", value.asInstanceOf[js.Any])
    
    inline def setCurrencySpacing(value: CurrencySpacingData): Self = StObject.set(x, "currencySpacing", value.asInstanceOf[js.Any])
    
    inline def setShort(value: RecordDecimalFormatNumLDM1000): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    inline def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    inline def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    inline def setUnitPattern(value: String): Self = StObject.set(x, "unitPattern", value.asInstanceOf[js.Any])
  }
}
