package typings
package gapiDotClientDotDoubleclicksearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnSortOrder extends js.Object {
  /** Column to perform the sort on. This can be a DoubleClick Search-defined column or a saved column. */
  var column: js.UndefOr[
    gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs.ReportApiColumnSpec
  ] = js.undefined
  /** The sort direction, which is either ascending or descending. */
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ColumnSortOrder {
  @scala.inline
  def apply(
    column: gapiDotClientDotDoubleclicksearchLib.gapiNs.clientNs.doubleclicksearchNs.ReportApiColumnSpec = null,
    sortOrder: java.lang.String = null
  ): Anon_ColumnSortOrder = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[Anon_ColumnSortOrder]
  }
}

