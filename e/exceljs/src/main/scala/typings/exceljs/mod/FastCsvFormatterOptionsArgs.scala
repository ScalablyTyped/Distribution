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
  
  inline def apply(
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
  
  extension [Self <: FastCsvFormatterOptionsArgs](x: Self) {
    
    inline def setAlwaysWriteHeaders(value: Boolean): Self = StObject.set(x, "alwaysWriteHeaders", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIncludeEndRowDelimiter(value: Boolean): Self = StObject.set(x, "includeEndRowDelimiter", value.asInstanceOf[js.Any])
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteColumns(value: QuoteColumns): Self = StObject.set(x, "quoteColumns", value.asInstanceOf[js.Any])
    
    inline def setQuoteColumnsVarargs(value: Boolean*): Self = StObject.set(x, "quoteColumns", js.Array(value*))
    
    inline def setQuoteHeaders(value: QuoteColumns): Self = StObject.set(x, "quoteHeaders", value.asInstanceOf[js.Any])
    
    inline def setQuoteHeadersVarargs(value: Boolean*): Self = StObject.set(x, "quoteHeaders", js.Array(value*))
    
    inline def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: RowTransformFunction): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setWriteBOM(value: Boolean): Self = StObject.set(x, "writeBOM", value.asInstanceOf[js.Any])
  }
}
