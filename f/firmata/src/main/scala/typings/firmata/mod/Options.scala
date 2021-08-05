package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
trait Options extends StObject {
  
  var analogPins: js.UndefOr[js.Array[Double]] = js.undefined
  
  var pins: js.UndefOr[js.Array[Pins]] = js.undefined
  
  var reportVersionTimeout: js.UndefOr[Double] = js.undefined
  
  var samplingInterval: js.UndefOr[Double] = js.undefined
  
  var serialport: js.UndefOr[Options] = js.undefined
  
  var skipCapabilities: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAnalogPins(value: js.Array[Double]): Self = StObject.set(x, "analogPins", value.asInstanceOf[js.Any])
    
    inline def setAnalogPinsUndefined: Self = StObject.set(x, "analogPins", js.undefined)
    
    inline def setAnalogPinsVarargs(value: Double*): Self = StObject.set(x, "analogPins", js.Array(value :_*))
    
    inline def setPins(value: js.Array[Pins]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    inline def setPinsUndefined: Self = StObject.set(x, "pins", js.undefined)
    
    inline def setPinsVarargs(value: Pins*): Self = StObject.set(x, "pins", js.Array(value :_*))
    
    inline def setReportVersionTimeout(value: Double): Self = StObject.set(x, "reportVersionTimeout", value.asInstanceOf[js.Any])
    
    inline def setReportVersionTimeoutUndefined: Self = StObject.set(x, "reportVersionTimeout", js.undefined)
    
    inline def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    inline def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
    
    inline def setSerialport(value: Options): Self = StObject.set(x, "serialport", value.asInstanceOf[js.Any])
    
    inline def setSerialportUndefined: Self = StObject.set(x, "serialport", js.undefined)
    
    inline def setSkipCapabilities(value: Boolean): Self = StObject.set(x, "skipCapabilities", value.asInstanceOf[js.Any])
    
    inline def setSkipCapabilitiesUndefined: Self = StObject.set(x, "skipCapabilities", js.undefined)
  }
}
