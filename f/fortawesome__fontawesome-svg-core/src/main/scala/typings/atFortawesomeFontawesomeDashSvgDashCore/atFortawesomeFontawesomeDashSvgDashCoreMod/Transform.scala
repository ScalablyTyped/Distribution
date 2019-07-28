package typings.atFortawesomeFontawesomeDashSvgDashCore.atFortawesomeFontawesomeDashSvgDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transform extends js.Object {
  var flipX: js.UndefOr[Boolean] = js.undefined
  var flipY: js.UndefOr[Boolean] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object Transform {
  @scala.inline
  def apply(
    flipX: js.UndefOr[Boolean] = js.undefined,
    flipY: js.UndefOr[Boolean] = js.undefined,
    rotate: Int | Double = null,
    size: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): Transform = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flipX)) __obj.updateDynamic("flipX")(flipX)
    if (!js.isUndefined(flipY)) __obj.updateDynamic("flipY")(flipY)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
}

