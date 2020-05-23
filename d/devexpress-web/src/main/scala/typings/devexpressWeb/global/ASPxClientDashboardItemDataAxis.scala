package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An axis that contains data points corresponding to the specified value hierarchy.
  */
@JSGlobal("ASPxClientDashboardItemDataAxis")
@js.native
class ASPxClientDashboardItemDataAxis ()
  extends typings.devexpressWeb.ASPxClientDashboardItemDataAxis {
  /**
    * Gets the dimensions used to create a hierarchy of axis points belonging to the current axis.
    */
  /* CompleteClass */
  override def GetDimensions(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataDimension] = js.native
  /**
    * Returns the data point for the specified axis by unique values. An ASPxClientDashboardItemDataAxisPoint object representing the data point belonging to the specified axis.
    * @param uniqueValues A hierarchy of unique values identifying the required data point.
    */
  /* CompleteClass */
  override def GetPointByUniqueValues(uniqueValues: js.Array[_]): typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint = js.native
  /**
    * Returns axis points corresponding to values of the last-level dimension.
    */
  /* CompleteClass */
  override def GetPoints(): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint] = js.native
  /**
    * Returns axis points corresponding to the specified dimension. An array of ASPxClientDashboardItemDataAxisPoint objects that represent data points in a multidimensional space.
    * @param dimensionId A String that is the dimension identifier.
    */
  /* CompleteClass */
  override def GetPointsByDimension(dimensionId: String): js.Array[typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint] = js.native
  /**
    * Gets the root axis point belonging to the current ASPxClientDashboardItemDataAxis.
    */
  /* CompleteClass */
  override def GetRootPoint(): typings.devexpressWeb.ASPxClientDashboardItemDataAxisPoint = js.native
}

