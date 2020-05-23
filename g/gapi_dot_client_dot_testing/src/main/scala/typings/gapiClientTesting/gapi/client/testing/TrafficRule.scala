package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficRule extends js.Object {
  /** Bandwidth in kbits/second */
  var bandwidth: js.UndefOr[Double] = js.undefined
  /** Burst size in kbits */
  var burst: js.UndefOr[Double] = js.undefined
  /** Packet delay, must be >= 0 */
  var delay: js.UndefOr[String] = js.undefined
  /** Packet duplication ratio (0.0 - 1.0) */
  var packetDuplicationRatio: js.UndefOr[Double] = js.undefined
  /** Packet loss ratio (0.0 - 1.0) */
  var packetLossRatio: js.UndefOr[Double] = js.undefined
}

object TrafficRule {
  @scala.inline
  def apply(
    bandwidth: js.UndefOr[Double] = js.undefined,
    burst: js.UndefOr[Double] = js.undefined,
    delay: String = null,
    packetDuplicationRatio: js.UndefOr[Double] = js.undefined,
    packetLossRatio: js.UndefOr[Double] = js.undefined
  ): TrafficRule = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bandwidth)) __obj.updateDynamic("bandwidth")(bandwidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(burst)) __obj.updateDynamic("burst")(burst.get.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(packetDuplicationRatio)) __obj.updateDynamic("packetDuplicationRatio")(packetDuplicationRatio.get.asInstanceOf[js.Any])
    if (!js.isUndefined(packetLossRatio)) __obj.updateDynamic("packetLossRatio")(packetLossRatio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficRule]
  }
}

