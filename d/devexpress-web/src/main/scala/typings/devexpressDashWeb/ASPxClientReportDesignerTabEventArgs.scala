package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportTabClosed event.
  */
trait ASPxClientReportDesignerTabEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report tab currently being processed.
    * Value: An object that specifies the report tab currently being processed.
    */
  var Tab: ASPxDesignerNavigateTab
}

object ASPxClientReportDesignerTabEventArgs {
  @scala.inline
  def apply(Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabEventArgs = {
    val __obj = js.Dynamic.literal(Tab = Tab)
  
    __obj.asInstanceOf[ASPxClientReportDesignerTabEventArgs]
  }
}

