package typings.googleAppsScript.GoogleAppsScript.Document

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
  
}

