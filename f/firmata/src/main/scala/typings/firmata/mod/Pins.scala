package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pins extends StObject {
  
  var analogChannel: Double = js.native
  
  var mode: PIN_MODE = js.native
  
  var report: REPORTING = js.native
  
  var state: PIN_STATE | PULLUP_STATE = js.native
  
  var supportedModes: js.Array[PIN_MODE] = js.native
  
  var value: PIN_STATE | Double = js.native
}
object Pins {
  
  @scala.inline
  def apply(
    analogChannel: Double,
    mode: PIN_MODE,
    report: REPORTING,
    state: PIN_STATE | PULLUP_STATE,
    supportedModes: js.Array[PIN_MODE],
    value: PIN_STATE | Double
  ): Pins = {
    val __obj = js.Dynamic.literal(analogChannel = analogChannel.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pins]
  }
  
  @scala.inline
  implicit class PinsMutableBuilder[Self <: Pins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalogChannel(value: Double): Self = StObject.set(x, "analogChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: PIN_MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReport(value: REPORTING): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PIN_STATE | PULLUP_STATE): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModes(value: js.Array[PIN_MODE]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedModesVarargs(value: PIN_MODE*): Self = StObject.set(x, "supportedModes", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: PIN_STATE | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
