package typings.googleCloudCommon.buildSrcUtilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleInnerError extends StObject {
  
  var message: js.UndefOr[String] = js.undefined
  
  var reason: js.UndefOr[String] = js.undefined
}
object GoogleInnerError {
  
  inline def apply(): GoogleInnerError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleInnerError]
  }
  
  extension [Self <: GoogleInnerError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
