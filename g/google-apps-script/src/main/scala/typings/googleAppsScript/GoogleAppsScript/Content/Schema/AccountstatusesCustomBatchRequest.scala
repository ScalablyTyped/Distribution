package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchRequestEntry]] = js.native
}

object AccountstatusesCustomBatchRequest {
  @scala.inline
  def apply(): AccountstatusesCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchRequest]
  }
  @scala.inline
  implicit class AccountstatusesCustomBatchRequestOps[Self <: AccountstatusesCustomBatchRequest] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: AccountstatusesCustomBatchRequestEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[AccountstatusesCustomBatchRequestEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

