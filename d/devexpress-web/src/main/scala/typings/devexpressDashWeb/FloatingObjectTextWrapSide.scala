package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapSide extends js.Object

@JSGlobal("FloatingObjectTextWrapSide")
@js.native
object FloatingObjectTextWrapSide extends js.Object {
  @js.native
  sealed trait Both extends FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Largest extends FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Left extends FloatingObjectTextWrapSide
  
  @js.native
  sealed trait Right extends FloatingObjectTextWrapSide
  
  /* 0 */ val Both: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Both with Double = js.native
  /* 3 */ val Largest: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Largest with Double = js.native
  /* 1 */ val Left: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Left with Double = js.native
  /* 2 */ val Right: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapSide with Double] = js.native
}

