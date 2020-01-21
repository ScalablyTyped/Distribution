package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphFirstLineIndent with Double] = js.native
  /* 2 */ @js.native
  object Hanging extends TopLevel[Hanging with Double]
  
  /* 1 */ @js.native
  object Indented extends TopLevel[Indented with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
}

