package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCols extends js.Object {
  var cols: js.UndefOr[js.Array[AnonId]] = js.native
  var rows: js.UndefOr[js.Array[AnonC]] = js.native
}

object AnonCols {
  @scala.inline
  def apply(cols: js.Array[AnonId] = null, rows: js.Array[AnonC] = null): AnonCols = {
    val __obj = js.Dynamic.literal()
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCols]
  }
}

