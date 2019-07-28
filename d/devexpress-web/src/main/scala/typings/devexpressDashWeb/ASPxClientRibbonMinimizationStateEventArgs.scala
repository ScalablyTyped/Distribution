package typings.devexpressDashWeb

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
  var ribbonState: Double
}

object ASPxClientRibbonMinimizationStateEventArgs {
  @scala.inline
  def apply(ribbonState: Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState)
  
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
}

