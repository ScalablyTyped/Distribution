package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.block
import typings.elasticElasticsearch.elasticElasticsearchStrings.cpu
import typings.elasticElasticsearch.elasticElasticsearchStrings.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesHotThreads extends Generic {
  var ignore_idle_threads: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[String] = js.undefined
  var node_id: js.UndefOr[String | js.Array[String]] = js.undefined
  var snapshots: js.UndefOr[Double] = js.undefined
  var threads: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[cpu | wait | block] = js.undefined
}

object NodesHotThreads {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    ignore_idle_threads: js.UndefOr[Boolean] = js.undefined,
    interval: String = null,
    method: String = null,
    node_id: String | js.Array[String] = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    snapshots: js.UndefOr[Double] = js.undefined,
    source: String = null,
    threads: js.UndefOr[Double] = js.undefined,
    timeout: String = null,
    `type`: cpu | wait | block = null
  ): NodesHotThreads = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_idle_threads)) __obj.updateDynamic("ignore_idle_threads")(ignore_idle_threads.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshots)) __obj.updateDynamic("snapshots")(snapshots.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(threads)) __obj.updateDynamic("threads")(threads.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreads]
  }
}

