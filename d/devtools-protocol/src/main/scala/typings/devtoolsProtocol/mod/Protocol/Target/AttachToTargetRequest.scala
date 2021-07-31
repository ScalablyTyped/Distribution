package typings.devtoolsProtocol.mod.Protocol.Target

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachToTargetRequest extends StObject {
  
  /**
    * Enables "flat" access to the session via specifying sessionId attribute in the commands.
    * We plan to make this the default, deprecate non-flattened mode,
    * and eventually retire it. See crbug.com/991325.
    */
  var flatten: js.UndefOr[Boolean] = js.undefined
  
  var targetId: TargetID
}
object AttachToTargetRequest {
  
  @scala.inline
  def apply(targetId: TargetID): AttachToTargetRequest = {
    val __obj = js.Dynamic.literal(targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachToTargetRequest]
  }
  
  @scala.inline
  implicit class AttachToTargetRequestMutableBuilder[Self <: AttachToTargetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
