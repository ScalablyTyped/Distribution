package typings.fastCsvFormat.formatterOptionsMod

import typings.fastCsvFormat.typesMod.Row
import typings.fastCsvFormat.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterOptionsArgs[I /* <: Row */, O /* <: Row */] extends js.Object {
  var alwaysWriteHeaders: js.UndefOr[Boolean] = js.undefined
  var delimiter: js.UndefOr[String] = js.undefined
  var escape: js.UndefOr[String] = js.undefined
  var headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.undefined
  var includeEndRowDelimiter: js.UndefOr[Boolean] = js.undefined
  var objectMode: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String | Boolean] = js.undefined
  var quoteColumns: js.UndefOr[QuoteColumns] = js.undefined
  var quoteHeaders: js.UndefOr[QuoteColumns] = js.undefined
  var rowDelimiter: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[RowTransformFunction[I, O]] = js.undefined
  var writeBOM: js.UndefOr[Boolean] = js.undefined
  var writeHeaders: js.UndefOr[Boolean] = js.undefined
}

object FormatterOptionsArgs {
  @scala.inline
  def apply[/* <: typings.fastCsvFormat.typesMod.Row */ I, /* <: typings.fastCsvFormat.typesMod.Row */ O](
    alwaysWriteHeaders: js.UndefOr[Boolean] = js.undefined,
    delimiter: String = null,
    escape: String = null,
    headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.undefined,
    includeEndRowDelimiter: js.UndefOr[Boolean] = js.undefined,
    objectMode: js.UndefOr[Boolean] = js.undefined,
    quote: String | Boolean = null,
    quoteColumns: QuoteColumns = null,
    quoteHeaders: QuoteColumns = null,
    rowDelimiter: String = null,
    transform: RowTransformFunction[I, O] = null,
    writeBOM: js.UndefOr[Boolean] = js.undefined,
    writeHeaders: js.UndefOr[Boolean] = js.undefined
  ): FormatterOptionsArgs[I, O] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alwaysWriteHeaders)) __obj.updateDynamic("alwaysWriteHeaders")(alwaysWriteHeaders.get.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (escape != null) __obj.updateDynamic("escape")(escape.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(includeEndRowDelimiter)) __obj.updateDynamic("includeEndRowDelimiter")(includeEndRowDelimiter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(objectMode)) __obj.updateDynamic("objectMode")(objectMode.get.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (quoteColumns != null) __obj.updateDynamic("quoteColumns")(quoteColumns.asInstanceOf[js.Any])
    if (quoteHeaders != null) __obj.updateDynamic("quoteHeaders")(quoteHeaders.asInstanceOf[js.Any])
    if (rowDelimiter != null) __obj.updateDynamic("rowDelimiter")(rowDelimiter.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(writeBOM)) __obj.updateDynamic("writeBOM")(writeBOM.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writeHeaders)) __obj.updateDynamic("writeHeaders")(writeHeaders.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatterOptionsArgs[I, O]]
  }
}

