package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[scala.Double] = js.undefined
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  var leftOffset: js.UndefOr[scala.Double] = js.undefined
  var rightOffset: js.UndefOr[scala.Double] = js.undefined
  var topOffset: js.UndefOr[scala.Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    bottomOffset: scala.Int | scala.Double = null,
    leftOffset: scala.Int | scala.Double = null,
    rightOffset: scala.Int | scala.Double = null,
    topOffset: scala.Int | scala.Double = null
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (leftOffset != null) __obj.updateDynamic("leftOffset")(leftOffset.asInstanceOf[js.Any])
    if (rightOffset != null) __obj.updateDynamic("rightOffset")(rightOffset.asInstanceOf[js.Any])
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

