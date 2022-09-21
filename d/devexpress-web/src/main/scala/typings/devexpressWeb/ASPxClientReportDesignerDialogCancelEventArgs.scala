package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogCancelEventArgs
  extends StObject
     with ASPxClientReportDesignerDialogEventArgs {
  
  /**
    * Specifies whether or not the operation performed with a report should be canceled.
    */
  var Cancel: Boolean
}
object ASPxClientReportDesignerDialogCancelEventArgs {
  
  inline def apply(Cancel: Boolean, Report: Any, Url: String): ASPxClientReportDesignerDialogCancelEventArgs = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogCancelEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerDialogCancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
