package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.all
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.closed
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.none
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutSettings[T] extends Generic {
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  var body: T
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var preserve_existing: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object IndicesPutSettings {
  @scala.inline
  def apply[T](
    body: T,
    allow_no_indices: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    filter_path: String | js.Array[String] = null,
    flat_settings: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_unavailable: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    master_timeout: String = null,
    method: String = null,
    preserve_existing: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null
  ): IndicesPutSettings[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_no_indices)) __obj.updateDynamic("allow_no_indices")(allow_no_indices)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flat_settings)) __obj.updateDynamic("flat_settings")(flat_settings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_unavailable)) __obj.updateDynamic("ignore_unavailable")(ignore_unavailable)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(preserve_existing)) __obj.updateDynamic("preserve_existing")(preserve_existing)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesPutSettings[T]]
  }
}

