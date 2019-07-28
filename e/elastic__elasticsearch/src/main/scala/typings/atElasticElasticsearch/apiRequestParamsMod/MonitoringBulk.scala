package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoringBulk[T] extends Generic {
  var body: T
  var interval: js.UndefOr[String] = js.undefined
  var system_api_version: js.UndefOr[String] = js.undefined
  var system_id: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object MonitoringBulk {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    interval: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    system_api_version: String = null,
    system_id: String = null,
    `type`: String = null
  ): MonitoringBulk[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (system_api_version != null) __obj.updateDynamic("system_api_version")(system_api_version)
    if (system_id != null) __obj.updateDynamic("system_id")(system_id)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MonitoringBulk[T]]
  }
}

