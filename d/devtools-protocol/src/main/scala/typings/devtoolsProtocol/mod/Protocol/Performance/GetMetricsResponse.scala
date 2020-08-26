package typings.devtoolsProtocol.mod.Protocol.Performance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMetricsResponse extends js.Object {
  /**
    * Current values for run-time metrics.
    */
  var metrics: js.Array[Metric] = js.native
}

object GetMetricsResponse {
  @scala.inline
  def apply(metrics: js.Array[Metric]): GetMetricsResponse = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMetricsResponse]
  }
  @scala.inline
  implicit class GetMetricsResponseOps[Self <: GetMetricsResponse] (val x: Self) extends AnyVal {
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
    def setMetricsVarargs(value: Metric*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[Metric]): Self = this.set("metrics", value.asInstanceOf[js.Any])
  }
  
}

