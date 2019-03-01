package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterHealthParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards
  ] = js.undefined
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
  var waitForEvents: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.immediate | elasticsearchLib.elasticsearchLibStrings.urgent | elasticsearchLib.elasticsearchLibStrings.high | elasticsearchLib.elasticsearchLibStrings.normal | elasticsearchLib.elasticsearchLibStrings.low | elasticsearchLib.elasticsearchLibStrings.languid
  ] = js.undefined
  var waitForNodes: js.UndefOr[java.lang.String] = js.undefined
  var waitForRelocatingShards: js.UndefOr[scala.Boolean] = js.undefined
  var waitForStatus: js.UndefOr[
    elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red
  ] = js.undefined
}

object ClusterHealthParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: NameList = null,
    level: elasticsearchLib.elasticsearchLibStrings.cluster | elasticsearchLib.elasticsearchLibStrings.indices | elasticsearchLib.elasticsearchLibStrings.shards = null,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    waitForActiveShards: java.lang.String = null,
    waitForEvents: elasticsearchLib.elasticsearchLibStrings.immediate | elasticsearchLib.elasticsearchLibStrings.urgent | elasticsearchLib.elasticsearchLibStrings.high | elasticsearchLib.elasticsearchLibStrings.normal | elasticsearchLib.elasticsearchLibStrings.low | elasticsearchLib.elasticsearchLibStrings.languid = null,
    waitForNodes: java.lang.String = null,
    waitForRelocatingShards: js.UndefOr[scala.Boolean] = js.undefined,
    waitForStatus: elasticsearchLib.elasticsearchLibStrings.green | elasticsearchLib.elasticsearchLibStrings.yellow | elasticsearchLib.elasticsearchLibStrings.red = null
  ): ClusterHealthParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    if (waitForEvents != null) __obj.updateDynamic("waitForEvents")(waitForEvents.asInstanceOf[js.Any])
    if (waitForNodes != null) __obj.updateDynamic("waitForNodes")(waitForNodes)
    if (!js.isUndefined(waitForRelocatingShards)) __obj.updateDynamic("waitForRelocatingShards")(waitForRelocatingShards)
    if (waitForStatus != null) __obj.updateDynamic("waitForStatus")(waitForStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealthParams]
  }
}

