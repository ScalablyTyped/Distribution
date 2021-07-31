package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyData extends StObject {
  
  var displayName: LDMLPluralRuleMap[String]
  
  var narrow: String
  
  var symbol: String
}
object CurrencyData {
  
  @scala.inline
  def apply(displayName: LDMLPluralRuleMap[String], narrow: String, symbol: String): CurrencyData = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyData]
  }
  
  @scala.inline
  implicit class CurrencyDataMutableBuilder[Self <: CurrencyData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: LDMLPluralRuleMap[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
  }
}
