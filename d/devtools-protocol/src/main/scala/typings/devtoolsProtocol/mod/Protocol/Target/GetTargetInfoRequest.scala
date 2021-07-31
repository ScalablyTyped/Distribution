package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTargetInfoRequest extends StObject {
  
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object GetTargetInfoRequest {
  
  @scala.inline
  def apply(): GetTargetInfoRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTargetInfoRequest]
  }
  
  @scala.inline
  implicit class GetTargetInfoRequestMutableBuilder[Self <: GetTargetInfoRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
