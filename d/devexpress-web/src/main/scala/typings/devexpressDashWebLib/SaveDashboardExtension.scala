package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * A Web Dashboard extension that allows you to save the current dashboard.
 */

trait SaveDashboardExtension extends IExtension {
  /**
       * Allows you to invoke a custom function while you save a dashboard.
       * @param action A custom function that is invoked when the dashboard is about to be saved.
       */
  def ensureDashboardSaved(action: js.Function): scala.Unit
  /**
       * Allows you to save the current dashboard with a specified unique name and JSON model.
       * @param dashboardId A string value that is a unique name of the created dashboard.
       * @param dashboardJson A dashboard model encoded in the specified JSON string.
       */
  def performSaveDashboard(dashboardId: java.lang.String, dashboardJson: java.lang.String): scala.Unit
  /**
       * Saves the opened dashboard.
       */
  def saveDashboard(): scala.Unit
}

