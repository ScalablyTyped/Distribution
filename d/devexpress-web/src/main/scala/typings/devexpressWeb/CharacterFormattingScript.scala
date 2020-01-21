package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CharacterFormattingScript extends js.Object

/**
  * Lists values specifying character script formatting.
  */
@JSGlobal("CharacterFormattingScript")
@js.native
object CharacterFormattingScript extends js.Object {
  /**
    * Specifies that the text is not formatted as subscript or as superscript.
    */
  @js.native
  sealed trait Normal extends CharacterFormattingScript
  
  /**
    * Formats text as subscript.
    */
  @js.native
  sealed trait Subscript extends CharacterFormattingScript
  
  /**
    * Formats text as superscript.
    */
  @js.native
  sealed trait Superscript extends CharacterFormattingScript
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CharacterFormattingScript with Double] = js.native
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 1 */ @js.native
  object Subscript extends TopLevel[Subscript with Double]
  
  /* 2 */ @js.native
  object Superscript extends TopLevel[Superscript with Double]
  
}

