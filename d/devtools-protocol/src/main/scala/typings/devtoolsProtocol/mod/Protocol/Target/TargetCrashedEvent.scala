package typings.devtoolsProtocol.mod.Protocol.Target

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetCrashedEvent extends StObject {
  
  /**
    * Termination error code.
    */
  var errorCode: integer
  
  /**
    * Termination status type.
    */
  var status: String
  
  var targetId: TargetID
}
object TargetCrashedEvent {
  
  inline def apply(errorCode: integer, status: String, targetId: TargetID): TargetCrashedEvent = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCrashedEvent]
  }
  
  extension [Self <: TargetCrashedEvent](x: Self) {
    
    inline def setErrorCode(value: integer): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
