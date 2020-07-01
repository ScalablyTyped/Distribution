package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cols extends js.Object {
  var cols: js.UndefOr[js.Array[Id]] = js.native
  var rows: js.UndefOr[js.Array[C]] = js.native
}

object Cols {
  @scala.inline
  def apply(cols: js.Array[Id] = null, rows: js.Array[C] = null): Cols = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
}

