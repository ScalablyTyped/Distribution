package typings.devexpressDashWeb

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportDesigner.ReportTabClosing event.
  */
@JSGlobal("ASPxClientReportDesignerTabClosingEventArgs")
@js.native
class ASPxClientReportDesignerTabClosingEventArgs protected () extends ASPxClientReportDesignerTabEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportDesignerTabClosingEventArgs class with the specified settings.
    * @param tab An object that specifies the report tab. This value is assigned to the ASPxClientReportDesignerTabEventArgs.Tab property.
    * @param readyToClose A JQuery Deferred object, which when resolved, forces the report tab to be closed. This value is assigned to the ASPxClientReportDesignerTabClosingEventArgs.ReadyToClose property.
    */
  def this(tab: ASPxDesignerNavigateTab, readyToClose: JQueryDeferred[_]) = this()
  /**
    * Specifies whether or not the event was handled.
    */
  var Handled: Boolean = js.native
  /**
    * Specifies the JQuery Deferred object, which when resolved, forces the report tab to be closed.
    */
  var ReadyToClose: JQueryDeferred[_] = js.native
}

