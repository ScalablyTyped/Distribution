package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
trait ASPxClientDashboardItemDataAxis extends StObject {
  
  /**
    * Gets the dimensions used to create a hierarchy of axis points belonging to the current axis.
    */
  def GetDimensions(): js.Array[ASPxClientDashboardItemDataDimension]
  
  /**
    * Returns the data point for the specified axis by unique values. An ASPxClientDashboardItemDataAxisPoint object representing the data point belonging to the specified axis.
    * @param uniqueValues A hierarchy of unique values identifying the required data point.
    */
  def GetPointByUniqueValues(uniqueValues: js.Array[Any]): ASPxClientDashboardItemDataAxisPoint
  
  /**
    * Returns axis points corresponding to values of the last-level dimension.
    */
  def GetPoints(): js.Array[ASPxClientDashboardItemDataAxisPoint]
  
  /**
    * Returns axis points corresponding to the specified dimension. An array of ASPxClientDashboardItemDataAxisPoint objects that represent data points in a multidimensional space.
    * @param dimensionId A String that is the dimension identifier.
    */
  def GetPointsByDimension(dimensionId: String): js.Array[ASPxClientDashboardItemDataAxisPoint]
  
  /**
    * Gets the root axis point belonging to the current ASPxClientDashboardItemDataAxis.
    */
  def GetRootPoint(): ASPxClientDashboardItemDataAxisPoint
}
object ASPxClientDashboardItemDataAxis {
  
  inline def apply(
    GetDimensions: () => js.Array[ASPxClientDashboardItemDataDimension],
    GetPointByUniqueValues: js.Array[Any] => ASPxClientDashboardItemDataAxisPoint,
    GetPoints: () => js.Array[ASPxClientDashboardItemDataAxisPoint],
    GetPointsByDimension: String => js.Array[ASPxClientDashboardItemDataAxisPoint],
    GetRootPoint: () => ASPxClientDashboardItemDataAxisPoint
  ): ASPxClientDashboardItemDataAxis = {
    val __obj = js.Dynamic.literal(GetDimensions = js.Any.fromFunction0(GetDimensions), GetPointByUniqueValues = js.Any.fromFunction1(GetPointByUniqueValues), GetPoints = js.Any.fromFunction0(GetPoints), GetPointsByDimension = js.Any.fromFunction1(GetPointsByDimension), GetRootPoint = js.Any.fromFunction0(GetRootPoint))
    __obj.asInstanceOf[ASPxClientDashboardItemDataAxis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientDashboardItemDataAxis] (val x: Self) extends AnyVal {
    
    inline def setGetDimensions(value: () => js.Array[ASPxClientDashboardItemDataDimension]): Self = StObject.set(x, "GetDimensions", js.Any.fromFunction0(value))
    
    inline def setGetPointByUniqueValues(value: js.Array[Any] => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetPointByUniqueValues", js.Any.fromFunction1(value))
    
    inline def setGetPoints(value: () => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetPoints", js.Any.fromFunction0(value))
    
    inline def setGetPointsByDimension(value: String => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetPointsByDimension", js.Any.fromFunction1(value))
    
    inline def setGetRootPoint(value: () => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetRootPoint", js.Any.fromFunction0(value))
  }
}
