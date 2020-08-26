package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndicesFreeze extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: String = js.native
  var master_timeout: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object IndicesFreeze {
  @scala.inline
  def apply(index: String): IndicesFreeze = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesFreeze]
  }
  @scala.inline
  implicit class IndicesFreezeOps[Self <: IndicesFreeze] (val x: Self) extends AnyVal {
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
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = this.set("allow_no_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_indices: Self = this.set("allow_no_indices", js.undefined)
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = this.set("ignore_unavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_unavailable: Self = this.set("ignore_unavailable", js.undefined)
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
  }
  
}

