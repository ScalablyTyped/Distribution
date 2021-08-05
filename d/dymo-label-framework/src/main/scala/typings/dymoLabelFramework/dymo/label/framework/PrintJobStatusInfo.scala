package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print Job Status Info */
trait PrintJobStatusInfo extends StObject {
  
  var status: PrintJobStatus
  
  var statusMessage: String
}
object PrintJobStatusInfo {
  
  inline def apply(status: PrintJobStatus, statusMessage: String): PrintJobStatusInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobStatusInfo]
  }
  
  extension [Self <: PrintJobStatusInfo](x: Self) {
    
    inline def setStatus(value: PrintJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
