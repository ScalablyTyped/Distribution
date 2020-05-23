package typings.googleVisualization.google.visualization

import typings.googleVisualization.googleVisualizationStrings.auto
import typings.googleVisualization.googleVisualizationStrings.both
import typings.googleVisualization.googleVisualizationStrings.next
import typings.googleVisualization.googleVisualizationStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var alternatingRowStyle: js.UndefOr[Boolean] = js.undefined
  var cssClassNames: js.UndefOr[CssClassNames] = js.undefined
  var firstRowNumber: js.UndefOr[Double] = js.undefined
  var frozenColumns: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var pagingButtons: js.UndefOr[Double | both | prev | next | auto] = js.undefined
  var rtlTable: js.UndefOr[Boolean] = js.undefined
  var scrollLeftStartPosition: js.UndefOr[Double] = js.undefined
  var showRowNumber: js.UndefOr[Boolean] = js.undefined
  var sort: js.UndefOr[String] = js.undefined
  var sortAscending: js.UndefOr[Boolean] = js.undefined
  var sortColumn: js.UndefOr[Double] = js.undefined
  var startPage: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[String] = js.undefined
}

object TableOptions {
  @scala.inline
  def apply(
    allowHtml: js.UndefOr[Boolean] = js.undefined,
    alternatingRowStyle: js.UndefOr[Boolean] = js.undefined,
    cssClassNames: CssClassNames = null,
    firstRowNumber: js.UndefOr[Double] = js.undefined,
    frozenColumns: js.UndefOr[Double] = js.undefined,
    height: String = null,
    page: String = null,
    pageSize: js.UndefOr[Double] = js.undefined,
    pagingButtons: Double | both | prev | next | auto = null,
    rtlTable: js.UndefOr[Boolean] = js.undefined,
    scrollLeftStartPosition: js.UndefOr[Double] = js.undefined,
    showRowNumber: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    sortAscending: js.UndefOr[Boolean] = js.undefined,
    sortColumn: js.UndefOr[Double] = js.undefined,
    startPage: js.UndefOr[Double] = js.undefined,
    width: String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(alternatingRowStyle)) __obj.updateDynamic("alternatingRowStyle")(alternatingRowStyle.get.asInstanceOf[js.Any])
    if (cssClassNames != null) __obj.updateDynamic("cssClassNames")(cssClassNames.asInstanceOf[js.Any])
    if (!js.isUndefined(firstRowNumber)) __obj.updateDynamic("firstRowNumber")(firstRowNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenColumns)) __obj.updateDynamic("frozenColumns")(frozenColumns.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (pagingButtons != null) __obj.updateDynamic("pagingButtons")(pagingButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlTable)) __obj.updateDynamic("rtlTable")(rtlTable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollLeftStartPosition)) __obj.updateDynamic("scrollLeftStartPosition")(scrollLeftStartPosition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowNumber)) __obj.updateDynamic("showRowNumber")(showRowNumber.get.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortColumn)) __obj.updateDynamic("sortColumn")(sortColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startPage)) __obj.updateDynamic("startPage")(startPage.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOptions]
  }
}

