package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Document {
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.Attribute & Double] = js.native
    
    /* 0 */ val BACKGROUND_COLOR: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.BACKGROUND_COLOR & Double = js.native
    
    /* 1 */ val BOLD: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.BOLD & Double = js.native
    
    /* 2 */ val BORDER_COLOR: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.BORDER_COLOR & Double = js.native
    
    /* 3 */ val BORDER_WIDTH: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.BORDER_WIDTH & Double = js.native
    
    /* 4 */ val CODE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.CODE & Double = js.native
    
    /* 5 */ val FONT_FAMILY: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.FONT_FAMILY & Double = js.native
    
    /* 6 */ val FONT_SIZE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.FONT_SIZE & Double = js.native
    
    /* 7 */ val FOREGROUND_COLOR: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.FOREGROUND_COLOR & Double = js.native
    
    /* 15 */ val GLYPH_TYPE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.GLYPH_TYPE & Double = js.native
    
    /* 8 */ val HEADING: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.HEADING & Double = js.native
    
    /* 9 */ val HEIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.HEIGHT & Double = js.native
    
    /* 10 */ val HORIZONTAL_ALIGNMENT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.HORIZONTAL_ALIGNMENT & Double = js.native
    
    /* 11 */ val INDENT_END: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_END & Double = js.native
    
    /* 12 */ val INDENT_FIRST_LINE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_FIRST_LINE & Double = js.native
    
    /* 13 */ val INDENT_START: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.INDENT_START & Double = js.native
    
    /* 14 */ val ITALIC: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.ITALIC & Double = js.native
    
    /* 16 */ val LEFT_TO_RIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.LEFT_TO_RIGHT & Double = js.native
    
    /* 17 */ val LINE_SPACING: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.LINE_SPACING & Double = js.native
    
    /* 18 */ val LINK_URL: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.LINK_URL & Double = js.native
    
    /* 19 */ val LIST_ID: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.LIST_ID & Double = js.native
    
    /* 20 */ val MARGIN_BOTTOM: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_BOTTOM & Double = js.native
    
    /* 21 */ val MARGIN_LEFT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_LEFT & Double = js.native
    
    /* 22 */ val MARGIN_RIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_RIGHT & Double = js.native
    
    /* 23 */ val MARGIN_TOP: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.MARGIN_TOP & Double = js.native
    
    /* 25 */ val MINIMUM_HEIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.MINIMUM_HEIGHT & Double = js.native
    
    /* 24 */ val NESTING_LEVEL: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.NESTING_LEVEL & Double = js.native
    
    /* 26 */ val PADDING_BOTTOM: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_BOTTOM & Double = js.native
    
    /* 27 */ val PADDING_LEFT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_LEFT & Double = js.native
    
    /* 28 */ val PADDING_RIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_RIGHT & Double = js.native
    
    /* 29 */ val PADDING_TOP: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PADDING_TOP & Double = js.native
    
    /* 30 */ val PAGE_HEIGHT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PAGE_HEIGHT & Double = js.native
    
    /* 31 */ val PAGE_WIDTH: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.PAGE_WIDTH & Double = js.native
    
    /* 32 */ val SPACING_AFTER: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.SPACING_AFTER & Double = js.native
    
    /* 33 */ val SPACING_BEFORE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.SPACING_BEFORE & Double = js.native
    
    /* 34 */ val STRIKETHROUGH: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.STRIKETHROUGH & Double = js.native
    
    /* 35 */ val UNDERLINE: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.UNDERLINE & Double = js.native
    
    /* 36 */ val VERTICAL_ALIGNMENT: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.VERTICAL_ALIGNMENT & Double = js.native
    
    /* 37 */ val WIDTH: typings.googleAppsScript.GoogleAppsScript.Document.Attribute.WIDTH & Double = js.native
  }
  
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
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.ElementType & Double] = js.native
    
    /* 0 */ val BODY_SECTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.BODY_SECTION & Double = js.native
    
    /* 1 */ val COMMENT_SECTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.COMMENT_SECTION & Double = js.native
    
    /* 2 */ val DATE: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.DATE & Double = js.native
    
    /* 3 */ val DOCUMENT: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.DOCUMENT & Double = js.native
    
    /* 4 */ val EQUATION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION & Double = js.native
    
    /* 5 */ val EQUATION_FUNCTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION & Double = js.native
    
    /* 6 */ val EQUATION_FUNCTION_ARGUMENT_SEPARATOR: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_FUNCTION_ARGUMENT_SEPARATOR & Double = js.native
    
    /* 7 */ val EQUATION_SYMBOL: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.EQUATION_SYMBOL & Double = js.native
    
    /* 8 */ val FOOTER_SECTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTER_SECTION & Double = js.native
    
    /* 9 */ val FOOTNOTE: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTNOTE & Double = js.native
    
    /* 10 */ val FOOTNOTE_SECTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.FOOTNOTE_SECTION & Double = js.native
    
    /* 11 */ val HEADER_SECTION: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.HEADER_SECTION & Double = js.native
    
    /* 12 */ val HORIZONTAL_RULE: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.HORIZONTAL_RULE & Double = js.native
    
    /* 13 */ val INLINE_DRAWING: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.INLINE_DRAWING & Double = js.native
    
    /* 14 */ val INLINE_IMAGE: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.INLINE_IMAGE & Double = js.native
    
    /* 15 */ val LIST_ITEM: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.LIST_ITEM & Double = js.native
    
    /* 16 */ val PAGE_BREAK: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.PAGE_BREAK & Double = js.native
    
    /* 17 */ val PARAGRAPH: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.PARAGRAPH & Double = js.native
    
    /* 18 */ val PERSON: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.PERSON & Double = js.native
    
    /* 19 */ val RICH_LINK: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.RICH_LINK & Double = js.native
    
    /* 20 */ val TABLE: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE & Double = js.native
    
    /* 21 */ val TABLE_CELL: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_CELL & Double = js.native
    
    /* 22 */ val TABLE_OF_CONTENTS: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_OF_CONTENTS & Double = js.native
    
    /* 23 */ val TABLE_ROW: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.TABLE_ROW & Double = js.native
    
    /* 24 */ val TEXT: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.TEXT & Double = js.native
    
    /* 25 */ val UNSUPPORTED: typings.googleAppsScript.GoogleAppsScript.Document.ElementType.UNSUPPORTED & Double = js.native
  }
  
  /**
    *
    * Deprecated. The methods getFontFamily() and setFontFamily(String) now use string
    *     names for fonts instead of this enum. Although this enum is deprecated, it will remain
    *     available for compatibility with older scripts.
    * An enumeration of the supported fonts.
    *
    * Use the FontFamily enumeration to set the font for a range of text, element or
    * document.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert a paragraph at the start of the document.
    *     body.insertParagraph(0, "Hello, Apps Script!");
    *
    *     // Set the document font to Calibri.
    *     body.editAsText().setFontFamily(DocumentApp.FontFamily.CALIBRI);
    *
    *     // Set the first paragraph font to Arial.
    *     body.getParagraphs()[0].setFontFamily(DocumentApp.FontFamily.ARIAL);
    *
    *     // Set "Apps Script" to Comic Sans MS.
    *     var text = 'Apps Script';
    *     var a = body.getText().indexOf(text);
    *     var b = a + text.length - 1;
    *     body.editAsText().setFontFamily(a, b, DocumentApp.FontFamily.COMIC_SANS_MS);
    */
  @JSGlobal("GoogleAppsScript.Document.FontFamily")
  @js.native
  object FontFamily extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.FontFamily & Double] = js.native
    
    /* 0 */ val AMARANTH: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.AMARANTH & Double = js.native
    
    /* 1 */ val ARIAL: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL & Double = js.native
    
    /* 2 */ val ARIAL_BLACK: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL_BLACK & Double = js.native
    
    /* 3 */ val ARIAL_NARROW: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARIAL_NARROW & Double = js.native
    
    /* 4 */ val ARVO: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.ARVO & Double = js.native
    
    /* 5 */ val CALIBRI: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.CALIBRI & Double = js.native
    
    /* 6 */ val CAMBRIA: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.CAMBRIA & Double = js.native
    
    /* 7 */ val COMIC_SANS_MS: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.COMIC_SANS_MS & Double = js.native
    
    /* 8 */ val CONSOLAS: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.CONSOLAS & Double = js.native
    
    /* 9 */ val CORSIVA: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.CORSIVA & Double = js.native
    
    /* 10 */ val COURIER_NEW: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.COURIER_NEW & Double = js.native
    
    /* 11 */ val DANCING_SCRIPT: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.DANCING_SCRIPT & Double = js.native
    
    /* 12 */ val DROID_SANS: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.DROID_SANS & Double = js.native
    
    /* 13 */ val DROID_SERIF: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.DROID_SERIF & Double = js.native
    
    /* 14 */ val GARAMOND: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.GARAMOND & Double = js.native
    
    /* 15 */ val GEORGIA: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.GEORGIA & Double = js.native
    
    /* 16 */ val GLORIA_HALLELUJAH: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.GLORIA_HALLELUJAH & Double = js.native
    
    /* 17 */ val GREAT_VIBES: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.GREAT_VIBES & Double = js.native
    
    /* 18 */ val LOBSTER: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.LOBSTER & Double = js.native
    
    /* 19 */ val MERRIWEATHER: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.MERRIWEATHER & Double = js.native
    
    /* 20 */ val PACIFICO: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.PACIFICO & Double = js.native
    
    /* 21 */ val PHILOSOPHER: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.PHILOSOPHER & Double = js.native
    
    /* 22 */ val POIRET_ONE: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.POIRET_ONE & Double = js.native
    
    /* 23 */ val QUATTROCENTO: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.QUATTROCENTO & Double = js.native
    
    /* 24 */ val ROBOTO: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.ROBOTO & Double = js.native
    
    /* 25 */ val SHADOWS_INTO_LIGHT: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.SHADOWS_INTO_LIGHT & Double = js.native
    
    /* 26 */ val SYNCOPATE: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.SYNCOPATE & Double = js.native
    
    /* 27 */ val TAHOMA: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.TAHOMA & Double = js.native
    
    /* 28 */ val TIMES_NEW_ROMAN: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.TIMES_NEW_ROMAN & Double = js.native
    
    /* 29 */ val TREBUCHET_MS: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.TREBUCHET_MS & Double = js.native
    
    /* 30 */ val UBUNTU: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.UBUNTU & Double = js.native
    
    /* 31 */ val VERDANA: typings.googleAppsScript.GoogleAppsScript.Document.FontFamily.VERDANA & Double = js.native
  }
  
  /**
    * An enumeration of the supported glyph types.
    *
    * Use the GlyphType enumeration to set the bullet type for list items.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert at list item, with the default nesting level of zero.
    *      body.appendListItem("Item 1");
    *
    *      // Append a second list item, with a nesting level of one, indented one inch.
    *      // The two items will have different bullet glyphs.
    *      body.appendListItem("Item 2").setNestingLevel(1).setIndentStart(72)
    *          .setGlyphType(DocumentApp.GlyphType.SQUARE_BULLET);
    */
  @JSGlobal("GoogleAppsScript.Document.GlyphType")
  @js.native
  object GlyphType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.GlyphType & Double] = js.native
    
    /* 0 */ val BULLET: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.BULLET & Double = js.native
    
    /* 1 */ val HOLLOW_BULLET: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.HOLLOW_BULLET & Double = js.native
    
    /* 5 */ val LATIN_LOWER: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.LATIN_LOWER & Double = js.native
    
    /* 4 */ val LATIN_UPPER: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.LATIN_UPPER & Double = js.native
    
    /* 3 */ val NUMBER: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.NUMBER & Double = js.native
    
    /* 7 */ val ROMAN_LOWER: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.ROMAN_LOWER & Double = js.native
    
    /* 6 */ val ROMAN_UPPER: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.ROMAN_UPPER & Double = js.native
    
    /* 2 */ val SQUARE_BULLET: typings.googleAppsScript.GoogleAppsScript.Document.GlyphType.SQUARE_BULLET & Double = js.native
  }
  
  /**
    * An enumeration of the supported horizontal alignment types.
    *
    * Use the HorizontalAlignment enumeration to manipulate the alignment of Paragraph contents.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Insert a paragraph and a table at the start of document.
    *     var par1 = body.insertParagraph(0, "Center");
    *     var table = body.insertTable(1, [['Left', 'Right']]);
    *     var par2 = table.getCell(0, 0).getChild(0).asParagraph();
    *     var par3 = table.getCell(0, 0).getChild(0).asParagraph();
    *
    *     // Center align the first paragraph.
    *     par1.setAlignment(DocumentApp.HorizontalAlignment.CENTER);
    *
    *     // Left align the first cell.
    *     par2.setAlignment(DocumentApp.HorizontalAlignment.LEFT);
    *
    *     // Right align the second cell.
    *     par3.setAlignment(DocumentApp.HorizontalAlignment.RIGHT);
    */
  @JSGlobal("GoogleAppsScript.Document.HorizontalAlignment")
  @js.native
  object HorizontalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment & Double] = js.native
    
    /* 1 */ val CENTER: typings.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.CENTER & Double = js.native
    
    /* 3 */ val JUSTIFY: typings.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.JUSTIFY & Double = js.native
    
    /* 0 */ val LEFT: typings.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.LEFT & Double = js.native
    
    /* 2 */ val RIGHT: typings.googleAppsScript.GoogleAppsScript.Document.HorizontalAlignment.RIGHT & Double = js.native
  }
  
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
  object ParagraphHeading extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading & Double] = js.native
    
    /* 1 */ val HEADING1: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING1 & Double = js.native
    
    /* 2 */ val HEADING2: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING2 & Double = js.native
    
    /* 3 */ val HEADING3: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING3 & Double = js.native
    
    /* 4 */ val HEADING4: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING4 & Double = js.native
    
    /* 5 */ val HEADING5: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING5 & Double = js.native
    
    /* 6 */ val HEADING6: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.HEADING6 & Double = js.native
    
    /* 0 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.NORMAL & Double = js.native
    
    /* 8 */ val SUBTITLE: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.SUBTITLE & Double = js.native
    
    /* 7 */ val TITLE: typings.googleAppsScript.GoogleAppsScript.Document.ParagraphHeading.TITLE & Double = js.native
  }
  
  /**
    * An enumeration that specifies how to lay out a PositionedImage in relation to surrounding
    * text.
    */
  @JSGlobal("GoogleAppsScript.Document.PositionedLayout")
  @js.native
  object PositionedLayout extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout & Double] = js.native
    
    /* 0 */ val ABOVE_TEXT: typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.ABOVE_TEXT & Double = js.native
    
    /* 1 */ val BREAK_BOTH: typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_BOTH & Double = js.native
    
    /* 2 */ val BREAK_LEFT: typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_LEFT & Double = js.native
    
    /* 3 */ val BREAK_RIGHT: typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.BREAK_RIGHT & Double = js.native
    
    /* 4 */ val WRAP_TEXT: typings.googleAppsScript.GoogleAppsScript.Document.PositionedLayout.WRAP_TEXT & Double = js.native
  }
  
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.TextAlignment & Double] = js.native
    
    /* 0 */ val NORMAL: typings.googleAppsScript.GoogleAppsScript.Document.TextAlignment.NORMAL & Double = js.native
    
    /* 2 */ val SUBSCRIPT: typings.googleAppsScript.GoogleAppsScript.Document.TextAlignment.SUBSCRIPT & Double = js.native
    
    /* 1 */ val SUPERSCRIPT: typings.googleAppsScript.GoogleAppsScript.Document.TextAlignment.SUPERSCRIPT & Double = js.native
  }
  
  /**
    * An enumeration of the supported vertical alignment types.
    *
    * Use the VerticalAlignment enumeration to set the vertical alignment of table cells.
    *
    *     var body = DocumentApp.getActiveDocument().getBody();
    *
    *     // Append table containing two cells.
    *     var table = body.appendTable([['Top', 'Center', 'Bottom']]);
    *
    *     // Align the first cell's contents to the top.
    *     table.getCell(0, 0).setVerticalAlignment(DocumentApp.VerticalAlignment.TOP);
    *
    *     // Align the second cell's contents to the center.
    *     table.getCell(0, 1).setVerticalAlignment(DocumentApp.VerticalAlignment.CENTER);
    *
    *     // Align the third cell's contents to the bottom.
    *     table.getCell(0, 2).setVerticalAlignment(DocumentApp.VerticalAlignment.BOTTOM);
    */
  @JSGlobal("GoogleAppsScript.Document.VerticalAlignment")
  @js.native
  object VerticalAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment & Double] = js.native
    
    /* 0 */ val BOTTOM: typings.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.BOTTOM & Double = js.native
    
    /* 1 */ val CENTER: typings.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.CENTER & Double = js.native
    
    /* 2 */ val TOP: typings.googleAppsScript.GoogleAppsScript.Document.VerticalAlignment.TOP & Double = js.native
  }
}
