package typings.devexpressWeb

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
@js.native
trait ASPxClientReportDesignerTabClosingEventArgs extends ASPxClientReportDesignerTabEventArgs {
  
  /**
    * Specifies whether or not the event was handled.
    */
  var Handled: Boolean = js.native
  
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  var ReadyToClose: JQueryDeferred[_] = js.native
}
object ASPxClientReportDesignerTabClosingEventArgs {
  
  @scala.inline
  def apply(Handled: Boolean, ReadyToClose: JQueryDeferred[_], Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabClosingEventArgs = {
    val __obj = js.Dynamic.literal(Handled = Handled.asInstanceOf[js.Any], ReadyToClose = ReadyToClose.asInstanceOf[js.Any], Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabClosingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerTabClosingEventArgsMutableBuilder[Self <: ASPxClientReportDesignerTabClosingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "Handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadyToClose(value: JQueryDeferred[_]): Self = StObject.set(x, "ReadyToClose", value.asInstanceOf[js.Any])
  }
}
