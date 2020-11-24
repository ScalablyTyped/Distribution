package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
@js.native
trait ASPxClientReportDesignerDialogCancelEventArgs extends ASPxClientReportDesignerDialogEventArgs {
  
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    */
  var Cancel: Boolean = js.native
}
object ASPxClientReportDesignerDialogCancelEventArgs {
  
  @scala.inline
  def apply(Cancel: Boolean, Report: js.Any, Url: String): ASPxClientReportDesignerDialogCancelEventArgs = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogCancelEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerDialogCancelEventArgsOps[Self <: ASPxClientReportDesignerDialogCancelEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
  }
}
