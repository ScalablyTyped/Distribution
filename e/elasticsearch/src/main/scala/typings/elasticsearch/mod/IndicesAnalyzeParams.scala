package typings.elasticsearch.mod

import typings.elasticsearch.elasticsearchStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesAnalyzeParams extends GenericParams {
  var analyzer: js.UndefOr[String] = js.undefined
  var attributes: js.UndefOr[NameList] = js.undefined
  var charFilter: js.UndefOr[NameList] = js.undefined
  var explain: js.UndefOr[Boolean] = js.undefined
  var field: js.UndefOr[String] = js.undefined
  var filter: js.UndefOr[NameList] = js.undefined
  var format: js.UndefOr[_empty] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var perferLocal: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[NameList] = js.undefined
  var tokenizer: js.UndefOr[String] = js.undefined
}

object IndicesAnalyzeParams {
  @scala.inline
  def apply(
    analyzer: String = null,
    attributes: NameList = null,
    body: js.Any = null,
    charFilter: NameList = null,
    explain: js.UndefOr[Boolean] = js.undefined,
    field: String = null,
    filter: NameList = null,
    filterPath: String | js.Array[String] = null,
    format: _empty = null,
    ignore: Double | js.Array[Double] = null,
    index: String = null,
    maxRetries: js.UndefOr[Double] = js.undefined,
    method: String = null,
    perferLocal: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: js.UndefOr[Double] = js.undefined,
    text: NameList = null,
    tokenizer: String = null
  ): IndicesAnalyzeParams = {
    val __obj = js.Dynamic.literal()
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (charFilter != null) __obj.updateDynamic("charFilter")(charFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain.get.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(perferLocal)) __obj.updateDynamic("perferLocal")(perferLocal.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestTimeout)) __obj.updateDynamic("requestTimeout")(requestTimeout.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tokenizer != null) __obj.updateDynamic("tokenizer")(tokenizer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesAnalyzeParams]
  }
}

