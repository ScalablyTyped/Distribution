package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosed event.
  */
trait ASPxClientReportDesignerTabEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Specifies the report tab currently being processed.
    */
  var Tab: ASPxDesignerNavigateTab
}
object ASPxClientReportDesignerTabEventArgs {
  
  inline def apply(Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabEventArgs = {
    val __obj = js.Dynamic.literal(Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabEventArgs]
  }
  
  extension [Self <: ASPxClientReportDesignerTabEventArgs](x: Self) {
    
    inline def setTab(value: ASPxDesignerNavigateTab): Self = StObject.set(x, "Tab", value.asInstanceOf[js.Any])
  }
}
