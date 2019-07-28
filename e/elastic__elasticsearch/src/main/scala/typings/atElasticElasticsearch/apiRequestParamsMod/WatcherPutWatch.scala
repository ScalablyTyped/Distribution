package typings.atElasticElasticsearch.apiRequestParamsMod

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
    if_primary_term: Int | Double = null,
    if_seq_no: Int | Double = null,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    version: Int | Double = null
  ): WatcherPutWatch[T] = {
    val __obj = js.Dynamic.literal(id = id)
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (if_primary_term != null) __obj.updateDynamic("if_primary_term")(if_primary_term.asInstanceOf[js.Any])
    if (if_seq_no != null) __obj.updateDynamic("if_seq_no")(if_seq_no.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (source != null) __obj.updateDynamic("source")(source)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[WatcherPutWatch[T]]
  }
}

