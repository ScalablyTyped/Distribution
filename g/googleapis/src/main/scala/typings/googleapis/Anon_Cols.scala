package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Cols extends js.Object {
  var cols: js.UndefOr[js.Array[Anon_Id]] = js.native
  var rows: js.UndefOr[js.Array[Anon_C]] = js.native
}

object Anon_Cols {
  @scala.inline
  def apply(cols: js.Array[Anon_Id] = null, rows: js.Array[Anon_C] = null): Anon_Cols = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cols]
  }
}

