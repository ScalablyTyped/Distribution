package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityIsolationStatus extends StObject {
  
  var coep: CrossOriginEmbedderPolicyStatus = js.native
  
  var coop: CrossOriginOpenerPolicyStatus = js.native
}
object SecurityIsolationStatus {
  
  @scala.inline
  def apply(coep: CrossOriginEmbedderPolicyStatus, coop: CrossOriginOpenerPolicyStatus): SecurityIsolationStatus = {
    val __obj = js.Dynamic.literal(coep = coep.asInstanceOf[js.Any], coop = coop.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityIsolationStatus]
  }
  
  @scala.inline
  implicit class SecurityIsolationStatusMutableBuilder[Self <: SecurityIsolationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoep(value: CrossOriginEmbedderPolicyStatus): Self = StObject.set(x, "coep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoop(value: CrossOriginOpenerPolicyStatus): Self = StObject.set(x, "coop", value.asInstanceOf[js.Any])
  }
}
