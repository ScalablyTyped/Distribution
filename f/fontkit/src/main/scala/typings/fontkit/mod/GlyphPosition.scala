package typings.fontkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlyphPosition extends js.Object {
  /** The amount to move the virtual pen in the X direction after rendering this glyph. */
  var xAdvance: Double = js.native
  /** The offset from the pen position in the X direction at which to render this glyph. */
  var xOffset: Double = js.native
  /** The amount to move the virtual pen in the Y direction after rendering this glyph. */
  var yAdvance: Double = js.native
  /** The offset from the pen position in the Y direction at which to render this glyph. */
  var yOffset: Double = js.native
}

object GlyphPosition {
  @scala.inline
  def apply(xAdvance: Double, xOffset: Double, yAdvance: Double, yOffset: Double): GlyphPosition = {
    val __obj = js.Dynamic.literal(xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yAdvance = yAdvance.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphPosition]
  }
  @scala.inline
  implicit class GlyphPositionOps[Self <: GlyphPosition] (val x: Self) extends AnyVal {
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
    def setXAdvance(value: Double): Self = this.set("xAdvance", value.asInstanceOf[js.Any])
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setYAdvance(value: Double): Self = this.set("yAdvance", value.asInstanceOf[js.Any])
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
  }
  
}

