package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesPutTemplate[T] extends Generic {
  var body: T
  var create: js.UndefOr[Boolean] = js.undefined
  var include_type_name: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var name: String
  var order: js.UndefOr[Double] = js.undefined
}

object IndicesPutTemplate {
  @scala.inline
  def apply[T](
    body: T,
    name: String,
    create: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_type_name: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    order: js.UndefOr[Double] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null
  ): IndicesPutTemplate[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.get.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_type_name)) __obj.updateDynamic("include_type_name")(include_type_name.get.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(order)) __obj.updateDynamic("order")(order.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutTemplate[T]]
  }
}

