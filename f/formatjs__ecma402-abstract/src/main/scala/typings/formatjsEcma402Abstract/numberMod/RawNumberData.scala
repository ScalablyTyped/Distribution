package typings.formatjsEcma402Abstract.numberMod

import typings.formatjsEcma402Abstract.anon.Standard
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawNumberData extends StObject {
  
  var currency: Record[NumberingSystem, RawCurrencyData]
  
  var decimal: Record[NumberingSystem, Standard]
  
  var nu: js.Array[String]
  
  var percent: Record[NumberingSystem, String]
  
  var symbols: Record[NumberingSystem, SymbolsData]
}
object RawNumberData {
  
  inline def apply(
    currency: Record[NumberingSystem, RawCurrencyData],
    decimal: Record[NumberingSystem, Standard],
    nu: js.Array[String],
    percent: Record[NumberingSystem, String],
    symbols: Record[NumberingSystem, SymbolsData]
  ): RawNumberData = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], nu = nu.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawNumberData]
  }
  
  extension [Self <: RawNumberData](x: Self) {
    
    inline def setCurrency(value: Record[NumberingSystem, RawCurrencyData]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setDecimal(value: Record[NumberingSystem, Standard]): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
    
    inline def setNu(value: js.Array[String]): Self = StObject.set(x, "nu", value.asInstanceOf[js.Any])
    
    inline def setNuVarargs(value: String*): Self = StObject.set(x, "nu", js.Array(value*))
    
    inline def setPercent(value: Record[NumberingSystem, String]): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setSymbols(value: Record[NumberingSystem, SymbolsData]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
  }
}
