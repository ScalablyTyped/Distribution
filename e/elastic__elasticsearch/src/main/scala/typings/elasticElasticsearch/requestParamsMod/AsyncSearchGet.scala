package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncSearchGet extends Generic {
  var id: String
  var keep_alive: js.UndefOr[String] = js.undefined
  var typed_keys: js.UndefOr[Boolean] = js.undefined
  var wait_for_completion_timeout: js.UndefOr[String] = js.undefined
}

object AsyncSearchGet {
  @scala.inline
  def apply(
    id: String,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    keep_alive: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    typed_keys: js.UndefOr[Boolean] = js.undefined,
    wait_for_completion_timeout: String = null
  ): AsyncSearchGet = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (keep_alive != null) __obj.updateDynamic("keep_alive")(keep_alive.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(typed_keys)) __obj.updateDynamic("typed_keys")(typed_keys.get.asInstanceOf[js.Any])
    if (wait_for_completion_timeout != null) __obj.updateDynamic("wait_for_completion_timeout")(wait_for_completion_timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncSearchGet]
  }
}

