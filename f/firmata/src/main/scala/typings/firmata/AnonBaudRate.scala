package typings.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaudRate extends js.Object {
  var baudRate: Double
  var bufferSize: Double
}

object AnonBaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): AnonBaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaudRate]
  }
}

