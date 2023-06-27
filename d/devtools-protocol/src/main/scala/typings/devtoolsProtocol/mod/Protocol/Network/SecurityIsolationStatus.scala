package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityIsolationStatus extends StObject {
  
  var coep: js.UndefOr[CrossOriginEmbedderPolicyStatus] = js.undefined
  
  var coop: js.UndefOr[CrossOriginOpenerPolicyStatus] = js.undefined
  
  var csp: js.UndefOr[js.Array[ContentSecurityPolicyStatus]] = js.undefined
}
object SecurityIsolationStatus {
  
  inline def apply(): SecurityIsolationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityIsolationStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityIsolationStatus] (val x: Self) extends AnyVal {
    
    inline def setCoep(value: CrossOriginEmbedderPolicyStatus): Self = StObject.set(x, "coep", value.asInstanceOf[js.Any])
    
    inline def setCoepUndefined: Self = StObject.set(x, "coep", js.undefined)
    
    inline def setCoop(value: CrossOriginOpenerPolicyStatus): Self = StObject.set(x, "coop", value.asInstanceOf[js.Any])
    
    inline def setCoopUndefined: Self = StObject.set(x, "coop", js.undefined)
    
    inline def setCsp(value: js.Array[ContentSecurityPolicyStatus]): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
    
    inline def setCspVarargs(value: ContentSecurityPolicyStatus*): Self = StObject.set(x, "csp", js.Array(value*))
  }
}
