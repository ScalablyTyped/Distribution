package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonColumnId extends js.Object {
  var columnId: js.UndefOr[Double] = js.native
  var tableIndex: js.UndefOr[Double] = js.native
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

