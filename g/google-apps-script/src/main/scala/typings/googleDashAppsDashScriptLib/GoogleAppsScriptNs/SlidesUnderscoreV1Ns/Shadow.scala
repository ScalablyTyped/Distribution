package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  // The alignment point of the shadow, that sets the origin for translate,
  // scale and skew of the shadow.
  var alignment: RectanglePosition
  // The alpha of the shadow's color, from 0.0 to 1.0.
  var alpha: scala.Double
  // The radius of the shadow blur. The larger the radius, the more diffuse the
  // shadow becomes.
  var blur_radius: Dimension
  // The shadow color value.
  var color: OpaqueColor
  // The shadow property state.
  //
  // Updating the shadow on a page element will implicitly update this field to
  // `RENDERED`, unless another value is specified in the same request. To have
  // no shadow on a page element, set this field to `NOT_RENDERED`. In this
  // case, any other shadow fields set in the same request will be ignored.
  var property_state: PropertyState
  // Whether the shadow should rotate with the shape.
  var rotate_with_shape: scala.Boolean
  // Transform that encodes the translate, scale, and skew of the shadow,
  // relative to the alignment position.
  var transform: AffineTransform
  // The type of the shadow.
  var `type`: ShadowType
}

object Shadow {
  @scala.inline
  def apply(
    alignment: RectanglePosition,
    alpha: scala.Double,
    blur_radius: Dimension,
    color: OpaqueColor,
    property_state: PropertyState,
    rotate_with_shape: scala.Boolean,
    transform: AffineTransform,
    `type`: ShadowType
  ): Shadow = {
    val __obj = js.Dynamic.literal(alignment = alignment, alpha = alpha, blur_radius = blur_radius, color = color, property_state = property_state, rotate_with_shape = rotate_with_shape, transform = transform)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Shadow]
  }
}

