package typings.fineUploader.mod

import typings.fineUploader.coreMod.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UITextOptions extends TextOptions {
  /**
    * Text that appears next to a failed item
    *
    * @default `'Upload failed'`
    */
  var failUpload: js.UndefOr[String] = js.native
  /**
    * Appears next to a currently uploading item
    *
    * @default `'{percent}% of {total_size}'`
    */
  var formatProgress: js.UndefOr[String] = js.native
  /**
    * Appears next to a paused item
    *
    * @default `'paused'`
    */
  var paused: js.UndefOr[String] = js.native
  /**
    * Appears next to item once the last bytes have been sent (differs on the user-agent)
    *
    * @default `'Processing...'`
    */
  var waitingForResponse: js.UndefOr[String] = js.native
}

object UITextOptions {
  @scala.inline
  def apply(): UITextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UITextOptions]
  }
  @scala.inline
  implicit class UITextOptionsOps[Self <: UITextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFailUpload(value: String): Self = this.set("failUpload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailUpload: Self = this.set("failUpload", js.undefined)
    @scala.inline
    def setFormatProgress(value: String): Self = this.set("formatProgress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormatProgress: Self = this.set("formatProgress", js.undefined)
    @scala.inline
    def setPaused(value: String): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaused: Self = this.set("paused", js.undefined)
    @scala.inline
    def setWaitingForResponse(value: String): Self = this.set("waitingForResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitingForResponse: Self = this.set("waitingForResponse", js.undefined)
  }
  
}

