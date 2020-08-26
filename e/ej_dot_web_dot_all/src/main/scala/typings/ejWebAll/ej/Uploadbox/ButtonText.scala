package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonText extends js.Object {
  /** Sets the text for the close button.
    */
  var Close: js.UndefOr[String] = js.native
  /** Sets the text for the browse button.
    */
  var browse: js.UndefOr[String] = js.native
  /** Sets the text for the cancel button.
    */
  var cancel: js.UndefOr[String] = js.native
  /** Sets the text for the Upload button inside the dialog popup.
    */
  var upload: js.UndefOr[String] = js.native
}

object ButtonText {
  @scala.inline
  def apply(): ButtonText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonText]
  }
  @scala.inline
  implicit class ButtonTextOps[Self <: ButtonText] (val x: Self) extends AnyVal {
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
    def setClose(value: String): Self = this.set("Close", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClose: Self = this.set("Close", js.undefined)
    @scala.inline
    def setBrowse(value: String): Self = this.set("browse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrowse: Self = this.set("browse", js.undefined)
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setUpload(value: String): Self = this.set("upload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload: Self = this.set("upload", js.undefined)
  }
  
}

