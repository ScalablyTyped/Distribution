package typings.gapiClientAnalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCols extends js.Object {
  var cols: js.UndefOr[js.Array[AnonId]] = js.undefined
  var rows: js.UndefOr[js.Array[AnonC]] = js.undefined
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

