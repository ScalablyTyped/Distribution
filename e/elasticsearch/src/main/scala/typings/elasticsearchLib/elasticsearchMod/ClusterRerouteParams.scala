package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterRerouteParams extends GenericParams {
  var dryRun: js.UndefOr[scala.Boolean] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var masterTimeout: js.UndefOr[TimeSpan] = js.undefined
  var metric: js.UndefOr[NameList] = js.undefined
  var retryFailed: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[TimeSpan] = js.undefined
}

object ClusterRerouteParams {
  @scala.inline
  def apply(
    body: js.Any = null,
    dryRun: js.UndefOr[scala.Boolean] = js.undefined,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    masterTimeout: TimeSpan = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    metric: NameList = null,
    requestTimeout: scala.Int | scala.Double = null,
    retryFailed: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: TimeSpan = null
  ): ClusterRerouteParams = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (masterTimeout != null) __obj.updateDynamic("masterTimeout")(masterTimeout)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(retryFailed)) __obj.updateDynamic("retryFailed")(retryFailed)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ClusterRerouteParams]
  }
}

