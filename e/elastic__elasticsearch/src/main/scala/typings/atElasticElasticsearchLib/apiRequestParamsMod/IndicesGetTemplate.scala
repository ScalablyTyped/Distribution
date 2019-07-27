package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesGetTemplate extends Generic {
  var flat_settings: js.UndefOr[scala.Boolean] = js.undefined
  var include_type_name: js.UndefOr[scala.Boolean] = js.undefined
  var local: js.UndefOr[scala.Boolean] = js.undefined
  var master_timeout: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object IndicesGetTemplate {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    flat_settings: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    include_type_name: js.UndefOr[scala.Boolean] = js.undefined,
    local: js.UndefOr[scala.Boolean] = js.undefined,
    master_timeout: java.lang.String = null,
    method: java.lang.String = null,
    name: java.lang.String | js.Array[java.lang.String] = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): IndicesGetTemplate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flat_settings)) __obj.updateDynamic("flat_settings")(flat_settings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_type_name)) __obj.updateDynamic("include_type_name")(include_type_name)
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local)
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[IndicesGetTemplate]
  }
}

