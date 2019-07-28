package typings.fancybox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FancyBoxThumbPos extends FancyBoxGetFitPosResults {
  var scaleX: js.UndefOr[Double] = js.undefined
  var scaleY: js.UndefOr[Double] = js.undefined
}

object FancyBoxThumbPos {
  @scala.inline
  def apply(
    height: Int | Double = null,
    left: Int | Double = null,
    scaleX: Int | Double = null,
    scaleY: Int | Double = null,
    top: Int | Double = null,
    width: Int | Double = null
  ): FancyBoxThumbPos = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxThumbPos]
  }
}

