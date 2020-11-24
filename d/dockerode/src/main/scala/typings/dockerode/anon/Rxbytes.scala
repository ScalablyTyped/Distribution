package typings.dockerode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rxbytes extends js.Object {
  
  var rx_bytes: Double = js.native
  
  var rx_dropped: Double = js.native
  
  var rx_errors: Double = js.native
  
  var rx_packets: Double = js.native
  
  var tx_bytes: Double = js.native
  
  var tx_dropped: Double = js.native
  
  var tx_errors: Double = js.native
  
  var tx_packets: Double = js.native
}
object Rxbytes {
  
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
  ): Rxbytes = {
    val __obj = js.Dynamic.literal(rx_bytes = rx_bytes.asInstanceOf[js.Any], rx_dropped = rx_dropped.asInstanceOf[js.Any], rx_errors = rx_errors.asInstanceOf[js.Any], rx_packets = rx_packets.asInstanceOf[js.Any], tx_bytes = tx_bytes.asInstanceOf[js.Any], tx_dropped = tx_dropped.asInstanceOf[js.Any], tx_errors = tx_errors.asInstanceOf[js.Any], tx_packets = tx_packets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rxbytes]
  }
  
  @scala.inline
  implicit class RxbytesOps[Self <: Rxbytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRx_bytes(value: Double): Self = this.set("rx_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_dropped(value: Double): Self = this.set("rx_dropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_errors(value: Double): Self = this.set("rx_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRx_packets(value: Double): Self = this.set("rx_packets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_bytes(value: Double): Self = this.set("tx_bytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_dropped(value: Double): Self = this.set("tx_dropped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_errors(value: Double): Self = this.set("tx_errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTx_packets(value: Double): Self = this.set("tx_packets", value.asInstanceOf[js.Any])
  }
}
