package typings.devtoolsProtocol.mod.Protocol.Profiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRuntimeCallStatsResponse extends js.Object {
  /**
    * Collected counter information.
    */
  var result: js.Array[CounterInfo] = js.native
}

object GetRuntimeCallStatsResponse {
  @scala.inline
  def apply(result: js.Array[CounterInfo]): GetRuntimeCallStatsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuntimeCallStatsResponse]
  }
  @scala.inline
  implicit class GetRuntimeCallStatsResponseOps[Self <: GetRuntimeCallStatsResponse] (val x: Self) extends AnyVal {
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
    def setResultVarargs(value: CounterInfo*): Self = this.set("result", js.Array(value :_*))
    @scala.inline
    def setResult(value: js.Array[CounterInfo]): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

