package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCustomBatchResponseEntry extends js.Object {
  var batchId: js.UndefOr[Double] = js.native
  var errors: js.UndefOr[Errors] = js.native
  var kind: js.UndefOr[String] = js.native
}

object InventoryCustomBatchResponseEntry {
  @scala.inline
  def apply(): InventoryCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryCustomBatchResponseEntry]
  }
  @scala.inline
  implicit class InventoryCustomBatchResponseEntryOps[Self <: InventoryCustomBatchResponseEntry] (val x: Self) extends AnyVal {
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
    def setErrors(value: Errors): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

