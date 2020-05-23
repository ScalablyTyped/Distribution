package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReindexParams extends GenericParams {
  @JSName("body")
  var body_ReindexParams: typings.elasticsearch.anon.Conflicts
  var refresh: js.UndefOr[Boolean] = js.undefined
  var requestsPerSecond: js.UndefOr[Double] = js.undefined
  var slices: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
  var waitForCompletion: js.UndefOr[Boolean] = js.undefined
}

object ReindexParams {
  @scala.inline
  def apply(
    body: typings.elasticsearch.anon.Conflicts,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    refresh: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    requestsPerSecond: js.UndefOr[Double] = js.undefined,
    slices: js.UndefOr[Double] = js.undefined,
    timeout: TimeSpan = null,
    waitForActiveShards: String = null,
    waitForCompletion: js.UndefOr[Boolean] = js.undefined
  ): ReindexParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsPerSecond)) __obj.updateDynamic("requestsPerSecond")(requestsPerSecond.get.asInstanceOf[js.Any])
    if (!js.isUndefined(slices)) __obj.updateDynamic("slices")(slices.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForCompletion)) __obj.updateDynamic("waitForCompletion")(waitForCompletion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexParams]
  }
}

