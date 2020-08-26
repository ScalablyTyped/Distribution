package typings.gapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchClearValuesByDataFilterRequest extends js.Object {
  /** The DataFilters used to determine which ranges to clear. */
  var dataFilters: js.UndefOr[js.Array[DataFilter]] = js.native
}

object BatchClearValuesByDataFilterRequest {
  @scala.inline
  def apply(): BatchClearValuesByDataFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchClearValuesByDataFilterRequest]
  }
  @scala.inline
  implicit class BatchClearValuesByDataFilterRequestOps[Self <: BatchClearValuesByDataFilterRequest] (val x: Self) extends AnyVal {
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
    def setDataFiltersVarargs(value: DataFilter*): Self = this.set("dataFilters", js.Array(value :_*))
    @scala.inline
    def setDataFilters(value: js.Array[DataFilter]): Self = this.set("dataFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataFilters: Self = this.set("dataFilters", js.undefined)
  }
  
}

