package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print Job Status Info */
trait PrintJobStatusInfo extends js.Object {
  var status: PrintJobStatus
  var statusMessage: java.lang.String
}

object PrintJobStatusInfo {
  @scala.inline
  def apply(status: PrintJobStatus, statusMessage: java.lang.String): PrintJobStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[PrintJobStatusInfo]
  }
}

