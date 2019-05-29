package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var offsetBottom: js.UndefOr[scala.Double] = js.undefined
  var offsetLeft: js.UndefOr[scala.Double] = js.undefined
  var offsetRight: js.UndefOr[scala.Double] = js.undefined
  var offsetTop: js.UndefOr[scala.Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    offsetBottom: scala.Int | scala.Double = null,
    offsetLeft: scala.Int | scala.Double = null,
    offsetRight: scala.Int | scala.Double = null,
    offsetTop: scala.Int | scala.Double = null
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom.asInstanceOf[js.Any])
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft.asInstanceOf[js.Any])
    if (offsetRight != null) __obj.updateDynamic("offsetRight")(offsetRight.asInstanceOf[js.Any])
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

