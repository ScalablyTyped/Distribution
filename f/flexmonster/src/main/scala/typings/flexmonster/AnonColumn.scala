package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: js.UndefOr[js.Array[AnonMeasureTuple]] = js.undefined
  var row: js.UndefOr[js.Array[AnonMeasureTuple]] = js.undefined
}

object AnonColumn {
  @scala.inline
  def apply(column: js.Array[AnonMeasureTuple] = null, row: js.Array[AnonMeasureTuple] = null): AnonColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

