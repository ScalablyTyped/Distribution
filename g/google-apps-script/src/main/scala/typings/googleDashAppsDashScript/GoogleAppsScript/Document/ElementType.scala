package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.BODY_SECTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.COMMENT_SECTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.DOCUMENT
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION_ARGUMENT_SEPARATOR
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.EQUATION_SYMBOL
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTER_SECTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTNOTE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.FOOTNOTE_SECTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.HEADER_SECTION
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.HORIZONTAL_RULE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.INLINE_DRAWING
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.INLINE_IMAGE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.LIST_ITEM
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.PAGE_BREAK
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.PARAGRAPH
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_CELL
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_OF_CONTENTS
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TABLE_ROW
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.TEXT
import typings.googleDashAppsDashScript.GoogleAppsScript.Document.ElementType.UNSUPPORTED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ElementType extends js.Object

/**
  * An enumeration of all the element types.
  *
  * Use the ElementType enumeration to check the type of a given element, for instance:
  *
  *     var firstChild = DocumentApp.getActiveDocument().getBody().getChild(0);
  *     if (firstChild.getType() == DocumentApp.ElementType.PARAGRAPH) {
  *       // It's a paragraph, apply a paragraph heading.
  *       firstChild.asParagraph().setHeading(DocumentApp.ParagraphHeading.HEADING1);
  *     }
  */
@JSGlobal("GoogleAppsScript.Document.ElementType")
@js.native
object ElementType extends js.Object {
  @js.native
  sealed trait BODY_SECTION extends ElementType
  
  @js.native
  sealed trait COMMENT_SECTION extends ElementType
  
  @js.native
  sealed trait DOCUMENT extends ElementType
  
  @js.native
  sealed trait EQUATION extends ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION extends ElementType
  
  @js.native
  sealed trait EQUATION_FUNCTION_ARGUMENT_SEPARATOR extends ElementType
  
  @js.native
  sealed trait EQUATION_SYMBOL extends ElementType
  
  @js.native
  sealed trait FOOTER_SECTION extends ElementType
  
  @js.native
  sealed trait FOOTNOTE extends ElementType
  
  @js.native
  sealed trait FOOTNOTE_SECTION extends ElementType
  
  @js.native
  sealed trait HEADER_SECTION extends ElementType
  
  @js.native
  sealed trait HORIZONTAL_RULE extends ElementType
  
  @js.native
  sealed trait INLINE_DRAWING extends ElementType
  
  @js.native
  sealed trait INLINE_IMAGE extends ElementType
  
  @js.native
  sealed trait LIST_ITEM extends ElementType
  
  @js.native
  sealed trait PAGE_BREAK extends ElementType
  
  @js.native
  sealed trait PARAGRAPH extends ElementType
  
  @js.native
  sealed trait TABLE extends ElementType
  
  @js.native
  sealed trait TABLE_CELL extends ElementType
  
  @js.native
  sealed trait TABLE_OF_CONTENTS extends ElementType
  
  @js.native
  sealed trait TABLE_ROW extends ElementType
  
  @js.native
  sealed trait TEXT extends ElementType
  
  @js.native
  sealed trait UNSUPPORTED extends ElementType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ElementType with Double] = js.native
  /* 0 */ @js.native
  object BODY_SECTION extends TopLevel[BODY_SECTION with Double]
  
  /* 1 */ @js.native
  object COMMENT_SECTION extends TopLevel[COMMENT_SECTION with Double]
  
  /* 2 */ @js.native
  object DOCUMENT extends TopLevel[DOCUMENT with Double]
  
  /* 3 */ @js.native
  object EQUATION extends TopLevel[EQUATION with Double]
  
  /* 4 */ @js.native
  object EQUATION_FUNCTION extends TopLevel[EQUATION_FUNCTION with Double]
  
  /* 5 */ @js.native
  object EQUATION_FUNCTION_ARGUMENT_SEPARATOR extends TopLevel[EQUATION_FUNCTION_ARGUMENT_SEPARATOR with Double]
  
  /* 6 */ @js.native
  object EQUATION_SYMBOL extends TopLevel[EQUATION_SYMBOL with Double]
  
  /* 7 */ @js.native
  object FOOTER_SECTION extends TopLevel[FOOTER_SECTION with Double]
  
  /* 8 */ @js.native
  object FOOTNOTE extends TopLevel[FOOTNOTE with Double]
  
  /* 9 */ @js.native
  object FOOTNOTE_SECTION extends TopLevel[FOOTNOTE_SECTION with Double]
  
  /* 10 */ @js.native
  object HEADER_SECTION extends TopLevel[HEADER_SECTION with Double]
  
  /* 11 */ @js.native
  object HORIZONTAL_RULE extends TopLevel[HORIZONTAL_RULE with Double]
  
  /* 12 */ @js.native
  object INLINE_DRAWING extends TopLevel[INLINE_DRAWING with Double]
  
  /* 13 */ @js.native
  object INLINE_IMAGE extends TopLevel[INLINE_IMAGE with Double]
  
  /* 14 */ @js.native
  object LIST_ITEM extends TopLevel[LIST_ITEM with Double]
  
  /* 15 */ @js.native
  object PAGE_BREAK extends TopLevel[PAGE_BREAK with Double]
  
  /* 16 */ @js.native
  object PARAGRAPH extends TopLevel[PARAGRAPH with Double]
  
  /* 17 */ @js.native
  object TABLE extends TopLevel[TABLE with Double]
  
  /* 18 */ @js.native
  object TABLE_CELL extends TopLevel[TABLE_CELL with Double]
  
  /* 19 */ @js.native
  object TABLE_OF_CONTENTS extends TopLevel[TABLE_OF_CONTENTS with Double]
  
  /* 20 */ @js.native
  object TABLE_ROW extends TopLevel[TABLE_ROW with Double]
  
  /* 21 */ @js.native
  object TEXT extends TopLevel[TEXT with Double]
  
  /* 22 */ @js.native
  object UNSUPPORTED extends TopLevel[UNSUPPORTED with Double]
  
}

