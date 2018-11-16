package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a tuple of axis points.
 */
@js.native
trait ASPxClientDashboardItemDataAxisPointTuple extends js.Object {
  /**
       * Returns the axis point belonging to the default data axis.
       */
  def GetAxisPoint(): ASPxClientDashboardItemDataAxisPoint = js.native
  /**
       * Returns the axis point belonging to the specified data axis.
       * @param axisName A string value returned by the DashboardDataAxisNames class that specifies the name of the data axis.
       */
  def GetAxisPoint(axisName: java.lang.String): ASPxClientDashboardItemDataAxisPoint = js.native
}

