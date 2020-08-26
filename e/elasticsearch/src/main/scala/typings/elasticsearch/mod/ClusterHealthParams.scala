package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.high
import typings.elasticsearch.elasticsearchStrings.immediate
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.languid
import typings.elasticsearch.elasticsearchStrings.low
import typings.elasticsearch.elasticsearchStrings.normal
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.shards
import typings.elasticsearch.elasticsearchStrings.urgent
import typings.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterHealthParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.native
  var level: js.UndefOr[cluster | indices | shards] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var masterTimeout: js.UndefOr[TimeSpan] = js.native
  var waitForActiveShards: js.UndefOr[String] = js.native
  var waitForEvents: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  var waitForNodes: js.UndefOr[String] = js.native
  var waitForRelocatingShards: js.UndefOr[Boolean] = js.native
  var waitForStatus: js.UndefOr[green | yellow | red] = js.native
}

object ClusterHealthParams {
  @scala.inline
  def apply(): ClusterHealthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealthParams]
  }
  @scala.inline
  implicit class ClusterHealthParamsOps[Self <: ClusterHealthParams] (val x: Self) extends AnyVal {
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
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: NameList): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLevel(value: cluster | indices | shards): Self = this.set("level", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    @scala.inline
    def setLocal(value: Boolean): Self = this.set("local", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocal: Self = this.set("local", js.undefined)
    @scala.inline
    def setMasterTimeout(value: TimeSpan): Self = this.set("masterTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterTimeout: Self = this.set("masterTimeout", js.undefined)
    @scala.inline
    def setWaitForActiveShards(value: String): Self = this.set("waitForActiveShards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForActiveShards: Self = this.set("waitForActiveShards", js.undefined)
    @scala.inline
    def setWaitForEvents(value: immediate | urgent | high | normal | low | languid): Self = this.set("waitForEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForEvents: Self = this.set("waitForEvents", js.undefined)
    @scala.inline
    def setWaitForNodes(value: String): Self = this.set("waitForNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForNodes: Self = this.set("waitForNodes", js.undefined)
    @scala.inline
    def setWaitForRelocatingShards(value: Boolean): Self = this.set("waitForRelocatingShards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForRelocatingShards: Self = this.set("waitForRelocatingShards", js.undefined)
    @scala.inline
    def setWaitForStatus(value: green | yellow | red): Self = this.set("waitForStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitForStatus: Self = this.set("waitForStatus", js.undefined)
  }
  
}

