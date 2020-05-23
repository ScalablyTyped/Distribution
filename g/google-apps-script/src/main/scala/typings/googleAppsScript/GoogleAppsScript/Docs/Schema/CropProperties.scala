package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CropProperties extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
  var offsetBottom: js.UndefOr[Double] = js.undefined
  var offsetLeft: js.UndefOr[Double] = js.undefined
  var offsetRight: js.UndefOr[Double] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
}

object CropProperties {
  @scala.inline
  def apply(
    angle: js.UndefOr[Double] = js.undefined,
    offsetBottom: js.UndefOr[Double] = js.undefined,
    offsetLeft: js.UndefOr[Double] = js.undefined,
    offsetRight: js.UndefOr[Double] = js.undefined,
    offsetTop: js.UndefOr[Double] = js.undefined
  ): CropProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottom)) __obj.updateDynamic("offsetBottom")(offsetBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeft)) __obj.updateDynamic("offsetLeft")(offsetLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetRight)) __obj.updateDynamic("offsetRight")(offsetRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CropProperties]
  }
}

