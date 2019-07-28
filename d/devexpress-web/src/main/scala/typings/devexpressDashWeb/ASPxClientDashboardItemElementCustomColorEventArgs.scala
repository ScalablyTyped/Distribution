package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemElementCustomColor events.
  */
trait ASPxClientDashboardItemElementCustomColorEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the component name of the dashboard item for which the event was raised.
    * Value: A string value that is the component name of the dashboard item for which the event was raised.
    */
  var ItemName: String
  /**
    * Gets the color of the current dashboard item element.
    */
  def GetColor(): String
  /**
    * Gets measures corresponding to the current dashboard item element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure]
  /**
    * Gets the axis point tuple that corresponds to the current dashboard item element.
    */
  def GetTargetElement(): ASPxClientDashboardItemDataAxisPointTuple
  /**
    * Sets the color of the current dashboard item element.
    * @param color A String that specifies the color of the current dashboard item element.
    */
  def SetColor(color: String): Unit
}

object ASPxClientDashboardItemElementCustomColorEventArgs {
  @scala.inline
  def apply(
    GetColor: () => String,
    GetMeasures: () => js.Array[ASPxClientDashboardItemDataMeasure],
    GetTargetElement: () => ASPxClientDashboardItemDataAxisPointTuple,
    ItemName: String,
    SetColor: String => Unit
  ): ASPxClientDashboardItemElementCustomColorEventArgs = {
    val __obj = js.Dynamic.literal(GetColor = js.Any.fromFunction0(GetColor), GetMeasures = js.Any.fromFunction0(GetMeasures), GetTargetElement = js.Any.fromFunction0(GetTargetElement), ItemName = ItemName, SetColor = js.Any.fromFunction1(SetColor))
  
    __obj.asInstanceOf[ASPxClientDashboardItemElementCustomColorEventArgs]
  }
}

