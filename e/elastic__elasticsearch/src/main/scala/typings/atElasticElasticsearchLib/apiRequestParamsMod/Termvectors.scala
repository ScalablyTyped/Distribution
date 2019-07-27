package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Termvectors[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var field_statistics: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var index: java.lang.String
  var offsets: js.UndefOr[scala.Boolean] = js.undefined
  var payloads: js.UndefOr[scala.Boolean] = js.undefined
  var positions: js.UndefOr[scala.Boolean] = js.undefined
  var preference: js.UndefOr[java.lang.String] = js.undefined
  var realtime: js.UndefOr[scala.Boolean] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var term_statistics: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var version_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force
  ] = js.undefined
}

object Termvectors {
  @scala.inline
  def apply[T](
    index: java.lang.String,
    body: T = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    field_statistics: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String | js.Array[java.lang.String] = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    offsets: js.UndefOr[scala.Boolean] = js.undefined,
    payloads: js.UndefOr[scala.Boolean] = js.undefined,
    positions: js.UndefOr[scala.Boolean] = js.undefined,
    preference: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    realtime: js.UndefOr[scala.Boolean] = js.undefined,
    routing: java.lang.String = null,
    source: java.lang.String = null,
    term_statistics: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: java.lang.String = null,
    version: scala.Int | scala.Double = null,
    version_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force = null
  ): Termvectors[T] = {
    val __obj = js.Dynamic.literal(index = index)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (!js.isUndefined(field_statistics)) __obj.updateDynamic("field_statistics")(field_statistics)
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(offsets)) __obj.updateDynamic("offsets")(offsets)
    if (!js.isUndefined(payloads)) __obj.updateDynamic("payloads")(payloads)
    if (!js.isUndefined(positions)) __obj.updateDynamic("positions")(positions)
    if (preference != null) __obj.updateDynamic("preference")(preference)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(realtime)) __obj.updateDynamic("realtime")(realtime)
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(term_statistics)) __obj.updateDynamic("term_statistics")(term_statistics)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Termvectors[T]]
  }
}

