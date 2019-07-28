package typings.atElasticElasticsearch.apiRequestParamsMod

import typings.atElasticElasticsearch.atElasticElasticsearchStrings.delimited
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.ndjson
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.semi_structured_text
import typings.atElasticElasticsearch.atElasticElasticsearchStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MlFindFileStructure[T] extends Generic {
  var body: T
  var charset: js.UndefOr[String] = js.undefined
  var column_names: js.UndefOr[String | js.Array[String]] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var format: js.UndefOr[ndjson | xml | delimited | semi_structured_text] = js.undefined
  var grok_pattern: js.UndefOr[String] = js.undefined
  var has_header_row: js.UndefOr[Boolean] = js.undefined
  var lines_to_sample: js.UndefOr[Double] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
  var should_trim_fields: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[String] = js.undefined
  var timestamp_field: js.UndefOr[String] = js.undefined
  var timestamp_format: js.UndefOr[String] = js.undefined
}

object MlFindFileStructure {
  @scala.inline
  def apply[T](
    body: T,
    charset: String = null,
    column_names: String | js.Array[String] = null,
    delimiter: String = null,
    error_trace: js.UndefOr[Boolean] = js.undefined,
    explain: js.UndefOr[Boolean] = js.undefined,
    filter_path: String | js.Array[String] = null,
    format: ndjson | xml | delimited | semi_structured_text = null,
    grok_pattern: String = null,
    has_header_row: js.UndefOr[Boolean] = js.undefined,
    human: js.UndefOr[Boolean] = js.undefined,
    ignore: Double | js.Array[Double] = null,
    lines_to_sample: Int | Double = null,
    method: String = null,
    pretty: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    should_trim_fields: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    timeout: String = null,
    timestamp_field: String = null,
    timestamp_format: String = null
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

