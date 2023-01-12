package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusXqequeryRequest extends StObject {
  
  var flwref: js.UndefOr[String] = js.undefined
  
  var last_attempt: js.UndefOr[String] = js.undefined
  
  var only_successful: js.UndefOr[String] = js.undefined
  
  var txref: js.UndefOr[String] = js.undefined
}
object StatusXqequeryRequest {
  
  inline def apply(): StatusXqequeryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusXqequeryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusXqequeryRequest] (val x: Self) extends AnyVal {
    
    inline def setFlwref(value: String): Self = StObject.set(x, "flwref", value.asInstanceOf[js.Any])
    
    inline def setFlwrefUndefined: Self = StObject.set(x, "flwref", js.undefined)
    
    inline def setLast_attempt(value: String): Self = StObject.set(x, "last_attempt", value.asInstanceOf[js.Any])
    
    inline def setLast_attemptUndefined: Self = StObject.set(x, "last_attempt", js.undefined)
    
    inline def setOnly_successful(value: String): Self = StObject.set(x, "only_successful", value.asInstanceOf[js.Any])
    
    inline def setOnly_successfulUndefined: Self = StObject.set(x, "only_successful", js.undefined)
    
    inline def setTxref(value: String): Self = StObject.set(x, "txref", value.asInstanceOf[js.Any])
    
    inline def setTxrefUndefined: Self = StObject.set(x, "txref", js.undefined)
  }
}
