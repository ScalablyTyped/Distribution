package typings.firmata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
@js.native
trait Options extends StObject {
  
  var analogPins: js.UndefOr[js.Array[Double]] = js.native
  
  var pins: js.UndefOr[js.Array[Pins]] = js.native
  
  var reportVersionTimeout: js.UndefOr[Double] = js.native
  
  var samplingInterval: js.UndefOr[Double] = js.native
  
  var serialport: js.UndefOr[Options] = js.native
  
  var skipCapabilities: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalogPins(value: js.Array[Double]): Self = StObject.set(x, "analogPins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalogPinsUndefined: Self = StObject.set(x, "analogPins", js.undefined)
    
    @scala.inline
    def setAnalogPinsVarargs(value: Double*): Self = StObject.set(x, "analogPins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[Pins]): Self = StObject.set(x, "pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinsUndefined: Self = StObject.set(x, "pins", js.undefined)
    
    @scala.inline
    def setPinsVarargs(value: Pins*): Self = StObject.set(x, "pins", js.Array(value :_*))
    
    @scala.inline
    def setReportVersionTimeout(value: Double): Self = StObject.set(x, "reportVersionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportVersionTimeoutUndefined: Self = StObject.set(x, "reportVersionTimeout", js.undefined)
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = StObject.set(x, "samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplingIntervalUndefined: Self = StObject.set(x, "samplingInterval", js.undefined)
    
    @scala.inline
    def setSerialport(value: Options): Self = StObject.set(x, "serialport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialportUndefined: Self = StObject.set(x, "serialport", js.undefined)
    
    @scala.inline
    def setSkipCapabilities(value: Boolean): Self = StObject.set(x, "skipCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipCapabilitiesUndefined: Self = StObject.set(x, "skipCapabilities", js.undefined)
  }
}
