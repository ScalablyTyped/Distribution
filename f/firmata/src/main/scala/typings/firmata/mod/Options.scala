package typings.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://github.com/firmata/firmata.js/blob/master/lib/firmata.js#L429-L451
@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAnalogPinsVarargs(value: Double*): Self = this.set("analogPins", js.Array(value :_*))
    
    @scala.inline
    def setAnalogPins(value: js.Array[Double]): Self = this.set("analogPins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnalogPins: Self = this.set("analogPins", js.undefined)
    
    @scala.inline
    def setPinsVarargs(value: Pins*): Self = this.set("pins", js.Array(value :_*))
    
    @scala.inline
    def setPins(value: js.Array[Pins]): Self = this.set("pins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePins: Self = this.set("pins", js.undefined)
    
    @scala.inline
    def setReportVersionTimeout(value: Double): Self = this.set("reportVersionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportVersionTimeout: Self = this.set("reportVersionTimeout", js.undefined)
    
    @scala.inline
    def setSamplingInterval(value: Double): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplingInterval: Self = this.set("samplingInterval", js.undefined)
    
    @scala.inline
    def setSerialport(value: Options): Self = this.set("serialport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSerialport: Self = this.set("serialport", js.undefined)
    
    @scala.inline
    def setSkipCapabilities(value: Boolean): Self = this.set("skipCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipCapabilities: Self = this.set("skipCapabilities", js.undefined)
  }
}
