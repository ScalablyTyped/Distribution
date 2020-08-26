package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.`false`
import typings.elasticElasticsearch.elasticElasticsearchStrings.`true`
import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.force
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait_for
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delete extends Generic {
  var id: String = js.native
  var if_primary_term: js.UndefOr[Double] = js.native
  var if_seq_no: js.UndefOr[Double] = js.native
  var index: String = js.native
  var refresh: js.UndefOr[`true` | `false` | wait_for] = js.native
  var routing: js.UndefOr[String] = js.native
  var timeout: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.native
  var wait_for_active_shards: js.UndefOr[String] = js.native
}

object Delete {
  @scala.inline
  def apply(id: String, index: String): Delete = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  @scala.inline
  implicit class DeleteOps[Self <: Delete] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: String): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIf_primary_term(value: Double): Self = this.set("if_primary_term", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIf_primary_term: Self = this.set("if_primary_term", js.undefined)
    @scala.inline
    def setIf_seq_no(value: Double): Self = this.set("if_seq_no", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIf_seq_no: Self = this.set("if_seq_no", js.undefined)
    @scala.inline
    def setRefresh(value: `true` | `false` | wait_for): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setVersion_type(value: internal | external | external_gte | force): Self = this.set("version_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion_type: Self = this.set("version_type", js.undefined)
    @scala.inline
    def setWait_for_active_shards(value: String): Self = this.set("wait_for_active_shards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWait_for_active_shards: Self = this.set("wait_for_active_shards", js.undefined)
  }
  
}

