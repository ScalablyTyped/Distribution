package typings.fineDashUploader.fineDashUploaderMod

import typings.fineDashUploader.libCoreMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITextOptions extends TextOptions {
  /**
    * Text that appears next to a failed item
    *
    * @default `'Upload failed'`
    */
  var failUpload: js.UndefOr[String] = js.undefined
  /**
    * Appears next to a currently uploading item
    *
    * @default `'{percent}% of {total_size}'`
    */
  var formatProgress: js.UndefOr[String] = js.undefined
  /**
    * Appears next to a paused item
    *
    * @default `'paused'`
    */
  var paused: js.UndefOr[String] = js.undefined
  /**
    * Appears next to item once the last bytes have been sent (differs on the user-agent)
    *
    * @default `'Processing...'`
    */
  var waitingForResponse: js.UndefOr[String] = js.undefined
}

object UITextOptions {
  @scala.inline
  def apply(
    defaultResponseError: String = null,
    failUpload: String = null,
    fileInputTitle: String = null,
    formatProgress: String = null,
    paused: String = null,
    sizeSymbols: js.Array[String] = null,
    waitingForResponse: String = null
  ): UITextOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultResponseError != null) __obj.updateDynamic("defaultResponseError")(defaultResponseError.asInstanceOf[js.Any])
    if (failUpload != null) __obj.updateDynamic("failUpload")(failUpload.asInstanceOf[js.Any])
    if (fileInputTitle != null) __obj.updateDynamic("fileInputTitle")(fileInputTitle.asInstanceOf[js.Any])
    if (formatProgress != null) __obj.updateDynamic("formatProgress")(formatProgress.asInstanceOf[js.Any])
    if (paused != null) __obj.updateDynamic("paused")(paused.asInstanceOf[js.Any])
    if (sizeSymbols != null) __obj.updateDynamic("sizeSymbols")(sizeSymbols.asInstanceOf[js.Any])
    if (waitingForResponse != null) __obj.updateDynamic("waitingForResponse")(waitingForResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UITextOptions]
  }
}

