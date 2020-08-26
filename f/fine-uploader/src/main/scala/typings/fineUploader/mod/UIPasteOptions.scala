package typings.fineUploader.mod

import typings.fineUploader.coreMod.PasteOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIPasteOptions extends PasteOptions {
  /**
    * Text that will appear in the `showPrompt` dialog.
    *
    * @default `Please name this image`
    */
  var namePromptMessage: js.UndefOr[String] = js.native
  /**
    * Enable or disable the usage of `showPrompt` by Fine Uploader to prompt the user for a filename for a pasted file
    *
    * @default `false`
    */
  var promptForName: js.UndefOr[Boolean] = js.native
}

object UIPasteOptions {
  @scala.inline
  def apply(): UIPasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIPasteOptions]
  }
  @scala.inline
  implicit class UIPasteOptionsOps[Self <: UIPasteOptions] (val x: Self) extends AnyVal {
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
    def setNamePromptMessage(value: String): Self = this.set("namePromptMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamePromptMessage: Self = this.set("namePromptMessage", js.undefined)
    @scala.inline
    def setPromptForName(value: Boolean): Self = this.set("promptForName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromptForName: Self = this.set("promptForName", js.undefined)
  }
  
}

