package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesReloadSecureSettings extends Generic {
  var node_id: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
}

object NodesReloadSecureSettings {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    node_id: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null
  ): NodesReloadSecureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[NodesReloadSecureSettings]
  }
}

