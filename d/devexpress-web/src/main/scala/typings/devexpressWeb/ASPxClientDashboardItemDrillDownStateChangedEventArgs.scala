package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
@JSGlobal("ASPxClientDashboardItemDrillDownStateChangedEventArgs")
@js.native
class ASPxClientDashboardItemDrillDownStateChangedEventArgs () extends ASPxClientDashboardItemEventArgs {
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  var Action: String = js.native
  /**
    * Gets values from the current drill-down hierarchy.
    */
  var Values: js.Array[_] = js.native
}

