package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastCsvParserOptionsArgs extends StObject {
  
  var comment: String
  
  var delimiter: String
  
  var discardUnmappedColumns: Boolean
  
  var encoding: String
  
  var escape: String
  
  var headers: Boolean | HeaderTransformFunction | HeaderArray
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], discardUnmappedColumns = discardUnmappedColumns.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ignoreEmpty = ignoreEmpty.asInstanceOf[js.Any], ltrim = ltrim.asInstanceOf[js.Any], maxRows = maxRows.asInstanceOf[js.Any], objectMode = objectMode.asInstanceOf[js.Any], renameHeaders = renameHeaders.asInstanceOf[js.Any], rtrim = rtrim.asInstanceOf[js.Any], skipLines = skipLines.asInstanceOf[js.Any], skipRows = skipRows.asInstanceOf[js.Any], strictColumnHandling = strictColumnHandling.asInstanceOf[js.Any], trim = trim.asInstanceOf[js.Any], quote = null)
    __obj.asInstanceOf[FastCsvParserOptionsArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastCsvParserOptionsArgs] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDiscardUnmappedColumns(value: Boolean): Self = StObject.set(x, "discardUnmappedColumns", value.asInstanceOf[js.Any])
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
    
    inline def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
    
    inline def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setRenameHeaders(value: Boolean): Self = StObject.set(x, "renameHeaders", value.asInstanceOf[js.Any])
    
    inline def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
    
    inline def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
    
    inline def setSkipRows(value: Double): Self = StObject.set(x, "skipRows", value.asInstanceOf[js.Any])
    
    inline def setStrictColumnHandling(value: Boolean): Self = StObject.set(x, "strictColumnHandling", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
  }
}
