package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.b
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.g
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.gb
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.k
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.kb
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.m
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.mb
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.p
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.pb
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.t
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.tb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSegments extends Generic {
  var bytes: js.UndefOr[b | k | kb | m | mb | g | gb | t | tb | p | pb] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var h: js.UndefOr[String | js.Array[String]] = js.undefined
  var help: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[String | js.Array[String]] = js.undefined
  var s: js.UndefOr[String | js.Array[String]] = js.undefined
  var v: js.UndefOr[Boolean] = js.undefined
}

object CatSegments {
  @scala.inline
  def apply(
    bytes: b | k | kb | m | mb | g | gb | t | tb | p | pb = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    format: String = null,
    h: String | js.Array[String] = null,
    help: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    index: String | js.Array[String] = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    s: String | js.Array[String] = null,
    source: String = null,
    v: js.UndefOr[Boolean] = js.undefined
  ): CatSegments = {
    val __obj = js.Dynamic.literal()
    if (bytes != null) __obj.updateDynamic("bytes")(bytes.asInstanceOf[js.Any])
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (!js.isUndefined(help)) __obj.updateDynamic("help")(help)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(v)) __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[CatSegments]
  }
}

