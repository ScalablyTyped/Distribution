package typings.facebookJsSdk.facebook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusResponse extends StObject {
  
  var authResponse: AuthResponse
  
  var status: LoginStatus
}
object StatusResponse {
  
  @scala.inline
  def apply(authResponse: AuthResponse, status: LoginStatus): StatusResponse = {
    val __obj = js.Dynamic.literal(authResponse = authResponse.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusResponse]
  }
  
  @scala.inline
  implicit class StatusResponseMutableBuilder[Self <: StatusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthResponse(value: AuthResponse): Self = StObject.set(x, "authResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: LoginStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
