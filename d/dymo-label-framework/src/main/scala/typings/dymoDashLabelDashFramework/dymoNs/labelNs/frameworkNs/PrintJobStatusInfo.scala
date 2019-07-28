package typings.dymoDashLabelDashFramework.dymoNs.labelNs.frameworkNs

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
    val __obj = js.Dynamic.literal(status = status, statusMessage = statusMessage)
  
    __obj.asInstanceOf[PrintJobStatusInfo]
  }
}

