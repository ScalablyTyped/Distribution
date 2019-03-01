package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterStatsParams extends GenericParams {
  var flatSettings: js.UndefOr[scala.Boolean] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var nodeId: js.UndefOr[NameList] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object ClusterStatsParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    flatSettings: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    nodeId: NameList = null,
    requestTimeout: scala.Int | scala.Double = null,
    timeout: TimeSpan = null
  ): ClusterStatsParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (!js.isUndefined(flatSettings)) __obj.updateDynamic("flatSettings")(flatSettings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (nodeId != null) __obj.updateDynamic("nodeId")(nodeId.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ClusterStatsParams]
  }
}

