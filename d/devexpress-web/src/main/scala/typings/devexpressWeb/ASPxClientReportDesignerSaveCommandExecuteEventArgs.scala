package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.SaveCommandExecute event.
  */
@js.native
trait ASPxClientReportDesignerSaveCommandExecuteEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var handled: Boolean = js.native
}
object ASPxClientReportDesignerSaveCommandExecuteEventArgs {
  
  @scala.inline
  def apply(handled: Boolean): ASPxClientReportDesignerSaveCommandExecuteEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerSaveCommandExecuteEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerSaveCommandExecuteEventArgsOps[Self <: ASPxClientReportDesignerSaveCommandExecuteEventArgs] (val x: Self) extends AnyVal {
    
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
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
}
