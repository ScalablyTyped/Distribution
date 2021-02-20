package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
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
  implicit class ASPxClientReportDesignerDialogCancelEventArgsMutableBuilder[Self <: ASPxClientReportDesignerDialogCancelEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
