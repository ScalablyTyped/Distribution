package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterReroute[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var dry_run: js.UndefOr[Boolean] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var metric: js.UndefOr[String | js.Array[String]] = js.undefined
  var retry_failed: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object ClusterReroute {
  @scala.inline
  def apply[T](
    body: T = null,
    dry_run: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    explain: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    master_timeout: String = null,
    method: String = null,
    metric: String | js.Array[String] = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    retry_failed: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null
  ): ClusterReroute[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(dry_run)) __obj.updateDynamic("dry_run")(dry_run)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(retry_failed)) __obj.updateDynamic("retry_failed")(retry_failed)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[ClusterReroute[T]]
  }
}

