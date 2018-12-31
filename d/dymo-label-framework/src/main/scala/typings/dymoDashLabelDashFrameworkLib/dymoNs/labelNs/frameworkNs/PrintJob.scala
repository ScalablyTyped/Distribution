package typings
package dymoDashLabelDashFrameworkLib.dymoNs.labelNs.frameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print Job */
trait PrintJob extends js.Object {
  /**
  		 * Gets a status of the print job
  		 *
  		 * @param replyCallback a function called when the status is available
  		 */
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _]): scala.Unit
}

