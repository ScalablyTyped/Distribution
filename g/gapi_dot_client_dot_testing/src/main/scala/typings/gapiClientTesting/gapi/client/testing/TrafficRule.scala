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
    bandwidth: Int | Double = null,
    burst: Int | Double = null,
    delay: String = null,
    packetDuplicationRatio: Int | Double = null,
    packetLossRatio: Int | Double = null
  ): TrafficRule = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (packetDuplicationRatio != null) __obj.updateDynamic("packetDuplicationRatio")(packetDuplicationRatio.asInstanceOf[js.Any])
    if (packetLossRatio != null) __obj.updateDynamic("packetLossRatio")(packetLossRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficRule]
  }
}

