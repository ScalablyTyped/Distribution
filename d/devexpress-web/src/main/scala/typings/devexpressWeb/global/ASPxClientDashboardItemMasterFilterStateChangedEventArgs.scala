package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
@JSGlobal("ASPxClientDashboardItemMasterFilterStateChangedEventArgs")
@js.native
class ASPxClientDashboardItemMasterFilterStateChangedEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  /**
    * Gets the component name of the dashboard item.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
  /**
    * Gets the currently selected values.
    */
  /* CompleteClass */
  override var Values: js.Array[js.Array[js.Object]] = js.native
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

