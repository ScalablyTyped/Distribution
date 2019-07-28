package typings.firmata.firmataMod

import typings.firmata.Anon_BaudRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var reportVersionTimeout: Double
  var samplingInterval: Double
  var serialport: Anon_BaudRate
}

object Settings {
  @scala.inline
  def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: Anon_BaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout, samplingInterval = samplingInterval, serialport = serialport)
  
    __obj.asInstanceOf[Settings]
  }
}

