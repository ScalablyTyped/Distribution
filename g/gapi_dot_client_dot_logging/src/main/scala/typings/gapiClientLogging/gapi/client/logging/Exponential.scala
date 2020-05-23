package typings.gapiClientLogging.gapi.client.logging

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
    growthFactor: js.UndefOr[Double] = js.undefined,
    numFiniteBuckets: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined
  ): Exponential = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(growthFactor)) __obj.updateDynamic("growthFactor")(growthFactor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numFiniteBuckets)) __obj.updateDynamic("numFiniteBuckets")(numFiniteBuckets.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exponential]
  }
}

