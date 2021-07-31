package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the events related to opening and saving reports in the Web Report Designer.
  */
trait ASPxClientReportDesignerDialogEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the report currently being processed.
    */
  var Report: js.Any
  
  /**
    * Specifies the URL of the report currently being processed.
    */
  var Url: String
}
object ASPxClientReportDesignerDialogEventArgs {
  
  @scala.inline
  def apply(Report: js.Any, Url: String): ASPxClientReportDesignerDialogEventArgs = {
    val __obj = js.Dynamic.literal(Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerDialogEventArgsMutableBuilder[Self <: ASPxClientReportDesignerDialogEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReport(value: js.Any): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
