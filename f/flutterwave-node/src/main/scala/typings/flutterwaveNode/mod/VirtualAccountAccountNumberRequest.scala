package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualAccountAccountNumberRequest extends StObject {
  
  var duration: js.UndefOr[String] = js.undefined
  
  var email: String
  
  var frequency: js.UndefOr[String] = js.undefined
  
  var is_permanent: js.UndefOr[String] = js.undefined
  
  var narration: js.UndefOr[String] = js.undefined
  
  var txref: js.UndefOr[String] = js.undefined
}
object VirtualAccountAccountNumberRequest {
  
  inline def apply(email: String): VirtualAccountAccountNumberRequest = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualAccountAccountNumberRequest]
  }
  
  extension [Self <: VirtualAccountAccountNumberRequest](x: Self) {
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFrequency(value: String): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setIs_permanent(value: String): Self = StObject.set(x, "is_permanent", value.asInstanceOf[js.Any])
    
    inline def setIs_permanentUndefined: Self = StObject.set(x, "is_permanent", js.undefined)
    
    inline def setNarration(value: String): Self = StObject.set(x, "narration", value.asInstanceOf[js.Any])
    
    inline def setNarrationUndefined: Self = StObject.set(x, "narration", js.undefined)
    
    inline def setTxref(value: String): Self = StObject.set(x, "txref", value.asInstanceOf[js.Any])
    
    inline def setTxrefUndefined: Self = StObject.set(x, "txref", js.undefined)
  }
}
