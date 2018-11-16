package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Web Dashboard extension that allows you to create a new dashboard.
 */

trait CreateDashboardExtension extends IExtension {
  /**
       * Creates a new dashboard with a specified name and JSON model.
       * @param dashboardName A string value that is the name of the created dashboard.
       * @param dashboardJson A dashboard model encoded in the specified JSON string.
       */
  def performCreateDashboard(dashboardName: java.lang.String, dashboardJson: java.lang.String): scala.Unit
}

