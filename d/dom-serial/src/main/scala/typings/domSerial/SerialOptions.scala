package typings.domSerial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialOptions extends js.Object {
  
  var baudRate: Double = js.native
  
  var bufferSize: js.UndefOr[Double] = js.native
  
  var dataBits: js.UndefOr[Double] = js.native
  
  var flowControl: js.UndefOr[FlowControlType] = js.native
  
  var parity: js.UndefOr[ParityType] = js.native
  
  var stopBits: js.UndefOr[Double] = js.native
}
object SerialOptions {
  
  @scala.inline
  def apply(baudRate: Double): SerialOptions = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialOptions]
  }
  
  @scala.inline
  implicit class SerialOptionsOps[Self <: SerialOptions] (val x: Self) extends AnyVal {
    
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
    def setBaudRate(value: Double): Self = this.set("baudRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setDataBits(value: Double): Self = this.set("dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataBits: Self = this.set("dataBits", js.undefined)
    
    @scala.inline
    def setFlowControl(value: FlowControlType): Self = this.set("flowControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowControl: Self = this.set("flowControl", js.undefined)
    
    @scala.inline
    def setParity(value: ParityType): Self = this.set("parity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParity: Self = this.set("parity", js.undefined)
    
    @scala.inline
    def setStopBits(value: Double): Self = this.set("stopBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopBits: Self = this.set("stopBits", js.undefined)
  }
}
