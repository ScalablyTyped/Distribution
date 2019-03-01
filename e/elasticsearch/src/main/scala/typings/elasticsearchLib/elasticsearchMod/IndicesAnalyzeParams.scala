package typings
package elasticsearchLib.elasticsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndicesAnalyzeParams extends GenericParams {
  var analyzer: js.UndefOr[java.lang.String] = js.undefined
  var attributes: js.UndefOr[NameList] = js.undefined
  var charFilter: js.UndefOr[NameList] = js.undefined
  var explain: js.UndefOr[scala.Boolean] = js.undefined
  var field: js.UndefOr[java.lang.String] = js.undefined
  var filter: js.UndefOr[NameList] = js.undefined
  var format: js.UndefOr[elasticsearchLib.elasticsearchLibStrings.Empty] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var perferLocal: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[NameList] = js.undefined
  var tokenizer: js.UndefOr[java.lang.String] = js.undefined
}

object IndicesAnalyzeParams {
  @scala.inline
  def apply(
    analyzer: java.lang.String = null,
    attributes: NameList = null,
    body: js.Any = null,
    charFilter: NameList = null,
    explain: js.UndefOr[scala.Boolean] = js.undefined,
    field: java.lang.String = null,
    filter: NameList = null,
    filterPath: java.lang.String | js.Array[java.lang.String] = null,
    format: elasticsearchLib.elasticsearchLibStrings.Empty = null,
    ignore: scala.Double | js.Array[scala.Double] = null,
    index: java.lang.String = null,
    maxRetries: scala.Int | scala.Double = null,
    method: java.lang.String = null,
    perferLocal: js.UndefOr[scala.Boolean] = js.undefined,
    requestTimeout: scala.Int | scala.Double = null,
    text: NameList = null,
    tokenizer: java.lang.String = null
  ): IndicesAnalyzeParams = {
    val __obj = js.Dynamic.literal()
    if (analyzer != null) __obj.updateDynamic("analyzer")(analyzer)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body)
    if (charFilter != null) __obj.updateDynamic("charFilter")(charFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(explain)) __obj.updateDynamic("explain")(explain)
    if (field != null) __obj.updateDynamic("field")(field)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (filterPath != null) __obj.updateDynamic("filterPath")(filterPath.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (ignore != null) __obj.updateDynamic("ignore")(ignore.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(perferLocal)) __obj.updateDynamic("perferLocal")(perferLocal)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (tokenizer != null) __obj.updateDynamic("tokenizer")(tokenizer)
    __obj.asInstanceOf[IndicesAnalyzeParams]
  }
}

