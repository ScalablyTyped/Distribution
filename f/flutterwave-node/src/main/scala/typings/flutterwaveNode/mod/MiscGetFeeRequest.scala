package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscGetFeeRequest extends StObject {
  
  var amount: String | Double
  
  var card6: js.UndefOr[Any] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var ptype: js.UndefOr[Any] = js.undefined
}
object MiscGetFeeRequest {
  
  inline def apply(amount: String | Double): MiscGetFeeRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiscGetFeeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MiscGetFeeRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCard6(value: Any): Self = StObject.set(x, "card6", value.asInstanceOf[js.Any])
    
    inline def setCard6Undefined: Self = StObject.set(x, "card6", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPtype(value: Any): Self = StObject.set(x, "ptype", value.asInstanceOf[js.Any])
    
    inline def setPtypeUndefined: Self = StObject.set(x, "ptype", js.undefined)
  }
}
