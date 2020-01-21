package typings.fontkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Glyph extends js.Object {
  /** the glyph’s advance width */
  var advanceWidth: Double
  /** the glyph’s bounding box, i.e. the rectangle that encloses the glyph outline as tightly as possible. */
  var bbox: BBOX
  /**
    * The glyph’s control box.
    * This is often the same as the bounding box, but is faster to compute.
    * Because of the way bezier curves are defined, some of the control points
    * can be outside of the bounding box. Where `bbox` takes this into account,
    * `cbox` does not. Thus, cbox is less accurate, but faster to compute.
    * See [here](http://www.freetype.org/freetype2/docs/glyphs/glyphs-6.html#section-2)
    * for a more detailed description.
    */
  var cbox: BBOX
  /**
    * An array of unicode code points that are represented by this glyph.
    * There can be multiple code points in the case of ligatures and other glyphs
    * that represent multiple visual characters.
    */
  var codePoints: js.Array[Double]
  /** the glyph id in the font */
  var id: Double
  /** is a ligature glyph (multiple character, spacing glyph) */
  var isLigature: Boolean
  /** is a mark glyph (non-spacing combining glyph) */
  var isMark: Boolean
  /** a vector Path object representing the glyph */
  var path: Path
}

object Glyph {
  @scala.inline
  def apply(
    advanceWidth: Double,
    bbox: BBOX,
    cbox: BBOX,
    codePoints: js.Array[Double],
    id: Double,
    isLigature: Boolean,
    isMark: Boolean,
    path: Path
  ): Glyph = {
    val __obj = js.Dynamic.literal(advanceWidth = advanceWidth.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], cbox = cbox.asInstanceOf[js.Any], codePoints = codePoints.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLigature = isLigature.asInstanceOf[js.Any], isMark = isMark.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Glyph]
  }
}

