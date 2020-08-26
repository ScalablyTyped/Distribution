package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var inappproductsinsertresponse: js.UndefOr[InappproductsInsertResponse] = js.native
  var inappproductsupdateresponse: js.UndefOr[InappproductsUpdateResponse] = js.native
}

object InappproductsBatchResponseEntry {
  @scala.inline
  def apply(): InappproductsBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchResponseEntry]
  }
  @scala.inline
  implicit class InappproductsBatchResponseEntryOps[Self <: InappproductsBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setBatchId(value: Double): Self = this.set("batchId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchId: Self = this.set("batchId", js.undefined)
    @scala.inline
    def setInappproductsinsertresponse(value: InappproductsInsertResponse): Self = this.set("inappproductsinsertresponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInappproductsinsertresponse: Self = this.set("inappproductsinsertresponse", js.undefined)
    @scala.inline
    def setInappproductsupdateresponse(value: InappproductsUpdateResponse): Self = this.set("inappproductsupdateresponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInappproductsupdateresponse: Self = this.set("inappproductsupdateresponse", js.undefined)
  }
  
}

