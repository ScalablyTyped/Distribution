package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reindex[T] extends Generic {
  var body: T
  var max_docs: js.UndefOr[Double] = js.undefined
  var refresh: js.UndefOr[Boolean] = js.undefined
  var requests_per_second: js.UndefOr[Double] = js.undefined
  var scroll: js.UndefOr[String] = js.undefined
  var slices: js.UndefOr[Double | String] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var wait_for_active_shards: js.UndefOr[String] = js.undefined
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}

object Reindex {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    max_docs: js.UndefOr[Double] = js.undefined,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    refresh: js.UndefOr[Boolean] = js.undefined,
    requests_per_second: js.UndefOr[Double] = js.undefined,
    scroll: String = null,
    slices: Double | String = null,
    source: String = null,
    timeout: String = null,
    wait_for_active_shards: String = null,
    wait_for_completion: js.UndefOr[Boolean] = js.undefined
  ): Reindex[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(max_docs)) __obj.updateDynamic("max_docs")(max_docs.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requests_per_second)) __obj.updateDynamic("requests_per_second")(requests_per_second.get.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards.asInstanceOf[js.Any])
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reindex[T]]
  }
}

