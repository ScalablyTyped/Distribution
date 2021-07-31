package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Attribute extends StObject
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
object Attribute extends StObject {
  
  @js.native
  sealed trait BACKGROUND_COLOR
    extends StObject
       with Attribute
  
  @js.native
  sealed trait BOLD
    extends StObject
       with Attribute
  
  @js.native
  sealed trait BORDER_COLOR
    extends StObject
       with Attribute
  
  @js.native
  sealed trait BORDER_WIDTH
    extends StObject
       with Attribute
  
  @js.native
  sealed trait CODE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait FONT_FAMILY
    extends StObject
       with Attribute
  
  @js.native
  sealed trait FONT_SIZE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait FOREGROUND_COLOR
    extends StObject
       with Attribute
  
  @js.native
  sealed trait GLYPH_TYPE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait HEADING
    extends StObject
       with Attribute
  
  @js.native
  sealed trait HEIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait HORIZONTAL_ALIGNMENT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait INDENT_END
    extends StObject
       with Attribute
  
  @js.native
  sealed trait INDENT_FIRST_LINE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait INDENT_START
    extends StObject
       with Attribute
  
  @js.native
  sealed trait ITALIC
    extends StObject
       with Attribute
  
  @js.native
  sealed trait LEFT_TO_RIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait LINE_SPACING
    extends StObject
       with Attribute
  
  @js.native
  sealed trait LINK_URL
    extends StObject
       with Attribute
  
  @js.native
  sealed trait LIST_ID
    extends StObject
       with Attribute
  
  @js.native
  sealed trait MARGIN_BOTTOM
    extends StObject
       with Attribute
  
  @js.native
  sealed trait MARGIN_LEFT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait MARGIN_RIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait MARGIN_TOP
    extends StObject
       with Attribute
  
  @js.native
  sealed trait MINIMUM_HEIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait NESTING_LEVEL
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PADDING_BOTTOM
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PADDING_LEFT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PADDING_RIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PADDING_TOP
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PAGE_HEIGHT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait PAGE_WIDTH
    extends StObject
       with Attribute
  
  @js.native
  sealed trait SPACING_AFTER
    extends StObject
       with Attribute
  
  @js.native
  sealed trait SPACING_BEFORE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait STRIKETHROUGH
    extends StObject
       with Attribute
  
  @js.native
  sealed trait UNDERLINE
    extends StObject
       with Attribute
  
  @js.native
  sealed trait VERTICAL_ALIGNMENT
    extends StObject
       with Attribute
  
  @js.native
  sealed trait WIDTH
    extends StObject
       with Attribute
}
