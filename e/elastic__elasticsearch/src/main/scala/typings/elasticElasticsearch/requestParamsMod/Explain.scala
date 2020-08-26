package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.AND
import typings.elasticElasticsearch.elasticElasticsearchStrings.OR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Explain[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.native
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.native
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.native
  var _source_include: js.UndefOr[String | js.Array[String]] = js.native
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.native
  var analyze_wildcard: js.UndefOr[Boolean] = js.native
  var analyzer: js.UndefOr[String] = js.native
  var body: js.UndefOr[T] = js.native
  var default_operator: js.UndefOr[AND | OR] = js.native
  var df: js.UndefOr[String] = js.native
  var id: String = js.native
  var index: String = js.native
  var lenient: js.UndefOr[Boolean] = js.native
  var preference: js.UndefOr[String] = js.native
  var q: js.UndefOr[String] = js.native
  var routing: js.UndefOr[String] = js.native
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Explain {
  @scala.inline
  def apply[T](id: String, index: String): Explain[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Explain[T]]
  }
  @scala.inline
  implicit class ExplainOps[Self <: Explain[_], T] (val x: Self with Explain[T]) extends AnyVal {
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
    def set_sourceVarargs(value: String*): Self = this.set("_source", js.Array(value :_*))
    @scala.inline
    def set_source(value: String | js.Array[String]): Self = this.set("_source", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source: Self = this.set("_source", js.undefined)
    @scala.inline
    def set_source_excludeVarargs(value: String*): Self = this.set("_source_exclude", js.Array(value :_*))
    @scala.inline
    def set_source_exclude(value: String | js.Array[String]): Self = this.set("_source_exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_exclude: Self = this.set("_source_exclude", js.undefined)
    @scala.inline
    def set_source_excludesVarargs(value: String*): Self = this.set("_source_excludes", js.Array(value :_*))
    @scala.inline
    def set_source_excludes(value: String | js.Array[String]): Self = this.set("_source_excludes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_excludes: Self = this.set("_source_excludes", js.undefined)
    @scala.inline
    def set_source_includeVarargs(value: String*): Self = this.set("_source_include", js.Array(value :_*))
    @scala.inline
    def set_source_include(value: String | js.Array[String]): Self = this.set("_source_include", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_include: Self = this.set("_source_include", js.undefined)
    @scala.inline
    def set_source_includesVarargs(value: String*): Self = this.set("_source_includes", js.Array(value :_*))
    @scala.inline
    def set_source_includes(value: String | js.Array[String]): Self = this.set("_source_includes", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_source_includes: Self = this.set("_source_includes", js.undefined)
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
    def setLenient(value: Boolean): Self = this.set("lenient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLenient: Self = this.set("lenient", js.undefined)
    @scala.inline
    def setPreference(value: String): Self = this.set("preference", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreference: Self = this.set("preference", js.undefined)
    @scala.inline
    def setQ(value: String): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setRouting(value: String): Self = this.set("routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRouting: Self = this.set("routing", js.undefined)
    @scala.inline
    def setStored_fieldsVarargs(value: String*): Self = this.set("stored_fields", js.Array(value :_*))
    @scala.inline
    def setStored_fields(value: String | js.Array[String]): Self = this.set("stored_fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStored_fields: Self = this.set("stored_fields", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

