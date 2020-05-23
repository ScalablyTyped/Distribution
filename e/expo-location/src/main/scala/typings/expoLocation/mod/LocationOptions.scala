package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.undefined
  var distanceInterval: js.UndefOr[Double] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var maximumAge: js.UndefOr[Double] = js.undefined
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.undefined
  var timeInterval: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(
    accuracy: LocationAccuracy = null,
    distanceInterval: js.UndefOr[Double] = js.undefined,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    maximumAge: js.UndefOr[Double] = js.undefined,
    mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.undefined,
    timeInterval: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceInterval)) __obj.updateDynamic("distanceInterval")(distanceInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumAge)) __obj.updateDynamic("maximumAge")(maximumAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayShowUserSettingsDialog)) __obj.updateDynamic("mayShowUserSettingsDialog")(mayShowUserSettingsDialog.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeInterval)) __obj.updateDynamic("timeInterval")(timeInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

