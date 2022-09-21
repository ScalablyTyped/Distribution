package typings.devexpressWeb

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
trait ASPxClientReportDesignerTabClosingEventArgs
  extends StObject
     with ASPxClientReportDesignerTabEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var Handled: Boolean
  
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  var ReadyToClose: JQueryDeferred[Any]
}
object ASPxClientReportDesignerTabClosingEventArgs {
  
  inline def apply(Handled: Boolean, ReadyToClose: JQueryDeferred[Any], Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabClosingEventArgs = {
    val __obj = js.Dynamic.literal(Handled = Handled.asInstanceOf[js.Any], ReadyToClose = ReadyToClose.asInstanceOf[js.Any], Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabClosingEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerTabClosingEventArgs](x: Self) {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
    
    inline def setReadyToClose(value: JQueryDeferred[Any]): Self = StObject.set(x, "ReadyToClose", value.asInstanceOf[js.Any])
  }
}
