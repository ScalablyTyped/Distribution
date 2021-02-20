package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectTextWrapSide extends StObject
/**
  * Lists values specifying how text can wrap around a floating object's left and right sides.
  */
@JSGlobal("FloatingObjectTextWrapSide")
@js.native
object FloatingObjectTextWrapSide extends StObject {
  
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
}
