package typings.expoDashLocation.expoDashLocationMod

import typings.expoDashLocation.Anon_NotificationBody
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
  var foregroundService: js.UndefOr[Anon_NotificationBody] = js.undefined
  var pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined
  var showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined
  var timeInterval: js.UndefOr[Double] = js.undefined
}

object LocationTaskOptions {
  @scala.inline
  def apply(
    accuracy: LocationAccuracy = null,
    activityType: LocationActivityType = null,
    deferredUpdatesDistance: Int | Double = null,
    deferredUpdatesInterval: Int | Double = null,
    deferredUpdatesTimeout: Int | Double = null,
    distanceInterval: Int | Double = null,
    foregroundService: Anon_NotificationBody = null,
    pausesUpdatesAutomatically: js.UndefOr[Boolean] = js.undefined,
    showsBackgroundLocationIndicator: js.UndefOr[Boolean] = js.undefined,
    timeInterval: Int | Double = null
  ): LocationTaskOptions = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (deferredUpdatesDistance != null) __obj.updateDynamic("deferredUpdatesDistance")(deferredUpdatesDistance.asInstanceOf[js.Any])
    if (deferredUpdatesInterval != null) __obj.updateDynamic("deferredUpdatesInterval")(deferredUpdatesInterval.asInstanceOf[js.Any])
    if (deferredUpdatesTimeout != null) __obj.updateDynamic("deferredUpdatesTimeout")(deferredUpdatesTimeout.asInstanceOf[js.Any])
    if (distanceInterval != null) __obj.updateDynamic("distanceInterval")(distanceInterval.asInstanceOf[js.Any])
    if (foregroundService != null) __obj.updateDynamic("foregroundService")(foregroundService.asInstanceOf[js.Any])
    if (!js.isUndefined(pausesUpdatesAutomatically)) __obj.updateDynamic("pausesUpdatesAutomatically")(pausesUpdatesAutomatically.asInstanceOf[js.Any])
    if (!js.isUndefined(showsBackgroundLocationIndicator)) __obj.updateDynamic("showsBackgroundLocationIndicator")(showsBackgroundLocationIndicator.asInstanceOf[js.Any])
    if (timeInterval != null) __obj.updateDynamic("timeInterval")(timeInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTaskOptions]
  }
}

