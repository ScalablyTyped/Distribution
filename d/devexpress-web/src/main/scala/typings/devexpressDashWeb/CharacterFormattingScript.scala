package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CharacterFormattingScript extends js.Object

@JSGlobal("CharacterFormattingScript")
@js.native
object CharacterFormattingScript extends js.Object {
  @js.native
  sealed trait Normal extends CharacterFormattingScript
  
  @js.native
  sealed trait Subscript extends CharacterFormattingScript
  
  @js.native
  sealed trait Superscript extends CharacterFormattingScript
  
  /* 0 */ val Normal: typings.devexpressDashWeb.CharacterFormattingScript.Normal with Double = js.native
  /* 1 */ val Subscript: typings.devexpressDashWeb.CharacterFormattingScript.Subscript with Double = js.native
  /* 2 */ val Superscript: typings.devexpressDashWeb.CharacterFormattingScript.Superscript with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CharacterFormattingScript with Double] = js.native
}

