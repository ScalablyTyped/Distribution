package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents multidimensional data visualized in the dashboard item.
  */
@JSGlobal("ASPxClientDashboardItemData")
@js.native
class ASPxClientDashboardItemData () extends js.Object {
  /**
    * Creates a tuple based on the specified axes names and corresponding values. An ASPxClientDashboardItemDataAxisPointTuple object representing an axis point tuple.
    * @param values An array of name-value pairs containing the axis name and corresponding values.
    */
  def CreateTuple(values: js.Array[_ | ASPxClientDashboardItemDataAxisPoint]): ASPxClientDashboardItemDataAxisPointTuple = js.native
  /**
    * Returns the specified data axis. A ASPxClientDashboardItemDataAxis object that contains data points corresponding to the specified value hierarchy.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetAxis(axisName: String): ASPxClientDashboardItemDataAxis = js.native
  /**
    * Gets the names of the axes that constitute the current ASPxClientDashboardItemData.
    */
  def GetAxisNames(): js.Array[String] = js.native
  /**
    * Returns an array of data members available in a data source.
    */
  def GetDataMembers(): js.Array[String] = js.native
  /**
    * Gets the summary value for the specified delta. A ASPxClientDashboardItemDataDeltaValue object providing delta element values.
    * @param deltaId A String that is the data item identifier.
    */
  def GetDeltaValue(deltaId: String): ASPxClientDashboardItemDataDeltaValue = js.native
  /**
    * Gets the deltas for the current ASPxClientDashboardItemData object.
    */
  def GetDeltas(): js.Array[ASPxClientDashboardItemDataDelta] = js.native
  /**
    * Gets the dimensions used to create a hierarchy of axis points for the specified axis. An array of ASPxClientDashboardItemDataDimension objects containing the dimension metadata.
    * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
    */
  def GetDimensions(axisName: String): js.Array[ASPxClientDashboardItemDataDimension] = js.native
  /**
    * Returns a total summary value for the specified measure. A ASPxClientDashboardItemDataMeasureValue object providing the measure value and display text.
    * @param measureId A String that is the measure identifier.
    */
  def GetMeasureValue(measureId: String): ASPxClientDashboardItemDataMeasureValue = js.native
  /**
    * Gets the measures for the current ASPxClientDashboardItemData object.
    */
  def GetMeasures(): js.Array[ASPxClientDashboardItemDataMeasure] = js.native
  def GetSlice(tuple: ASPxClientDashboardItemDataAxisPoint): ASPxClientDashboardItemData = js.native
  /**
    * Gets the slice of the current ASPxClientDashboardItemData object by the specified axis point tuple. An ASPxClientDashboardItemData object that is the slice of the current client data object by the specified axis point tuple.
    * @param tuple A ASPxClientDashboardItemDataAxisPointTuple object that is a tuple of axis points.
    */
  def GetSlice(tuple: ASPxClientDashboardItemDataAxisPointTuple): ASPxClientDashboardItemData = js.native
}

