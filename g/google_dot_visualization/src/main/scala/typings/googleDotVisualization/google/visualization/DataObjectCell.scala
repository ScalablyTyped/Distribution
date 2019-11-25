package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataObjectCell extends js.Object {
  var f: js.UndefOr[String] = js.undefined
  var p: js.UndefOr[js.Any] = js.undefined
  var v: js.UndefOr[js.Any] = js.undefined
}

object DataObjectCell {
  @scala.inline
  def apply(f: String = null, p: js.Any = null, v: js.Any = null): DataObjectCell = {
    val __obj = js.Dynamic.literal()
    if (f != null) __obj.updateDynamic("f")(f.asInstanceOf[js.Any])
    if (p != null) __obj.updateDynamic("p")(p.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataObjectCell]
  }
}

