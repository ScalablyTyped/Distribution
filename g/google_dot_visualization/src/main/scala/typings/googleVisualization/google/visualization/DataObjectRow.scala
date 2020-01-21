package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectRow extends js.Object {
  var c: js.Array[DataObjectCell]
  var p: js.UndefOr[js.Any] = js.undefined
}

object DataObjectRow {
  @scala.inline
  def apply(c: js.Array[DataObjectCell], p: js.Any = null): DataObjectRow = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectRow]
  }
}

