package typings.devexpressDashWeb

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ReportTabClosing event.
  */
trait ASPxClientReportDesignerTabClosingEventArgs extends ASPxClientReportDesignerTabEventArgs {
  /**
    * Specifies whether or not the event was handled.
    * Value: true, if the event was handled and no other processing should occur; otherwise, false.
    */
  var Handled: Boolean
  /**
    * Specifies the JQueryDeferred object, which when resolved, forces the report tab to be closed.
    * Value: A JQueryDeferred object.
    */
  var ReadyToClose: JQueryDeferred[_]
}

object ASPxClientReportDesignerTabClosingEventArgs {
  @scala.inline
  def apply(Handled: Boolean, ReadyToClose: JQueryDeferred[_], Tab: ASPxDesignerNavigateTab): ASPxClientReportDesignerTabClosingEventArgs = {
    val __obj = js.Dynamic.literal(Handled = Handled, ReadyToClose = ReadyToClose, Tab = Tab)
  
    __obj.asInstanceOf[ASPxClientReportDesignerTabClosingEventArgs]
  }
}

