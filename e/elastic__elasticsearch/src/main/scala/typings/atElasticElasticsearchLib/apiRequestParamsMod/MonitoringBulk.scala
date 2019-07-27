package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonitoringBulk[T] extends Generic {
  var body: T
  var interval: js.UndefOr[java.lang.String] = js.undefined
  var system_api_version: js.UndefOr[java.lang.String] = js.undefined
  var system_id: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MonitoringBulk {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    interval: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    system_api_version: java.lang.String = null,
    system_id: java.lang.String = null,
    `type`: java.lang.String = null
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

