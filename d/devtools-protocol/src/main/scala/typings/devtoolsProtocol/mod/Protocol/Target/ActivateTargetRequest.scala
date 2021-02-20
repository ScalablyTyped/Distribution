package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivateTargetRequest extends StObject {
  
  var targetId: TargetID = js.native
}
object ActivateTargetRequest {
  
  @scala.inline
  def apply(targetId: TargetID): ActivateTargetRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateTargetRequest]
  }
  
  @scala.inline
  implicit class ActivateTargetRequestMutableBuilder[Self <: ActivateTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
