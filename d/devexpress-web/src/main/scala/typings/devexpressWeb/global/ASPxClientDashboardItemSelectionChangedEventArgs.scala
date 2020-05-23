package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
@JSGlobal("ASPxClientDashboardItemSelectionChangedEventArgs")
@js.native
class ASPxClientDashboardItemSelectionChangedEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemSelectionChangedEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
  /**
    * Gets currently selected elements.
    */
  /* CompleteClass */
  override def GetCurrentSelection(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPointTuple] = js.native
}

