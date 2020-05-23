package typings.flexmonster.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: js.UndefOr[js.Array[Tuple]] = js.undefined
  var row: js.UndefOr[js.Array[Tuple]] = js.undefined
}

object Column {
  @scala.inline
  def apply(column: js.Array[Tuple] = null, row: js.Array[Tuple] = null): Column = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

