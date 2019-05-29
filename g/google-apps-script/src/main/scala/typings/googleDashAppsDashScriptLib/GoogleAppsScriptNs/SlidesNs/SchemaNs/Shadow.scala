package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Shadow extends js.Object {
  var alignment: js.UndefOr[java.lang.String] = js.undefined
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var blurRadius: js.UndefOr[Dimension] = js.undefined
  var color: js.UndefOr[OpaqueColor] = js.undefined
  var propertyState: js.UndefOr[java.lang.String] = js.undefined
  var rotateWithShape: js.UndefOr[scala.Boolean] = js.undefined
  var transform: js.UndefOr[AffineTransform] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Shadow {
  @scala.inline
  def apply(
    alignment: java.lang.String = null,
    alpha: scala.Int | scala.Double = null,
    blurRadius: Dimension = null,
    color: OpaqueColor = null,
    propertyState: java.lang.String = null,
    rotateWithShape: js.UndefOr[scala.Boolean] = js.undefined,
    transform: AffineTransform = null,
    `type`: java.lang.String = null
  ): Shadow = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment)
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (blurRadius != null) __obj.updateDynamic("blurRadius")(blurRadius)
    if (color != null) __obj.updateDynamic("color")(color)
    if (propertyState != null) __obj.updateDynamic("propertyState")(propertyState)
    if (!js.isUndefined(rotateWithShape)) __obj.updateDynamic("rotateWithShape")(rotateWithShape)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Shadow]
  }
}

