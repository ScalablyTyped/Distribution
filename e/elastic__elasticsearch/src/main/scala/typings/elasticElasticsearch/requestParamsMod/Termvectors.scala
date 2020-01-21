package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.external
import typings.elasticElasticsearch.elasticElasticsearchStrings.external_gte
import typings.elasticElasticsearch.elasticElasticsearchStrings.force
import typings.elasticElasticsearch.elasticElasticsearchStrings.internal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Termvectors[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var field_statistics: js.UndefOr[Boolean] = js.undefined
  var fields: js.UndefOr[String | js.Array[String]] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var index: String
  var offsets: js.UndefOr[Boolean] = js.undefined
  var payloads: js.UndefOr[Boolean] = js.undefined
  var positions: js.UndefOr[Boolean] = js.undefined
  var preference: js.UndefOr[String] = js.undefined
  var realtime: js.UndefOr[Boolean] = js.undefined
  var routing: js.UndefOr[String] = js.undefined
  var term_statistics: js.UndefOr[Boolean] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
  var version_type: js.UndefOr[internal | external | external_gte | force] = js.undefined
}

object Termvectors {
  @scala.inline
  def apply[T](
    index: String,
    body: T = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    field_statistics: js.UndefOr[Boolean] = js.undefined,
    fields: String | js.Array[String] = null,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    offsets: js.UndefOr[Boolean] = js.undefined,
    payloads: js.UndefOr[Boolean] = js.undefined,
    positions: js.UndefOr[Boolean] = js.undefined,
    preference: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    realtime: js.UndefOr[Boolean] = js.undefined,
    routing: String = null,
    source: String = null,
    term_statistics: js.UndefOr[Boolean] = js.undefined,
    `type`: String = null,
    version: Int | Double = null,
    version_type: internal | external | external_gte | force = null
  ): Termvectors[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (!js.isUndefined(field_statistics)) __obj.updateDynamic("field_statistics")(field_statistics.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets.asInstanceOf[js.Any])
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads.asInstanceOf[js.Any])
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions.asInstanceOf[js.Any])
    if (preference != null) __obj.updateDynamic("preference")(preference.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(term_statistics)) __obj.updateDynamic("term_statistics")(term_statistics.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Termvectors[T]]
  }
}

