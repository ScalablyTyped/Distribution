package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesCustomBatchResponse extends js.Object {
  var entries: js.UndefOr[js.Array[AccountstatusesCustomBatchResponseEntry]] = js.native
  var kind: js.UndefOr[String] = js.native
}

object AccountstatusesCustomBatchResponse {
  @scala.inline
  def apply(): AccountstatusesCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchResponse]
  }
  @scala.inline
  implicit class AccountstatusesCustomBatchResponseOps[Self <: AccountstatusesCustomBatchResponse] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: AccountstatusesCustomBatchResponseEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[AccountstatusesCustomBatchResponseEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

