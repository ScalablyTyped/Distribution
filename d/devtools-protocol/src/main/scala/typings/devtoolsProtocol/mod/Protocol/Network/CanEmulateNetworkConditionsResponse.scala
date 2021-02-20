package typings.devtoolsProtocol.mod.Protocol.Network

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanEmulateNetworkConditionsResponse extends StObject {
  
  /**
    * True if emulation of network conditions is supported.
    */
  var result: Boolean = js.native
}
object CanEmulateNetworkConditionsResponse {
  
  @scala.inline
  def apply(result: Boolean): CanEmulateNetworkConditionsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanEmulateNetworkConditionsResponse]
  }
  
  @scala.inline
  implicit class CanEmulateNetworkConditionsResponseMutableBuilder[Self <: CanEmulateNetworkConditionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: Boolean): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
