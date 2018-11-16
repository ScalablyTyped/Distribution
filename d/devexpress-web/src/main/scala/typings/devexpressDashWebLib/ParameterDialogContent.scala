package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The content of the Dashboard Parameters dialog.
 */

trait ParameterDialogContent extends js.Object {
  /**
       * Gets the Dashboard Parameters dialog's grid that displays parameter values.
       * Value: The Dashboards Parameters dialog's grid that displays parameter values.
       */
  var grid: js.Object
  /**
       * Resets changes in the Dashboard Parameters dialog to the default values.
       */
  def resetParameterValues(): scala.Unit
  /**
       * Applies changes made in the Dashboard Parameters dialog.
       */
  def submitParameterValues(): scala.Unit
  def valueChanged(): scala.Unit
}

