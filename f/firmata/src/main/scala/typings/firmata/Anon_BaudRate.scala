package typings.firmata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaudRate extends js.Object {
  var baudRate: Double
  var bufferSize: Double
}

object Anon_BaudRate {
  @scala.inline
  def apply(baudRate: Double, bufferSize: Double): Anon_BaudRate = {
    val __obj = js.Dynamic.literal(baudRate = baudRate, bufferSize = bufferSize)
  
    __obj.asInstanceOf[Anon_BaudRate]
  }
}

