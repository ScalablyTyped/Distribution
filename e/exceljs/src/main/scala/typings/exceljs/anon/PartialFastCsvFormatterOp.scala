package typings.exceljs.anon

import typings.exceljs.mod.QuoteColumns
import typings.exceljs.mod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<exceljs.exceljs.FastCsvFormatterOptionsArgs> */
@js.native
trait PartialFastCsvFormatterOp extends js.Object {
  var alwaysWriteHeaders: js.UndefOr[Boolean] = js.native
  var delimiter: js.UndefOr[String] = js.native
  var escape: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Null | Boolean | js.Array[String]] = js.native
  var includeEndRowDelimiter: js.UndefOr[Boolean] = js.native
  var objectMode: js.UndefOr[Boolean] = js.native
  var quote: js.UndefOr[String | Boolean] = js.native
  var quoteColumns: js.UndefOr[QuoteColumns] = js.native
  var quoteHeaders: js.UndefOr[QuoteColumns] = js.native
  var rowDelimiter: js.UndefOr[String] = js.native
  var transform: js.UndefOr[RowTransformFunction] = js.native
  var writeBOM: js.UndefOr[Boolean] = js.native
}

object PartialFastCsvFormatterOp {
  @scala.inline
  def apply(): PartialFastCsvFormatterOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFastCsvFormatterOp]
  }
  @scala.inline
  implicit class PartialFastCsvFormatterOpOps[Self <: PartialFastCsvFormatterOp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlwaysWriteHeaders(value: Boolean): Self = this.set("alwaysWriteHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlwaysWriteHeaders: Self = this.set("alwaysWriteHeaders", js.undefined)
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    @scala.inline
    def setHeadersVarargs(value: String*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: Boolean | js.Array[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeadersNull: Self = this.set("headers", null)
    @scala.inline
    def setIncludeEndRowDelimiter(value: Boolean): Self = this.set("includeEndRowDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeEndRowDelimiter: Self = this.set("includeEndRowDelimiter", js.undefined)
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
    @scala.inline
    def setQuote(value: String | Boolean): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    @scala.inline
    def setQuoteColumnsVarargs(value: Boolean*): Self = this.set("quoteColumns", js.Array(value :_*))
    @scala.inline
    def setQuoteColumns(value: QuoteColumns): Self = this.set("quoteColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteColumns: Self = this.set("quoteColumns", js.undefined)
    @scala.inline
    def setQuoteHeadersVarargs(value: Boolean*): Self = this.set("quoteHeaders", js.Array(value :_*))
    @scala.inline
    def setQuoteHeaders(value: QuoteColumns): Self = this.set("quoteHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteHeaders: Self = this.set("quoteHeaders", js.undefined)
    @scala.inline
    def setRowDelimiter(value: String): Self = this.set("rowDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDelimiter: Self = this.set("rowDelimiter", js.undefined)
    @scala.inline
    def setTransform(value: RowTransformFunction): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setWriteBOM(value: Boolean): Self = this.set("writeBOM", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriteBOM: Self = this.set("writeBOM", js.undefined)
  }
  
}

