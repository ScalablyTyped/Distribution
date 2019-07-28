package typings.googleDotVisualization.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOptions extends js.Object {
  var allowHtml: js.UndefOr[Boolean] = js.undefined
  var alternatingRowStyle: js.UndefOr[Boolean] = js.undefined
  var cssClassNames: js.UndefOr[CssClassNames] = js.undefined
  var firstRowNumber: js.UndefOr[Double] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var page: js.UndefOr[String] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
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
    firstRowNumber: Int | Double = null,
    height: String = null,
    page: String = null,
    pageSize: Int | Double = null,
    rtlTable: js.UndefOr[Boolean] = js.undefined,
    scrollLeftStartPosition: Int | Double = null,
    showRowNumber: js.UndefOr[Boolean] = js.undefined,
    sort: String = null,
    sortAscending: js.UndefOr[Boolean] = js.undefined,
    sortColumn: Int | Double = null,
    startPage: Int | Double = null,
    width: String = null
  ): TableOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHtml)) __obj.updateDynamic("allowHtml")(allowHtml)
    if (!js.isUndefined(alternatingRowStyle)) __obj.updateDynamic("alternatingRowStyle")(alternatingRowStyle)
    if (cssClassNames != null) __obj.updateDynamic("cssClassNames")(cssClassNames)
    if (firstRowNumber != null) __obj.updateDynamic("firstRowNumber")(firstRowNumber.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (page != null) __obj.updateDynamic("page")(page)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlTable)) __obj.updateDynamic("rtlTable")(rtlTable)
    if (scrollLeftStartPosition != null) __obj.updateDynamic("scrollLeftStartPosition")(scrollLeftStartPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowNumber)) __obj.updateDynamic("showRowNumber")(showRowNumber)
    if (sort != null) __obj.updateDynamic("sort")(sort)
    if (!js.isUndefined(sortAscending)) __obj.updateDynamic("sortAscending")(sortAscending)
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (startPage != null) __obj.updateDynamic("startPage")(startPage.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[TableOptions]
  }
}

