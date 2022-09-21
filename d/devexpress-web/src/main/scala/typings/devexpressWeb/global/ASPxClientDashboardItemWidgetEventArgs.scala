package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for events related to client widgets used to visualize data in dashboard items.
  */
@JSGlobal("ASPxClientDashboardItemWidgetEventArgs")
@js.native
open class ASPxClientDashboardItemWidgetEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemWidgetEventArgs {
  
  /**
    * Returns an underlying widget corresponding to the current dashboard item.
    */
  /* CompleteClass */
  override def GetWidget(): Any = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  var ItemName: String = js.native
}
