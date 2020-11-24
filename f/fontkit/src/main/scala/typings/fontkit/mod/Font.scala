package typings.fontkit.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Font extends js.Object {
  
  /** the font’s ascender */
  var ascent: Double = js.native
  
  /** an array of all OpenType feature tags (or mapped AAT tags) supported by the font */
  var availableFeatures: js.Array[String] = js.native
  
  /** the font’s bounding box, i.e. the box that encloses all glyphs in the font */
  var bbox: BBOX = js.native
  
  /** the height of capital letters above the baseline */
  var capHeight: Double = js.native
  
  /** an array of all of the unicode code points supported by the font */
  var characterSet: js.Array[Double] = js.native
  
  var copyright: String = js.native
  
  /** the font’s descender */
  var descent: Double = js.native
  
  var familyName: String = js.native
  
  var fullName: String = js.native
  
  /**
    * Maps a single unicode code point to a Glyph object.
    * Does not perform any advanced substitutions (there is no context to do so).
    */
  def glyphForCodePoint(codePoint: Double): Glyph = js.native
  
  /**
    * Returns an array of Glyph objects for the given string.
    * This is only a one-to-one mapping from characters to glyphs.
    * For most uses, you should use font.layout (described below), which
    * provides a much more advanced mapping supporting AAT and OpenType shaping.
    */
  def glyphsForString(string: String): js.Array[Glyph] = js.native
  
  /**
    * Returns whether there is glyph in the font for the given unicode code point.
    */
  def hasGlyphForCodePoint(codePoint: Double): Boolean = js.native
  
  /** if this is an italic font, the angle the cursor should be drawn at to match the font design */
  var italicAngle: Double = js.native
  
  /**
    * Returns a GlyphRun object, which includes an array of Glyphs and GlyphPositions for the given string.
    */
  def layout(string: String): GlyphRun = js.native
  def layout(
    string: String,
    features: js.UndefOr[scala.Nothing],
    script: js.UndefOr[scala.Nothing],
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(
    string: String,
    features: js.UndefOr[scala.Nothing],
    script: js.UndefOr[scala.Nothing],
    language: String
  ): GlyphRun = js.native
  def layout(
    string: String,
    features: js.UndefOr[scala.Nothing],
    script: js.UndefOr[scala.Nothing],
    language: String,
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.UndefOr[scala.Nothing], script: String): GlyphRun = js.native
  def layout(
    string: String,
    features: js.UndefOr[scala.Nothing],
    script: String,
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.UndefOr[scala.Nothing], script: String, language: String): GlyphRun = js.native
  def layout(
    string: String,
    features: js.UndefOr[scala.Nothing],
    script: String,
    language: String,
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.Array[String]): GlyphRun = js.native
  def layout(
    string: String,
    features: js.Array[String],
    script: js.UndefOr[scala.Nothing],
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.Array[String], script: js.UndefOr[scala.Nothing], language: String): GlyphRun = js.native
  def layout(
    string: String,
    features: js.Array[String],
    script: js.UndefOr[scala.Nothing],
    language: String,
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.Array[String], script: String): GlyphRun = js.native
  def layout(
    string: String,
    features: js.Array[String],
    script: String,
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: js.Array[String], script: String, language: String): GlyphRun = js.native
  def layout(string: String, features: js.Array[String], script: String, language: String, direction: String): GlyphRun = js.native
  def layout(string: String, features: Record[String, Boolean]): GlyphRun = js.native
  def layout(
    string: String,
    features: Record[String, Boolean],
    script: js.UndefOr[scala.Nothing],
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(
    string: String,
    features: Record[String, Boolean],
    script: js.UndefOr[scala.Nothing],
    language: String
  ): GlyphRun = js.native
  def layout(
    string: String,
    features: Record[String, Boolean],
    script: js.UndefOr[scala.Nothing],
    language: String,
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: Record[String, Boolean], script: String): GlyphRun = js.native
  def layout(
    string: String,
    features: Record[String, Boolean],
    script: String,
    language: js.UndefOr[scala.Nothing],
    direction: String
  ): GlyphRun = js.native
  def layout(string: String, features: Record[String, Boolean], script: String, language: String): GlyphRun = js.native
  def layout(
    string: String,
    features: Record[String, Boolean],
    script: String,
    language: String,
    direction: String
  ): GlyphRun = js.native
  
  /** the amount of space that should be included between lines */
  var lineGap: Double = js.native
  
  /** the number of glyphs in the font */
  var numGlyphs: Double = js.native
  
  var postscriptName: String = js.native
  
  /**
    * Returns an array of strings that map to the given glyph id.
    */
  def stringsForGlyph(gid: Double): js.Array[String] = js.native
  
  var subfamilyName: String = js.native
  
  /** the offset from the normal underline position that should be used */
  var underlinePosition: Double = js.native
  
  /** the weight of the underline that should be used */
  var underlineThickness: Double = js.native
  
  /** the size of the font’s internal coordinate grid */
  var unitsPerEm: Double = js.native
  
  var version: Double = js.native
  
  /**
    * Returns the advance width for a single glyph id.
    */
  def widthOfGlyph(glyph_id: Double): Double = js.native
  
  /** the height of lower case letters */
  var xHeight: Double = js.native
}
