package typings.dymoLabelFramework.dymo.label.framework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Print Job Status Info */
@js.native
trait PrintJobStatusInfo extends StObject {
  
  var status: PrintJobStatus = js.native
  
  var statusMessage: String = js.native
}
object PrintJobStatusInfo {
  
  @scala.inline
  def apply(status: PrintJobStatus, statusMessage: String): PrintJobStatusInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintJobStatusInfo]
  }
  
  @scala.inline
  implicit class PrintJobStatusInfoMutableBuilder[Self <: PrintJobStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: PrintJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
  }
}
