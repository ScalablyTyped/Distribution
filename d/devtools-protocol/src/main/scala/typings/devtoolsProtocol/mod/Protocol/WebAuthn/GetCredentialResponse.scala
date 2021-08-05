package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCredentialResponse extends StObject {
  
  var credential: Credential
}
object GetCredentialResponse {
  
  inline def apply(credential: Credential): GetCredentialResponse = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCredentialResponse]
  }
  
  extension [Self <: GetCredentialResponse](x: Self) {
    
    inline def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
