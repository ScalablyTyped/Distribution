package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpellCheckerState extends js.Object

/**
  * Lists values specifying the spell checking state.
  */
@JSGlobal("SpellCheckerState")
@js.native
object SpellCheckerState extends js.Object {
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SpellCheckerState with Double] = js.native
  /* 0 */ @js.native
  object Disabled extends TopLevel[Disabled with Double]
  
  /* 2 */ @js.native
  object Done extends TopLevel[Done with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
}

