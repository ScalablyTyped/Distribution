package typings.flowdoc.FlowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var grid: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}

object Settings {
  @scala.inline
  def apply(grid: js.Tuple2[Double, Double] = null): Settings = {
    val __obj = js.Dynamic.literal()
    if (grid != null) __obj.updateDynamic("grid")(grid)
    __obj.asInstanceOf[Settings]
  }
}

