package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
trait ASPxClientDashboardItemDataAxis extends js.Object {
  /**
    * Gets the dimensions used to create a hierarchy of axis points belonging to the current axis.
    */
  def GetDimensions(): js.Array[ASPxClientDashboardItemDataDimension]
  /**
    * Returns the data point for the specified axis by unique values.
    * @param uniqueValues A hierarchy of unique values identifying the required data point.
    */
  def GetPointByUniqueValues(uniqueValues: js.Array[js.Object]): ASPxClientDashboardItemDataAxisPoint
  /**
    * Returns axis points corresponding to values of the last-level dimension.
    */
  def GetPoints(): js.Array[ASPxClientDashboardItemDataAxisPoint]
  /**
    * Returns axis points corresponding to the specified dimension.
    * @param dimensionId A String that is the dimension identifier.
    */
  def GetPointsByDimension(dimensionId: java.lang.String): js.Array[ASPxClientDashboardItemDataAxisPoint]
  /**
    * Gets the root axis point belonging to the current ASPxClientDashboardItemDataAxis.
    */
  def GetRootPoint(): ASPxClientDashboardItemDataAxisPoint
}

object ASPxClientDashboardItemDataAxis {
  @scala.inline
  def apply(
    GetDimensions: js.Function0[js.Array[ASPxClientDashboardItemDataDimension]],
    GetPointByUniqueValues: js.Function1[js.Array[js.Object], ASPxClientDashboardItemDataAxisPoint],
    GetPoints: js.Function0[js.Array[ASPxClientDashboardItemDataAxisPoint]],
    GetPointsByDimension: js.Function1[java.lang.String, js.Array[ASPxClientDashboardItemDataAxisPoint]],
    GetRootPoint: js.Function0[ASPxClientDashboardItemDataAxisPoint]
  ): ASPxClientDashboardItemDataAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDimensions")(GetDimensions)
    __obj.updateDynamic("GetPointByUniqueValues")(GetPointByUniqueValues)
    __obj.updateDynamic("GetPoints")(GetPoints)
    __obj.updateDynamic("GetPointsByDimension")(GetPointsByDimension)
    __obj.updateDynamic("GetRootPoint")(GetRootPoint)
    __obj.asInstanceOf[ASPxClientDashboardItemDataAxis]
  }
}

