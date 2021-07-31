package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemElementCustomColor event.
  */
@JSGlobal("ASPxClientDashboardItemElementCustomColorEventArgs")
@js.native
class ASPxClientDashboardItemElementCustomColorEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientDashboardItemElementCustomColorEventArgs {
  
  /**
    * Gets the color of the current dashboard item element.
    */
  /* CompleteClass */
  override def GetColor(): String = js.native
  
  /**
    * Gets measures corresponding to the current dashboard item element.
    */
  /* CompleteClass */
  override def GetMeasures(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataMeasure] = js.native
  
  /**
    * Gets the axis point tuple that corresponds to the current dashboard item element.
    */
  /* CompleteClass */
  override def GetTargetElement(): typings.devexpressWeb.ASPxClientDashboardItemDataAxisPointTuple = js.native
  
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  var ItemName: String = js.native
  
  /**
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  /* CompleteClass */
  override def SetColor(color: String): Unit = js.native
}
