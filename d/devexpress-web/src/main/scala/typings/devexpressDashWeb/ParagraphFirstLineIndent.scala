package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ParagraphFirstLineIndent extends js.Object

/**
  * Lists values specifying the indent for the first line in a paragraph.
  */
@JSGlobal("ParagraphFirstLineIndent")
@js.native
object ParagraphFirstLineIndent extends js.Object {
  /**
    * The first line of a paragraph is indented to the left, by the value specified by the ParagraphFormattingSettings.firstLineIndent property.
    */
  @js.native
  sealed trait Hanging extends ParagraphFirstLineIndent
  
  /**
    * The first line of a paragraph is indented to the right by the value specified by the ParagraphFormattingSettings.firstLineIndent property.
    */
  @js.native
  sealed trait Indented extends ParagraphFirstLineIndent
  
  /**
    * The first line of a paragraph doesn't have any indent.
    */
  @js.native
  sealed trait None extends ParagraphFirstLineIndent
  
  /* 2 */ val Hanging: typings.devexpressDashWeb.ParagraphFirstLineIndent.Hanging with Double = js.native
  /* 1 */ val Indented: typings.devexpressDashWeb.ParagraphFirstLineIndent.Indented with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.ParagraphFirstLineIndent.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphFirstLineIndent with Double] = js.native
}

