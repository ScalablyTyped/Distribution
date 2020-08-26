package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JavascriptDialogOpeningEvent extends js.Object {
  /**
    * Default dialog prompt.
    */
  var defaultPrompt: js.UndefOr[String] = js.native
  /**
    * True iff browser is capable showing or acting on the given dialog. When browser has no
    * dialog handler for given target, calling alert while Page domain is engaged will stall
    * the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
    */
  var hasBrowserHandler: Boolean = js.native
  /**
    * Message that will be displayed by the dialog.
    */
  var message: String = js.native
  /**
    * Dialog type.
    */
  var `type`: DialogType = js.native
  /**
    * Frame url.
    */
  var url: String = js.native
}

object JavascriptDialogOpeningEvent {
  @scala.inline
  def apply(hasBrowserHandler: Boolean, message: String, `type`: DialogType, url: String): JavascriptDialogOpeningEvent = {
    val __obj = js.Dynamic.literal(hasBrowserHandler = hasBrowserHandler.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JavascriptDialogOpeningEvent]
  }
  @scala.inline
  implicit class JavascriptDialogOpeningEventOps[Self <: JavascriptDialogOpeningEvent] (val x: Self) extends AnyVal {
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
    def setHasBrowserHandler(value: Boolean): Self = this.set("hasBrowserHandler", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: DialogType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPrompt(value: String): Self = this.set("defaultPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultPrompt: Self = this.set("defaultPrompt", js.undefined)
  }
  
}

