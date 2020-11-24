package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
@js.native
trait ASPxClientDashboardItemDataAxis extends js.Object {
  
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
  implicit class ASPxClientDashboardItemDataAxisOps[Self <: ASPxClientDashboardItemDataAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetDimensions(value: () => js.Array[ASPxClientDashboardItemDataDimension]): Self = this.set("GetDimensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointByUniqueValues(value: js.Array[_] => ASPxClientDashboardItemDataAxisPoint): Self = this.set("GetPointByUniqueValues", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPoints(value: () => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = this.set("GetPoints", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPointsByDimension(value: String => js.Array[ASPxClientDashboardItemDataAxisPoint]): Self = this.set("GetPointsByDimension", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRootPoint(value: () => ASPxClientDashboardItemDataAxisPoint): Self = this.set("GetRootPoint", js.Any.fromFunction0(value))
  }
}
