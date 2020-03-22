package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: js.UndefOr[js.Array[AnonTuple]] = js.undefined
  var row: js.UndefOr[js.Array[AnonTuple]] = js.undefined
}

object AnonColumn {
  @scala.inline
  def apply(column: js.Array[AnonTuple] = null, row: js.Array[AnonTuple] = null): AnonColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

