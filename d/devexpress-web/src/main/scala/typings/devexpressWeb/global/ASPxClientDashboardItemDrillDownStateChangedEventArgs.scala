package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
@JSGlobal("ASPxClientDashboardItemDrillDownStateChangedEventArgs")
@js.native
class ASPxClientDashboardItemDrillDownStateChangedEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  /* CompleteClass */
  override var Action: String = js.native
  /**
    * Gets the component name of the dashboard item.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
  /**
    * Gets values from the current drill-down hierarchy.
    */
  /* CompleteClass */
  override var Values: js.Array[_] = js.native
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsNullValue(value: js.Any): Boolean = js.native
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsOthersValue(value: js.Any): Boolean = js.native
}

