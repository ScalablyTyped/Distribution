package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scroll[T] extends Generic {
  var body: js.UndefOr[T] = js.undefined
  var rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined
  var scroll: js.UndefOr[java.lang.String] = js.undefined
  var scroll_id: js.UndefOr[java.lang.String] = js.undefined
}

object Scroll {
  @scala.inline
  def apply[T](
    body: T = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    rest_total_hits_as_int: js.UndefOr[scala.Boolean] = js.undefined,
    scroll: java.lang.String = null,
    scroll_id: java.lang.String = null,
    source: java.lang.String = null
  ): Scroll[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (!js.isUndefined(rest_total_hits_as_int)) __obj.updateDynamic("rest_total_hits_as_int")(rest_total_hits_as_int)
    if (scroll != null) __obj.updateDynamic("scroll")(scroll)
    if (scroll_id != null) __obj.updateDynamic("scroll_id")(scroll_id)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Scroll[T]]
  }
}

