package typings.gapiClientDoubleclicksearch.anon

import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortOrder extends js.Object {
  /** Column to perform the sort on. This can be a DoubleClick Search-defined column or a saved column. */
  var column: js.UndefOr[ReportApiColumnSpec] = js.native
  /** The sort direction, which is either ascending or descending. */
  var sortOrder: js.UndefOr[String] = js.native
}

object SortOrder {
  @scala.inline
  def apply(): SortOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOrder]
  }
  @scala.inline
  implicit class SortOrderOps[Self <: SortOrder] (val x: Self) extends AnyVal {
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
    def setColumn(value: ReportApiColumnSpec): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
  
}

