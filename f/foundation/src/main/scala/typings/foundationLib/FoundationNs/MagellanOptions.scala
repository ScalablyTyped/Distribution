package typings
package foundationLib.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/magellan.html#js
trait MagellanOptions extends js.Object {
  var active_class: js.UndefOr[java.lang.String] = js.undefined
  var destination_threshold: js.UndefOr[scala.Double] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[java.lang.String] = js.undefined
  var fixed_top: js.UndefOr[scala.Double] = js.undefined
  var offset_by_height: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var throttle_delay: js.UndefOr[scala.Double] = js.undefined
}

object MagellanOptions {
  @scala.inline
  def apply(
    active_class: java.lang.String = null,
    destination_threshold: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    easing: java.lang.String = null,
    fixed_top: scala.Int | scala.Double = null,
    offset_by_height: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    throttle_delay: scala.Int | scala.Double = null
  ): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    if (active_class != null) __obj.updateDynamic("active_class")(active_class)
    if (destination_threshold != null) __obj.updateDynamic("destination_threshold")(destination_threshold.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fixed_top != null) __obj.updateDynamic("fixed_top")(fixed_top.asInstanceOf[js.Any])
    if (!js.isUndefined(offset_by_height)) __obj.updateDynamic("offset_by_height")(offset_by_height)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (throttle_delay != null) __obj.updateDynamic("throttle_delay")(throttle_delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[MagellanOptions]
  }
}

