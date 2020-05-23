package typings.devexpressWeb

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
trait ASPxClientReportDesignerTabClosingEventArgs extends ASPxClientReportDesignerTabEventArgs {
  /**
    * Specifies whether or not the event was handled.
    */
  var Handled: Boolean
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  var ReadyToClose: JQueryDeferred[_]
}

object ASPxClientReportDesignerTabClosingEventArgs {
  @scala.inline
  def apply(Handled: Boolean, ReadyToClose: JQueryDeferred[_], Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabClosingEventArgs = {
    val __obj = js.Dynamic.literal(Handled = Handled.asInstanceOf[js.Any], ReadyToClose = ReadyToClose.asInstanceOf[js.Any], Tab = Tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportDesignerTabClosingEventArgs]
  }
}

