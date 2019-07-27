package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CatSegments extends Generic {
  var bytes: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.b | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.k | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.kb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.m | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.mb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.g | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.t | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.tb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.p | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.pb
  ] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var h: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var help: js.UndefOr[scala.Boolean] = js.undefined
  var index: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var s: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var v: js.UndefOr[scala.Boolean] = js.undefined
}

object CatSegments {
  @scala.inline
  def apply(
    bytes: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.b | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.k | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.kb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.m | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.mb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.g | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.gb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.t | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.tb | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.p | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.pb = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    format: java.lang.String = null,
    h: java.lang.String | js.Array[java.lang.String] = null,
    help: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: java.lang.String | js.Array[java.lang.String] = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    s: java.lang.String | js.Array[java.lang.String] = null,
    source: java.lang.String = null,
    v: js.UndefOr[scala.Boolean] = js.undefined
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

