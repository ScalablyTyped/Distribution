package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for events related to client widgets used to visualize data in dashboard items.
 */

trait ASPxClientDashboardItemWidgetEventArgs extends ASPxClientEventArgs {
  /**
       * Gets the component name of the dashboard item for which the event was raised.
       * Value: A string value that is the component name of the dashboard item.
       */
  var ItemName: java.lang.String
  /**
       * Returns an underlying widget corresponding to the current dashboard item.
       */
  def GetWidget(): js.Object
}

