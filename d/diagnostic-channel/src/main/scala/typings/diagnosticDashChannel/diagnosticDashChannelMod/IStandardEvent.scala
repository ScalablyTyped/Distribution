package typings.diagnosticDashChannel.diagnosticDashChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStandardEvent[T] extends js.Object {
  var data: T
  var timestamp: Double
}

object IStandardEvent {
  @scala.inline
  def apply[T](data: T, timestamp: Double): IStandardEvent[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp)
  
    __obj.asInstanceOf[IStandardEvent[T]]
  }
}

