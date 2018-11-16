package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CharacterFormattingScript extends js.Object

@JSGlobal("CharacterFormattingScript")
@js.native
object CharacterFormattingScript extends js.Object {
  @js.native
  sealed trait Normal
    extends devexpressDashWebLib.CharacterFormattingScript
  
  @js.native
  sealed trait Subscript
    extends devexpressDashWebLib.CharacterFormattingScript
  
  @js.native
  sealed trait Superscript
    extends devexpressDashWebLib.CharacterFormattingScript
  
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val Subscript: Subscript with scala.Double = js.native
  /* 2 */ val Superscript: Superscript with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.CharacterFormattingScript with scala.Double] = js.native
}

