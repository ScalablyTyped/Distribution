package typings.fontkit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlyphPosition extends js.Object {
  /** The amount to move the virtual pen in the X direction after rendering this glyph. */
  var xAdvance: Double
  /** The offset from the pen position in the X direction at which to render this glyph. */
  var xOffset: Double
  /** The amount to move the virtual pen in the Y direction after rendering this glyph. */
  var yAdvance: Double
  /** The offset from the pen position in the Y direction at which to render this glyph. */
  var yOffset: Double
}

object GlyphPosition {
  @scala.inline
  def apply(xAdvance: Double, xOffset: Double, yAdvance: Double, yOffset: Double): GlyphPosition = {
    val __obj = js.Dynamic.literal(xAdvance = xAdvance.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], yAdvance = yAdvance.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlyphPosition]
  }
}

