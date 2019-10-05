package typings.dymoDashLabelDashFramework.dymo.label.framework

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
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _]): Unit
}

object PrintJob {
  @scala.inline
  def apply(getStatus: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _] => Unit): PrintJob = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
  
    __obj.asInstanceOf[PrintJob]
  }
}

