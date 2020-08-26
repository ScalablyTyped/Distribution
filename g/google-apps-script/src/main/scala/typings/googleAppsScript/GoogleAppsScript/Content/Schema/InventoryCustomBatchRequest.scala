package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCustomBatchRequest extends js.Object {
  var entries: js.UndefOr[js.Array[InventoryCustomBatchRequestEntry]] = js.native
}

object InventoryCustomBatchRequest {
  @scala.inline
  def apply(): InventoryCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InventoryCustomBatchRequest]
  }
  @scala.inline
  implicit class InventoryCustomBatchRequestOps[Self <: InventoryCustomBatchRequest] (val x: Self) extends AnyVal {
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
    def setEntriesVarargs(value: InventoryCustomBatchRequestEntry*): Self = this.set("entries", js.Array(value :_*))
    @scala.inline
    def setEntries(value: js.Array[InventoryCustomBatchRequestEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
  
}

