package typings
package firmataLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaudRate extends js.Object {
  var baudRate: scala.Double
  var bufferSize: scala.Double
}

object Anon_BaudRate {
  @scala.inline
  def apply(baudRate: scala.Double, bufferSize: scala.Double): Anon_BaudRate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("baudRate")(baudRate)
    __obj.updateDynamic("bufferSize")(bufferSize)
    __obj.asInstanceOf[Anon_BaudRate]
  }
}

