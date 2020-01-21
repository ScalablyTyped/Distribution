package typings.elasticsearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterRerouteParams extends GenericParams {
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var retryFailed: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object ClusterRerouteParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    explain: js.UndefOr[Boolean] = js.undefined,
    filterPath: String | js.Array[String] = null,
    ignore: Double | js.Array[Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: Int | Double = null,
    method: String = null,
    metric: NameList = null,
    requestTimeout: Int | Double = null,
    retryFailed: js.UndefOr[Boolean] = js.undefined,
    timeout: TimeSpan = null
  ): ClusterRerouteParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(retryFailed)) __obj.updateDynamic("retryFailed")(retryFailed.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterRerouteParams]
  }
}

