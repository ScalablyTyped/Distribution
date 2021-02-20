package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastCsvParserOptionsArgs extends StObject {
  
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
  implicit class FastCsvParserOptionsArgsMutableBuilder[Self <: FastCsvParserOptionsArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiscardUnmappedColumns(value: Boolean): Self = StObject.set(x, "discardUnmappedColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    @scala.inline
    def setRenameHeaders(value: Boolean): Self = StObject.set(x, "renameHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipRows(value: Double): Self = StObject.set(x, "skipRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictColumnHandling(value: Boolean): Self = StObject.set(x, "strictColumnHandling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
  }
}
