package typings.gapiClientCloudtasks.gapi.client.cloudtasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PullMessage extends js.Object {
  /** A data payload consumed by the task worker to execute the task. */
  var payload: js.UndefOr[String] = js.native
  /**
    * A meta-data tag for this task.
    *
    * This value is used by CloudTasks.PullTasks calls when
    * PullTasksRequest.filter is `tag=<tag>`.
    *
    * The tag must be less than 500 bytes.
    */
  var tag: js.UndefOr[String] = js.native
}

object PullMessage {
  @scala.inline
  def apply(): PullMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PullMessage]
  }
  @scala.inline
  implicit class PullMessageOps[Self <: PullMessage] (val x: Self) extends AnyVal {
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
    def setPayload(value: String): Self = this.set("payload", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayload: Self = this.set("payload", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

