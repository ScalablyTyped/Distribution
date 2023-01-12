package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
trait ASPxClientRibbonMinimizationStateEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Returns the value indicating the new ribbon state.
    */
  var ribbonState: Double
}
object ASPxClientRibbonMinimizationStateEventArgs {
  
  inline def apply(ribbonState: Double): ASPxClientRibbonMinimizationStateEventArgs = {
    val __obj = js.Dynamic.literal(ribbonState = ribbonState.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientRibbonMinimizationStateEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientRibbonMinimizationStateEventArgs] (val x: Self) extends AnyVal {
    
    inline def setRibbonState(value: Double): Self = StObject.set(x, "ribbonState", value.asInstanceOf[js.Any])
  }
}
