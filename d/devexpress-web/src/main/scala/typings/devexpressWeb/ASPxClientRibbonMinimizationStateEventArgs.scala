package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
trait ASPxClientRibbonMinimizationStateEventArgs extends ASPxClientEventArgs {
  /**
    * Returns the value indicating the new ribbon state.
    */
  var ribbonState: Double
}

object ASPxClientRibbonMinimizationStateEventArgs {
  @scala.inline
  def apply(ribbonState: Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
}

