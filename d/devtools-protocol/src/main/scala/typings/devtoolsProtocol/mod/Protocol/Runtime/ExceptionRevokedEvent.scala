package typings.devtoolsProtocol.mod.Protocol.Runtime

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExceptionRevokedEvent extends StObject {
  
  /**
    * The id of revoked exception, as reported in `exceptionThrown`.
    */
  var exceptionId: integer
  
  /**
    * Reason describing why exception was revoked.
    */
  var reason: String
}
object ExceptionRevokedEvent {
  
  @scala.inline
  def apply(exceptionId: integer, reason: String): ExceptionRevokedEvent = {
    val __obj = js.Dynamic.literal(exceptionId = exceptionId.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionRevokedEvent]
  }
  
  @scala.inline
  implicit class ExceptionRevokedEventMutableBuilder[Self <: ExceptionRevokedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionId(value: integer): Self = StObject.set(x, "exceptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
