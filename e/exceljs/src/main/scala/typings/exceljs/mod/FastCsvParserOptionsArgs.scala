package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastCsvParserOptionsArgs extends js.Object {
  var comment: String = js.native
  var delimiter: String = js.native
  var discardUnmappedColumns: Boolean = js.native
  var encoding: String = js.native
  var escape: String = js.native
  var headers: Boolean | HeaderTransformFunction | HeaderArray = js.native
  var ignoreEmpty: Boolean = js.native
  var ltrim: Boolean = js.native
  var maxRows: Double = js.native
  var objectMode: Boolean = js.native
  var quote: String | Null = js.native
  var renameHeaders: Boolean = js.native
  var rtrim: Boolean = js.native
  var skipLines: Double = js.native
  var skipRows: Double = js.native
  var strictColumnHandling: Boolean = js.native
  var trim: Boolean = js.native
}

object FastCsvParserOptionsArgs {
  @scala.inline
  def apply(
    comment: String,
    delimiter: String,
    discardUnmappedColumns: Boolean,
    encoding: String,
    escape: String,
    headers: Boolean | HeaderTransformFunction | HeaderArray,
    ignoreEmpty: Boolean,
    ltrim: Boolean,
    maxRows: Double,
    objectMode: Boolean,
    renameHeaders: Boolean,
    rtrim: Boolean,
    skipLines: Double,
    skipRows: Double,
    strictColumnHandling: Boolean,
    trim: Boolean
  ): FastCsvParserOptionsArgs = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], discardUnmappedColumns = discardUnmappedColumns.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignoreEmpty = ignoreEmpty.asInstanceOf[js.Any], ltrim = ltrim.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], renameHeaders = renameHeaders.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], skipLines = skipLines.asInstanceOf[js.Any], skipRows = skipRows.asInstanceOf[js.Any], strictColumnHandling = strictColumnHandling.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastCsvParserOptionsArgs]
  }
  @scala.inline
  implicit class FastCsvParserOptionsArgsOps[Self <: FastCsvParserOptionsArgs] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDiscardUnmappedColumns(value: Boolean): Self = this.set("discardUnmappedColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscape(value: String): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = this.set("headers", js.Any.fromFunction1(value))
    @scala.inline
    def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreEmpty(value: Boolean): Self = this.set("ignoreEmpty", value.asInstanceOf[js.Any])
    @scala.inline
    def setLtrim(value: Boolean): Self = this.set("ltrim", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectMode(value: Boolean): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenameHeaders(value: Boolean): Self = this.set("renameHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setRtrim(value: Boolean): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipLines(value: Double): Self = this.set("skipLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setSkipRows(value: Double): Self = this.set("skipRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrictColumnHandling(value: Boolean): Self = this.set("strictColumnHandling", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuoteNull: Self = this.set("quote", null)
  }
  
}

