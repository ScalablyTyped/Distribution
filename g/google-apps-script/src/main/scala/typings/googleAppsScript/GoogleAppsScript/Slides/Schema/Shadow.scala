package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  var alignment: js.UndefOr[String] = js.undefined
  var alpha: js.UndefOr[Double] = js.undefined
  var blurRadius: js.UndefOr[Dimension] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
  var propertyState: js.UndefOr[String] = js.undefined
  var rotateWithShape: js.UndefOr[Boolean] = js.undefined
  var transform: js.UndefOr[AffineTransform] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    alignment: String = null,
    alpha: Int | Double = null,
    blurRadius: Dimension = null,
    color: OpaqueColor = null,
    propertyState: String = null,
    rotateWithShape: js.UndefOr[Boolean] = js.undefined,
    transform: AffineTransform = null,
    `type`: String = null
  ): Shadow = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState.asInstanceOf[js.Any])
    if (!js.isUndefined(rotateWithShape)) __obj.updateDynamic("rotateWithShape")(rotateWithShape.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shadow]
  }
}

