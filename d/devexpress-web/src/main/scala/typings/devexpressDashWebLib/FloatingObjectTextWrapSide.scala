package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapSide extends js.Object

@JSGlobal("FloatingObjectTextWrapSide")
@js.native
object FloatingObjectTextWrapSide extends js.Object {
  @js.native
  sealed trait Both
    extends devexpressDashWebLib.FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Largest
    extends devexpressDashWebLib.FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.FloatingObjectTextWrapSide
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 3 */ val Largest: Largest with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectTextWrapSide with scala.Double] = js.native
}

