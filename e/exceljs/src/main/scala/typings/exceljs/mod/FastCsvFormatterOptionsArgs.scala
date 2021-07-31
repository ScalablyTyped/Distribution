package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastCsvFormatterOptionsArgs extends StObject {
  
  var alwaysWriteHeaders: Boolean
  
  var delimiter: String
  
  var escape: String
  
  var headers: Null | Boolean | js.Array[String]
  
  var includeEndRowDelimiter: Boolean
  
  var objectMode: Boolean
  
  var quote: String | Boolean
  
  var quoteColumns: QuoteColumns
  
  var quoteHeaders: QuoteColumns
  
  var rowDelimiter: String
  
  def transform(row: Rows): Rows
  def transform(row: Rows, callback: RowTransformCallback): Unit
  @JSName("transform")
  var transform_Original: RowTransformFunction
  
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
    quoteColumns: QuoteColumns,
    quoteHeaders: QuoteColumns,
    rowDelimiter: String,
    transform: RowTransformFunction,
    writeBOM: Boolean
  ): FastCsvFormatterOptionsArgs = {
    val __obj = js.Dynamic.literal(alwaysWriteHeaders = alwaysWriteHeaders.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], includeEndRowDelimiter = includeEndRowDelimiter.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], quote = quote.asInstanceOf[js.Any], quoteColumns = quoteColumns.asInstanceOf[js.Any], quoteHeaders = quoteHeaders.asInstanceOf[js.Any], rowDelimiter = rowDelimiter.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], writeBOM = writeBOM.asInstanceOf[js.Any], headers = null)
    __obj.asInstanceOf[FastCsvFormatterOptionsArgs]
  }
  
  @scala.inline
  implicit class FastCsvFormatterOptionsArgsMutableBuilder[Self <: FastCsvFormatterOptionsArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysWriteHeaders(value: Boolean): Self = StObject.set(x, "alwaysWriteHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIncludeEndRowDelimiter(value: Boolean): Self = StObject.set(x, "includeEndRowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote(value: String | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteColumns(value: QuoteColumns): Self = StObject.set(x, "quoteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteColumnsVarargs(value: Boolean*): Self = StObject.set(x, "quoteColumns", js.Array(value :_*))
    
    @scala.inline
    def setQuoteHeaders(value: QuoteColumns): Self = StObject.set(x, "quoteHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteHeadersVarargs(value: Boolean*): Self = StObject.set(x, "quoteHeaders", js.Array(value :_*))
    
    @scala.inline
    def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: RowTransformFunction): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteBOM(value: Boolean): Self = StObject.set(x, "writeBOM", value.asInstanceOf[js.Any])
  }
}
