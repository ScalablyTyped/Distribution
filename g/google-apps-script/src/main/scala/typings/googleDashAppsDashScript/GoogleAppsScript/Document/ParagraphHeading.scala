package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val HEADING1: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING1 with Double = js.native
  /* 2 */ val HEADING2: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING2 with Double = js.native
  /* 3 */ val HEADING3: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING3 with Double = js.native
  /* 4 */ val HEADING4: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING4 with Double = js.native
  /* 5 */ val HEADING5: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING5 with Double = js.native
  /* 6 */ val HEADING6: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.HEADING6 with Double = js.native
  /* 0 */ val NORMAL: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.NORMAL with Double = js.native
  /* 8 */ val SUBTITLE: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.SUBTITLE with Double = js.native
  /* 7 */ val TITLE: typings.googleDashAppsDashScript.GoogleAppsScript.Document.ParagraphHeading.TITLE with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphHeading with Double] = js.native
}

