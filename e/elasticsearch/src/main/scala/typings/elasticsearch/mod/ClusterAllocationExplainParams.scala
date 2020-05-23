package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterAllocationExplainParams extends GenericParams {
  var includeDiskInfo: js.UndefOr[Boolean] = js.undefined
  var includeYesDecisions: js.UndefOr[Boolean] = js.undefined
}

object ClusterAllocationExplainParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    includeDiskInfo: js.UndefOr[Boolean] = js.undefined,
    includeYesDecisions: js.UndefOr[Boolean] = js.undefined,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined
  ): ClusterAllocationExplainParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDiskInfo)) __obj.updateDynamic("includeDiskInfo")(includeDiskInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeYesDecisions)) __obj.updateDynamic("includeYesDecisions")(includeYesDecisions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainParams]
  }
}

