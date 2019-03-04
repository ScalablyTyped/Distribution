package typings
package flotLib.jqueryNs.flotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait canvasPoint extends js.Object {
  var bottom: js.UndefOr[scala.Double] = js.undefined
  var left: scala.Double
  var right: js.UndefOr[scala.Double] = js.undefined
  var top: scala.Double
}

object canvasPoint {
  @scala.inline
  def apply(
    left: scala.Double,
    top: scala.Double,
    bottom: scala.Int | scala.Double = null,
    right: scala.Int | scala.Double = null
  ): canvasPoint = {
    val __obj = js.Dynamic.literal(left = left, top = top)
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    __obj.asInstanceOf[canvasPoint]
  }
}

