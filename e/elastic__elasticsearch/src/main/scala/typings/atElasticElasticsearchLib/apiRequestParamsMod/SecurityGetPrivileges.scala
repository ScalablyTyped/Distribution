package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGetPrivileges extends Generic {
  var application: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SecurityGetPrivileges {
  @scala.inline
  def apply(
    application: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null
  ): SecurityGetPrivileges = {
    val __obj = js.Dynamic.literal()
    if (application != null) __obj.updateDynamic("application")(application)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SecurityGetPrivileges]
  }
}

