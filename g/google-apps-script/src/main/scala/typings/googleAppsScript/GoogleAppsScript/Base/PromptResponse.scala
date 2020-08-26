package typings.googleAppsScript.GoogleAppsScript.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to a prompt dialog displayed in the
  * user-interface environment for a Google App. The response contains any text the user entered in
  * the dialog's input field and indicates which button the user clicked to dismiss the dialog.
  *
  *     // Display a dialog box with a title, message, input field, and "Yes" and "No" buttons. The
  *     // user can also close the dialog by clicking the close button in its title bar.
  *     var ui = DocumentApp.getUi();
  *     var response = ui.prompt('Getting to know you', 'May I know your name?', ui.ButtonSet.YES_NO);
  *
  *     // Process the user's response.
  *     if (response.getSelectedButton() == ui.Button.YES) {
  *       Logger.log('The user\'s name is %s.', response.getResponseText());
  *     } else if (response.getSelectedButton() == ui.Button.NO) {
  *       Logger.log('The user didn\'t want to provide a name.');
  *     } else {
  *       Logger.log('The user clicked the close button in the dialog\'s title bar.');
  *     }
  */
@js.native
trait PromptResponse extends js.Object {
  def getResponseText(): String = js.native
  def getSelectedButton(): Button = js.native
}

object PromptResponse {
  @scala.inline
  def apply(getResponseText: () => String, getSelectedButton: () => Button): PromptResponse = {
    val __obj = js.Dynamic.literal(getResponseText = js.Any.fromFunction0(getResponseText), getSelectedButton = js.Any.fromFunction0(getSelectedButton))
    __obj.asInstanceOf[PromptResponse]
  }
  @scala.inline
  implicit class PromptResponseOps[Self <: PromptResponse] (val x: Self) extends AnyVal {
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
    def setGetResponseText(value: () => String): Self = this.set("getResponseText", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedButton(value: () => Button): Self = this.set("getSelectedButton", js.Any.fromFunction0(value))
  }
  
}

