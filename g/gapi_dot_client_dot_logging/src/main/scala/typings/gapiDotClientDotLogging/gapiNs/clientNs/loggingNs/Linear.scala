package typings.gapiDotClientDotLogging.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linear extends js.Object {
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  /** Lower bound of the first bucket. */
  var offset: js.UndefOr[Double] = js.undefined
  /** Must be greater than 0. */
  var width: js.UndefOr[Double] = js.undefined
}

object Linear {
  @scala.inline
  def apply(numFiniteBuckets: Int | Double = null, offset: Int | Double = null, width: Int | Double = null): Linear = {
    val __obj = js.Dynamic.literal()
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linear]
  }
}

