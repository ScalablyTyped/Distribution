package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphHeading extends js.Object
/**
  * An enumeration of the standard paragraph headings.
  *
  * Use the ParagraphHeading enumeration to configure the heading style for ParagraphElement.
  *
  *     var body = DocumentApp.getActiveDocument().getBody();
  *
  *     // Append a paragraph, with heading 1.
  *     var par1 = body.appendParagraph("Title");
  *     par1.setHeading(DocumentApp.ParagraphHeading.HEADING1);
  *
  *     // Append a paragraph, with heading 2.
  *     var par2 = body.appendParagraph("SubTitle");
  *     par2.setHeading(DocumentApp.ParagraphHeading.HEADING2);
  *
  *     // Append a paragraph, with normal heading.
  *     var par3 = body.appendParagraph("Text");
  *     par3.setHeading(DocumentApp.ParagraphHeading.NORMAL);
  */
@JSGlobal("GoogleAppsScript.Document.ParagraphHeading")
@js.native
object ParagraphHeading extends js.Object {
  
  @js.native
  sealed trait HEADING1 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING2 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING3 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING4 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING5 extends ParagraphHeading
  
  @js.native
  sealed trait HEADING6 extends ParagraphHeading
  
  @js.native
  sealed trait NORMAL extends ParagraphHeading
  
  @js.native
  sealed trait SUBTITLE extends ParagraphHeading
  
  @js.native
  sealed trait TITLE extends ParagraphHeading
}
