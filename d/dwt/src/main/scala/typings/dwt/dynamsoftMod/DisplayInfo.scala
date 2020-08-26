package typings.dwt.dynamsoftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayInfo extends js.Object {
  var buttons: js.Any = js.native
  var customProgressText: js.Any = js.native
  var dialogText: js.Any = js.native
  var errorMessages: js.Any = js.native
  var generalMessages: js.Any = js.native
}

object DisplayInfo {
  @scala.inline
  def apply(
    buttons: js.Any,
    customProgressText: js.Any,
    dialogText: js.Any,
    errorMessages: js.Any,
    generalMessages: js.Any
  ): DisplayInfo = {
    val __obj = js.Dynamic.literal(buttons = buttons.asInstanceOf[js.Any], customProgressText = customProgressText.asInstanceOf[js.Any], dialogText = dialogText.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any], generalMessages = generalMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayInfo]
  }
  @scala.inline
  implicit class DisplayInfoOps[Self <: DisplayInfo] (val x: Self) extends AnyVal {
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
    def setButtons(value: js.Any): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomProgressText(value: js.Any): Self = this.set("customProgressText", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogText(value: js.Any): Self = this.set("dialogText", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessages(value: js.Any): Self = this.set("errorMessages", value.asInstanceOf[js.Any])
    @scala.inline
    def setGeneralMessages(value: js.Any): Self = this.set("generalMessages", value.asInstanceOf[js.Any])
  }
  
}

