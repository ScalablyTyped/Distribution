package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesCreateParams extends GenericParams {
  var index: String
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
  var updateAllTypes: js.UndefOr[Boolean] = js.undefined
  var waitForActiveShards: js.UndefOr[String] = js.undefined
}

object IndicesCreateParams {
  @scala.inline
  def apply(
    index: String,
    body: js.Any = null,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    timeout: TimeSpan = null,
    updateAllTypes: js.UndefOr[Boolean] = js.undefined,
    waitForActiveShards: String = null
  ): IndicesCreateParams = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(updateAllTypes)) __obj.updateDynamic("updateAllTypes")(updateAllTypes.get.asInstanceOf[js.Any])
    if (waitForActiveShards != null) __obj.updateDynamic("waitForActiveShards")(waitForActiveShards.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesCreateParams]
  }
}

