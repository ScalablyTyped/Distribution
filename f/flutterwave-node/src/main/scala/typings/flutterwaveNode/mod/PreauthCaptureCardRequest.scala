package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreauthCaptureCardRequest extends StObject {
  
  var amount: js.UndefOr[String] = js.undefined
  
  var flwRef: String
}
object PreauthCaptureCardRequest {
  
  inline def apply(flwRef: String): PreauthCaptureCardRequest = {
    val __obj = js.Dynamic.literal(flwRef = flwRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreauthCaptureCardRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreauthCaptureCardRequest] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
    
    inline def setFlwRef(value: String): Self = StObject.set(x, "flwRef", value.asInstanceOf[js.Any])
  }
}
