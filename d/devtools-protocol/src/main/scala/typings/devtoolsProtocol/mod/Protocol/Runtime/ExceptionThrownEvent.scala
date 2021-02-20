package typings.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExceptionThrownEvent extends StObject {
  
  var exceptionDetails: ExceptionDetails = js.native
  
  /**
    * Timestamp of the exception.
    */
  var timestamp: Timestamp = js.native
}
object ExceptionThrownEvent {
  
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails, timestamp: Timestamp): ExceptionThrownEvent = {
    val __obj = js.Dynamic.literal(exceptionDetails = exceptionDetails.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionThrownEvent]
  }
  
  @scala.inline
  implicit class ExceptionThrownEventMutableBuilder[Self <: ExceptionThrownEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExceptionDetails(value: ExceptionDetails): Self = StObject.set(x, "exceptionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Timestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
