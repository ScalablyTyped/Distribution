package typings.devexpressWeb

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientReportDesignerTabClosingEventArgsOps[Self <: ASPxClientReportDesignerTabClosingEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("Handled", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadyToClose(value: JQueryDeferred[_]): Self = this.set("ReadyToClose", value.asInstanceOf[js.Any])
  }
  
}

