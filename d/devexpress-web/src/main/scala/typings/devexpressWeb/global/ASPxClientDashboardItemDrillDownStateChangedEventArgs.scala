package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemDrillDownStateChanged event.
  */
@JSGlobal("ASPxClientDashboardItemDrillDownStateChangedEventArgs")
@js.native
open class ASPxClientDashboardItemDrillDownStateChangedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemDrillDownStateChangedEventArgs {
  
  /**
    * Gets the drill-down action performed in the dashboard item.
    */
  /* CompleteClass */
  var Action: String = js.native
  
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
    * Gets values from the current drill-down hierarchy.
    */
  /* CompleteClass */
  var Values: js.Array[Any] = js.native
}
