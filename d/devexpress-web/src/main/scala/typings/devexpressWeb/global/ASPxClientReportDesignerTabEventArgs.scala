package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosed event.
  */
@JSGlobal("ASPxClientReportDesignerTabEventArgs")
@js.native
open class ASPxClientReportDesignerTabEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportDesignerTabEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerTabEventArgs class with the specified settings.
    * @param tab An object that specifies the report tab. This value is assigned to the ASPxClientReportDesignerTabEventArgs.Tab property.
    */
  def this(tab: typings.devexpressWeb.ASPxDesignerNavigateTab) = this()
  
  /**
    * Specifies the report tab currently being processed.
    */
  /* CompleteClass */
  var Tab: typings.devexpressWeb.ASPxDesignerNavigateTab = js.native
}
