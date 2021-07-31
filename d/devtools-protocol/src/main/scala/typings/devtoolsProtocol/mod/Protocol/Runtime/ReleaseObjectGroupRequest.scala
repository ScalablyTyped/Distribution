package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseObjectGroupRequest extends StObject {
  
  /**
    * Symbolic object group name.
    */
  var objectGroup: String
}
object ReleaseObjectGroupRequest {
  
  @scala.inline
  def apply(objectGroup: String): ReleaseObjectGroupRequest = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectGroupRequest]
  }
  
  @scala.inline
  implicit class ReleaseObjectGroupRequestMutableBuilder[Self <: ReleaseObjectGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectGroup(value: String): Self = StObject.set(x, "objectGroup", value.asInstanceOf[js.Any])
  }
}
