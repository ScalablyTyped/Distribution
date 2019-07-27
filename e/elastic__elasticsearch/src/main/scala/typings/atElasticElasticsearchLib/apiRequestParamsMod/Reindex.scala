package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reindex[T] extends Generic {
  var body: T
  var refresh: js.UndefOr[scala.Boolean] = js.undefined
  var requests_per_second: js.UndefOr[scala.Double] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var slices: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
}

object Reindex {
  @scala.inline
  def apply[T](
    body: T,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    refresh: js.UndefOr[scala.Boolean] = js.undefined,
    requests_per_second: scala.Int | scala.Double = null,
    scroll: java.lang.String = null,
    slices: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    wait_for_active_shards: java.lang.String = null,
    wait_for_completion: js.UndefOr[scala.Boolean] = js.undefined
  ): Reindex[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(refresh)) __obj.updateDynamic("refresh")(refresh)
    if (requests_per_second != null) __obj.updateDynamic("requests_per_second")(requests_per_second.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (slices != null) __obj.updateDynamic("slices")(slices.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    if (!js.isUndefined(wait_for_completion)) __obj.updateDynamic("wait_for_completion")(wait_for_completion)
    __obj.asInstanceOf[Reindex[T]]
  }
}

