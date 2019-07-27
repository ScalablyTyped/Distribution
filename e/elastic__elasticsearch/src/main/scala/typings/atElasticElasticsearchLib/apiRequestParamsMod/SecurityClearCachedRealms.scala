package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityClearCachedRealms extends Generic {
  var realms: java.lang.String | js.Array[java.lang.String]
  var usernames: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object SecurityClearCachedRealms {
  @scala.inline
  def apply(
    realms: java.lang.String | js.Array[java.lang.String],
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    usernames: java.lang.String | js.Array[java.lang.String] = null
  ): SecurityClearCachedRealms = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (usernames != null) __obj.updateDynamic("usernames")(usernames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealms]
  }
}

