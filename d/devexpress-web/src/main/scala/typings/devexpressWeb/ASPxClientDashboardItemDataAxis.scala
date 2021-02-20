package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
@js.native
trait ASPxClientDashboardItemDataAxis extends StObject {
  
  /**
    * Gets the dimensions used to create a hierarchy of axis points belonging to the current axis.
    */
  def GetDimensions(): js.Array[ASPxClientDashboardItemDataDimension] = js.native
  
  /**
    * Returns the data point for the specified axis by unique values. An ASPxClientDashboardItemDataAxisPoint object representing the data point belonging to the specified axis.
    * @param uniqueValues A hierarchy of unique values identifying the required data point.
    */
  def GetPointByUniqueValues(uniqueValues: js.Array[_]): ASPxClientDashboardItemDataAxisPoint = js.native
  
  /**
    * Returns axis points corresponding to values of the last-level dimension.
    */
  def GetPoints(): js.Array[ASPxClientDashboardItemDataAxisPoint] = js.native
  
  /**
    * Returns axis points corresponding to the specified dimension. An array of ASPxClientDashboardItemDataAxisPoint objects that represent data points in a multidimensional space.
    * @param dimensionId A String that is the dimension identifier.
    */
  def GetPointsByDimension(dimensionId: String): js.Array[ASPxClientDashboardItemDataAxisPoint] = js.native
  
  /**
    * Gets the root axis point belonging to the current ASPxClientDashboardItemDataAxis.
    */
  def GetRootPoint(): ASPxClientDashboardItemDataAxisPoint = js.native
}
object ASPxClientDashboardItemDataAxis {
  
  @scala.inline
  def apply(
    GetDimensions: () => js.Array[ASPxClientDashboardItemDataDimension],
    GetPointByUniqueValues: js.Array[_] => ASPxClientDashboardItemDataAxisPoint,
    GetPoints: () => js.Array[ASPxClientDashboardItemDataAxisPoint],
    GetPointsByDimension: String => js.Array[ASPxClientDashboardItemDataAxisPoint],
    GetRootPoint: () => ASPxClientDashboardItemDataAxisPoint
  ): ASPxClientDashboardItemDataAxis = {
    val __obj = js.Dynamic.literal(GetDimensions = js.Any.fromFunction0(GetDimensions), GetPointByUniqueValues = js.Any.fromFunction1(GetPointByUniqueValues), GetPoints = js.Any.fromFunction0(GetPoints), GetPointsByDimension = js.Any.fromFunction1(GetPointsByDimension), GetRootPoint = js.Any.fromFunction0(GetRootPoint))
    __obj.asInstanceOf[ASPxClientDashboardItemDataAxis]
  }
  
  @scala.inline
  implicit class ASPxClientDashboardItemDataAxisMutableBuilder[Self <: ASPxClientDashboardItemDataAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDimensions(value: () => js.Array[ASPxClientDashboardItemDataDimension]): Self = StObject.set(x, "GetDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointByUniqueValues(value: js.Array[_] => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetPointByUniqueValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPoints(value: () => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointsByDimension(value: String => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = StObject.set(x, "GetPointsByDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRootPoint(value: () => ASPxClientDashboardItemDataAxisPoint): Self = StObject.set(x, "GetRootPoint", js.Any.fromFunction0(value))
  }
}
