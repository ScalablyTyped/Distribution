package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemElementCustomColor event.
  */
@JSGlobal("ASPxClientDashboardItemElementCustomColorEventArgs")
@js.native
class ASPxClientDashboardItemElementCustomColorEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemElementCustomColorEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
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
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  /* CompleteClass */
  override def SetColor(color: String): Unit = js.native
}

