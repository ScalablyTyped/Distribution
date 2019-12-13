package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`d (Days)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`h (Hours)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`m (Minutes)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`micros (Microseconds)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`ms (Milliseconds)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`nanos (Nanoseconds)`
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.`s (Seconds)`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatTasks extends Generic {
  var actions: js.UndefOr[String | js.Array[String]] = js.undefined
  var detailed: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var node_id: js.UndefOr[String | js.Array[String]] = js.undefined
  var parent_task: js.UndefOr[Double] = js.undefined
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  var time: js.UndefOr[
    (`d (Days)`) | (`h (Hours)`) | (`m (Minutes)`) | (`s (Seconds)`) | (`ms (Milliseconds)`) | (`micros (Microseconds)`) | (`nanos (Nanoseconds)`)
  ] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatTasks {
  @scala.inline
  def apply(
    actions: String | js.Array[String] = null,
    detailed: js.UndefOr[Boolean] = js.undefined,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    format: String = null,
    h: String | js.Array[String] = null,
    help: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    method: String = null,
    node_id: String | js.Array[String] = null,
    parent_task: Int | Double = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    s: String | js.Array[String] = null,
    source: String = null,
    time: (`d (Days)`) | (`h (Hours)`) | (`m (Minutes)`) | (`s (Seconds)`) | (`ms (Milliseconds)`) | (`micros (Microseconds)`) | (`nanos (Nanoseconds)`) = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatTasks = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (node_id != null) __obj.updateDynamic("node_id")(node_id.asInstanceOf[js.Any])
    if (parent_task != null) __obj.updateDynamic("parent_task")(parent_task.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatTasks]
  }
}

