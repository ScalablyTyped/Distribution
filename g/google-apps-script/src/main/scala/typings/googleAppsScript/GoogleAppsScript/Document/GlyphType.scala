package typings.googleAppsScript.GoogleAppsScript.Document

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GlyphType with Double] = js.native
  /* 0 */ @js.native
  object BULLET extends TopLevel[BULLET with Double]
  
  /* 1 */ @js.native
  object HOLLOW_BULLET extends TopLevel[HOLLOW_BULLET with Double]
  
  /* 5 */ @js.native
  object LATIN_LOWER extends TopLevel[LATIN_LOWER with Double]
  
  /* 4 */ @js.native
  object LATIN_UPPER extends TopLevel[LATIN_UPPER with Double]
  
  /* 3 */ @js.native
  object NUMBER extends TopLevel[NUMBER with Double]
  
  /* 7 */ @js.native
  object ROMAN_LOWER extends TopLevel[ROMAN_LOWER with Double]
  
  /* 6 */ @js.native
  object ROMAN_UPPER extends TopLevel[ROMAN_UPPER with Double]
  
  /* 2 */ @js.native
  object SQUARE_BULLET extends TopLevel[SQUARE_BULLET with Double]
  
}

