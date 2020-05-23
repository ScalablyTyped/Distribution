package typings.dropzone.mod

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
    srcHeight: js.UndefOr[Double] = js.undefined,
    srcWidth: js.UndefOr[Double] = js.undefined,
    srcX: js.UndefOr[Double] = js.undefined,
    srcY: js.UndefOr[Double] = js.undefined,
    trgHeight: js.UndefOr[Double] = js.undefined,
    trgWidth: js.UndefOr[Double] = js.undefined,
    trgX: js.UndefOr[Double] = js.undefined,
    trgY: js.UndefOr[Double] = js.undefined
  ): DropzoneResizeInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(srcHeight)) __obj.updateDynamic("srcHeight")(srcHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(srcWidth)) __obj.updateDynamic("srcWidth")(srcWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(srcX)) __obj.updateDynamic("srcX")(srcX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(srcY)) __obj.updateDynamic("srcY")(srcY.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trgHeight)) __obj.updateDynamic("trgHeight")(trgHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trgWidth)) __obj.updateDynamic("trgWidth")(trgWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trgX)) __obj.updateDynamic("trgX")(trgX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trgY)) __obj.updateDynamic("trgY")(trgY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropzoneResizeInfo]
  }
}

