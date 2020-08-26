package typings.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchDeleteMessagesRequest extends js.Object {
  /** The IDs of the messages to delete. */
  var ids: js.UndefOr[js.Array[String]] = js.native
}

object BatchDeleteMessagesRequest {
  @scala.inline
  def apply(): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
  @scala.inline
  implicit class BatchDeleteMessagesRequestOps[Self <: BatchDeleteMessagesRequest] (val x: Self) extends AnyVal {
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
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIds: Self = this.set("ids", js.undefined)
  }
  
}

