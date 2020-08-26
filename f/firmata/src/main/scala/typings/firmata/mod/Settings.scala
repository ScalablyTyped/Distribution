package typings.firmata.mod

import typings.firmata.anon.BaudRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var reportVersionTimeout: Double = js.native
  var samplingInterval: Double = js.native
  var serialport: BaudRate = js.native
}

object Settings {
  @scala.inline
  def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: BaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], serialport = serialport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setReportVersionTimeout(value: Double): Self = this.set("reportVersionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setSamplingInterval(value: Double): Self = this.set("samplingInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialport(value: BaudRate): Self = this.set("serialport", value.asInstanceOf[js.Any])
  }
  
}

