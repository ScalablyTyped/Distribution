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
trait MlUpdateDatafeed[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var body: T = js.native
  var datafeed_id: String = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
}

object MlUpdateDatafeed {
  @scala.inline
  def apply[T](body: T, datafeed_id: String): MlUpdateDatafeed[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], datafeed_id = datafeed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlUpdateDatafeed[T]]
  }
  @scala.inline
  implicit class MlUpdateDatafeedOps[Self <: MlUpdateDatafeed[_], T] (val x: Self with MlUpdateDatafeed[T]) extends AnyVal {
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
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatafeed_id(value: String): Self = this.set("datafeed_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllow_no_indices(value: Boolean): Self = this.set("allow_no_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_indices: Self = this.set("allow_no_indices", js.undefined)
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    @scala.inline
    def setIgnore_throttled(value: Boolean): Self = this.set("ignore_throttled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_throttled: Self = this.set("ignore_throttled", js.undefined)
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = this.set("ignore_unavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_unavailable: Self = this.set("ignore_unavailable", js.undefined)
  }
  
}

