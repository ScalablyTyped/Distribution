package typings.devtoolsProtocol.mod.Protocol.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TakePreciseCoverageResponse extends js.Object {
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage] = js.native
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double = js.native
}

object TakePreciseCoverageResponse {
  @scala.inline
  def apply(result: js.Array[ScriptCoverage], timestamp: Double): TakePreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePreciseCoverageResponse]
  }
  @scala.inline
  implicit class TakePreciseCoverageResponseOps[Self <: TakePreciseCoverageResponse] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: ScriptCoverage*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[ScriptCoverage]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

