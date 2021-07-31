package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientRibbon.MinimizationStateChanged event.
  */
@JSGlobal("ASPxClientRibbonMinimizationStateEventArgs")
@js.native
class ASPxClientRibbonMinimizationStateEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientRibbonMinimizationStateEventArgs {
  /**
    * Initializes a new instance of the ASPxClientRibbonMinimizationStateEventArgs class with the specified setting.
    * @param ribbonState The integer value indicating the new ribbon minimization state.
    */
  def this(ribbonState: Double) = this()
  
  /**
    * Returns the value indicating the new ribbon state.
    */
  /* CompleteClass */
  var ribbonState: Double = js.native
}
