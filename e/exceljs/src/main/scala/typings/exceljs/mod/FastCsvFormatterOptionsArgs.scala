package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastCsvFormatterOptionsArgs extends js.Object {
  var alwaysWriteHeaders: Boolean
  var delimiter: String
  var escape: String
  var headers: Null | Boolean | js.Array[String]
  var includeEndRowDelimiter: Boolean
  var objectMode: Boolean
  var quote: String | Boolean
  var quoteColumns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuoteColumns */ js.Any
  var quoteHeaders: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuoteColumns */ js.Any
  var rowDelimiter: String
  var transform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RowTransformFunction */ js.Any
  var writeBOM: Boolean
}

object FastCsvFormatterOptionsArgs {
  @scala.inline
  def apply(
    alwaysWriteHeaders: Boolean,
    delimiter: String,
    escape: String,
    includeEndRowDelimiter: Boolean,
    objectMode: Boolean,
    quote: String | Boolean,
    quoteColumns: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuoteColumns */ js.Any,
    quoteHeaders: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify QuoteColumns */ js.Any,
    rowDelimiter: String,
    transform: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RowTransformFunction */ js.Any,
    writeBOM: Boolean,
    headers: Boolean | js.Array[String] = null
  ): FastCsvFormatterOptionsArgs = {
    val __obj = js.Dynamic.literal(alwaysWriteHeaders = alwaysWriteHeaders.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], includeEndRowDelimiter = includeEndRowDelimiter.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], quoteColumns = quoteColumns.asInstanceOf[js.Any], quoteHeaders = quoteHeaders.asInstanceOf[js.Any], rowDelimiter = rowDelimiter.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], writeBOM = writeBOM.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastCsvFormatterOptionsArgs]
  }
}

