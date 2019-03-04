package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesHotThreadsParams extends GenericParams {
  var ignoreIdleThreads: js.UndefOr[scala.Boolean] = js.undefined
  var interval: js.UndefOr[TimeSpan] = js.undefined
  var nodeId: NameList
  var snapshots: js.UndefOr[scala.Double] = js.undefined
  var threads: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var `type`: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cpu | elasticsearchLib.elasticsearchLibStrings.wait | elasticsearchLib.elasticsearchLibStrings.blocked
  ] = js.undefined
}

object NodesHotThreadsParams {
  @scala.inline
  def apply(
    nodeId: NameList,
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    ignoreIdleThreads: js.UndefOr[scala.Boolean] = js.undefined,
    interval: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    snapshots: scala.Int | scala.Double = null,
    threads: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    `type`: elasticsearchLib.elasticsearchLibStrings.cpu | elasticsearchLib.elasticsearchLibStrings.wait | elasticsearchLib.elasticsearchLibStrings.blocked = null
  ): NodesHotThreadsParams = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreIdleThreads)) __obj.updateDynamic("ignoreIdleThreads")(ignoreIdleThreads)
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (snapshots != null) __obj.updateDynamic("snapshots")(snapshots.asInstanceOf[js.Any])
    if (threads != null) __obj.updateDynamic("threads")(threads.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesHotThreadsParams]
  }
}

