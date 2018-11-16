package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Web Dashboard extension that allows you to open the created dashboards.
 */

trait OpenDashboardExtension extends IExtension {
  /**
       * Loads a dashboard with the specified identifier from the dashboard storage.
       * @param id A String value that specifies the unique dashboard name.
       */
  def loadDashboard(id: java.lang.String): scala.Unit
}

