package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphFirstLineIndent extends StObject
/**
  * Lists values specifying the indent for the first line in a paragraph.
  */
@JSGlobal("ParagraphFirstLineIndent")
@js.native
object ParagraphFirstLineIndent extends StObject {
  
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
}
