package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.dfs_query_then_fetch
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.query_then_fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RankEval[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var body: T = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var search_type: js.UndefOr[query_then_fetch | dfs_query_then_fetch] = js.native
}

object RankEval {
  @scala.inline
  def apply[T](body: T): RankEval[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[RankEval[T]]
  }
  @scala.inline
  implicit class RankEvalOps[Self <: RankEval[_], T] (val x: Self with RankEval[T]) extends AnyVal {
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
    def setExpand_wildcards(value: open | closed | hidden | none | all): Self = this.set("expand_wildcards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpand_wildcards: Self = this.set("expand_wildcards", js.undefined)
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
    def setSearch_type(value: query_then_fetch | dfs_query_then_fetch): Self = this.set("search_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearch_type: Self = this.set("search_type", js.undefined)
  }
  
}

