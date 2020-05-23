package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  /**
    * The alignment point of the shadow, that sets the origin for translate,
    * scale and skew of the shadow.
    */
  var alignment: js.UndefOr[String] = js.undefined
  /** The alpha of the shadow's color, from 0.0 to 1.0. */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * The radius of the shadow blur. The larger the radius, the more diffuse the
    * shadow becomes.
    */
  var blurRadius: js.UndefOr[Dimension] = js.undefined
  /** The shadow color value. */
  var color: js.UndefOr[OpaqueColor] = js.undefined
  /**
    * The shadow property state.
    *
    * Updating the the shadow on a page element will implicitly update this field
    * to `RENDERED`, unless another value is specified in the same request. To
    * have no shadow on a page element, set this field to `NOT_RENDERED`. In this
    * case, any other shadow fields set in the same request will be ignored.
    */
  var propertyState: js.UndefOr[String] = js.undefined
  /** Whether the shadow should rotate with the shape. */
  var rotateWithShape: js.UndefOr[Boolean] = js.undefined
  /**
    * Transform that encodes the translate, scale, and skew of the shadow,
    * relative to the alignment position.
    */
  var transform: js.UndefOr[AffineTransform] = js.undefined
  /** The type of the shadow. */
  var `type`: js.UndefOr[String] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    alignment: String = null,
    alpha: js.UndefOr[Double] = js.undefined,
    blurRadius: Dimension = null,
    color: OpaqueColor = null,
    propertyState: String = null,
    rotateWithShape: js.UndefOr[Boolean] = js.undefined,
    transform: AffineTransform = null,
    `type`: String = null
  ): Shadow = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithShape)) __obj.updateDynamic("rotateWithShape")(rotateWithShape.get.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}

