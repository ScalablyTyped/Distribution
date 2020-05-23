package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageOptions extends js.Object {
  /**
    * Restrict images to a maximum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Restrict images to a maximum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Restrict images to a minimum height in pixels (wherever possible)
    *
    * @default `0`
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  /**
    * Restrict images to a minimum width in pixels (wherever possible)
    *
    * @default `0`
    */
  var minWidth: js.UndefOr[Double] = js.undefined
}

object ImageOptions {
  @scala.inline
  def apply(
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minHeight: js.UndefOr[Double] = js.undefined,
    minWidth: js.UndefOr[Double] = js.undefined
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minHeight)) __obj.updateDynamic("minHeight")(minHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

