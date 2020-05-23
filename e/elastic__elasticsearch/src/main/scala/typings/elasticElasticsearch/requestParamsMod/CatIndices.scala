package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.all
import typings.elasticElasticsearch.elasticElasticsearchStrings.b
import typings.elasticElasticsearch.elasticElasticsearchStrings.closed
import typings.elasticElasticsearch.elasticElasticsearchStrings.d
import typings.elasticElasticsearch.elasticElasticsearchStrings.g
import typings.elasticElasticsearch.elasticElasticsearchStrings.gb
import typings.elasticElasticsearch.elasticElasticsearchStrings.green
import typings.elasticElasticsearch.elasticElasticsearchStrings.h
import typings.elasticElasticsearch.elasticElasticsearchStrings.hidden
import typings.elasticElasticsearch.elasticElasticsearchStrings.k
import typings.elasticElasticsearch.elasticElasticsearchStrings.kb
import typings.elasticElasticsearch.elasticElasticsearchStrings.m
import typings.elasticElasticsearch.elasticElasticsearchStrings.mb
import typings.elasticElasticsearch.elasticElasticsearchStrings.micros
import typings.elasticElasticsearch.elasticElasticsearchStrings.ms
import typings.elasticElasticsearch.elasticElasticsearchStrings.nanos
import typings.elasticElasticsearch.elasticElasticsearchStrings.none
import typings.elasticElasticsearch.elasticElasticsearchStrings.open
import typings.elasticElasticsearch.elasticElasticsearchStrings.p
import typings.elasticElasticsearch.elasticElasticsearchStrings.pb
import typings.elasticElasticsearch.elasticElasticsearchStrings.red
import typings.elasticElasticsearch.elasticElasticsearchStrings.s
import typings.elasticElasticsearch.elasticElasticsearchStrings.t
import typings.elasticElasticsearch.elasticElasticsearchStrings.tb
import typings.elasticElasticsearch.elasticElasticsearchStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatIndices extends Generic {
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.undefined
  var expand_wildcards: js.UndefOr[open | closed | hidden | none | all] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  var health: js.UndefOr[green | yellow | red] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var include_unloaded_segments: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var local: js.UndefOr[Boolean] = js.undefined
  var master_timeout: js.UndefOr[String] = js.undefined
  var pri: js.UndefOr[Boolean] = js.undefined
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  var time: js.UndefOr[d | h | m | s | ms | micros | nanos] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatIndices {
  @scala.inline
  def apply(
    bytes: b | k | kb | m | mb | g | gb | t | tb | p | pb = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    expand_wildcards: open | closed | hidden | none | all = null,
    filter_path: String | js.Array[String] = null,
    format: String = null,
    h: String | js.Array[String] = null,
    health: green | yellow | red = null,
    help: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    include_unloaded_segments: js.UndefOr[Boolean] = js.undefined,
    index: String | js.Array[String] = null,
    local: js.UndefOr[Boolean] = js.undefined,
    master_timeout: String = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    pri: js.UndefOr[Boolean] = js.undefined,
    s: String | js.Array[String] = null,
    source: String = null,
    time: d | h | m | s | ms | micros | nanos = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatIndices = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace.get.asInstanceOf[js.Any])
    if (expand_wildcards != null) __obj.updateDynamic("expand_wildcards")(expand_wildcards.asInstanceOf[js.Any])
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (health != null) __obj.updateDynamic("health")(health.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help.get.asInstanceOf[js.Any])
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human.get.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (!js.isUndefined(include_unloaded_segments)) __obj.updateDynamic("include_unloaded_segments")(include_unloaded_segments.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(local)) __obj.updateDynamic("local")(local.get.asInstanceOf[js.Any])
    if (master_timeout != null) __obj.updateDynamic("master_timeout")(master_timeout.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pri)) __obj.updateDynamic("pri")(pri.get.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatIndices]
  }
}

