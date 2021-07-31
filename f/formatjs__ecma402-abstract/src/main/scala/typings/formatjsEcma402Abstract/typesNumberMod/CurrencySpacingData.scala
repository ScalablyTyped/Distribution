package typings.formatjsEcma402Abstract.typesNumberMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencySpacingData extends StObject {
  
  var afterInsertBetween: String
  
  var beforeInsertBetween: String
}
object CurrencySpacingData {
  
  @scala.inline
  def apply(afterInsertBetween: String, beforeInsertBetween: String): CurrencySpacingData = {
    val __obj = js.Dynamic.literal(afterInsertBetween = afterInsertBetween.asInstanceOf[js.Any], beforeInsertBetween = beforeInsertBetween.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySpacingData]
  }
  
  @scala.inline
  implicit class CurrencySpacingDataMutableBuilder[Self <: CurrencySpacingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterInsertBetween(value: String): Self = StObject.set(x, "afterInsertBetween", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeInsertBetween(value: String): Self = StObject.set(x, "beforeInsertBetween", value.asInstanceOf[js.Any])
  }
}
