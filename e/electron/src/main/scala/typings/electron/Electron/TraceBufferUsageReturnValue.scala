package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceBufferUsageReturnValue extends js.Object {
  var percentage: Double
  var value: Double
}

object TraceBufferUsageReturnValue {
  @scala.inline
  def apply(percentage: Double, value: Double): TraceBufferUsageReturnValue = {
    val __obj = js.Dynamic.literal(percentage = percentage.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceBufferUsageReturnValue]
  }
}

