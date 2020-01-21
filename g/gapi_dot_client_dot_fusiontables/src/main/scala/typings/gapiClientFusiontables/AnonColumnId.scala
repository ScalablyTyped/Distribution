package typings.gapiClientFusiontables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnId extends js.Object {
  /** The id of the column in the base table from which this column is derived. */
  var columnId: js.UndefOr[Double] = js.undefined
  /** Offset to the entry in the list of base tables in the table definition. */
  var tableIndex: js.UndefOr[Double] = js.undefined
}

object AnonColumnId {
  @scala.inline
  def apply(columnId: Int | Double = null, tableIndex: Int | Double = null): AnonColumnId = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (tableIndex != null) __obj.updateDynamic("tableIndex")(tableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnId]
  }
}

