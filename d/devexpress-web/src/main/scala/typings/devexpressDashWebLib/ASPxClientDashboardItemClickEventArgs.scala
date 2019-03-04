package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ItemClick events.
  */
trait ASPxClientDashboardItemClickEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the name of the dashboard item for which the event has been raised.
    * Value: A string value that is the dashboard item name.
    */
  var ItemName: java.lang.String
  /**
    * Returns the axis point corresponding to the clicked visual element.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetAxisPoint(axisName: java.lang.String): ASPxClientDashboardItemDataAxisPoint
  /**
    * Gets the dashboard item's client data.
    */
  def GetData(): ASPxClientDashboardItemData
  /**
    * Gets deltas corresponding to the clicked visual element.
    */
  def GetDeltas(): js.Array[ASPxClientDashboardItemDataDelta]
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetDimensions(axisName: java.lang.String): js.Array[ASPxClientDashboardItemDataDimension]
  /**
    * Gets measures corresponding to the clicked visual element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure]
  /**
    * Requests underlying data corresponding to the clicked visual element.
    * @param onCompleted A ASPxClientDashboardItemRequestUnderlyingDataCompleted object that references a method executed after the request is completed.
    * @param dataMembers (Optional) An array of string values that specify data members used to obtain underlying data. If this parameter is not specified, underlying data for all available data members will be requested.
    */
  def RequestUnderlyingData(
    onCompleted: ASPxClientDashboardItemRequestUnderlyingDataCompleted,
    dataMembers: js.Array[java.lang.String]
  ): scala.Unit
}

object ASPxClientDashboardItemClickEventArgs {
  @scala.inline
  def apply(
    GetAxisPoint: js.Function1[java.lang.String, ASPxClientDashboardItemDataAxisPoint],
    GetData: js.Function0[ASPxClientDashboardItemData],
    GetDeltas: js.Function0[js.Array[ASPxClientDashboardItemDataDelta]],
    GetDimensions: js.Function1[java.lang.String, js.Array[ASPxClientDashboardItemDataDimension]],
    GetMeasures: js.Function0[js.Array[ASPxClientDashboardItemDataMeasure]],
    ItemName: java.lang.String,
    RequestUnderlyingData: js.Function2[
      ASPxClientDashboardItemRequestUnderlyingDataCompleted, 
      js.Array[java.lang.String], 
      scala.Unit
    ]
  ): ASPxClientDashboardItemClickEventArgs = {
    val __obj = js.Dynamic.literal(GetAxisPoint = GetAxisPoint, GetData = GetData, GetDeltas = GetDeltas, GetDimensions = GetDimensions, GetMeasures = GetMeasures, ItemName = ItemName, RequestUnderlyingData = RequestUnderlyingData)
  
    __obj.asInstanceOf[ASPxClientDashboardItemClickEventArgs]
  }
}

