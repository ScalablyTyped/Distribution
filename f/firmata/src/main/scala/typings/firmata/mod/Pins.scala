package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pins extends StObject {
  
  var analogChannel: Double
  
  var mode: PIN_MODE
  
  var report: REPORTING
  
  var state: PIN_STATE | PULLUP_STATE
  
  var supportedModes: js.Array[PIN_MODE]
  
  var value: PIN_STATE | Double
}
object Pins {
  
  inline def apply(
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
  
  extension [Self <: Pins](x: Self) {
    
    inline def setAnalogChannel(value: Double): Self = StObject.set(x, "analogChannel", value.asInstanceOf[js.Any])
    
    inline def setMode(value: PIN_MODE): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setReport(value: REPORTING): Self = StObject.set(x, "report", value.asInstanceOf[js.Any])
    
    inline def setState(value: PIN_STATE | PULLUP_STATE): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSupportedModes(value: js.Array[PIN_MODE]): Self = StObject.set(x, "supportedModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedModesVarargs(value: PIN_MODE*): Self = StObject.set(x, "supportedModes", js.Array(value :_*))
    
    inline def setValue(value: PIN_STATE | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
