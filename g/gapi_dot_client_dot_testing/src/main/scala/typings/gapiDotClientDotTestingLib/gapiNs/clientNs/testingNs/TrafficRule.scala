package typings
package gapiDotClientDotTestingLib.gapiNs.clientNs.testingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficRule extends js.Object {
  /** Bandwidth in kbits/second */
  var bandwidth: js.UndefOr[scala.Double] = js.undefined
  /** Burst size in kbits */
  var burst: js.UndefOr[scala.Double] = js.undefined
  /** Packet delay, must be >= 0 */
  var delay: js.UndefOr[java.lang.String] = js.undefined
  /** Packet duplication ratio (0.0 - 1.0) */
  var packetDuplicationRatio: js.UndefOr[scala.Double] = js.undefined
  /** Packet loss ratio (0.0 - 1.0) */
  var packetLossRatio: js.UndefOr[scala.Double] = js.undefined
}

object TrafficRule {
  @scala.inline
  def apply(
    bandwidth: scala.Int | scala.Double = null,
    burst: scala.Int | scala.Double = null,
    delay: java.lang.String = null,
    packetDuplicationRatio: scala.Int | scala.Double = null,
    packetLossRatio: scala.Int | scala.Double = null
  ): TrafficRule = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay)
    if (packetDuplicationRatio != null) __obj.updateDynamic("packetDuplicationRatio")(packetDuplicationRatio.asInstanceOf[js.Any])
    if (packetLossRatio != null) __obj.updateDynamic("packetLossRatio")(packetLossRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficRule]
  }
}

