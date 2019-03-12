package typings
package devexpressDashWebLib

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
  var ItemName: java.lang.String
  /**
    * Gets the color of the current dashboard item element.
    */
  def GetColor(): java.lang.String
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
  def SetColor(color: java.lang.String): scala.Unit
}

object ASPxClientDashboardItemElementCustomColorEventArgs {
  @scala.inline
  def apply(
    GetColor: () => java.lang.String,
    GetMeasures: () => js.Array[ASPxClientDashboardItemDataMeasure],
    GetTargetElement: () => ASPxClientDashboardItemDataAxisPointTuple,
    ItemName: java.lang.String,
    SetColor: java.lang.String => scala.Unit
  ): ASPxClientDashboardItemElementCustomColorEventArgs = {
    val __obj = js.Dynamic.literal(GetColor = js.Any.fromFunction0(GetColor), GetMeasures = js.Any.fromFunction0(GetMeasures), GetTargetElement = js.Any.fromFunction0(GetTargetElement), ItemName = ItemName, SetColor = js.Any.fromFunction1(SetColor))
  
    __obj.asInstanceOf[ASPxClientDashboardItemElementCustomColorEventArgs]
  }
}

