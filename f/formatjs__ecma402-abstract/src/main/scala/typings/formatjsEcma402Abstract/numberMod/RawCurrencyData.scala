package typings.formatjsEcma402Abstract.numberMod

import typings.formatjsEcma402Abstract.anon.RecordDecimalFormatNumLDM
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawCurrencyData extends StObject {
  
  var accounting: String
  
  var currencySpacing: CurrencySpacingData
  
  var short: js.UndefOr[RecordDecimalFormatNumLDM] = js.undefined
  
  var standard: String
  
  var unitPattern: String
}
object RawCurrencyData {
  
  @scala.inline
  def apply(accounting: String, currencySpacing: CurrencySpacingData, standard: String, unitPattern: String): RawCurrencyData = {
    val __obj = js.Dynamic.literal(accounting = accounting.asInstanceOf[js.Any], currencySpacing = currencySpacing.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any], unitPattern = unitPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawCurrencyData]
  }
  
  @scala.inline
  implicit class RawCurrencyDataMutableBuilder[Self <: RawCurrencyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccounting(value: String): Self = StObject.set(x, "accounting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySpacing(value: CurrencySpacingData): Self = StObject.set(x, "currencySpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShort(value: RecordDecimalFormatNumLDM): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    
    @scala.inline
    def setStandard(value: String): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPattern(value: String): Self = StObject.set(x, "unitPattern", value.asInstanceOf[js.Any])
  }
}
