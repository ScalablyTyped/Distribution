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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rx_bytes")(rx_bytes)
    __obj.updateDynamic("rx_dropped")(rx_dropped)
    __obj.updateDynamic("rx_errors")(rx_errors)
    __obj.updateDynamic("rx_packets")(rx_packets)
    __obj.updateDynamic("tx_bytes")(tx_bytes)
    __obj.updateDynamic("tx_dropped")(tx_dropped)
    __obj.updateDynamic("tx_errors")(tx_errors)
    __obj.updateDynamic("tx_packets")(tx_packets)
    __obj.asInstanceOf[Anon_Rxbytes]
  }
}

