package typings.elasticsearch.elasticsearchMod

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
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    snapshots: Int | Double = null,
    threads: Int | Double = null,
    timeout: TimeSpan = null,
    `type`: cpu | wait | blocked = null
  ): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIdleThreads)) __obj.updateDynamic("ignoreIdleThreads")(ignoreIdleThreads.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
}

