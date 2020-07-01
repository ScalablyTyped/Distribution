package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColumnId extends js.Object {
  var columnId: js.UndefOr[Double] = js.native
  var tableIndex: js.UndefOr[Double] = js.native
}

object ColumnId {
  @scala.inline
  def apply(columnId: js.UndefOr[Double] = js.undefined, tableIndex: js.UndefOr[Double] = js.undefined): ColumnId = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnId)) __obj.updateDynamic("columnId")(columnId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tableIndex)) __obj.updateDynamic("tableIndex")(tableIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnId]
  }
}

