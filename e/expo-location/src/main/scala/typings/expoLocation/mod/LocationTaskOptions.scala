package typings.expoLocation.mod

import typings.expoLocation.anon.NotificationBody
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationTaskOptions extends js.Object {
  var accuracy: js.UndefOr[LocationAccuracy] = js.undefined
  var activityType: js.UndefOr[LocationActivityType] = js.undefined
  var deferredUpdatesDistance: js.UndefOr[Double] = js.undefined
  var deferredUpdatesInterval: js.UndefOr[Double] = js.undefined
  var deferredUpdatesTimeout: js.UndefOr[Double] = js.undefined
  var distanceInterval: js.UndefOr[Double] = js.undefined
  var foregroundService: js.UndefOr[NotificationBody] = js.undefined
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined
  var timeInterval: js.UndefOr[Double] = js.undefined
}

object LocationTaskOptions {
  @scala.inline
  def apply(
    accuracy: LocationAccuracy = null,
    activityType: LocationActivityType = null,
    deferredUpdatesDistance: js.UndefOr[Double] = js.undefined,
    deferredUpdatesInterval: js.UndefOr[Double] = js.undefined,
    deferredUpdatesTimeout: js.UndefOr[Double] = js.undefined,
    distanceInterval: js.UndefOr[Double] = js.undefined,
    foregroundService: NotificationBody = null,
    pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined,
    showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined,
    timeInterval: js.UndefOr[Double] = js.undefined
  ): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredUpdatesDistance)) __obj.updateDynamic("deferredUpdatesDistance")(deferredUpdatesDistance.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredUpdatesInterval)) __obj.updateDynamic("deferredUpdatesInterval")(deferredUpdatesInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferredUpdatesTimeout)) __obj.updateDynamic("deferredUpdatesTimeout")(deferredUpdatesTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceInterval)) __obj.updateDynamic("distanceInterval")(distanceInterval.get.asInstanceOf[js.Any])
    if (foregroundService != null) __obj.updateDynamic("foregroundService")(foregroundService.asInstanceOf[js.Any])
    if (!js.isUndefined(pausesUpdatesAutomatically)) __obj.updateDynamic("pausesUpdatesAutomatically")(pausesUpdatesAutomatically.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showsBackgroundLocationIndicator)) __obj.updateDynamic("showsBackgroundLocationIndicator")(showsBackgroundLocationIndicator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeInterval)) __obj.updateDynamic("timeInterval")(timeInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTaskOptions]
  }
}

