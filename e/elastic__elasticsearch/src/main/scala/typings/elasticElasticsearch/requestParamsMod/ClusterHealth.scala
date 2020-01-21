package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.cluster
import typings.elasticElasticsearch.elasticElasticsearchStrings.green
import typings.elasticElasticsearch.elasticElasticsearchStrings.high
import typings.elasticElasticsearch.elasticElasticsearchStrings.immediate
import typings.elasticElasticsearch.elasticElasticsearchStrings.indices
import typings.elasticElasticsearch.elasticElasticsearchStrings.languid
import typings.elasticElasticsearch.elasticElasticsearchStrings.low
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.normal
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.red
import typings.elasticElasticsearch.elasticElasticsearchStrings.shards
import typings.elasticElasticsearch.elasticElasticsearchStrings.urgent
import typings.elasticElasticsearch.elasticElasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterHealth extends Generic {
  var expand_wildcards: js.UndefOr[open | closed | none | all] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  var local: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  var wait_for_events: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.undefined
  var wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.undefined
  var wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.undefined
  var wait_for_nodes: js.UndefOr[String] = js.undefined
  var wait_for_status: js.UndefOr[green | yellow | red] = js.undefined
}

object ClusterHealth {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | none | all = null,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String | js.Array[String] = null,
    level: cluster | indices | shards = null,
    local: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    wait_for_active_shards: String = null,
    wait_for_events: immediate | urgent | high | normal | low | languid = null,
    wait_for_no_initializing_shards: js.UndefOr[Boolean] = js.undefined,
    wait_for_no_relocating_shards: js.UndefOr[Boolean] = js.undefined,
    wait_for_nodes: String = null,
    wait_for_status: green | yellow | red = null
  ): ClusterHealth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    if (wait_for_events != null) __obj.updateDynamic("wait_for_events")(wait_for_events.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_no_initializing_shards)) __obj.updateDynamic("wait_for_no_initializing_shards")(wait_for_no_initializing_shards.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_no_relocating_shards)) __obj.updateDynamic("wait_for_no_relocating_shards")(wait_for_no_relocating_shards.asInstanceOf[js.Any])
    if (wait_for_nodes != null) __obj.updateDynamic("wait_for_nodes")(wait_for_nodes.asInstanceOf[js.Any])
    if (wait_for_status != null) __obj.updateDynamic("wait_for_status")(wait_for_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealth]
  }
}

