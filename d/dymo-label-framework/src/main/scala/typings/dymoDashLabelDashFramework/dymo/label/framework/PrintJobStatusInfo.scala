package typings.dymoDashLabelDashFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print Job Status Info */
trait PrintJobStatusInfo extends js.Object {
  var status: PrintJobStatus
  var statusMessage: String
}

object PrintJobStatusInfo {
  @scala.inline
  def apply(status: PrintJobStatus, statusMessage: String): PrintJobStatusInfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PrintJobStatusInfo]
  }
}

