package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AffineTransform extends js.Object {
  var scaleX: js.UndefOr[stdLib.Number] = js.undefined
  var scaleY: js.UndefOr[stdLib.Number] = js.undefined
  var shearX: js.UndefOr[stdLib.Number] = js.undefined
  var shearY: js.UndefOr[stdLib.Number] = js.undefined
  var translateX: js.UndefOr[stdLib.Number] = js.undefined
  var translateY: js.UndefOr[stdLib.Number] = js.undefined
  var unit: js.UndefOr[java.lang.String] = js.undefined
}

object AffineTransform {
  @scala.inline
  def apply(
    scaleX: stdLib.Number = null,
    scaleY: stdLib.Number = null,
    shearX: stdLib.Number = null,
    shearY: stdLib.Number = null,
    translateX: stdLib.Number = null,
    translateY: stdLib.Number = null,
    unit: java.lang.String = null
  ): AffineTransform = {
    val __obj = js.Dynamic.literal()
    if (scaleX != null) __obj.updateDynamic("scaleX")(scaleX)
    if (scaleY != null) __obj.updateDynamic("scaleY")(scaleY)
    if (shearX != null) __obj.updateDynamic("shearX")(shearX)
    if (shearY != null) __obj.updateDynamic("shearY")(shearY)
    if (translateX != null) __obj.updateDynamic("translateX")(translateX)
    if (translateY != null) __obj.updateDynamic("translateY")(translateY)
    if (unit != null) __obj.updateDynamic("unit")(unit)
    __obj.asInstanceOf[AffineTransform]
  }
}

