package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphFirstLineIndent extends js.Object

@JSGlobal("ParagraphFirstLineIndent")
@js.native
object ParagraphFirstLineIndent extends js.Object {
  @js.native
  sealed trait Hanging extends ParagraphFirstLineIndent
  
  @js.native
  sealed trait Indented extends ParagraphFirstLineIndent
  
  @js.native
  sealed trait None extends ParagraphFirstLineIndent
  
  /* 2 */ val Hanging: typings.devexpressDashWeb.ParagraphFirstLineIndent.Hanging with Double = js.native
  /* 1 */ val Indented: typings.devexpressDashWeb.ParagraphFirstLineIndent.Indented with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.ParagraphFirstLineIndent.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphFirstLineIndent with Double] = js.native
}

