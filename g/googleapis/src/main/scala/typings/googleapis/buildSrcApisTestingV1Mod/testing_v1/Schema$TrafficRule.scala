package typings.googleapis.buildSrcApisTestingV1Mod.testing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Network emulation parameters.
  */
@js.native
trait Schema$TrafficRule extends js.Object {
  /**
    * Bandwidth in kbits/second.
    */
  var bandwidth: js.UndefOr[Double] = js.native
  /**
    * Burst size in kbits.
    */
  var burst: js.UndefOr[Double] = js.native
  /**
    * Packet delay, must be &gt;= 0.
    */
  var delay: js.UndefOr[String] = js.native
  /**
    * Packet duplication ratio (0.0 - 1.0).
    */
  var packetDuplicationRatio: js.UndefOr[Double] = js.native
  /**
    * Packet loss ratio (0.0 - 1.0).
    */
  var packetLossRatio: js.UndefOr[Double] = js.native
}

object Schema$TrafficRule {
  @scala.inline
  def apply(
    bandwidth: Int | Double = null,
    burst: Int | Double = null,
    delay: String = null,
    packetDuplicationRatio: Int | Double = null,
    packetLossRatio: Int | Double = null
  ): Schema$TrafficRule = {
    val __obj = js.Dynamic.literal()
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth.asInstanceOf[js.Any])
    if (burst != null) __obj.updateDynamic("burst")(burst.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (packetDuplicationRatio != null) __obj.updateDynamic("packetDuplicationRatio")(packetDuplicationRatio.asInstanceOf[js.Any])
    if (packetLossRatio != null) __obj.updateDynamic("packetLossRatio")(packetLossRatio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TrafficRule]
  }
}

