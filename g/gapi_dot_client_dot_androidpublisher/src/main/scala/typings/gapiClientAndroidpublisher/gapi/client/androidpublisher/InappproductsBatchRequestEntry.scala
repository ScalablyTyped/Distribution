package typings.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InappproductsBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var inappproductsinsertrequest: js.UndefOr[InappproductsInsertRequest] = js.native
  var inappproductsupdaterequest: js.UndefOr[InappproductsUpdateRequest] = js.native
  var methodName: js.UndefOr[String] = js.native
}

object InappproductsBatchRequestEntry {
  @scala.inline
  def apply(): InappproductsBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InappproductsBatchRequestEntry]
  }
  @scala.inline
  implicit class InappproductsBatchRequestEntryOps[Self <: InappproductsBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setInappproductsinsertrequest(value: InappproductsInsertRequest): Self = this.set("inappproductsinsertrequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInappproductsinsertrequest: Self = this.set("inappproductsinsertrequest", js.undefined)
    @scala.inline
    def setInappproductsupdaterequest(value: InappproductsUpdateRequest): Self = this.set("inappproductsupdaterequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInappproductsupdaterequest: Self = this.set("inappproductsupdaterequest", js.undefined)
    @scala.inline
    def setMethodName(value: String): Self = this.set("methodName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethodName: Self = this.set("methodName", js.undefined)
  }
  
}

