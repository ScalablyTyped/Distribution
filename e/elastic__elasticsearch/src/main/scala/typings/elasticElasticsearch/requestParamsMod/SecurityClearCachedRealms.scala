package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityClearCachedRealms extends Generic {
  var realms: String | js.Array[String]
  var usernames: js.UndefOr[String | js.Array[String]] = js.undefined
}

object SecurityClearCachedRealms {
  @scala.inline
  def apply(
    realms: String | js.Array[String],
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    usernames: String | js.Array[String] = null
  ): SecurityClearCachedRealms = {
    val __obj = js.Dynamic.literal(realms = realms.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (usernames != null) __obj.updateDynamic("usernames")(usernames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityClearCachedRealms]
  }
}

