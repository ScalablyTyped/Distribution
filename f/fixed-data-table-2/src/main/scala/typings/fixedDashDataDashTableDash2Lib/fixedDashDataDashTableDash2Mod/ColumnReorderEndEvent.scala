package typings
package fixedDashDataDashTableDash2Lib.fixedDashDataDashTableDash2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnReorderEndEvent extends js.Object {
  /** the column after the new location of this one */
  var columnAfter: js.UndefOr[java.lang.String] = js.undefined
  /** the column before the new location of this one */
  var columnBefore: js.UndefOr[java.lang.String] = js.undefined
  /** the column key that was just reordered */
  var reorderColumn: java.lang.String
}

object ColumnReorderEndEvent {
  @scala.inline
  def apply(
    reorderColumn: java.lang.String,
    columnAfter: java.lang.String = null,
    columnBefore: java.lang.String = null
  ): ColumnReorderEndEvent = {
    val __obj = js.Dynamic.literal(reorderColumn = reorderColumn)
    if (columnAfter != null) __obj.updateDynamic("columnAfter")(columnAfter)
    if (columnBefore != null) __obj.updateDynamic("columnBefore")(columnBefore)
    __obj.asInstanceOf[ColumnReorderEndEvent]
  }
}

