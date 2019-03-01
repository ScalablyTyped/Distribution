package typings
package gapiDotClientDotFusiontablesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColumnId extends js.Object {
  /** The id of the column in the base table from which this column is derived. */
  var columnId: js.UndefOr[scala.Double] = js.undefined
  /** Offset to the entry in the list of base tables in the table definition. */
  var tableIndex: js.UndefOr[scala.Double] = js.undefined
}

object Anon_ColumnId {
  @scala.inline
  def apply(columnId: scala.Int | scala.Double = null, tableIndex: scala.Int | scala.Double = null): Anon_ColumnId = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (tableIndex != null) __obj.updateDynamic("tableIndex")(tableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnId]
  }
}

