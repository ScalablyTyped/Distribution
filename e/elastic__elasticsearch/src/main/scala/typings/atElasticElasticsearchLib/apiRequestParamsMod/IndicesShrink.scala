package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesShrink[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var copy_settings: js.UndefOr[scala.Boolean] = js.undefined
  var index: java.lang.String
  var master_timeout: js.UndefOr[java.lang.String] = js.undefined
  var target: java.lang.String
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var wait_for_active_shards: js.UndefOr[java.lang.String] = js.undefined
}

object IndicesShrink {
  @scala.inline
  def apply[T](
    index: java.lang.String,
    target: java.lang.String,
    body: T = null,
    copy_settings: js.UndefOr[scala.Boolean] = js.undefined,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    master_timeout: java.lang.String = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    wait_for_active_shards: java.lang.String = null
  ): IndicesShrink[T] = {
    val __obj = js.Dynamic.literal(index = index, target = target)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(copy_settings)) __obj.updateDynamic("copy_settings")(copy_settings)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (wait_for_active_shards != null) __obj.updateDynamic("wait_for_active_shards")(wait_for_active_shards)
    __obj.asInstanceOf[IndicesShrink[T]]
  }
}

