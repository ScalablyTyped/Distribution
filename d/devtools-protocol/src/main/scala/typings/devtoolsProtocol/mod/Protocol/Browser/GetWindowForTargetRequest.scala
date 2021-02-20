package typings.devtoolsProtocol.mod.Protocol.Browser

import typings.devtoolsProtocol.mod.Protocol.Target.TargetID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowForTargetRequest extends StObject {
  
  /**
    * Devtools agent host id. If called as a part of the session, associated targetId is used.
    */
  var targetId: js.UndefOr[TargetID] = js.native
}
object GetWindowForTargetRequest {
  
  @scala.inline
  def apply(): GetWindowForTargetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWindowForTargetRequest]
  }
  
  @scala.inline
  implicit class GetWindowForTargetRequestMutableBuilder[Self <: GetWindowForTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
