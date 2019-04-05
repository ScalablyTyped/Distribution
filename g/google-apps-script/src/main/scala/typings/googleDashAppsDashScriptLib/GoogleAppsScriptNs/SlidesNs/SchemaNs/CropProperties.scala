package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[stdLib.Number] = js.undefined
  var bottomOffset: js.UndefOr[stdLib.Number] = js.undefined
  var leftOffset: js.UndefOr[stdLib.Number] = js.undefined
  var rightOffset: js.UndefOr[stdLib.Number] = js.undefined
  var topOffset: js.UndefOr[stdLib.Number] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: stdLib.Number = null,
    bottomOffset: stdLib.Number = null,
    leftOffset: stdLib.Number = null,
    rightOffset: stdLib.Number = null,
    topOffset: stdLib.Number = null
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle)
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset)
    if (leftOffset != null) __obj.updateDynamic("leftOffset")(leftOffset)
    if (rightOffset != null) __obj.updateDynamic("rightOffset")(rightOffset)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset)
    __obj.asInstanceOf[CropProperties]
  }
}

