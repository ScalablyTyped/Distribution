package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DocsUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[stdLib.Number] = js.undefined
  var offsetBottom: js.UndefOr[stdLib.Number] = js.undefined
  var offsetLeft: js.UndefOr[stdLib.Number] = js.undefined
  var offsetRight: js.UndefOr[stdLib.Number] = js.undefined
  var offsetTop: js.UndefOr[stdLib.Number] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: stdLib.Number = null,
    offsetBottom: stdLib.Number = null,
    offsetLeft: stdLib.Number = null,
    offsetRight: stdLib.Number = null,
    offsetTop: stdLib.Number = null
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle)
    if (offsetBottom != null) __obj.updateDynamic("offsetBottom")(offsetBottom)
    if (offsetLeft != null) __obj.updateDynamic("offsetLeft")(offsetLeft)
    if (offsetRight != null) __obj.updateDynamic("offsetRight")(offsetRight)
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop)
    __obj.asInstanceOf[CropProperties]
  }
}

