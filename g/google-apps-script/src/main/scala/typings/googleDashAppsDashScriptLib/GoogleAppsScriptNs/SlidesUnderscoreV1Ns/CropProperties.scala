package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  // The rotation angle of the crop window around its center, in radians.
  // Rotation angle is applied after the offset.
  var angle: scala.Double
  // The offset specifies the bottom edge of the crop rectangle that is located
  // above the original bounding rectangle bottom edge, relative to the object's
  // original height.
  var bottom_offset: scala.Double
  // The offset specifies the left edge of the crop rectangle that is located to
  // the right of the original bounding rectangle left edge, relative to the
  // object's original width.
  var left_offset: scala.Double
  // The offset specifies the right edge of the crop rectangle that is located
  // to the left of the original bounding rectangle right edge, relative to the
  // object's original width.
  var right_offset: scala.Double
  // The offset specifies the top edge of the crop rectangle that is located
  // below the original bounding rectangle top edge, relative to the object's
  // original height.
  var top_offset: scala.Double
}

object CropProperties {
  @scala.inline
  def apply(
    angle: scala.Double,
    bottom_offset: scala.Double,
    left_offset: scala.Double,
    right_offset: scala.Double,
    top_offset: scala.Double
  ): CropProperties = {
    val __obj = js.Dynamic.literal(angle = angle, bottom_offset = bottom_offset, left_offset = left_offset, right_offset = right_offset, top_offset = top_offset)
  
    __obj.asInstanceOf[CropProperties]
  }
}

