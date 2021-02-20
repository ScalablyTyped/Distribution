package typings.googleCloudCommon.utilMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleInnerError extends StObject {
  
  var message: js.UndefOr[String] = js.native
  
  var reason: js.UndefOr[String] = js.native
}
object GoogleInnerError {
  
  @scala.inline
  def apply(): GoogleInnerError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleInnerError]
  }
  
  @scala.inline
  implicit class GoogleInnerErrorMutableBuilder[Self <: GoogleInnerError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
