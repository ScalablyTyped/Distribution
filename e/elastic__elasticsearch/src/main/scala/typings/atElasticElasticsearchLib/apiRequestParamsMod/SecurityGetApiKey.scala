package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGetApiKey extends Generic {
  var id: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var realm_name: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object SecurityGetApiKey {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    name: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    realm_name: java.lang.String = null,
    source: java.lang.String = null,
    username: java.lang.String = null
  ): SecurityGetApiKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (id != null) __obj.updateDynamic("id")(id)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (realm_name != null) __obj.updateDynamic("realm_name")(realm_name)
    if (source != null) __obj.updateDynamic("source")(source)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SecurityGetApiKey]
  }
}

