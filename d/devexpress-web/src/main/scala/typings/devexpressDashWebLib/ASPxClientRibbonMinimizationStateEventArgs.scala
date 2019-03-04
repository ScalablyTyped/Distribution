package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the MinimizationStateChanged event.
  */
trait ASPxClientRibbonMinimizationStateEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the value indicating the new ribbon state.
    * Value: The integer value indicating the ribbon minimization state.
    */
  var ribbonState: scala.Double
}

object ASPxClientRibbonMinimizationStateEventArgs {
  @scala.inline
  def apply(ribbonState: scala.Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState)
  
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
}

