package typings.formatjsEcma402Abstract.numberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencySpacingData extends StObject {
  
  var afterInsertBetween: String
  
  var beforeInsertBetween: String
}
object CurrencySpacingData {
  
  inline def apply(afterInsertBetween: String, beforeInsertBetween: String): CurrencySpacingData = {
    val __obj = js.Dynamic.literal(afterInsertBetween = afterInsertBetween.asInstanceOf[js.Any], beforeInsertBetween = beforeInsertBetween.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySpacingData]
  }
  
  extension [Self <: CurrencySpacingData](x: Self) {
    
    inline def setAfterInsertBetween(value: String): Self = StObject.set(x, "afterInsertBetween", value.asInstanceOf[js.Any])
    
    inline def setBeforeInsertBetween(value: String): Self = StObject.set(x, "beforeInsertBetween", value.asInstanceOf[js.Any])
  }
}
