package typings.atElasticElasticsearch.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutTemplate[T] extends Generic {
  var body: T
  var create: js.UndefOr[Boolean] = js.undefined
  var flat_settings: js.UndefOr[Boolean] = js.undefined
  var include_type_name: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var name: String
  var order: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
}

object IndicesPutTemplate {
  @scala.inline
  def apply[T](
    body: T,
    name: String,
    create: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    flat_settings: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_type_name: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    order: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null
  ): IndicesPutTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name)
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(flat_settings)) __obj.updateDynamic("flat_settings")(flat_settings)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_type_name)) __obj.updateDynamic("include_type_name")(include_type_name)
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout)
    if (method != null) __obj.updateDynamic("method")(method)
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[IndicesPutTemplate[T]]
  }
}

