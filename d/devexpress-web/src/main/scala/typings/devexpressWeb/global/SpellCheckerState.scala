package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists values specifying the spell checking state.
  */
@JSGlobal("SpellCheckerState")
@js.native
object SpellCheckerState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.devexpressWeb.SpellCheckerState & Double] = js.native
  
  /* 0 */ val Disabled: typings.devexpressWeb.SpellCheckerState.Disabled & Double = js.native
  
  /* 2 */ val Done: typings.devexpressWeb.SpellCheckerState.Done & Double = js.native
  
  /* 1 */ val InProgress: typings.devexpressWeb.SpellCheckerState.InProgress & Double = js.native
}
