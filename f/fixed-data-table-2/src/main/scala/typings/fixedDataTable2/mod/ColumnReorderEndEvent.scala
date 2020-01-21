package typings.fixedDataTable2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnReorderEndEvent extends js.Object {
  /** the column after the new location of this one */
  var columnAfter: js.UndefOr[String] = js.undefined
  /** the column before the new location of this one */
  var columnBefore: js.UndefOr[String] = js.undefined
  /** the column key that was just reordered */
  var reorderColumn: String
}

object ColumnReorderEndEvent {
  @scala.inline
  def apply(reorderColumn: String, columnAfter: String = null, columnBefore: String = null): ColumnReorderEndEvent = {
    val __obj = js.Dynamic.literal(reorderColumn = reorderColumn.asInstanceOf[js.Any])
    if (columnAfter != null) __obj.updateDynamic("columnAfter")(columnAfter.asInstanceOf[js.Any])
    if (columnBefore != null) __obj.updateDynamic("columnBefore")(columnBefore.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnReorderEndEvent]
  }
}

