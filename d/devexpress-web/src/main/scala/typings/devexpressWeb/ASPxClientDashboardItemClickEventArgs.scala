package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientDashboard.ItemClick event.
  */
trait ASPxClientDashboardItemClickEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the axis point corresponding to the clicked visual element. An ASPxClientDashboardItemDataAxisPoint object that is the axis point.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetAxisPoint(axisName: String): ASPxClientDashboardItemDataAxisPoint
  
  /**
    * Gets the dashboard item's client data.
    */
  def GetData(): ASPxClientDashboardItemData
  
  /**
    * Gets deltas corresponding to the clicked visual element.
    */
  def GetDeltas(): js.Array[ASPxClientDashboardItemDataDelta]
  
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis. An array of ASPxClientDashboardItemDataDimension objects that contain the dimension metadata.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetDimensions(axisName: String): js.Array[ASPxClientDashboardItemDataDimension]
  
  /**
    * Gets measures corresponding to the clicked visual element.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure]
  
  /**
    * Gets the name of the dashboard item for which the event has been raised.
    */
  var ItemName: String
  
  /**
    * Requests underlying data corresponding to the clicked visual element.
    * @param onCompleted A ASPxClientDashboardItemRequestUnderlyingDataCompleted object that references a method executed after the request is completed.
    * @param dataMembers (Optional) An array of string values that specify data members used to obtain underlying data. If this parameter is not specified, underlying data for all available data members will be requested.
    */
  def RequestUnderlyingData(onCompleted: ASPxClientDashboardItemRequestUnderlyingDataCompleted, dataMembers: js.Array[String]): Unit
}
object ASPxClientDashboardItemClickEventArgs {
  
  inline def apply(
    GetAxisPoint: String => ASPxClientDashboardItemDataAxisPoint,
    GetData: () => ASPxClientDashboardItemData,
    GetDeltas: () => js.Array[ASPxClientDashboardItemDataDelta],
    GetDimensions: String => js.Array[ASPxClientDashboardItemDataDimension],
    GetMeasures: () => js.Array[ASPxClientDashboardItemDataMeasure],
    ItemName: String,
    RequestUnderlyingData: (ASPxClientDashboardItemRequestUnderlyingDataCompleted, js.Array[String]) => Unit
  ): ASPxClientDashboardItemClickEventArgs = {
    val __obj = js.Dynamic.literal(GetAxisPoint = js.Any.fromFunction1(GetAxisPoint), GetData = js.Any.fromFunction0(GetData), GetDeltas = js.Any.fromFunction0(GetDeltas), GetDimensions = js.Any.fromFunction1(GetDimensions), GetMeasures = js.Any.fromFunction0(GetMeasures), ItemName = ItemName.asInstanceOf[js.Any], RequestUnderlyingData = js.Any.fromFunction2(RequestUnderlyingData))
    __obj.asInstanceOf[ASPxClientDashboardItemClickEventArgs]
  }
  
  extension [Self <: ASPxClientDashboardItemClickEventArgs](x: Self) {
    
    inline def setGetAxisPoint(value: String => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetAxisPoint", js.Any.fromFunction1(value))
    
    inline def setGetData(value: () => ASPxClientDashboardItemData): Self = StObject.set(x, "GetData", js.Any.fromFunction0(value))
    
    inline def setGetDeltas(value: () => js.Array[ASPxClientDashboardItemDataDelta]): Self = StObject.set(x, "GetDeltas", js.Any.fromFunction0(value))
    
    inline def setGetDimensions(value: String => js.Array[ASPxClientDashboardItemDataDimension]): Self = StObject.set(x, "GetDimensions", js.Any.fromFunction1(value))
    
    inline def setGetMeasures(value: () => js.Array[ASPxClientDashboardItemDataMeasure]): Self = StObject.set(x, "GetMeasures", js.Any.fromFunction0(value))
    
    inline def setItemName(value: String): Self = StObject.set(x, "ItemName", value.asInstanceOf[js.Any])
    
    inline def setRequestUnderlyingData(value: (ASPxClientDashboardItemRequestUnderlyingDataCompleted, js.Array[String]) => Unit): Self = StObject.set(x, "RequestUnderlyingData", js.Any.fromFunction2(value))
  }
}
