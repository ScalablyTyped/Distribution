package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesHotThreads extends Generic {
  var ignore_idle_threads: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var node_id: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var snapshots: js.UndefOr[scala.Double] = js.undefined
  var threads: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cpu | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.block
  ] = js.undefined
}

object NodesHotThreads {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignore_idle_threads: js.UndefOr[scala.Boolean] = js.undefined,
    interval: java.lang.String = null,
    method: java.lang.String = null,
    node_id: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    snapshots: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    threads: scala.Int | scala.Double = null,
    timeout: java.lang.String = null,
    `type`: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.cpu | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.wait | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.block = null
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

