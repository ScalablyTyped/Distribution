package typings.downscale

import typings.downscale.downscaleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined downscale.downscale.DownscaleOptions & {  returnBlob ? :false,   returnCanvas ? :false} */
trait DownscaleOptionsreturnBloImageType extends js.Object {
  var imageType: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var returnBlob: js.UndefOr[Boolean with `false`] = js.undefined
  var returnCanvas: js.UndefOr[Boolean with `false`] = js.undefined
  var sourceX: js.UndefOr[Double] = js.undefined
  var sourceY: js.UndefOr[Double] = js.undefined
}

object DownscaleOptionsreturnBloImageType {
  @scala.inline
  def apply(
    imageType: String = null,
    quality: Int | Double = null,
    returnBlob: js.UndefOr[Boolean with `false`] = js.undefined,
    returnCanvas: js.UndefOr[Boolean with `false`] = js.undefined,
    sourceX: Int | Double = null,
    sourceY: Int | Double = null
  ): DownscaleOptionsreturnBloImageType = {
    val __obj = js.Dynamic.literal()
    if (imageType != null) __obj.updateDynamic("imageType")(imageType.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBlob)) __obj.updateDynamic("returnBlob")(returnBlob.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCanvas)) __obj.updateDynamic("returnCanvas")(returnCanvas.asInstanceOf[js.Any])
    if (sourceX != null) __obj.updateDynamic("sourceX")(sourceX.asInstanceOf[js.Any])
    if (sourceY != null) __obj.updateDynamic("sourceY")(sourceY.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownscaleOptionsreturnBloImageType]
  }
}

