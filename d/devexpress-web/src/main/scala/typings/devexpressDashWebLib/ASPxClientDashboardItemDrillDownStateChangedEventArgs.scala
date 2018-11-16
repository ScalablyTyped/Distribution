package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ItemDrillDownStateChanged event.
 */

trait ASPxClientDashboardItemDrillDownStateChangedEventArgs extends ASPxClientDashboardItemEventArgs {
  /**
       * Gets the drill-down action performed in the dashboard item.
       * Value: A string value that is the drill-down action performed in the dashboard item.
       */
  var Action: java.lang.String
  /**
       * Gets values from the current drill-down hierarchy.
       * Value: An array of values from the current drill-down hierarchy.
       */
  var Values: js.Array[js.Object]
}

