package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCredentialResponse extends StObject {
  
  var credential: Credential = js.native
}
object GetCredentialResponse {
  
  @scala.inline
  def apply(credential: Credential): GetCredentialResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialResponse]
  }
  
  @scala.inline
  implicit class GetCredentialResponseMutableBuilder[Self <: GetCredentialResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
