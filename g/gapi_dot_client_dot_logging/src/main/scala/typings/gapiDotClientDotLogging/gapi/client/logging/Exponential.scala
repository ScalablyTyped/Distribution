package typings.gapiDotClientDotLogging.gapi.client.logging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exponential extends js.Object {
  /** Must be greater than 1. */
  var growthFactor: js.UndefOr[Double] = js.undefined
  /** Must be greater than 0. */
  var numFiniteBuckets: js.UndefOr[Double] = js.undefined
  /** Must be greater than 0. */
  var scale: js.UndefOr[Double] = js.undefined
}

object Exponential {
  @scala.inline
  def apply(
    growthFactor: Int | Double = null,
    numFiniteBuckets: Int | Double = null,
    scale: Int | Double = null
  ): Exponential = {
    val __obj = js.Dynamic.literal()
    if (growthFactor != null) __obj.updateDynamic("growthFactor")(growthFactor.asInstanceOf[js.Any])
    if (numFiniteBuckets != null) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exponential]
  }
}

