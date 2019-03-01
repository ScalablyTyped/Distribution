package typings
package gapiDotClientDotMonitoringLib.gapiNs.clientNs.monitoringNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linear extends js.Object {
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[scala.Double] = js.undefined
  /** Lower bound of the first bucket. */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /** Must be greater than 0. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Linear {
  @scala.inline
  def apply(
    numFiniteBuckets: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Linear = {
    val __obj = js.Dynamic.literal()
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linear]
  }
}

