package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterAllocationExplainParams extends GenericParams {
  var includeDiskInfo: js.UndefOr[scala.Boolean] = js.undefined
  var includeYesDecisions: js.UndefOr[scala.Boolean] = js.undefined
}

object ClusterAllocationExplainParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    includeDiskInfo: js.UndefOr[scala.Boolean] = js.undefined,
    includeYesDecisions: js.UndefOr[scala.Boolean] = js.undefined,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null
  ): ClusterAllocationExplainParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(includeDiskInfo)) __obj.updateDynamic("includeDiskInfo")(includeDiskInfo)
    if (!js.isUndefined(includeYesDecisions)) __obj.updateDynamic("includeYesDecisions")(includeYesDecisions)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterAllocationExplainParams]
  }
}

