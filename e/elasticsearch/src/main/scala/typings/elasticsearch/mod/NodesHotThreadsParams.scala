package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.blocked
import typings.elasticsearch.elasticsearchStrings.cpu
import typings.elasticsearch.elasticsearchStrings.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesHotThreadsParams extends GenericParams {
  var ignoreIdleThreads: js.UndefOr[Boolean] = js.native
  var interval: js.UndefOr[TimeSpan] = js.native
  var nodeId: NameList = js.native
  var snapshots: js.UndefOr[Double] = js.native
  var threads: js.UndefOr[Double] = js.native
  var timeout: js.UndefOr[TimeSpan] = js.native
  var `type`: js.UndefOr[cpu | wait | blocked] = js.native
}

object NodesHotThreadsParams {
  @scala.inline
  def apply(nodeId: NameList): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
  @scala.inline
  implicit class NodesHotThreadsParamsOps[Self <: NodesHotThreadsParams] (val x: Self) extends AnyVal {
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
    def setIgnoreIdleThreads(value: Boolean): Self = this.set("ignoreIdleThreads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreIdleThreads: Self = this.set("ignoreIdleThreads", js.undefined)
    @scala.inline
    def setInterval(value: TimeSpan): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setSnapshots(value: Double): Self = this.set("snapshots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshots: Self = this.set("snapshots", js.undefined)
    @scala.inline
    def setThreads(value: Double): Self = this.set("threads", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreads: Self = this.set("threads", js.undefined)
    @scala.inline
    def setTimeout(value: TimeSpan): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: cpu | wait | blocked): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

