package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Represents a client-side equivalent of the Range Selector control.
 */

trait BootstrapClientRangeSelector extends BootstrapUIWidgetBase {
  /**
       * Fires after the selected range has been changed by moving one of the sliders.
       */
  var ValueChanged: ASPxClientEvent[
    BootstrapClientRangeSelectorValueChangedEventHandler[BootstrapClientRangeSelector]
  ]
  /**
       * Gets the Range Selector's selected value range.
       */
  def GetValue(): js.Array[js.Object]
  /**
       * Gets the Range Selector's selected value range.
       * @param value An array containing the value range.
       */
  def SetValue(value: js.Array[js.Object]): scala.Unit
}

