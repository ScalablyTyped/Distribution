package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesClearCache extends Generic {
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var fielddata: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var query: js.UndefOr[scala.Boolean] = js.undefined
  var request: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicesClearCache {
  @scala.inline
  def apply(
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    fielddata: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String | js.Array[java.lang.String] = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    index: java.lang.String | js.Array[java.lang.String] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    query: js.UndefOr[scala.Boolean] = js.undefined,
    request: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): IndicesClearCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (!js.isUndefined(fielddata)) __obj.updateDynamic("fielddata")(fielddata)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(request)) __obj.updateDynamic("request")(request)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IndicesClearCache]
  }
}

