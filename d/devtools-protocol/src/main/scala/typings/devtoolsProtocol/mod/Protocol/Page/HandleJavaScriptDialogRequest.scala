package typings.devtoolsProtocol.mod.Protocol.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleJavaScriptDialogRequest extends js.Object {
  
  /**
    * Whether to accept or dismiss the dialog.
    */
  var accept: Boolean = js.native
  
  /**
    * The text to enter into the dialog prompt before accepting. Used only if this is a prompt
    * dialog.
    */
  var promptText: js.UndefOr[String] = js.native
}
object HandleJavaScriptDialogRequest {
  
  @scala.inline
  def apply(accept: Boolean): HandleJavaScriptDialogRequest = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleJavaScriptDialogRequest]
  }
  
  @scala.inline
  implicit class HandleJavaScriptDialogRequestOps[Self <: HandleJavaScriptDialogRequest] (val x: Self) extends AnyVal {
    
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
    def setAccept(value: Boolean): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromptText(value: String): Self = this.set("promptText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromptText: Self = this.set("promptText", js.undefined)
  }
}
