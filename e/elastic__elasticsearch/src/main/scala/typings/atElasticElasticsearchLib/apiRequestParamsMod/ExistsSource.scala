package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExistsSource extends Generic {
  var _source: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_excludes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_includes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var id: java.lang.String
  var index: java.lang.String
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var version_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force
  ] = js.undefined
}

object ExistsSource {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: java.lang.String,
    _source: java.lang.String | js.Array[java.lang.String] = null,
    _source_exclude: java.lang.String | js.Array[java.lang.String] = null,
    _source_excludes: java.lang.String | js.Array[java.lang.String] = null,
    _source_include: java.lang.String | js.Array[java.lang.String] = null,
    _source_includes: java.lang.String | js.Array[java.lang.String] = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    realtime: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    routing: java.lang.String = null,
    source: java.lang.String = null,
    `type`: java.lang.String = null,
    version: scala.Int | scala.Double = null,
    version_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force = null
  ): ExistsSource = {
    val __obj = js.Dynamic.literal(id = id, index = index)
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExistsSource]
  }
}

