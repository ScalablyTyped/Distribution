package typings.fastDashCsv.buildSrcFormatterFormatterOptionsMod

import typings.fastDashCsv.buildSrcFormatterTypesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptionsArgs extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.undefined
  var includeEndRowDelimiter: js.UndefOr[Boolean] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String | Boolean] = js.undefined
  var quoteColumns: js.UndefOr[QuoteColumns] = js.undefined
  var quoteHeaders: js.UndefOr[QuoteColumns] = js.undefined
  var rowDelimiter: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[RowTransformFunction] = js.undefined
  var writeBOM: js.UndefOr[Boolean] = js.undefined
}

object FormatterOptionsArgs {
  @scala.inline
  def apply(
    delimiter: String = null,
    escape: String = null,
    headers: Boolean | js.Array[String] = null,
    includeEndRowDelimiter: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    quote: String | Boolean = null,
    quoteColumns: QuoteColumns = null,
    quoteHeaders: QuoteColumns = null,
    rowDelimiter: String = null,
    transform: RowTransformFunction = null,
    writeBOM: js.UndefOr[Boolean] = js.undefined
  ): FormatterOptionsArgs = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEndRowDelimiter)) __obj.updateDynamic("includeEndRowDelimiter")(includeEndRowDelimiter.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (quoteColumns != null) __obj.updateDynamic("quoteColumns")(quoteColumns.asInstanceOf[js.Any])
    if (quoteHeaders != null) __obj.updateDynamic("quoteHeaders")(quoteHeaders.asInstanceOf[js.Any])
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writeBOM)) __obj.updateDynamic("writeBOM")(writeBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterOptionsArgs]
  }
}

