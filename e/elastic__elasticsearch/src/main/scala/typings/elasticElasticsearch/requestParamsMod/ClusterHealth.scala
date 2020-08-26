package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typings.elasticElasticsearch.elasticElasticsearchStrings.green
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.high
import typings.elasticElasticsearch.elasticElasticsearchStrings.immediate
import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.languid
import typings.elasticElasticsearch.elasticElasticsearchStrings.low
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.normal
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.red
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import typings.elasticElasticsearch.elasticElasticsearchStrings.urgent
import typings.elasticElasticsearch.elasticElasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterHealth extends Generic {
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var level: js.UndefOr[cluster | indices | shards] = js.native
  var local: js.UndefOr[Boolean] = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
  var wait_for_events: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.native
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.native
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.native
  var wait_for_nodes: js.UndefOr[String] = js.native
  var wait_for_status: js.UndefOr[green | yellow | red] = js.native
}

object ClusterHealth {
  @scala.inline
  def apply(): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterHealth]
  }
  @scala.inline
  implicit class ClusterHealthOps[Self <: ClusterHealth] (val x: Self) extends AnyVal {
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
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
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
    def setMaster_timeout(value: String): Self = this.set("master_timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster_timeout: Self = this.set("master_timeout", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
    @scala.inline
    def setWait_for_events(value: immediate | urgent | high | normal | low | languid): Self = this.set("wait_for_events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_events: Self = this.set("wait_for_events", js.undefined)
    @scala.inline
    def setWait_for_no_initializing_shards(value: Boolean): Self = this.set("wait_for_no_initializing_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_no_initializing_shards: Self = this.set("wait_for_no_initializing_shards", js.undefined)
    @scala.inline
    def setWait_for_no_relocating_shards(value: Boolean): Self = this.set("wait_for_no_relocating_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_no_relocating_shards: Self = this.set("wait_for_no_relocating_shards", js.undefined)
    @scala.inline
    def setWait_for_nodes(value: String): Self = this.set("wait_for_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_nodes: Self = this.set("wait_for_nodes", js.undefined)
    @scala.inline
    def setWait_for_status(value: green | yellow | red): Self = this.set("wait_for_status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_status: Self = this.set("wait_for_status", js.undefined)
  }
  
}

