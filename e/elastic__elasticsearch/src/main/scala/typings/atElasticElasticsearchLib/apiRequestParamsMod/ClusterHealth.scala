package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterHealth extends Generic {
  var expand_wildcards: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all
  ] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var level: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cluster | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards
  ] = js.undefined
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var master_timeout: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_events: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.immediate | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.urgent | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.high | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.normal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.low | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.languid
  ] = js.undefined
  var wait_for_no_initializing_shards: js.UndefOr[scala.Boolean] = js.undefined
  var wait_for_no_relocating_shards: js.UndefOr[scala.Boolean] = js.undefined
  var wait_for_nodes: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_status: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.green | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.yellow | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.red
  ] = js.undefined
}

object ClusterHealth {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    expand_wildcards: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.open | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.closed | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.none | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.all = null,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: java.lang.String | js.Array[java.lang.String] = null,
    level: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cluster | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.indices | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.shards = null,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    master_timeout: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    wait_for_active_shards: java.lang.String = null,
    wait_for_events: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.immediate | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.urgent | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.high | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.normal | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.low | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.languid = null,
    wait_for_no_initializing_shards: js.UndefOr[scala.Boolean] = js.undefined,
    wait_for_no_relocating_shards: js.UndefOr[scala.Boolean] = js.undefined,
    wait_for_nodes: java.lang.String = null,
    wait_for_status: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.green | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.yellow | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.red = null
  ): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    if (wait_for_events != null) __obj.updateDynamic("wait_for_events")(wait_for_events.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_no_initializing_shards)) __obj.updateDynamic("wait_for_no_initializing_shards")(wait_for_no_initializing_shards)
    if (!js.isUndefined(wait_for_no_relocating_shards)) __obj.updateDynamic("wait_for_no_relocating_shards")(wait_for_no_relocating_shards)
    if (wait_for_nodes != null) __obj.updateDynamic("wait_for_nodes")(wait_for_nodes)
    if (wait_for_status != null) __obj.updateDynamic("wait_for_status")(wait_for_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealth]
  }
}

