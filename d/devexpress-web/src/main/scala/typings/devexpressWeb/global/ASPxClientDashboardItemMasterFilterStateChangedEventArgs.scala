package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemMasterFilterStateChanged event.
  */
@JSGlobal("ASPxClientDashboardItemMasterFilterStateChangedEventArgs")
@js.native
open class ASPxClientDashboardItemMasterFilterStateChangedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemMasterFilterStateChangedEventArgs {
  
  /**
    * Returns whether the specified value is null. true, if the specified value is null; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsNullValue(value: Any): Boolean = js.native
  
  /**
    * Returns whether the specified value is 'others'. true, if the specified value is 'others'; otherwise, false.
    * @param value The specified value.
    */
  /* CompleteClass */
  override def IsOthersValue(value: Any): Boolean = js.native
  
  /**
    * Gets the component name of the dashboard item.
    */
  /* CompleteClass */
  var ItemName: String = js.native
  
  /**
    * Gets the currently selected values.
    */
  /* CompleteClass */
  var Values: js.Array[js.Array[js.Object]] = js.native
}
