package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A point on the data axis.
 */
@js.native
trait ASPxClientDashboardItemDataAxisPoint extends js.Object {
  /**
       * Gets the name of the axis to which the current axis point belongs.
       */
  def GetAxisName(): java.lang.String = js.native
  /**
       * Gets the child axis points for the current axis point.
       */
  def GetChildren(): js.Array[ASPxClientDashboardItemDataAxisPoint] = js.native
  /**
       * Gets the last level dimension corresponding to the current axis point.
       */
  def GetDimension(): ASPxClientDashboardItemDataDimension = js.native
  /**
       * Gets the dimension values at the specified axis point.
       */
  def GetDimensionValue(): ASPxClientDashboardItemDataDimensionValue = js.native
  /**
       * Gets the dimension value at the current axis point.
       * @param dimensionId A String value that specifies the dimension identifier.
       */
  def GetDimensionValue(dimensionId: java.lang.String): ASPxClientDashboardItemDataDimensionValue = js.native
  /**
       * Gets the collection of dimensions used to create a hierarchy of axis points from the root point to the current axis point.
       */
  def GetDimensions(): js.Array[ASPxClientDashboardItemDataDimension] = js.native
  /**
       * Gets the display text corresponding to the current axis point.
       */
  def GetDisplayText(): java.lang.String = js.native
  /**
       * Gets the parent axis point for the current axis point.
       */
  def GetParent(): ASPxClientDashboardItemDataAxisPoint = js.native
  /**
       * Gets the unique value corresponding to the current axis point.
       */
  def GetUniqueValue(): js.Object = js.native
  /**
       * Gets the value corresponding to the current axis point.
       */
  def GetValue(): js.Object = js.native
}

