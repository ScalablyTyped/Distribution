package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings.blocked
import typings.elasticsearch.elasticsearchStrings.cpu
import typings.elasticsearch.elasticsearchStrings.wait
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesHotThreadsParams extends GenericParams {
  var ignoreIdleThreads: js.UndefOr[Boolean] = js.undefined
  var interval: js.UndefOr[TimeSpan] = js.undefined
  var nodeId: NameList
  var snapshots: js.UndefOr[Double] = js.undefined
  var threads: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[cpu | wait | blocked] = js.undefined
}

object NodesHotThreadsParams {
  @scala.inline
  def apply(
    nodeId: NameList,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    ignoreIdleThreads: js.UndefOr[Boolean] = js.undefined,
    interval: TimeSpan = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    snapshots: js.UndefOr[Double] = js.undefined,
    threads: js.UndefOr[Double] = js.undefined,
    timeout: TimeSpan = null,
    `type`: cpu | wait | blocked = null
  ): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIdleThreads)) __obj.updateDynamic("ignoreIdleThreads")(ignoreIdleThreads.get.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshots)) __obj.updateDynamic("snapshots")(snapshots.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threads)) __obj.updateDynamic("threads")(threads.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
}

