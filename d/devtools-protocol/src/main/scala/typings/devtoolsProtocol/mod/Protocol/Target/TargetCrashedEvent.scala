package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetCrashedEvent extends StObject {
  
  /**
    * Termination error code.
    */
  var errorCode: integer = js.native
  
  /**
    * Termination status type.
    */
  var status: String = js.native
  
  var targetId: TargetID = js.native
}
object TargetCrashedEvent {
  
  @scala.inline
  def apply(errorCode: integer, status: String, targetId: TargetID): TargetCrashedEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCrashedEvent]
  }
  
  @scala.inline
  implicit class TargetCrashedEventMutableBuilder[Self <: TargetCrashedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: integer): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
