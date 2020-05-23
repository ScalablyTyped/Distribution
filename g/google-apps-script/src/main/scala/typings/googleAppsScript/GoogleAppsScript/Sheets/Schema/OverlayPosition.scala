package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayPosition extends js.Object {
  var anchorCell: js.UndefOr[GridCoordinate] = js.undefined
  var heightPixels: js.UndefOr[Double] = js.undefined
  var offsetXPixels: js.UndefOr[Double] = js.undefined
  var offsetYPixels: js.UndefOr[Double] = js.undefined
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object OverlayPosition {
  @scala.inline
  def apply(
    anchorCell: GridCoordinate = null,
    heightPixels: js.UndefOr[Double] = js.undefined,
    offsetXPixels: js.UndefOr[Double] = js.undefined,
    offsetYPixels: js.UndefOr[Double] = js.undefined,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): OverlayPosition = {
    val __obj = js.Dynamic.literal()
    if (anchorCell != null) __obj.updateDynamic("anchorCell")(anchorCell.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetXPixels)) __obj.updateDynamic("offsetXPixels")(offsetXPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetYPixels)) __obj.updateDynamic("offsetYPixels")(offsetYPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayPosition]
  }
}

