package typings.firmata.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaudRate extends js.Object {
  var baudRate: Double
  var bufferSize: Double
}

object BaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): BaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate.asInstanceOf[js.Any], bufferSize = bufferSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaudRate]
  }
}

