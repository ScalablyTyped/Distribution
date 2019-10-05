package typings.gapiDotClientDotDoubleclicksearch

import typings.gapiDotClientDotDoubleclicksearch.gapi.client.doubleclicksearch.ReportApiColumnSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSortOrder extends js.Object {
  /** Column to perform the sort on. This can be a DoubleClick Search-defined column or a saved column. */
  var column: js.UndefOr[ReportApiColumnSpec] = js.undefined
  /** The sort direction, which is either ascending or descending. */
  var sortOrder: js.UndefOr[String] = js.undefined
}

object Anon_ColumnSortOrder {
  @scala.inline
  def apply(column: ReportApiColumnSpec = null, sortOrder: String = null): Anon_ColumnSortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_ColumnSortOrder]
  }
}

