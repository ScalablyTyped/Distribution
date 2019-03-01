package typings
package fineDashUploaderLib.fineDashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UITextOptions
  extends fineDashUploaderLib.libCoreMod.TextOptions {
  /**
    * Text that appears next to a failed item
    *
    * @default `'Upload failed'`
    */
  var failUpload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Appears next to a currently uploading item
    *
    * @default `'{percent}% of {total_size}'`
    */
  var formatProgress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Appears next to a paused item
    *
    * @default `'paused'`
    */
  var paused: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Appears next to item once the last bytes have been sent (differs on the user-agent)
    *
    * @default `'Processing...'`
    */
  var waitingForResponse: js.UndefOr[java.lang.String] = js.undefined
}

object UITextOptions {
  @scala.inline
  def apply(
    defaultResponseError: java.lang.String = null,
    failUpload: java.lang.String = null,
    fileInputTitle: java.lang.String = null,
    formatProgress: java.lang.String = null,
    paused: java.lang.String = null,
    sizeSymbols: js.Array[java.lang.String] = null,
    waitingForResponse: java.lang.String = null
  ): UITextOptions = {
    val __obj = js.Dynamic.literal()
    if (defaultResponseError != null) __obj.updateDynamic("defaultResponseError")(defaultResponseError)
    if (failUpload != null) __obj.updateDynamic("failUpload")(failUpload)
    if (fileInputTitle != null) __obj.updateDynamic("fileInputTitle")(fileInputTitle)
    if (formatProgress != null) __obj.updateDynamic("formatProgress")(formatProgress)
    if (paused != null) __obj.updateDynamic("paused")(paused)
    if (sizeSymbols != null) __obj.updateDynamic("sizeSymbols")(sizeSymbols)
    if (waitingForResponse != null) __obj.updateDynamic("waitingForResponse")(waitingForResponse)
    __obj.asInstanceOf[UITextOptions]
  }
}

