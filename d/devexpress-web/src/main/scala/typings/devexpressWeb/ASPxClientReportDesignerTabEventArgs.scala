package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosed event.
  */
@JSGlobal("ASPxClientReportDesignerTabEventArgs")
@js.native
class ASPxClientReportDesignerTabEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerTabEventArgs class with the specified settings.
    * @param tab An object that specifies the report tab. This value is assigned to the ASPxClientReportDesignerTabEventArgs.Tab property.
    */
  def this(tab: ASPxDesignerNavigateTab) = this()
  /**
    * Specifies the report tab currently being processed.
    */
  var Tab: ASPxDesignerNavigateTab = js.native
}

