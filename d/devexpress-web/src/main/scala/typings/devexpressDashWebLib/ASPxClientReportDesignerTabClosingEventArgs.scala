package typings
package devexpressDashWebLib

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
  var Handled: scala.Boolean
  /**
    * Specifies the JQueryDeferred object, which when resolved, forces the report tab to be closed.
    * Value: A JQueryDeferred object.
    */
  var ReadyToClose: jqueryLib.JQueryDeferred[_]
}

