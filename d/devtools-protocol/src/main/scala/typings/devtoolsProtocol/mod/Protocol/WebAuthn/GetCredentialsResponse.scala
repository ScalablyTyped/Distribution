package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialsResponse extends StObject {
  
  var credentials: js.Array[Credential]
}
object GetCredentialsResponse {
  
  @scala.inline
  def apply(credentials: js.Array[Credential]): GetCredentialsResponse = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialsResponse]
  }
  
  @scala.inline
  implicit class GetCredentialsResponseMutableBuilder[Self <: GetCredentialsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: js.Array[Credential]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsVarargs(value: Credential*): Self = StObject.set(x, "credentials", js.Array(value :_*))
  }
}
