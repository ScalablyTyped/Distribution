package typings.formatjsEcma402Abstract.typesNumberMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatLocaleInternalData extends StObject {
  
  var currencies: Record[String, CurrencyData]
  
  var nu: js.Array[String]
  
  var numbers: RawNumberData
  
  var units: UnitDataTable
}
object NumberFormatLocaleInternalData {
  
  inline def apply(
    currencies: Record[String, CurrencyData],
    nu: js.Array[String],
    numbers: RawNumberData,
    units: UnitDataTable
  ): NumberFormatLocaleInternalData = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatLocaleInternalData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberFormatLocaleInternalData] (val x: Self) extends AnyVal {
    
    inline def setCurrencies(value: Record[String, CurrencyData]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    inline def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
    
    inline def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value*))
    
    inline def setNumbers(value: RawNumberData): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: UnitDataTable): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
