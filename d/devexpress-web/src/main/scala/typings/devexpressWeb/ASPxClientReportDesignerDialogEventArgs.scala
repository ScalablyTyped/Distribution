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
  var Report: Any
  
  /**
    * Specifies the URL of the report currently being processed.
    */
  var Url: String
}
object ASPxClientReportDesignerDialogEventArgs {
  
  inline def apply(Report: Any, Url: String): ASPxClientReportDesignerDialogEventArgs = {
    val __obj = js.Dynamic.literal(Report = Report.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerDialogEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientReportDesignerDialogEventArgs] (val x: Self) extends AnyVal {
    
    inline def setReport(value: Any): Self = StObject.set(x, "Report", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
