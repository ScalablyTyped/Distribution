package typings.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var bottomOffset: js.UndefOr[Double] = js.undefined
  var leftOffset: js.UndefOr[Double] = js.undefined
  var rightOffset: js.UndefOr[Double] = js.undefined
  var topOffset: js.UndefOr[Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    bottomOffset: js.UndefOr[Double] = js.undefined,
    leftOffset: js.UndefOr[Double] = js.undefined,
    rightOffset: js.UndefOr[Double] = js.undefined,
    topOffset: js.UndefOr[Double] = js.undefined
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bottomOffset)) __obj.updateDynamic("bottomOffset")(bottomOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leftOffset)) __obj.updateDynamic("leftOffset")(leftOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rightOffset)) __obj.updateDynamic("rightOffset")(rightOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(topOffset)) __obj.updateDynamic("topOffset")(topOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

