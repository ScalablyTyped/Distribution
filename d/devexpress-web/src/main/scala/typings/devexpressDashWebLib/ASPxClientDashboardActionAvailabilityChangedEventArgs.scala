package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ActionAvailabilityChanged event.
 */

trait ASPxClientDashboardActionAvailabilityChangedEventArgs extends ASPxClientEventArgs {
  /**
       * Gets whether or not data reloading is available in the current state of dashboard item.
       * Value: true, if data reloading is available in the current state of dashboard item; otherwise, false.
       */
  var IsReloadDataAvailable: scala.Boolean
  /**
       * Gets interactivity actions currently available for the dashboard item.
       * Value: An array of ASPxClientDashboardItemAction objects that represent interactivity actions currently available for the dashboard item.
       */
  var ItemActions: js.Array[ASPxClientDashboardItemAction]
}

