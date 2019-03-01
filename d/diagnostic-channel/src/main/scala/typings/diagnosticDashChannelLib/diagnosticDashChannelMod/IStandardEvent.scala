package typings
package diagnosticDashChannelLib.diagnosticDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardEvent[T] extends js.Object {
  var data: T
  var timestamp: scala.Double
}

object IStandardEvent {
  @scala.inline
  def apply[T](data: T, timestamp: scala.Double): IStandardEvent[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.asInstanceOf[IStandardEvent[T]]
  }
}

