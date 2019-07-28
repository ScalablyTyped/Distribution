package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.block
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.cpu
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.wait
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
    snapshots: Int | Double = null,
    source: String = null,
    threads: Int | Double = null,
    timeout: String = null,
    `type`: cpu | wait | block = null
  ): NodesHotThreads = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_idle_threads)) __obj.updateDynamic("ignore_idle_threads")(ignore_idle_threads)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (method != null) __obj.updateDynamic("method")(method)
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreads]
  }
}

