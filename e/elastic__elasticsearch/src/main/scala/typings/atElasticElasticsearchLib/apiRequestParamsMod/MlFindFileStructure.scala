package typings
package atElasticElasticsearchLib.apiRequestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlFindFileStructure[T] extends Generic {
  var body: T
  var charset: js.UndefOr[java.lang.String] = js.undefined
  var column_names: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[
    atElasticElasticsearchLib.atElasticElasticsearchLibStrings.ndjson | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.xml | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.delimited | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.semi_structured_text
  ] = js.undefined
  var grok_pattern: js.UndefOr[java.lang.String] = js.undefined
  var has_header_row: js.UndefOr[scala.Boolean] = js.undefined
  var lines_to_sample: js.UndefOr[scala.Double] = js.undefined
  var quote: js.UndefOr[java.lang.String] = js.undefined
  var should_trim_fields: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[java.lang.String] = js.undefined
  var timestamp_field: js.UndefOr[java.lang.String] = js.undefined
  var timestamp_format: js.UndefOr[java.lang.String] = js.undefined
}

object MlFindFileStructure {
  @scala.inline
  def apply[T](
    body: T,
    charset: java.lang.String = null,
    column_names: java.lang.String | js.Array[java.lang.String] = null,
    delimiter: java.lang.String = null,
    error_trace: js.UndefOr[scala.Boolean] = js.undefined,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    filter_path: java.lang.String | js.Array[java.lang.String] = null,
    format: atElasticElasticsearchLib.atElasticElasticsearchLibStrings.ndjson | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.xml | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.delimited | atElasticElasticsearchLib.atElasticElasticsearchLibStrings.semi_structured_text = null,
    grok_pattern: java.lang.String = null,
    has_header_row: js.UndefOr[scala.Boolean] = js.undefined,
    human: js.UndefOr[scala.Boolean] = js.undefined,
    ignore: scala.Double | js.Array[scala.Double] = null,
    lines_to_sample: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    quote: java.lang.String = null,
    should_trim_fields: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    timeout: java.lang.String = null,
    timestamp_field: java.lang.String = null,
    timestamp_format: java.lang.String = null
  ): MlFindFileStructure[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (column_names != null) __obj.updateDynamic("column_names")(column_names.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (!js.isUndefined(error_trace)) __obj.updateDynamic("error_trace")(error_trace)
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (filter_path != null) __obj.updateDynamic("filter_path")(filter_path.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (grok_pattern != null) __obj.updateDynamic("grok_pattern")(grok_pattern)
    if (!js.isUndefined(has_header_row)) __obj.updateDynamic("has_header_row")(has_header_row)
    if (!js.isUndefined(human)) __obj.updateDynamic("human")(human)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (lines_to_sample != null) __obj.updateDynamic("lines_to_sample")(lines_to_sample.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    if (!js.isUndefined(should_trim_fields)) __obj.updateDynamic("should_trim_fields")(should_trim_fields)
    if (source != null) __obj.updateDynamic("source")(source)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout)
    if (timestamp_field != null) __obj.updateDynamic("timestamp_field")(timestamp_field)
    if (timestamp_format != null) __obj.updateDynamic("timestamp_format")(timestamp_format)
    __obj.asInstanceOf[MlFindFileStructure[T]]
  }
}

