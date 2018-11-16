package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Holds action types for the client-side Refresh method.
 */

trait ASPxClientSchedulerRefreshAction extends js.Object {
  /**
       * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its satellite View controls.
       * Value: An integer representing the action parameter value.
       */
  var ActiveViewTypeChanged: scala.Double
  /**
       * Gets the value of the action parameter which initiates a simple reload of the control.
       * Value: An integer representing the action parameter value.
       */
  var None: scala.Double
  /**
       * Gets the value of the action parameter which initiates reloading of the main ASPxScheduler control and its data-dependent satellites.
       * Value: An integer representing the action parameter value.
       */
  var VisibleIntervalChanged: scala.Double
}

