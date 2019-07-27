package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delete extends Generic {
  var id: java.lang.String
  var if_primary_term: js.UndefOr[scala.Double] = js.undefined
  var if_seq_no: js.UndefOr[scala.Double] = js.undefined
  var index: java.lang.String
  var refresh: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for
  ] = js.undefined
  var routing: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
  var version_type: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force
  ] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
}

object Delete {
  @scala.inline
  def apply(
    id: java.lang.String,
    index: java.lang.String,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    if_primary_term: scala.Int | scala.Double = null,
    if_seq_no: scala.Int | scala.Double = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`true` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.`false` | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait_for = null,
    routing: java.lang.String = null,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    `type`: java.lang.String = null,
    version: scala.Int | scala.Double = null,
    version_type: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.internal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.external_gte | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.force = null,
    wait_for_active_shards: java.lang.String = null
  ): Delete = {
    val __obj = js.Dynamic.literal(id = id, index = index)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (if_primary_term != null) __obj.updateDynamic("if_primary_term")(if_primary_term.asInstanceOf[js.Any])
    if (if_seq_no != null) __obj.updateDynamic("if_seq_no")(if_seq_no.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (refresh != null) __obj.updateDynamic("refresh")(refresh.asInstanceOf[js.Any])
    if (routing != null) __obj.updateDynamic("routing")(routing)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (version_type != null) __obj.updateDynamic("version_type")(version_type.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    __obj.asInstanceOf[Delete]
  }
}

