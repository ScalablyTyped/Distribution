package typings.domSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerialOptions extends StObject {
  
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
  implicit class SerialOptionsMutableBuilder[Self <: SerialOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaudRate(value: Double): Self = StObject.set(x, "baudRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
    
    @scala.inline
    def setDataBits(value: Double): Self = StObject.set(x, "dataBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataBitsUndefined: Self = StObject.set(x, "dataBits", js.undefined)
    
    @scala.inline
    def setFlowControl(value: FlowControlType): Self = StObject.set(x, "flowControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowControlUndefined: Self = StObject.set(x, "flowControl", js.undefined)
    
    @scala.inline
    def setParity(value: ParityType): Self = StObject.set(x, "parity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParityUndefined: Self = StObject.set(x, "parity", js.undefined)
    
    @scala.inline
    def setStopBits(value: Double): Self = StObject.set(x, "stopBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopBitsUndefined: Self = StObject.set(x, "stopBits", js.undefined)
  }
}
