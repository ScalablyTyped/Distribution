package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.undefined
  var distanceInterval: js.UndefOr[Double] = js.undefined
  var enableHighAccuracy: js.UndefOr[Boolean] = js.undefined
  var mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.undefined
  var timeInterval: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object LocationOptions {
  @scala.inline
  def apply(
    accuracy: LocationAccuracy = null,
    distanceInterval: Int | Double = null,
    enableHighAccuracy: js.UndefOr[Boolean] = js.undefined,
    mayShowUserSettingsDialog: js.UndefOr[Boolean] = js.undefined,
    timeInterval: Int | Double = null,
    timeout: Int | Double = null
  ): LocationOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (distanceInterval != null) __obj.updateDynamic("distanceInterval")(distanceInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(enableHighAccuracy)) __obj.updateDynamic("enableHighAccuracy")(enableHighAccuracy.asInstanceOf[js.Any])
    if (!js.isUndefined(mayShowUserSettingsDialog)) __obj.updateDynamic("mayShowUserSettingsDialog")(mayShowUserSettingsDialog.asInstanceOf[js.Any])
    if (timeInterval != null) __obj.updateDynamic("timeInterval")(timeInterval.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationOptions]
  }
}

