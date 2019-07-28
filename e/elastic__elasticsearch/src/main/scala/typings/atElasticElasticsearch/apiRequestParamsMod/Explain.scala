package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.AND
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.OR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Explain[T] extends Generic {
  var _source: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_excludes: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_include: js.UndefOr[String | js.Array[String]] = js.undefined
  var _source_includes: js.UndefOr[String | js.Array[String]] = js.undefined
  var analyze_wildcard: js.UndefOr[Boolean] = js.undefined
  var analyzer: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var default_operator: js.UndefOr[AND | OR] = js.undefined
  var df: js.UndefOr[String] = js.undefined
  var id: String
  var index: String
  var lenient: js.UndefOr[Boolean] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var q: js.UndefOr[String] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var stored_fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Explain {
  @scala.inline
  def apply[T](
    id: String,
    index: String,
    _source: String | js.Array[String] = null,
    _source_exclude: String | js.Array[String] = null,
    _source_excludes: String | js.Array[String] = null,
    _source_include: String | js.Array[String] = null,
    _source_includes: String | js.Array[String] = null,
    analyze_wildcard: js.UndefOr[Boolean] = js.undefined,
    analyzer: String = null,
    body: T = null,
    default_operator: AND | OR = null,
    df: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    lenient: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    q: String = null,
    routing: String = null,
    source: String = null,
    stored_fields: String | js.Array[String] = null,
    `type`: String = null
  ): Explain[T] = {
    val __obj = js.Dynamic.literal(id = id, index = index)
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(analyze_wildcard)) __obj.updateDynamic("analyze_wildcard")(analyze_wildcard)
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (default_operator != null) __obj.updateDynamic("default_operator")(default_operator.asInstanceOf[js.Any])
    if (df != null) __obj.updateDynamic("df")(df)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(lenient)) __obj.updateDynamic("lenient")(lenient)
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (q != null) __obj.updateDynamic("q")(q)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (source != null) __obj.updateDynamic("source")(source)
    if (stored_fields != null) __obj.updateDynamic("stored_fields")(stored_fields.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Explain[T]]
  }
}

