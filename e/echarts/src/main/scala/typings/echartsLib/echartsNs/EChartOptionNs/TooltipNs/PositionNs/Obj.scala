package typings
package echartsLib.echartsNs.EChartOptionNs.TooltipNs.PositionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Obj extends _Type {
  var bottom: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var left: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var right: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var top: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Obj {
  @scala.inline
  def apply(
    bottom: java.lang.String | scala.Double = null,
    left: java.lang.String | scala.Double = null,
    right: java.lang.String | scala.Double = null,
    top: java.lang.String | scala.Double = null
  ): Obj = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Obj]
  }
}

