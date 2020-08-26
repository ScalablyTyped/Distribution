package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountstatusesCustomBatchResponseEntry extends js.Object {
  var accountStatus: js.UndefOr[AccountStatus] = js.native
  var batchId: js.UndefOr[Double] = js.native
  var errors: js.UndefOr[Errors] = js.native
}

object AccountstatusesCustomBatchResponseEntry {
  @scala.inline
  def apply(): AccountstatusesCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountstatusesCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class AccountstatusesCustomBatchResponseEntryOps[Self <: AccountstatusesCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setAccountStatus(value: AccountStatus): Self = this.set("accountStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountStatus: Self = this.set("accountStatus", js.undefined)
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

