package typings
package dockerodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rxbytes extends js.Object {
  var rx_bytes: scala.Double
  var rx_dropped: scala.Double
  var rx_errors: scala.Double
  var rx_packets: scala.Double
  var tx_bytes: scala.Double
  var tx_dropped: scala.Double
  var tx_errors: scala.Double
  var tx_packets: scala.Double
}

object Anon_Rxbytes {
  @scala.inline
  def apply(
    rx_bytes: scala.Double,
    rx_dropped: scala.Double,
    rx_errors: scala.Double,
    rx_packets: scala.Double,
    tx_bytes: scala.Double,
    tx_dropped: scala.Double,
    tx_errors: scala.Double,
    tx_packets: scala.Double
  ): Anon_Rxbytes = {
    val __obj = js.Dynamic.literal(rx_bytes = rx_bytes, rx_dropped = rx_dropped, rx_errors = rx_errors, rx_packets = rx_packets, tx_bytes = tx_bytes, tx_dropped = tx_dropped, tx_errors = tx_errors, tx_packets = tx_packets)
  
    __obj.asInstanceOf[Anon_Rxbytes]
  }
}

