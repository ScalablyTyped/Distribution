package typings.dymoLabelFramework.dymo.label.framework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print Job */
@js.native
trait PrintJob extends js.Object {
  /**
    * Gets a status of the print job
    *
    * @param replyCallback a function called when the status is available
    */
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _]): Unit = js.native
}

object PrintJob {
  @scala.inline
  def apply(getStatus: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _] => Unit): PrintJob = {
    val __obj = js.Dynamic.literal(getStatus = js.Any.fromFunction1(getStatus))
    __obj.asInstanceOf[PrintJob]
  }
  @scala.inline
  implicit class PrintJobOps[Self <: PrintJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetStatus(value: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _] => Unit): Self = this.set("getStatus", js.Any.fromFunction1(value))
  }
  
}

