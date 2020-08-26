package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.auto
import typings.googleVisualization.googleVisualizationStrings.both
import typings.googleVisualization.googleVisualizationStrings.next
import typings.googleVisualization.googleVisualizationStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableOptions extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.native
  var alternatingRowStyle: js.UndefOr[Boolean] = js.native
  var cssClassNames: js.UndefOr[CssClassNames] = js.native
  var firstRowNumber: js.UndefOr[Double] = js.native
  var frozenColumns: js.UndefOr[Double] = js.native
  var height: js.UndefOr[String] = js.native
  var page: js.UndefOr[String] = js.native
  var pageSize: js.UndefOr[Double] = js.native
  var pagingButtons: js.UndefOr[Double | both | prev | next | auto] = js.native
  var rtlTable: js.UndefOr[Boolean] = js.native
  var scrollLeftStartPosition: js.UndefOr[Double] = js.native
  var showRowNumber: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[String] = js.native
  var sortAscending: js.UndefOr[Boolean] = js.native
  var sortColumn: js.UndefOr[Double] = js.native
  var startPage: js.UndefOr[Double] = js.native
  var width: js.UndefOr[String] = js.native
}

object TableOptions {
  @scala.inline
  def apply(): TableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableOptions]
  }
  @scala.inline
  implicit class TableOptionsOps[Self <: TableOptions] (val x: Self) extends AnyVal {
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
    def setAllowHtml(value: Boolean): Self = this.set("allowHtml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowHtml: Self = this.set("allowHtml", js.undefined)
    @scala.inline
    def setAlternatingRowStyle(value: Boolean): Self = this.set("alternatingRowStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlternatingRowStyle: Self = this.set("alternatingRowStyle", js.undefined)
    @scala.inline
    def setCssClassNames(value: CssClassNames): Self = this.set("cssClassNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClassNames: Self = this.set("cssClassNames", js.undefined)
    @scala.inline
    def setFirstRowNumber(value: Double): Self = this.set("firstRowNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstRowNumber: Self = this.set("firstRowNumber", js.undefined)
    @scala.inline
    def setFrozenColumns(value: Double): Self = this.set("frozenColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrozenColumns: Self = this.set("frozenColumns", js.undefined)
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setPage(value: String): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPagingButtons(value: Double | both | prev | next | auto): Self = this.set("pagingButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePagingButtons: Self = this.set("pagingButtons", js.undefined)
    @scala.inline
    def setRtlTable(value: Boolean): Self = this.set("rtlTable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRtlTable: Self = this.set("rtlTable", js.undefined)
    @scala.inline
    def setScrollLeftStartPosition(value: Double): Self = this.set("scrollLeftStartPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollLeftStartPosition: Self = this.set("scrollLeftStartPosition", js.undefined)
    @scala.inline
    def setShowRowNumber(value: Boolean): Self = this.set("showRowNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowRowNumber: Self = this.set("showRowNumber", js.undefined)
    @scala.inline
    def setSort(value: String): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("sortAscending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortAscending: Self = this.set("sortAscending", js.undefined)
    @scala.inline
    def setSortColumn(value: Double): Self = this.set("sortColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortColumn: Self = this.set("sortColumn", js.undefined)
    @scala.inline
    def setStartPage(value: Double): Self = this.set("startPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartPage: Self = this.set("startPage", js.undefined)
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

