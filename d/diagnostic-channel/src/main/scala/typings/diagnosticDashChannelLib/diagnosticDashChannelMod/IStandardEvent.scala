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
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp)
  
    __obj.asInstanceOf[IStandardEvent[T]]
  }
}

