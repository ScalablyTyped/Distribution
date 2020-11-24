package typings.fontkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Glyph extends js.Object {
  
  /** the glyph’s advance width */
  var advanceWidth: Double = js.native
  
  /** the glyph’s bounding box, i.e. the rectangle that encloses the glyph outline as tightly as possible. */
  var bbox: BBOX = js.native
  
  /**
    * The glyph’s control box.
    * This is often the same as the bounding box, but is faster to compute.
    * Because of the way bezier curves are defined, some of the control points
    * can be outside of the bounding box. Where `bbox` takes this into account,
    * `cbox` does not. Thus, cbox is less accurate, but faster to compute.
    * See [here](http://www.freetype.org/freetype2/docs/glyphs/glyphs-6.html#section-2)
    * for a more detailed description.
    */
  var cbox: BBOX = js.native
  
  /**
    * An array of unicode code points that are represented by this glyph.
    * There can be multiple code points in the case of ligatures and other glyphs
    * that represent multiple visual characters.
    */
  var codePoints: js.Array[Double] = js.native
  
  /** the glyph id in the font */
  var id: Double = js.native
  
  /** is a ligature glyph (multiple character, spacing glyph) */
  var isLigature: Boolean = js.native
  
  /** is a mark glyph (non-spacing combining glyph) */
  var isMark: Boolean = js.native
  
  /** a vector Path object representing the glyph */
  var path: Path = js.native
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
  
  @scala.inline
  implicit class GlyphOps[Self <: Glyph] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdvanceWidth(value: Double): Self = this.set("advanceWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBbox(value: BBOX): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCbox(value: BBOX): Self = this.set("cbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodePointsVarargs(value: Double*): Self = this.set("codePoints", js.Array(value :_*))
    
    @scala.inline
    def setCodePoints(value: js.Array[Double]): Self = this.set("codePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLigature(value: Boolean): Self = this.set("isLigature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMark(value: Boolean): Self = this.set("isMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
  }
}
