package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Msearch[T] extends Generic {
  var body: T
  var ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var max_concurrent_searches: js.UndefOr[scala.Double] = js.undefined
  var max_concurrent_shard_requests: js.UndefOr[scala.Double] = js.undefined
  var pre_filter_shard_size: js.UndefOr[scala.Double] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined
  var search_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_and_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_and_fetch
  ] = js.undefined
  var `type`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var typed_keys: js.UndefOr[scala.Boolean] = js.undefined
}

object Msearch {
  @scala.inline
  def apply[T](
    body: T,
    ccs_minimize_roundtrips: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: java.lang.String | js.Array[java.lang.String] = null,
    max_concurrent_searches: scala.Int | scala.Double = null,
    max_concurrent_shard_requests: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    pre_filter_shard_size: scala.Int | scala.Double = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined,
    search_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.query_and_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_then_fetch | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.dfs_query_and_fetch = null,
    source: java.lang.String = null,
    `type`: java.lang.String | js.Array[java.lang.String] = null,
    typed_keys: js.UndefOr[scala.Boolean] = js.undefined
  ): Msearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(ccs_minimize_roundtrips)) __obj.updateDynamic("ccs_minimize_roundtrips")(ccs_minimize_roundtrips)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (max_concurrent_searches != null) __obj.updateDynamic("max_concurrent_searches")(max_concurrent_searches.asInstanceOf[js.Any])
    if (max_concurrent_shard_requests != null) __obj.updateDynamic("max_concurrent_shard_requests")(max_concurrent_shard_requests.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (pre_filter_shard_size != null) __obj.updateDynamic("pre_filter_shard_size")(pre_filter_shard_size.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int)
    if (search_type != null) __obj.updateDynamic("search_type")(search_type.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys)
    __obj.asInstanceOf[Msearch[T]]
  }
}

