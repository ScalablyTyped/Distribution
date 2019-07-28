package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGetApiKey extends Generic {
  var id: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var realm_name: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object SecurityGetApiKey {
  @scala.inline
  def apply(
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    name: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    realm_name: String = null,
    source: String = null,
    username: String = null
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

