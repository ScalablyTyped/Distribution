package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayPosition extends js.Object {
  var anchorCell: js.UndefOr[GridCoordinate] = js.undefined
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  var offsetXPixels: js.UndefOr[scala.Double] = js.undefined
  var offsetYPixels: js.UndefOr[scala.Double] = js.undefined
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

object OverlayPosition {
  @scala.inline
  def apply(
    anchorCell: GridCoordinate = null,
    heightPixels: scala.Int | scala.Double = null,
    offsetXPixels: scala.Int | scala.Double = null,
    offsetYPixels: scala.Int | scala.Double = null,
    widthPixels: scala.Int | scala.Double = null
  ): OverlayPosition = {
    val __obj = js.Dynamic.literal()
    if (anchorCell != null) __obj.updateDynamic("anchorCell")(anchorCell)
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (offsetXPixels != null) __obj.updateDynamic("offsetXPixels")(offsetXPixels.asInstanceOf[js.Any])
    if (offsetYPixels != null) __obj.updateDynamic("offsetYPixels")(offsetYPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayPosition]
  }
}

