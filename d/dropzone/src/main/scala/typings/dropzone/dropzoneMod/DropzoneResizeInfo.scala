package typings.dropzone.dropzoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropzoneResizeInfo extends js.Object {
  var srcHeight: js.UndefOr[Double] = js.undefined
  var srcWidth: js.UndefOr[Double] = js.undefined
  var srcX: js.UndefOr[Double] = js.undefined
  var srcY: js.UndefOr[Double] = js.undefined
  var trgHeight: js.UndefOr[Double] = js.undefined
  var trgWidth: js.UndefOr[Double] = js.undefined
  var trgX: js.UndefOr[Double] = js.undefined
  var trgY: js.UndefOr[Double] = js.undefined
}

object DropzoneResizeInfo {
  @scala.inline
  def apply(
    srcHeight: Int | Double = null,
    srcWidth: Int | Double = null,
    srcX: Int | Double = null,
    srcY: Int | Double = null,
    trgHeight: Int | Double = null,
    trgWidth: Int | Double = null,
    trgX: Int | Double = null,
    trgY: Int | Double = null
  ): DropzoneResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (srcHeight != null) __obj.updateDynamic("srcHeight")(srcHeight.asInstanceOf[js.Any])
    if (srcWidth != null) __obj.updateDynamic("srcWidth")(srcWidth.asInstanceOf[js.Any])
    if (srcX != null) __obj.updateDynamic("srcX")(srcX.asInstanceOf[js.Any])
    if (srcY != null) __obj.updateDynamic("srcY")(srcY.asInstanceOf[js.Any])
    if (trgHeight != null) __obj.updateDynamic("trgHeight")(trgHeight.asInstanceOf[js.Any])
    if (trgWidth != null) __obj.updateDynamic("trgWidth")(trgWidth.asInstanceOf[js.Any])
    if (trgX != null) __obj.updateDynamic("trgX")(trgX.asInstanceOf[js.Any])
    if (trgY != null) __obj.updateDynamic("trgY")(trgY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneResizeInfo]
  }
}

