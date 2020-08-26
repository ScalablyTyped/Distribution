package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatafeedsCustomBatchRequestEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var datafeed: js.UndefOr[Datafeed] = js.native
  var datafeedId: js.UndefOr[String] = js.native
  var merchantId: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
}

object DatafeedsCustomBatchRequestEntry {
  @scala.inline
  def apply(): DatafeedsCustomBatchRequestEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatafeedsCustomBatchRequestEntry]
  }
  @scala.inline
  implicit class DatafeedsCustomBatchRequestEntryOps[Self <: DatafeedsCustomBatchRequestEntry] (val x: Self) extends AnyVal {
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
    def setDatafeed(value: Datafeed): Self = this.set("datafeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatafeed: Self = this.set("datafeed", js.undefined)
    @scala.inline
    def setDatafeedId(value: String): Self = this.set("datafeedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatafeedId: Self = this.set("datafeedId", js.undefined)
    @scala.inline
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMerchantId: Self = this.set("merchantId", js.undefined)
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

