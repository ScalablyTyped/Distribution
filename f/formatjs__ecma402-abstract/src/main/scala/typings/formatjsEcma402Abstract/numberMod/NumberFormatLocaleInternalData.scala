package typings.formatjsEcma402Abstract.numberMod

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
  
  @scala.inline
  def apply(
    currencies: Record[String, CurrencyData],
    nu: js.Array[String],
    numbers: RawNumberData,
    units: UnitDataTable
  ): NumberFormatLocaleInternalData = {
    val __obj = js.Dynamic.literal(currencies = currencies.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatLocaleInternalData]
  }
  
  @scala.inline
  implicit class NumberFormatLocaleInternalDataMutableBuilder[Self <: NumberFormatLocaleInternalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencies(value: Record[String, CurrencyData]): Self = StObject.set(x, "currencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value :_*))
    
    @scala.inline
    def setNumbers(value: RawNumberData): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnits(value: UnitDataTable): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
