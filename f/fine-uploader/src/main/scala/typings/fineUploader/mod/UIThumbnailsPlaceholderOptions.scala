package typings.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIThumbnailsPlaceholderOptions extends js.Object {
  /**
    * Absolute URL or relative path to the image to display if the preview/thumbnail could not be generated/displayed
    *
    * @default `null`
    */
  var notAvailablePath: js.UndefOr[String] = js.undefined
  /**
    * Set this to true if you want the 'waiting' placeholder image to remain in place until the server response has been parsed.
    *
    * This is useful if you expect to return thumbnail URLs in your upload responses for files types that cannot be previewed.
    * This option is ignored in older browsers where client-side previews cannot be generated
    *
    * @default `false`
    */
  var waitUntilResponse: js.UndefOr[Boolean] = js.undefined
  /**
    * Absolute URL or relative path to the image to display during preview generation (modern browsers) or until the server response has been parsed (older browsers)
    *
    * @default `null`
    */
  var waitingPath: js.UndefOr[String] = js.undefined
}

object UIThumbnailsPlaceholderOptions {
  @scala.inline
  def apply(
    notAvailablePath: String = null,
    waitUntilResponse: js.UndefOr[Boolean] = js.undefined,
    waitingPath: String = null
  ): UIThumbnailsPlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    if (notAvailablePath != null) __obj.updateDynamic("notAvailablePath")(notAvailablePath.asInstanceOf[js.Any])
    if (!js.isUndefined(waitUntilResponse)) __obj.updateDynamic("waitUntilResponse")(waitUntilResponse.asInstanceOf[js.Any])
    if (waitingPath != null) __obj.updateDynamic("waitingPath")(waitingPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIThumbnailsPlaceholderOptions]
  }
}

