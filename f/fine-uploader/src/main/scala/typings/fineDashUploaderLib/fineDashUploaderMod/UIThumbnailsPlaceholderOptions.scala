package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIThumbnailsPlaceholderOptions extends js.Object {
  /**
    * Absolute URL or relative path to the image to display if the preview/thumbnail could not be generated/displayed
    *
    * @default `null`
    */
  var notAvailablePath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set this to true if you want the 'waiting' placeholder image to remain in place until the server response has been parsed.
    *
    * This is useful if you expect to return thumbnail URLs in your upload responses for files types that cannot be previewed.
    * This option is ignored in older browsers where client-side previews cannot be generated
    *
    * @default `false`
    */
  var waitUntilResponse: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Absolute URL or relative path to the image to display during preview generation (modern browsers) or until the server response has been parsed (older browsers)
    *
    * @default `null`
    */
  var waitingPath: js.UndefOr[java.lang.String] = js.undefined
}

object UIThumbnailsPlaceholderOptions {
  @scala.inline
  def apply(
    notAvailablePath: java.lang.String = null,
    waitUntilResponse: js.UndefOr[scala.Boolean] = js.undefined,
    waitingPath: java.lang.String = null
  ): UIThumbnailsPlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    if (notAvailablePath != null) __obj.updateDynamic("notAvailablePath")(notAvailablePath)
    if (!js.isUndefined(waitUntilResponse)) __obj.updateDynamic("waitUntilResponse")(waitUntilResponse)
    if (waitingPath != null) __obj.updateDynamic("waitingPath")(waitingPath)
    __obj.asInstanceOf[UIThumbnailsPlaceholderOptions]
  }
}

