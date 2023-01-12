package typings.devtoolsProtocol.mod.Protocol.WebAuthn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddVirtualAuthenticatorRequest extends StObject {
  
  var options: VirtualAuthenticatorOptions
}
object AddVirtualAuthenticatorRequest {
  
  inline def apply(options: VirtualAuthenticatorOptions): AddVirtualAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddVirtualAuthenticatorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddVirtualAuthenticatorRequest] (val x: Self) extends AnyVal {
    
    inline def setOptions(value: VirtualAuthenticatorOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
