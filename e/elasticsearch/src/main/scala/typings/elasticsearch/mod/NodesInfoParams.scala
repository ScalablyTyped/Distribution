package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesInfoParams extends GenericParams {
  var flatSettings: js.UndefOr[Boolean] = js.native
  var human: js.UndefOr[Boolean] = js.native
  var metric: js.UndefOr[NameList] = js.native
  var nodeId: NameList = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
}

object NodesInfoParams {
  @scala.inline
  def apply(nodeId: NameList): NodesInfoParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoParams]
  }
  @scala.inline
  implicit class NodesInfoParamsOps[Self <: NodesInfoParams] (val x: Self) extends AnyVal {
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
    def setNodeIdVarargs(value: String*): Self = this.set("nodeId", js.Array(value :_*))
    @scala.inline
    def setNodeId(value: NameList): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlatSettings(value: Boolean): Self = this.set("flatSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlatSettings: Self = this.set("flatSettings", js.undefined)
    @scala.inline
    def setHuman(value: Boolean): Self = this.set("human", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuman: Self = this.set("human", js.undefined)
    @scala.inline
    def setMetricVarargs(value: String*): Self = this.set("metric", js.Array(value :_*))
    @scala.inline
    def setMetric(value: NameList): Self = this.set("metric", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

