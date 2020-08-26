package typings.devtoolsProtocol.mod.Protocol.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPreciseCoverageResponse extends js.Object {
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double = js.native
}

object StartPreciseCoverageResponse {
  @scala.inline
  def apply(timestamp: Double): StartPreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPreciseCoverageResponse]
  }
  @scala.inline
  implicit class StartPreciseCoverageResponseOps[Self <: StartPreciseCoverageResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

