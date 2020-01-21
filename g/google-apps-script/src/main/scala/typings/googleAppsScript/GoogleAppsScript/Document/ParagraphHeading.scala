package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ParagraphHeading with Double] = js.native
  /* 1 */ @js.native
  object HEADING1 extends TopLevel[HEADING1 with Double]
  
  /* 2 */ @js.native
  object HEADING2 extends TopLevel[HEADING2 with Double]
  
  /* 3 */ @js.native
  object HEADING3 extends TopLevel[HEADING3 with Double]
  
  /* 4 */ @js.native
  object HEADING4 extends TopLevel[HEADING4 with Double]
  
  /* 5 */ @js.native
  object HEADING5 extends TopLevel[HEADING5 with Double]
  
  /* 6 */ @js.native
  object HEADING6 extends TopLevel[HEADING6 with Double]
  
  /* 0 */ @js.native
  object NORMAL extends TopLevel[NORMAL with Double]
  
  /* 8 */ @js.native
  object SUBTITLE extends TopLevel[SUBTITLE with Double]
  
  /* 7 */ @js.native
  object TITLE extends TopLevel[TITLE with Double]
  
}

