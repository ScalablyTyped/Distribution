package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectTextWrapSide with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 3 */ @js.native
  object Largest extends TopLevel[Largest with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

