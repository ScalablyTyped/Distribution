package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphFirstLineIndent extends js.Object

@JSGlobal("ParagraphFirstLineIndent")
@js.native
object ParagraphFirstLineIndent extends js.Object {
  @js.native
  sealed trait Hanging
    extends devexpressDashWebLib.ParagraphFirstLineIndent
  
  @js.native
  sealed trait Indented
    extends devexpressDashWebLib.ParagraphFirstLineIndent
  
  @js.native
  sealed trait None
    extends devexpressDashWebLib.ParagraphFirstLineIndent
  
  /* 2 */ val Hanging: Hanging with scala.Double = js.native
  /* 1 */ val Indented: Indented with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ParagraphFirstLineIndent with scala.Double] = js.native
}

