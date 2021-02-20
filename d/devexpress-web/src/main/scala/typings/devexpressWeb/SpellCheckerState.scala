package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SpellCheckerState extends StObject
/**
  * Lists values specifying the spell checking state.
  */
@JSGlobal("SpellCheckerState")
@js.native
object SpellCheckerState extends StObject {
  
  /**
    * Spell checking is disabled.
    */
  @js.native
  sealed trait Disabled extends SpellCheckerState
  
  /**
    * Spell checking is completed.
    */
  @js.native
  sealed trait Done extends SpellCheckerState
  
  /**
    * Spell checking is in progress.
    */
  @js.native
  sealed trait InProgress extends SpellCheckerState
}
