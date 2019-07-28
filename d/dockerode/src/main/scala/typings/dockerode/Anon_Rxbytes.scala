package typings.dockerode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rxbytes extends js.Object {
  var rx_bytes: Double
  var rx_dropped: Double
  var rx_errors: Double
  var rx_packets: Double
  var tx_bytes: Double
  var tx_dropped: Double
  var tx_errors: Double
  var tx_packets: Double
}

object Anon_Rxbytes {
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
  ): Anon_Rxbytes = {
    val __obj = js.Dynamic.literal(rx_bytes = rx_bytes, rx_dropped = rx_dropped, rx_errors = rx_errors, rx_packets = rx_packets, tx_bytes = tx_bytes, tx_dropped = tx_dropped, tx_errors = tx_errors, tx_packets = tx_packets)
  
    __obj.asInstanceOf[Anon_Rxbytes]
  }
}

