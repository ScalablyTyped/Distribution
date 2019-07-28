package typings.elasticsearch.elasticsearchMod

import typings.elasticsearch.elasticsearchStrings.cluster
import typings.elasticsearch.elasticsearchStrings.green
import typings.elasticsearch.elasticsearchStrings.high
import typings.elasticsearch.elasticsearchStrings.immediate
import typings.elasticsearch.elasticsearchStrings.indices
import typings.elasticsearch.elasticsearchStrings.languid
import typings.elasticsearch.elasticsearchStrings.low
import typings.elasticsearch.elasticsearchStrings.normal
import typings.elasticsearch.elasticsearchStrings.red
import typings.elasticsearch.elasticsearchStrings.shards
import typings.elasticsearch.elasticsearchStrings.urgent
import typings.elasticsearch.elasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterHealthParams extends GenericParams {
  var index: js.UndefOr[NameList] = js.undefined
  var level: js.UndefOr[cluster | indices | shards] = js.undefined
  var local: js.UndefOr[Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  var waitForEvents: js.UndefOr[immediate | urgent | high | normal | low | languid] = js.undefined
  var waitForNodes: js.UndefOr[String] = js.undefined
  var waitForRelocatingShards: js.UndefOr[Boolean] = js.undefined
  var waitForStatus: js.UndefOr[green | yellow | red] = js.undefined
}

object ClusterHealthParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    index: NameList = null,
    level: cluster | indices | shards = null,
    local: js.UndefOr[Boolean] = js.undefined,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    requestTimeout: Int | Double = null,
    waitForActiveShards: String = null,
    waitForEvents: immediate | urgent | high | normal | low | languid = null,
    waitForNodes: String = null,
    waitForRelocatingShards: js.UndefOr[Boolean] = js.undefined,
    waitForStatus: green | yellow | red = null
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

