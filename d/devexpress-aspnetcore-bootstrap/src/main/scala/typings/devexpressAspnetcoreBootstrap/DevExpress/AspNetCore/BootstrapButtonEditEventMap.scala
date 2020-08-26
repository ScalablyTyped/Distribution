package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BootstrapButtonEditEventMap extends BootstrapClientEditEventMap {
  var buttonClick: ButtonEditClickEventArgs = js.native
  var keyDown: EditKeyEventArgs = js.native
  var keyPress: EditKeyEventArgs = js.native
  var keyUp: EditKeyEventArgs = js.native
  var textChanged: ProcessingModeEventArgs = js.native
  var userInput: EventArgs = js.native
}

object BootstrapButtonEditEventMap {
  @scala.inline
  def apply(
    buttonClick: ButtonEditClickEventArgs,
    gotFocus: EventArgs,
    init: EventArgs,
    keyDown: EditKeyEventArgs,
    keyPress: EditKeyEventArgs,
    keyUp: EditKeyEventArgs,
    lostFocus: EventArgs,
    textChanged: ProcessingModeEventArgs,
    userInput: EventArgs,
    validation: EditValidationEventArgs,
    valueChanged: ProcessingModeEventArgs
  ): BootstrapButtonEditEventMap = {
    val __obj = js.Dynamic.literal(buttonClick = buttonClick.asInstanceOf[js.Any], gotFocus = gotFocus.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], keyDown = keyDown.asInstanceOf[js.Any], keyPress = keyPress.asInstanceOf[js.Any], keyUp = keyUp.asInstanceOf[js.Any], lostFocus = lostFocus.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], userInput = userInput.asInstanceOf[js.Any], validation = validation.asInstanceOf[js.Any], valueChanged = valueChanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapButtonEditEventMap]
  }
  @scala.inline
  implicit class BootstrapButtonEditEventMapOps[Self <: BootstrapButtonEditEventMap] (val x: Self) extends AnyVal {
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
    def setButtonClick(value: ButtonEditClickEventArgs): Self = this.set("buttonClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyDown(value: EditKeyEventArgs): Self = this.set("keyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPress(value: EditKeyEventArgs): Self = this.set("keyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUp(value: EditKeyEventArgs): Self = this.set("keyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextChanged(value: ProcessingModeEventArgs): Self = this.set("textChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserInput(value: EventArgs): Self = this.set("userInput", value.asInstanceOf[js.Any])
  }
  
}

