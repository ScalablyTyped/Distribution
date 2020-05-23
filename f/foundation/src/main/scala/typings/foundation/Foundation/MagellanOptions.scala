package typings.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/magellan.html#js
trait MagellanOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.undefined
  var destination_threshold: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var easing: js.UndefOr[String] = js.undefined
  var fixed_top: js.UndefOr[Double] = js.undefined
  var offset_by_height: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var throttle_delay: js.UndefOr[Double] = js.undefined
}

object MagellanOptions {
  @scala.inline
  def apply(
    active_class: String = null,
    destination_threshold: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: String = null,
    fixed_top: js.UndefOr[Double] = js.undefined,
    offset_by_height: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    throttle_delay: js.UndefOr[Double] = js.undefined
  ): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class.asInstanceOf[js.Any])
    if (!js.isUndefined(destination_threshold)) __obj.updateDynamic("destination_threshold")(destination_threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed_top)) __obj.updateDynamic("fixed_top")(fixed_top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset_by_height)) __obj.updateDynamic("offset_by_height")(offset_by_height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle_delay)) __obj.updateDynamic("throttle_delay")(throttle_delay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagellanOptions]
  }
}

