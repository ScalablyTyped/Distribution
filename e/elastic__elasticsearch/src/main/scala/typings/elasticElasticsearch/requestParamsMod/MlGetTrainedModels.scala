package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlGetTrainedModels extends Generic {
  var allow_no_match: js.UndefOr[Boolean] = js.undefined
  var decompress_definition: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[Double] = js.undefined
  var include_model_definition: js.UndefOr[Boolean] = js.undefined
  var model_id: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var tags: js.UndefOr[String | js.Array[String]] = js.undefined
}

object MlGetTrainedModels {
  @scala.inline
  def apply(
    allow_no_match: js.UndefOr[Boolean] = js.undefined,
    decompress_definition: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    from: js.UndefOr[Double] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_model_definition: js.UndefOr[Boolean] = js.undefined,
    method: String = null,
    model_id: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    source: String = null,
    tags: String | js.Array[String] = null
  ): MlGetTrainedModels = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_no_match)) __obj.updateDynamic("allow_no_match")(allow_no_match.get.asInstanceOf[js.Any])
    if (!js.isUndefined(decompress_definition)) __obj.updateDynamic("decompress_definition")(decompress_definition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_model_definition)) __obj.updateDynamic("include_model_definition")(include_model_definition.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (model_id != null) __obj.updateDynamic("model_id")(model_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetTrainedModels]
  }
}

