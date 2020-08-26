package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesUsage extends Generic {
  var metric: js.UndefOr[String | js.Array[String]] = js.native
  var node_id: js.UndefOr[String | js.Array[String]] = js.native
  var timeout: js.UndefOr[String] = js.native
}

object NodesUsage {
  @scala.inline
  def apply(): NodesUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesUsage]
  }
  @scala.inline
  implicit class NodesUsageOps[Self <: NodesUsage] (val x: Self) extends AnyVal {
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
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    @scala.inline
    def setMetric(value: String | js.Array[String]): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setNode_idVarargs(value: String*): Self = this.set("node_id", js.Array(value :_*))
    @scala.inline
    def setNode_id(value: String | js.Array[String]): Self = this.set("node_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode_id: Self = this.set("node_id", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

