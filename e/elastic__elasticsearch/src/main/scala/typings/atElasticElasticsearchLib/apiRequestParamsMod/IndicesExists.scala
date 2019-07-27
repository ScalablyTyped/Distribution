package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesExists extends Generic {
  var allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var flat_settings: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined
  var include_defaults: js.UndefOr[scala.Boolean] = js.undefined
  var index: java.lang.String | js.Array[java.lang.String]
  var local: js.UndefOr[scala.Boolean] = js.undefined
}

object IndicesExists {
  @scala.inline
  def apply(
    index: java.lang.String | js.Array[java.lang.String],
    allow_no_indices: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    flat_settings: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_unavailable: js.UndefOr[scala.Boolean] = js.undefined,
    include_defaults: js.UndefOr[scala.Boolean] = js.undefined,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): IndicesExists = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flat_settings)) __obj.updateDynamic("flat_settings")(flat_settings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (!js.isUndefined(include_defaults)) __obj.updateDynamic("include_defaults")(include_defaults)
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IndicesExists]
  }
}

