package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
@js.native
trait ASPxClientRibbonMinimizationStateEventArgs extends ASPxClientEventArgs {
  
  /**
    * Returns the value indicating the new ribbon state.
    */
  var ribbonState: Double = js.native
}
object ASPxClientRibbonMinimizationStateEventArgs {
  
  @scala.inline
  def apply(ribbonState: Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientRibbonMinimizationStateEventArgsMutableBuilder[Self <: ASPxClientRibbonMinimizationStateEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRibbonState(value: Double): Self = StObject.set(x, "ribbonState", value.asInstanceOf[js.Any])
  }
}
