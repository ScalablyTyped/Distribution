package typings.googleGax.bundleExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BundleOptions extends js.Object {
  var delayThreshold: js.UndefOr[Double] = js.undefined
  var elementCountLimit: js.UndefOr[Double] = js.undefined
  var elementCountThreshold: js.UndefOr[Double] = js.undefined
  var requestByteLimit: js.UndefOr[Double] = js.undefined
  var requestByteThreshold: js.UndefOr[Double] = js.undefined
}

object BundleOptions {
  @scala.inline
  def apply(
    delayThreshold: js.UndefOr[Double] = js.undefined,
    elementCountLimit: js.UndefOr[Double] = js.undefined,
    elementCountThreshold: js.UndefOr[Double] = js.undefined,
    requestByteLimit: js.UndefOr[Double] = js.undefined,
    requestByteThreshold: js.UndefOr[Double] = js.undefined
  ): BundleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(delayThreshold)) __obj.updateDynamic("delayThreshold")(delayThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elementCountLimit)) __obj.updateDynamic("elementCountLimit")(elementCountLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(elementCountThreshold)) __obj.updateDynamic("elementCountThreshold")(elementCountThreshold.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestByteLimit)) __obj.updateDynamic("requestByteLimit")(requestByteLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestByteThreshold)) __obj.updateDynamic("requestByteThreshold")(requestByteThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundleOptions]
  }
}

