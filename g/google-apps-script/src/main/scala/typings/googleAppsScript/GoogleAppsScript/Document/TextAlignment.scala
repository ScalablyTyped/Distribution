package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
