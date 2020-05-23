package typings.firmata.mod

import typings.firmata.anon.BaudRate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var reportVersionTimeout: Double
  var samplingInterval: Double
  var serialport: BaudRate
}

object Settings {
  @scala.inline
  def apply(reportVersionTimeout: Double, samplingInterval: Double, serialport: BaudRate): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout.asInstanceOf[js.Any], samplingInterval = samplingInterval.asInstanceOf[js.Any], serialport = serialport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

