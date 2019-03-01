package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkArounds extends js.Object {
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader always have a `multiple` attribute present.
    *
    * This only applies to iOS8 Chrome and iOS8 UIWebView, and is put in place to work around an issue that causes the browser to crash when a file input element does not contain a `multiple` attribute inside of a `UIWebView` container created by an iOS8 app compiled with and iOS7 SDK
    *
    * @default `false`
    */
  var ios8BrowserCrash: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disables Fine Uploader and displays a message to the user in iOS 8.0.0 Safari.
    *
    * Due to serious bugs in iOS 8.0.0 Safari, uploading is not possible.
    * This was apparently fixed in subsequent builds of iOS8, so this workaround only targets 8.0.0
    *
    * @default `true`
    */
  var ios8SafariUploads: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader do NOT contain a `multiple` attribute to work around an issue present in iOS7 & 8 that otherwise results in 0-sized uploaded videos
    *
    * @default `true`
    */
  var iosEmptyVideos: js.UndefOr[scala.Boolean] = js.undefined
}

object WorkArounds {
  @scala.inline
  def apply(
    ios8BrowserCrash: js.UndefOr[scala.Boolean] = js.undefined,
    ios8SafariUploads: js.UndefOr[scala.Boolean] = js.undefined,
    iosEmptyVideos: js.UndefOr[scala.Boolean] = js.undefined
  ): WorkArounds = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ios8BrowserCrash)) __obj.updateDynamic("ios8BrowserCrash")(ios8BrowserCrash)
    if (!js.isUndefined(ios8SafariUploads)) __obj.updateDynamic("ios8SafariUploads")(ios8SafariUploads)
    if (!js.isUndefined(iosEmptyVideos)) __obj.updateDynamic("iosEmptyVideos")(iosEmptyVideos)
    __obj.asInstanceOf[WorkArounds]
  }
}

