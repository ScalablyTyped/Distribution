package typings.devtoolsProtocol.mod.Protocol.Network

import typings.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSecurityIsolationStatusRequest extends StObject {
  
  /**
    * If no frameId is provided, the status of the target is provided.
    */
  var frameId: js.UndefOr[FrameId] = js.native
}
object GetSecurityIsolationStatusRequest {
  
  @scala.inline
  def apply(): GetSecurityIsolationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSecurityIsolationStatusRequest]
  }
  
  @scala.inline
  implicit class GetSecurityIsolationStatusRequestMutableBuilder[Self <: GetSecurityIsolationStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
