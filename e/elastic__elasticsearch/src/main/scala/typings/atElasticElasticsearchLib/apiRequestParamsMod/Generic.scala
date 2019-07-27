package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generic extends js.Object {
  var error_trace: js.UndefOr[scala.Boolean] = js.undefined
  var filter_path: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var human: js.UndefOr[scala.Boolean] = js.undefined
  var ignore: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Generic {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): Generic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Generic]
  }
}

