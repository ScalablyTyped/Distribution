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

