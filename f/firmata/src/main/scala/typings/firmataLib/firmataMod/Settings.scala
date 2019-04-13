package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var reportVersionTimeout: scala.Double
  var samplingInterval: scala.Double
  var serialport: firmataLib.Anon_BaudRate
}

object Settings {
  @scala.inline
  def apply(
    reportVersionTimeout: scala.Double,
    samplingInterval: scala.Double,
    serialport: firmataLib.Anon_BaudRate
  ): Settings = {
    val __obj = js.Dynamic.literal(reportVersionTimeout = reportVersionTimeout, samplingInterval = samplingInterval, serialport = serialport)
  
    __obj.asInstanceOf[Settings]
  }
}

