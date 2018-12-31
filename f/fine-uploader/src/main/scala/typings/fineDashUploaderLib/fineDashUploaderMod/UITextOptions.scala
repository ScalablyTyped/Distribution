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

