package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetDiscoverTargetsRequest extends StObject {
  
  /**
    * Whether to discover available targets.
    */
  var discover: Boolean = js.native
}
object SetDiscoverTargetsRequest {
  
  @scala.inline
  def apply(discover: Boolean): SetDiscoverTargetsRequest = {
    val __obj = js.Dynamic.literal(discover = discover.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDiscoverTargetsRequest]
  }
  
  @scala.inline
  implicit class SetDiscoverTargetsRequestMutableBuilder[Self <: SetDiscoverTargetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiscover(value: Boolean): Self = StObject.set(x, "discover", value.asInstanceOf[js.Any])
  }
}
