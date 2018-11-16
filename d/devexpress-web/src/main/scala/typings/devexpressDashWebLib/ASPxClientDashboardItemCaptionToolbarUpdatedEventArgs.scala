package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Provides data for the ItemCaptionToolbarUpdated event.
 */

trait ASPxClientDashboardItemCaptionToolbarUpdatedEventArgs extends ASPxClientEventArgs {
  /**
       * Gets a component name of the dashboard item.
       * Value: A string value that is a component name of the dashboard item.
       */
  var ItemName: java.lang.String
  /**
       * Provides access to caption options of the dashboard item.
       * Value: A <a href="https://documentation.devexpress.com/ClientDashboard/api/DevExpress.Dashboard.DashboardItemCaptionToolbarOptions.html">DashboardItemCaptionToolbarOptions</a> object containing caption options of the dashboard item.
       */
  var Options: js.Object
}

