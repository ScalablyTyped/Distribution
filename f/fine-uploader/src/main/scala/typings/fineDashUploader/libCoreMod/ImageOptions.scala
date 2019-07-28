package typings.fineDashUploader.libCoreMod

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
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null
  ): ImageOptions = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
}

