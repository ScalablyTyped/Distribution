package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ColumnId extends js.Object {
  var columnId: js.UndefOr[Double] = js.native
  var tableIndex: js.UndefOr[Double] = js.native
}

object Anon_ColumnId {
  @scala.inline
  def apply(columnId: Int | Double = null, tableIndex: Int | Double = null): Anon_ColumnId = {
    val __obj = js.Dynamic.literal()
    if (columnId != null) __obj.updateDynamic("columnId")(columnId.asInstanceOf[js.Any])
    if (tableIndex != null) __obj.updateDynamic("tableIndex")(tableIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColumnId]
  }
}

