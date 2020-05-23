package typings.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WatcherPutWatch[T] extends Generic {
  var active: js.UndefOr[Boolean] = js.undefined
  var body: js.UndefOr[T] = js.undefined
  var id: String
  var if_primary_term: js.UndefOr[Double] = js.undefined
  var if_seq_no: js.UndefOr[Double] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object WatcherPutWatch {
  @scala.inline
  def apply[T](
    id: String,
    active: js.UndefOr[Boolean] = js.undefined,
    body: T = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    human: js.UndefOr[Boolean] = js.undefined,
    if_primary_term: js.UndefOr[Double] = js.undefined,
    if_seq_no: js.UndefOr[Double] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    version: js.UndefOr[Double] = js.undefined
  ): WatcherPutWatch[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.get.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (!js.isUndefined(if_primary_term)) __obj.updateDynamic("if_primary_term")(if_primary_term.get.asInstanceOf[js.Any])
    if (!js.isUndefined(if_seq_no)) __obj.updateDynamic("if_seq_no")(if_seq_no.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatch[T]]
  }
}

