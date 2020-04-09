package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastCsvParserOptionsArgs extends js.Object {
  var comment: String
  var delimiter: String
  var discardUnmappedColumns: Boolean
  var encoding: String
  var escape: String
  var headers: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HeaderTransformFunction */ js.Any)
  var ignoreEmpty: Boolean
  var ltrim: Boolean
  var maxRows: Double
  var objectMode: Boolean
  var quote: String | Null
  var renameHeaders: Boolean
  var rtrim: Boolean
  var skipLines: Double
  var skipRows: Double
  var strictColumnHandling: Boolean
  var trim: Boolean
}

object FastCsvParserOptionsArgs {
  @scala.inline
  def apply(
    comment: String,
    delimiter: String,
    discardUnmappedColumns: Boolean,
    encoding: String,
    escape: String,
    headers: Boolean | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HeaderTransformFunction */ js.Any),
    ignoreEmpty: Boolean,
    ltrim: Boolean,
    maxRows: Double,
    objectMode: Boolean,
    renameHeaders: Boolean,
    rtrim: Boolean,
    skipLines: Double,
    skipRows: Double,
    strictColumnHandling: Boolean,
    trim: Boolean,
    quote: String = null
  ): FastCsvParserOptionsArgs = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], discardUnmappedColumns = discardUnmappedColumns.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignoreEmpty = ignoreEmpty.asInstanceOf[js.Any], ltrim = ltrim.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], renameHeaders = renameHeaders.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], skipLines = skipLines.asInstanceOf[js.Any], skipRows = skipRows.asInstanceOf[js.Any], strictColumnHandling = strictColumnHandling.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastCsvParserOptionsArgs]
  }
}

