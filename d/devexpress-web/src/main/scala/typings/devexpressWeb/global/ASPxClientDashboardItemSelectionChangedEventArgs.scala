package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemSelectionChanged event.
  */
@JSGlobal("ASPxClientDashboardItemSelectionChangedEventArgs")
@js.native
open class ASPxClientDashboardItemSelectionChangedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemSelectionChangedEventArgs {
  
  /**
    * Gets currently selected elements.
    */
  /* CompleteClass */
  override def GetCurrentSelection(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPointTuple] = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  var ItemName: String = js.native
}
