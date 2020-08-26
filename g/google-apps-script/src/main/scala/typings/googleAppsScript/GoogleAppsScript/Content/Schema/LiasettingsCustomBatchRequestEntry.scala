package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiasettingsCustomBatchRequestEntry extends js.Object {
  var accountId: js.UndefOr[String] = js.native
  var batchId: js.UndefOr[Double] = js.native
  var contactEmail: js.UndefOr[String] = js.native
  var contactName: js.UndefOr[String] = js.native
  var country: js.UndefOr[String] = js.native
  var gmbEmail: js.UndefOr[String] = js.native
  var liaSettings: js.UndefOr[LiaSettings] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var posDataProviderId: js.UndefOr[String] = js.native
  var posExternalAccountId: js.UndefOr[String] = js.native
}

object LiasettingsCustomBatchRequestEntry {
  @scala.inline
  def apply(): LiasettingsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiasettingsCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class LiasettingsCustomBatchRequestEntryOps[Self <: LiasettingsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setContactEmail(value: String): Self = this.set("contactEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactEmail: Self = this.set("contactEmail", js.undefined)
    @scala.inline
    def setContactName(value: String): Self = this.set("contactName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactName: Self = this.set("contactName", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setGmbEmail(value: String): Self = this.set("gmbEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGmbEmail: Self = this.set("gmbEmail", js.undefined)
    @scala.inline
    def setLiaSettings(value: LiaSettings): Self = this.set("liaSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiaSettings: Self = this.set("liaSettings", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPosDataProviderId(value: String): Self = this.set("posDataProviderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosDataProviderId: Self = this.set("posDataProviderId", js.undefined)
    @scala.inline
    def setPosExternalAccountId(value: String): Self = this.set("posExternalAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosExternalAccountId: Self = this.set("posExternalAccountId", js.undefined)
  }
  
}

