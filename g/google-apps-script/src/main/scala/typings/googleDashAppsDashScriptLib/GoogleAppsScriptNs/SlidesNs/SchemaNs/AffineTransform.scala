package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  var scaleX: js.UndefOr[scala.Double] = js.undefined
  var scaleY: js.UndefOr[scala.Double] = js.undefined
  var shearX: js.UndefOr[scala.Double] = js.undefined
  var shearY: js.UndefOr[scala.Double] = js.undefined
  var translateX: js.UndefOr[scala.Double] = js.undefined
  var translateY: js.UndefOr[scala.Double] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object AffineTransform {
  @scala.inline
  def apply(
    scaleX: scala.Int | scala.Double = null,
    scaleY: scala.Int | scala.Double = null,
    shearX: scala.Int | scala.Double = null,
    shearY: scala.Int | scala.Double = null,
    translateX: scala.Int | scala.Double = null,
    translateY: scala.Int | scala.Double = null,
    unit: java.lang.String = null
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX.asInstanceOf[js.Any])
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY.asInstanceOf[js.Any])
    if (shearX != null) __obj.updateDynamic("shearX")(shearX.asInstanceOf[js.Any])
    if (shearY != null) __obj.updateDynamic("shearY")(shearY.asInstanceOf[js.Any])
    if (translateX != null) __obj.updateDynamic("translateX")(translateX.asInstanceOf[js.Any])
    if (translateY != null) __obj.updateDynamic("translateY")(translateY.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[AffineTransform]
  }
}

