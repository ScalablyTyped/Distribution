package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectTextWrapSide extends js.Object

/**
  * Lists values specifying how text can wrap around a floating object's left and right sides.
  */
@JSGlobal("FloatingObjectTextWrapSide")
@js.native
object FloatingObjectTextWrapSide extends js.Object {
  /**
    * Wraps text to both the left and right of the shape.
    */
  @js.native
  sealed trait Both extends FloatingObjectTextWrapSide
  
  /**
    * Wraps text on the side that is the greater distance from the shape to the margin.
    */
  @js.native
  sealed trait Largest extends FloatingObjectTextWrapSide
  
  /**
    * Wraps text to the left of the shape.
    */
  @js.native
  sealed trait Left extends FloatingObjectTextWrapSide
  
  /**
    * Wraps text to the right of the shape.
    */
  @js.native
  sealed trait Right extends FloatingObjectTextWrapSide
  
  /* 0 */ val Both: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Both with Double = js.native
  /* 3 */ val Largest: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Largest with Double = js.native
  /* 1 */ val Left: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Left with Double = js.native
  /* 2 */ val Right: typings.devexpressDashWeb.FloatingObjectTextWrapSide.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapSide with Double] = js.native
}

