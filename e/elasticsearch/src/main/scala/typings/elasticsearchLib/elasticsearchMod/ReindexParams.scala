package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexParams extends GenericParams {
  @JSName("body")
  var body_ReindexParams: elasticsearchLib.Anon_Conflicts
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var requestsPerSecond: js.UndefOr[scala.Double] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[java.lang.String] = js.undefined
  var waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
}

object ReindexParams {
  @scala.inline
  def apply(
    body: elasticsearchLib.Anon_Conflicts,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    requestsPerSecond: scala.Int | scala.Double = null,
    slices: scala.Int | scala.Double = null,
    timeout: TimeSpan = null,
    waitForActiveShards: java.lang.String = null,
    waitForCompletion: js.UndefOr[scala.Boolean] = js.undefined
  ): ReindexParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (requestsPerSecond != null) __obj.updateDynamic("requestsPerSecond")(requestsPerSecond.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards)
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion)
    __obj.asInstanceOf[ReindexParams]
  }
}

