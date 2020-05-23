package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GlyphType extends js.Object

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
object GlyphType extends js.Object {
  @js.native
  sealed trait BULLET extends GlyphType
  
  @js.native
  sealed trait HOLLOW_BULLET extends GlyphType
  
  @js.native
  sealed trait LATIN_LOWER extends GlyphType
  
  @js.native
  sealed trait LATIN_UPPER extends GlyphType
  
  @js.native
  sealed trait NUMBER extends GlyphType
  
  @js.native
  sealed trait ROMAN_LOWER extends GlyphType
  
  @js.native
  sealed trait ROMAN_UPPER extends GlyphType
  
  @js.native
  sealed trait SQUARE_BULLET extends GlyphType
  
}

