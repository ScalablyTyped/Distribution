package typings.gapiClientLogging.gapi.client.logging

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
  def apply(
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Linear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linear]
  }
}

