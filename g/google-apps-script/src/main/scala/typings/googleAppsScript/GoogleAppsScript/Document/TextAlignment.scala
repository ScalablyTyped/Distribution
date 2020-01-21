package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlignment extends js.Object

/**
  * An enumeration of the type of text alignments.
  *
  *     // Make the first character in the first paragraph be superscript.
  *     var text = DocumentApp.getActiveDocument().getBody().getParagraphs()[0].editAsText();
  *     text.setTextAlignment(0, 0, DocumentApp.TextAlignment.SUPERSCRIPT);
  */
@JSGlobal("GoogleAppsScript.Document.TextAlignment")
@js.native
object TextAlignment extends js.Object {
  @js.native
  sealed trait NORMAL extends TextAlignment
  
  @js.native
  sealed trait SUBSCRIPT extends TextAlignment
  
  @js.native
  sealed trait SUPERSCRIPT extends TextAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextAlignment with Double] = js.native
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 2 */ @js.native
  object SUBSCRIPT extends TopLevel[SUBSCRIPT with Double]
  
  /* 1 */ @js.native
  object SUPERSCRIPT extends TopLevel[SUPERSCRIPT with Double]
  
}

