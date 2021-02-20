package typings.devtoolsProtocol.mod.Protocol.Browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowBoundsRequest extends StObject {
  
  /**
    * Browser window id.
    */
  var windowId: WindowID = js.native
}
object GetWindowBoundsRequest {
  
  @scala.inline
  def apply(windowId: WindowID): GetWindowBoundsRequest = {
    val __obj = js.Dynamic.literal(windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowBoundsRequest]
  }
  
  @scala.inline
  implicit class GetWindowBoundsRequestMutableBuilder[Self <: GetWindowBoundsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowId(value: WindowID): Self = StObject.set(x, "windowId", value.asInstanceOf[js.Any])
  }
}
