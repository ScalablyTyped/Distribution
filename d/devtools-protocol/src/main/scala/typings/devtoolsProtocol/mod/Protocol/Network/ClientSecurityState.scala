package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSecurityState extends StObject {
  
  var initiatorIPAddressSpace: IPAddressSpace
  
  var initiatorIsSecureContext: Boolean
  
  var privateNetworkRequestPolicy: PrivateNetworkRequestPolicy
}
object ClientSecurityState {
  
  inline def apply(
    initiatorIPAddressSpace: IPAddressSpace,
    initiatorIsSecureContext: Boolean,
    privateNetworkRequestPolicy: PrivateNetworkRequestPolicy
  ): ClientSecurityState = {
    val __obj = js.Dynamic.literal(initiatorIPAddressSpace = initiatorIPAddressSpace.asInstanceOf[js.Any], initiatorIsSecureContext = initiatorIsSecureContext.asInstanceOf[js.Any], privateNetworkRequestPolicy = privateNetworkRequestPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSecurityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientSecurityState] (val x: Self) extends AnyVal {
    
    inline def setInitiatorIPAddressSpace(value: IPAddressSpace): Self = StObject.set(x, "initiatorIPAddressSpace", value.asInstanceOf[js.Any])
    
    inline def setInitiatorIsSecureContext(value: Boolean): Self = StObject.set(x, "initiatorIsSecureContext", value.asInstanceOf[js.Any])
    
    inline def setPrivateNetworkRequestPolicy(value: PrivateNetworkRequestPolicy): Self = StObject.set(x, "privateNetworkRequestPolicy", value.asInstanceOf[js.Any])
  }
}
