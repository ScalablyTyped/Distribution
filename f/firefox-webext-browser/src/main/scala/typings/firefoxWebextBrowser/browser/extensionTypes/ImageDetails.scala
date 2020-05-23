package typings.firefoxWebextBrowser.browser.extensionTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Details about the format and quality of an image. */
trait ImageDetails extends js.Object {
  /** The format of the resulting image. Default is `"jpeg"`. */
  var format: js.UndefOr[ImageFormat] = js.undefined
  /**
    * When format is `"jpeg"`, controls the quality of the resulting image. This value is ignored for PNG images.
    * As quality is decreased, the resulting image will have more visual artifacts, and the number of bytes needed
    * to store it will decrease.
    */
  var quality: js.UndefOr[Double] = js.undefined
}

object ImageDetails {
  @scala.inline
  def apply(format: ImageFormat = null, quality: js.UndefOr[Double] = js.undefined): ImageDetails = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDetails]
  }
}

