package typings.fontkit.fontkitMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphRun extends js.Object {
  /**
    * The total advance height of the run.
    */
  var advanceHeight: Double
  /**
    * The total advance width of the run.
    */
  var advanceWidth: Double
  /**
    * The bounding box containing all glyphs in the run.
    */
  var bbox: BBOX
  /**
    * The direction requested for shaping, as passed in (either ltr or rtl).
    * If `null`, the default direction of the script is used.
    */
  var direction: String
  /**
    * The features requested during shaping. This is a combination of user
    * specified features and features chosen by the shaper.
    */
  var features: Record[String, Boolean]
  /**
    * An array of Glyph objects in the run
    */
  var glyphs: js.Array[Glyph]
  /**
    * The language requested for shaping, as passed in. If `null`, the default language for the
    * script was used.
    */
  var language: String
  /**
    * An array of GlyphPosition objects for each glyph in the run
    */
  var positions: js.Array[GlyphPosition]
  /**
    * The script that was requested for shaping. This was either passed in or detected automatically.
    */
  var script: String
}

object GlyphRun {
  @scala.inline
  def apply(
    advanceHeight: Double,
    advanceWidth: Double,
    bbox: BBOX,
    direction: String,
    features: Record[String, Boolean],
    glyphs: js.Array[Glyph],
    language: String,
    positions: js.Array[GlyphPosition],
    script: String
  ): GlyphRun = {
    val __obj = js.Dynamic.literal(advanceHeight = advanceHeight.asInstanceOf[js.Any], advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], glyphs = glyphs.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlyphRun]
  }
}

