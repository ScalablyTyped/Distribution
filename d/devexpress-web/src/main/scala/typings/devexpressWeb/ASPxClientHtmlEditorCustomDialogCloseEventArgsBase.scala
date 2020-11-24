package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
@js.native
trait ASPxClientHtmlEditorCustomDialogCloseEventArgsBase extends ASPxClientHtmlEditorCustomDialogEventArgs {
  
  /**
    * Gets the status of the closed custom dialog.
    */
  var status: js.Any = js.native
}
object ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  
  @scala.inline
  def apply(name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogCloseEventArgsBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogCloseEventArgsBase]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogCloseEventArgsBaseOps[Self <: ASPxClientHtmlEditorCustomDialogCloseEventArgsBase] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
