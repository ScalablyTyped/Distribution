package typings.downscale.anon

import typings.downscale.downscaleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined downscale.downscale.DownscaleOptions & {  returnBlob  :true} */
trait DownscaleOptionsreturnBlo extends js.Object {
  var imageType: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var returnBlob: js.UndefOr[Boolean with `true`] = js.undefined
  var returnCanvas: js.UndefOr[Boolean] = js.undefined
  var sourceX: js.UndefOr[Double] = js.undefined
  var sourceY: js.UndefOr[Double] = js.undefined
}

object DownscaleOptionsreturnBlo {
  @scala.inline
  def apply(
    imageType: String = null,
    quality: js.UndefOr[Double] = js.undefined,
    returnBlob: js.UndefOr[Boolean with `true`] = js.undefined,
    returnCanvas: js.UndefOr[Boolean] = js.undefined,
    sourceX: js.UndefOr[Double] = js.undefined,
    sourceY: js.UndefOr[Double] = js.undefined
  ): DownscaleOptionsreturnBlo = {
    val __obj = js.Dynamic.literal()
    if (imageType != null) __obj.updateDynamic("imageType")(imageType.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnBlob)) __obj.updateDynamic("returnBlob")(returnBlob.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnCanvas)) __obj.updateDynamic("returnCanvas")(returnCanvas.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceX)) __obj.updateDynamic("sourceX")(sourceX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sourceY)) __obj.updateDynamic("sourceY")(sourceY.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownscaleOptionsreturnBlo]
  }
}

