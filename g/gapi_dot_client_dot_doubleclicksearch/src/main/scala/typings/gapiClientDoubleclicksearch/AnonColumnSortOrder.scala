package typings.gapiClientDoubleclicksearch

import typings.gapiClientDoubleclicksearch.gapi.client.doubleclicksearch.ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnSortOrder extends js.Object {
  /** Column to perform the sort on. This can be a DoubleClick Search-defined column or a saved column. */
  var column: js.UndefOr[ReportApiColumnSpec] = js.undefined
  /** The sort direction, which is either ascending or descending. */
  var sortOrder: js.UndefOr[String] = js.undefined
}

object AnonColumnSortOrder {
  @scala.inline
  def apply(column: ReportApiColumnSpec = null, sortOrder: String = null): AnonColumnSortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnSortOrder]
  }
}

