package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRxbytes extends js.Object {
  var rx_bytes: Double
  var rx_dropped: Double
  var rx_errors: Double
  var rx_packets: Double
  var tx_bytes: Double
  var tx_dropped: Double
  var tx_errors: Double
  var tx_packets: Double
}

object AnonRxbytes {
  @scala.inline
  def apply(
    rx_bytes: Double,
    rx_dropped: Double,
    rx_errors: Double,
    rx_packets: Double,
    tx_bytes: Double,
    tx_dropped: Double,
    tx_errors: Double,
    tx_packets: Double
  ): AnonRxbytes = {
    val __obj = js.Dynamic.literal(rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_dropped = rx_dropped.asInstanceOf[js.Any], rx_errors = rx_errors.asInstanceOf[js.Any], rx_packets = rx_packets.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_dropped = tx_dropped.asInstanceOf[js.Any], tx_errors = tx_errors.asInstanceOf[js.Any], tx_packets = tx_packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRxbytes]
  }
}

