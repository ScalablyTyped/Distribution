package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents multidimensional data visualized in the dashboard item.
  */
@js.native
trait ASPxClientDashboardItemData extends js.Object {
  /**
    * Creates a tuple based on the specified axes names and corresponding values.
    * @param values An array of name-value pairs containing the axis name and corresponding values.
    */
  /**
    * Creates a tuple based on the specified axis points.
    * @param axisPoints An array of ASPxClientDashboardItemDataAxisPoint objects that specify axis points belonging to different data axes.
    */
  def CreateTuple(values: js.Array[ASPxClientDashboardItemDataAxisPoint | js.Object]): ASPxClientDashboardItemDataAxisPointTuple = js.native
  /**
    * Returns the specified data axis.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetAxis(axisName: java.lang.String): ASPxClientDashboardItemDataAxis = js.native
  /**
    * Gets the names of the axes that constitute the current ASPxClientDashboardItemData.
    */
  def GetAxisNames(): js.Array[java.lang.String] = js.native
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[java.lang.String] = js.native
  /**
    * Gets the summary value for the specified delta.
    * @param deltaId A String that is the data item identifier.
    */
  def GetDeltaValue(deltaId: java.lang.String): ASPxClientDashboardItemDataDeltaValue = js.native
  /**
    * Gets the deltas for the current ASPxClientDashboardItemData object.
    */
  def GetDeltas(): js.Array[ASPxClientDashboardItemDataDelta] = js.native
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetDimensions(axisName: java.lang.String): js.Array[ASPxClientDashboardItemDataDimension] = js.native
  /**
    * Returns a total summary value for the specified measure.
    * @param measureId A String that is the measure identifier.
    */
  def GetMeasureValue(measureId: java.lang.String): ASPxClientDashboardItemDataMeasureValue = js.native
  /**
    * Gets the measures for the current ASPxClientDashboardItemData object.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure] = js.native
  /**
    * Gets the slice of the current ASPxClientDashboardItemData object by the specified axis point.
    * @param axisPoint An ASPxClientDashboardItemDataAxisPoint object that is the data point in a multidimensional space.
    */
  def GetSlice(axisPoint: ASPxClientDashboardItemDataAxisPoint): ASPxClientDashboardItemData = js.native
  /**
    * Gets the slice of the current ASPxClientDashboardItemData object by the specified axis point tuple.
    * @param tuple A ASPxClientDashboardItemDataAxisPointTuple object that is a tuple of axis points.
    */
  def GetSlice(tuple: ASPxClientDashboardItemDataAxisPointTuple): ASPxClientDashboardItemData = js.native
}

