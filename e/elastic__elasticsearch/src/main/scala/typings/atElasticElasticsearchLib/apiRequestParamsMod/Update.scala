package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Update[T] extends Generic {
  var _source: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_exclude: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_excludes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_include: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var _source_includes: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var body: T
  var id: java.lang.String
  var if_primary_term: js.UndefOr[scala.Double] = js.undefined
  var if_seq_no: js.UndefOr[scala.Double] = js.undefined
  var index: java.lang.String
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var refresh: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for
  ] = js.undefined
  var retry_on_conflict: js.UndefOr[scala.Double] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
}

object Update {
  @scala.inline
  def apply[T](
    body: T,
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
    if_primary_term: scala.Int | scala.Double = null,
    if_seq_no: scala.Int | scala.Double = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    lang: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for = null,
    retry_on_conflict: scala.Int | scala.Double = null,
    routing: java.lang.String = null,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    `type`: java.lang.String = null,
    wait_for_active_shards: java.lang.String = null
  ): Update[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id, index = index)
    if (_source != null) __obj.updateDynamic("_source")(_source.asInstanceOf[js.Any])
    if (_source_exclude != null) __obj.updateDynamic("_source_exclude")(_source_exclude.asInstanceOf[js.Any])
    if (_source_excludes != null) __obj.updateDynamic("_source_excludes")(_source_excludes.asInstanceOf[js.Any])
    if (_source_include != null) __obj.updateDynamic("_source_include")(_source_include.asInstanceOf[js.Any])
    if (_source_includes != null) __obj.updateDynamic("_source_includes")(_source_includes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (if_primary_term != null) __obj.updateDynamic("if_primary_term")(if_primary_term.asInstanceOf[js.Any])
    if (if_seq_no != null) __obj.updateDynamic("if_seq_no")(if_seq_no.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (retry_on_conflict != null) __obj.updateDynamic("retry_on_conflict")(retry_on_conflict.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    __obj.asInstanceOf[Update[T]]
  }
}

