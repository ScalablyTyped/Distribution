package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
@JSGlobal("ASPxClientDashboardItemDataAxis")
@js.native
class ASPxClientDashboardItemDataAxis () extends js.Object {
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

