package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlignment extends StObject
/**
  * An enumeration of the type of text alignments.
  *
  *     // Make the first character in the first paragraph be superscript.
  *     var text = DocumentApp.getActiveDocument().getBody().getParagraphs()[0].editAsText();
  *     text.setTextAlignment(0, 0, DocumentApp.TextAlignment.SUPERSCRIPT);
  */
@JSGlobal("GoogleAppsScript.Document.TextAlignment")
@js.native
object TextAlignment extends StObject {
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with TextAlignment
  
  @js.native
  sealed trait SUBSCRIPT
    extends StObject
       with TextAlignment
  
  @js.native
  sealed trait SUPERSCRIPT
    extends StObject
       with TextAlignment
}
