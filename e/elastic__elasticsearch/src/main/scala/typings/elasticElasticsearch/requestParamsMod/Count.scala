package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Count[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.native
  var analyze_wildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var body: js.UndefOr[T] = js.native
  var default_operator: js.UndefOr[AND | OR] = js.native
  var df: js.UndefOr[String] = js.native
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.native
  var ignore_throttled: js.UndefOr[Boolean] = js.native
  var ignore_unavailable: js.UndefOr[Boolean] = js.native
  var index: js.UndefOr[String | js.Array[String]] = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var min_score: js.UndefOr[Double] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String | js.Array[String]] = js.native
  var terminate_after: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
}

object Count {
  @scala.inline
  def apply[T](): Count[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count[T]]
  }
  @scala.inline
  implicit class CountOps[Self <: Count[_], T] (val x: Self with Count[T]) extends AnyVal {
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
    def setAllow_no_indices(value: Boolean): Self = this.set("allow_no_indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllow_no_indices: Self = this.set("allow_no_indices", js.undefined)
    @scala.inline
    def setAnalyze_wildcard(value: Boolean): Self = this.set("analyze_wildcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyze_wildcard: Self = this.set("analyze_wildcard", js.undefined)
    @scala.inline
    def setAnalyzer(value: String): Self = this.set("analyzer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnalyzer: Self = this.set("analyzer", js.undefined)
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setDefault_operator(value: AND | OR): Self = this.set("default_operator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_operator: Self = this.set("default_operator", js.undefined)
    @scala.inline
    def setDf(value: String): Self = this.set("df", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDf: Self = this.set("df", js.undefined)
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
    @scala.inline
    def setIndexVarargs(value: String*): Self = this.set("index", js.Array(value :_*))
    @scala.inline
    def setIndex(value: String | js.Array[String]): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setLenient(value: Boolean): Self = this.set("lenient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenient: Self = this.set("lenient", js.undefined)
    @scala.inline
    def setMin_score(value: Double): Self = this.set("min_score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin_score: Self = this.set("min_score", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRoutingVarargs(value: String*): Self = this.set("routing", js.Array(value :_*))
    @scala.inline
    def setRouting(value: String | js.Array[String]): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setTerminate_after(value: Double): Self = this.set("terminate_after", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminate_after: Self = this.set("terminate_after", js.undefined)
    @scala.inline
    def setTypeVarargs(value: String*): Self = this.set("type", js.Array(value :_*))
    @scala.inline
    def setType(value: String | js.Array[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

