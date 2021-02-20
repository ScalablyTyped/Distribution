package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosed event.
  */
@js.native
trait ASPxClientReportDesignerTabEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies the report tab currently being processed.
    */
  var Tab: ASPxDesignerNavigateTab = js.native
}
object ASPxClientReportDesignerTabEventArgs {
  
  @scala.inline
  def apply(Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabEventArgs = {
    val __obj = js.Dynamic.literal(Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportDesignerTabEventArgsMutableBuilder[Self <: ASPxClientReportDesignerTabEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTab(value: ASPxDesignerNavigateTab): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
  }
}
