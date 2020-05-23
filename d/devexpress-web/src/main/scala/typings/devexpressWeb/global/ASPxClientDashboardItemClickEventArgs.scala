package typings.devexpressWeb.global

import typings.devexpressWeb.ASPxClientDashboardItemRequestUnderlyingDataCompleted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientDashboard.ItemClick event.
  */
@JSGlobal("ASPxClientDashboardItemClickEventArgs")
@js.native
class ASPxClientDashboardItemClickEventArgs ()
  extends typings.devexpressWeb.ASPxClientDashboardItemClickEventArgs {
  /**
    * Gets the name of the dashboard item for which the event has been raised.
    */
  /* CompleteClass */
  override var ItemName: String = js.native
  /**
    * Returns the axis point corresponding to the clicked visual element. An ASPxClientDashboardItemDataAxisPoint object that is the axis point.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  /* CompleteClass */
  override def GetAxisPoint(axisName: String): typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint = js.native
  /**
    * Gets the dashboard item's client data.
    */
  /* CompleteClass */
  override def GetData(): typings.devexpressWeb.ASPxClientDashboardItemData = js.native
  /**
    * Gets deltas corresponding to the clicked visual element.
    */
  /* CompleteClass */
  override def GetDeltas(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataDelta] = js.native
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis. An array of ASPxClientDashboardItemDataDimension objects that contain the dimension metadata.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  /* CompleteClass */
  override def GetDimensions(axisName: String): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataDimension] = js.native
  /**
    * Gets measures corresponding to the clicked visual element.
    */
  /* CompleteClass */
  override def GetMeasures(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataMeasure] = js.native
  /**
    * Requests underlying data corresponding to the clicked visual element.
    * @param onCompleted A ASPxClientDashboardItemRequestUnderlyingDataCompleted object that references a method executed after the request is completed.
    * @param dataMembers (Optional) An array of string values that specify data members used to obtain underlying data. If this parameter is not specified, underlying data for all available data members will be requested.
    */
  /* CompleteClass */
  override def RequestUnderlyingData(onCompleted: ASPxClientDashboardItemRequestUnderlyingDataCompleted, dataMembers: js.Array[String]): Unit = js.native
}

