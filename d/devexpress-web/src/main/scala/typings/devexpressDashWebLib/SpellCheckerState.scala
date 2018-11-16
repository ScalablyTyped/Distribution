package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SpellCheckerState extends js.Object

@JSGlobal("SpellCheckerState")
@js.native
object SpellCheckerState extends js.Object {
  @js.native
  sealed trait Disabled
    extends devexpressDashWebLib.SpellCheckerState
  
  @js.native
  sealed trait Done
    extends devexpressDashWebLib.SpellCheckerState
  
  @js.native
  sealed trait InProgress
    extends devexpressDashWebLib.SpellCheckerState
  
  /* 0 */ val Disabled: Disabled with scala.Double = js.native
  /* 2 */ val Done: Done with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.SpellCheckerState with scala.Double] = js.native
}

