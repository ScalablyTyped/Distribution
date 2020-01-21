package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.DashboardInitializing event.
  */
@JSGlobal("ASPxClientDashboardInitializingEventArgs")
@js.native
class ASPxClientDashboardInitializingEventArgs () extends ASPxClientEventArgs {
  /**
    * Gets a model of the dashboard displayed in the control.
    */
  var Dashboard: js.Any = js.native
  /**
    * Gets a string value that is the dashboard identifier.
    */
  var DashboardId: String = js.native
  /**
    * Specifies a Promise object to observe when all actions of a certain type bound to the collection, queued or not, have finished.
    */
  var Ready: js.Any = js.native
}

