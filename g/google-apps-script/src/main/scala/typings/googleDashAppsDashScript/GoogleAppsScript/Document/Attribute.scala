package typings.googleDashAppsDashScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Attribute extends js.Object

/**
  * An enumeration of the element attributes.
  *
  * Use attributes to compose custom styles. For example:
  *
  *     // Define a style with yellow background.
  *     var highlightStyle = {};
  *     highlightStyle[DocumentApp.Attribute.BACKGROUND_COLOR] = '#FFFF00';
  *     highlightStyle[DocumentApp.Attribute.BOLD] = true;
  *
  *     // Insert "Hello", highlighted.
  *     DocumentApp.getActiveDocument().editAsText()
  *       .insertText(0, 'Hello\n')
  *       .setAttributes(0, 4, highlightStyle);
  */
@JSGlobal("GoogleAppsScript.Document.Attribute")
@js.native
object Attribute extends js.Object {
  @js.native
  sealed trait BACKGROUND_COLOR extends Attribute
  
  @js.native
  sealed trait BOLD extends Attribute
  
  @js.native
  sealed trait BORDER_COLOR extends Attribute
  
  @js.native
  sealed trait BORDER_WIDTH extends Attribute
  
  @js.native
  sealed trait CODE extends Attribute
  
  @js.native
  sealed trait FONT_FAMILY extends Attribute
  
  @js.native
  sealed trait FONT_SIZE extends Attribute
  
  @js.native
  sealed trait FOREGROUND_COLOR extends Attribute
  
  @js.native
  sealed trait GLYPH_TYPE extends Attribute
  
  @js.native
  sealed trait HEADING extends Attribute
  
  @js.native
  sealed trait HEIGHT extends Attribute
  
  @js.native
  sealed trait HORIZONTAL_ALIGNMENT extends Attribute
  
  @js.native
  sealed trait INDENT_END extends Attribute
  
  @js.native
  sealed trait INDENT_FIRST_LINE extends Attribute
  
  @js.native
  sealed trait INDENT_START extends Attribute
  
  @js.native
  sealed trait ITALIC extends Attribute
  
  @js.native
  sealed trait LEFT_TO_RIGHT extends Attribute
  
  @js.native
  sealed trait LINE_SPACING extends Attribute
  
  @js.native
  sealed trait LINK_URL extends Attribute
  
  @js.native
  sealed trait LIST_ID extends Attribute
  
  @js.native
  sealed trait MARGIN_BOTTOM extends Attribute
  
  @js.native
  sealed trait MARGIN_LEFT extends Attribute
  
  @js.native
  sealed trait MARGIN_RIGHT extends Attribute
  
  @js.native
  sealed trait MARGIN_TOP extends Attribute
  
  @js.native
  sealed trait MINIMUM_HEIGHT extends Attribute
  
  @js.native
  sealed trait NESTING_LEVEL extends Attribute
  
  @js.native
  sealed trait PADDING_BOTTOM extends Attribute
  
  @js.native
  sealed trait PADDING_LEFT extends Attribute
  
  @js.native
  sealed trait PADDING_RIGHT extends Attribute
  
  @js.native
  sealed trait PADDING_TOP extends Attribute
  
  @js.native
  sealed trait PAGE_HEIGHT extends Attribute
  
  @js.native
  sealed trait PAGE_WIDTH extends Attribute
  
  @js.native
  sealed trait SPACING_AFTER extends Attribute
  
  @js.native
  sealed trait SPACING_BEFORE extends Attribute
  
  @js.native
  sealed trait STRIKETHROUGH extends Attribute
  
  @js.native
  sealed trait UNDERLINE extends Attribute
  
  @js.native
  sealed trait VERTICAL_ALIGNMENT extends Attribute
  
  @js.native
  sealed trait WIDTH extends Attribute
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Attribute with Double] = js.native
  /* 0 */ @js.native
  object BACKGROUND_COLOR extends TopLevel[BACKGROUND_COLOR with Double]
  
  /* 1 */ @js.native
  object BOLD extends TopLevel[BOLD with Double]
  
  /* 2 */ @js.native
  object BORDER_COLOR extends TopLevel[BORDER_COLOR with Double]
  
  /* 3 */ @js.native
  object BORDER_WIDTH extends TopLevel[BORDER_WIDTH with Double]
  
  /* 4 */ @js.native
  object CODE extends TopLevel[CODE with Double]
  
  /* 5 */ @js.native
  object FONT_FAMILY extends TopLevel[FONT_FAMILY with Double]
  
  /* 6 */ @js.native
  object FONT_SIZE extends TopLevel[FONT_SIZE with Double]
  
  /* 7 */ @js.native
  object FOREGROUND_COLOR extends TopLevel[FOREGROUND_COLOR with Double]
  
  /* 15 */ @js.native
  object GLYPH_TYPE extends TopLevel[GLYPH_TYPE with Double]
  
  /* 8 */ @js.native
  object HEADING extends TopLevel[HEADING with Double]
  
  /* 9 */ @js.native
  object HEIGHT extends TopLevel[HEIGHT with Double]
  
  /* 10 */ @js.native
  object HORIZONTAL_ALIGNMENT extends TopLevel[HORIZONTAL_ALIGNMENT with Double]
  
  /* 11 */ @js.native
  object INDENT_END extends TopLevel[INDENT_END with Double]
  
  /* 12 */ @js.native
  object INDENT_FIRST_LINE extends TopLevel[INDENT_FIRST_LINE with Double]
  
  /* 13 */ @js.native
  object INDENT_START extends TopLevel[INDENT_START with Double]
  
  /* 14 */ @js.native
  object ITALIC extends TopLevel[ITALIC with Double]
  
  /* 16 */ @js.native
  object LEFT_TO_RIGHT extends TopLevel[LEFT_TO_RIGHT with Double]
  
  /* 17 */ @js.native
  object LINE_SPACING extends TopLevel[LINE_SPACING with Double]
  
  /* 18 */ @js.native
  object LINK_URL extends TopLevel[LINK_URL with Double]
  
  /* 19 */ @js.native
  object LIST_ID extends TopLevel[LIST_ID with Double]
  
  /* 20 */ @js.native
  object MARGIN_BOTTOM extends TopLevel[MARGIN_BOTTOM with Double]
  
  /* 21 */ @js.native
  object MARGIN_LEFT extends TopLevel[MARGIN_LEFT with Double]
  
  /* 22 */ @js.native
  object MARGIN_RIGHT extends TopLevel[MARGIN_RIGHT with Double]
  
  /* 23 */ @js.native
  object MARGIN_TOP extends TopLevel[MARGIN_TOP with Double]
  
  /* 25 */ @js.native
  object MINIMUM_HEIGHT extends TopLevel[MINIMUM_HEIGHT with Double]
  
  /* 24 */ @js.native
  object NESTING_LEVEL extends TopLevel[NESTING_LEVEL with Double]
  
  /* 26 */ @js.native
  object PADDING_BOTTOM extends TopLevel[PADDING_BOTTOM with Double]
  
  /* 27 */ @js.native
  object PADDING_LEFT extends TopLevel[PADDING_LEFT with Double]
  
  /* 28 */ @js.native
  object PADDING_RIGHT extends TopLevel[PADDING_RIGHT with Double]
  
  /* 29 */ @js.native
  object PADDING_TOP extends TopLevel[PADDING_TOP with Double]
  
  /* 30 */ @js.native
  object PAGE_HEIGHT extends TopLevel[PAGE_HEIGHT with Double]
  
  /* 31 */ @js.native
  object PAGE_WIDTH extends TopLevel[PAGE_WIDTH with Double]
  
  /* 32 */ @js.native
  object SPACING_AFTER extends TopLevel[SPACING_AFTER with Double]
  
  /* 33 */ @js.native
  object SPACING_BEFORE extends TopLevel[SPACING_BEFORE with Double]
  
  /* 34 */ @js.native
  object STRIKETHROUGH extends TopLevel[STRIKETHROUGH with Double]
  
  /* 35 */ @js.native
  object UNDERLINE extends TopLevel[UNDERLINE with Double]
  
  /* 36 */ @js.native
  object VERTICAL_ALIGNMENT extends TopLevel[VERTICAL_ALIGNMENT with Double]
  
  /* 37 */ @js.native
  object WIDTH extends TopLevel[WIDTH with Double]
  
}

