package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_and_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchTemplate[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var body: T = js.native
  var ccs_minimize_roundtrips: js.UndefOr[Boolean] = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var explain: js.UndefOr[Boolean] = js.native
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var preference: js.UndefOr[String] = js.native
  var profile: js.UndefOr[Boolean] = js.native
  var rest_total_hits_as_int: js.UndefOr[Boolean] = js.native
  var routing: js.UndefOr[String | js.Array[String]] = js.native
  var scroll: js.UndefOr[String] = js.native
  var search_type: js.UndefOr[query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
  var typed_keys: js.UndefOr[Boolean] = js.native
}

object SearchTemplate {
  @scala.inline
  def apply[T](body: T): SearchTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTemplate[T]]
  }
  @scala.inline
  implicit class SearchTemplateOps[Self <: SearchTemplate[_], T] (val x: Self with SearchTemplate[T]) extends AnyVal {
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
    def setAllow_no_indices(value: Boolean): Self = this.set("allow_no_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_indices: Self = this.set("allow_no_indices", js.undefined)
    @scala.inline
    def setCcs_minimize_roundtrips(value: Boolean): Self = this.set("ccs_minimize_roundtrips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCcs_minimize_roundtrips: Self = this.set("ccs_minimize_roundtrips", js.undefined)
    @scala.inline
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    @scala.inline
    def setIgnore_throttled(value: Boolean): Self = this.set("ignore_throttled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_throttled: Self = this.set("ignore_throttled", js.undefined)
    @scala.inline
    def setIgnore_unavailable(value: Boolean): Self = this.set("ignore_unavailable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_unavailable: Self = this.set("ignore_unavailable", js.undefined)
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setProfile(value: Boolean): Self = this.set("profile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    @scala.inline
    def setRest_total_hits_as_int(value: Boolean): Self = this.set("rest_total_hits_as_int", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRest_total_hits_as_int: Self = this.set("rest_total_hits_as_int", js.undefined)
    @scala.inline
    def setRoutingVarargs(value: String*): Self = this.set("routing", js.Array(value :_*))
    @scala.inline
    def setRouting(value: String | js.Array[String]): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setScroll(value: String): Self = this.set("scroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScroll: Self = this.set("scroll", js.undefined)
    @scala.inline
    def setSearch_type(value: query_then_fetch | query_and_fetch | dfs_query_then_fetch | dfs_query_and_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setTyped_keys(value: Boolean): Self = this.set("typed_keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTyped_keys: Self = this.set("typed_keys", js.undefined)
  }
  
}

