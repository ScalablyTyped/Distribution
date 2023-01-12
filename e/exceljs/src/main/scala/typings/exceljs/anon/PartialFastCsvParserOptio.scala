package typings.exceljs.anon

import typings.exceljs.mod.HeaderArray
import typings.exceljs.mod.HeaderTransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.FastCsvParserOptionsArgs> */
trait PartialFastCsvParserOptio extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var discardUnmappedColumns: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var escape: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[Boolean | HeaderTransformFunction | HeaderArray] = js.undefined
  
  var ignoreEmpty: js.UndefOr[Boolean] = js.undefined
  
  var ltrim: js.UndefOr[Boolean] = js.undefined
  
  var maxRows: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var quote: js.UndefOr[String | Null] = js.undefined
  
  var renameHeaders: js.UndefOr[Boolean] = js.undefined
  
  var rtrim: js.UndefOr[Boolean] = js.undefined
  
  var skipLines: js.UndefOr[Double] = js.undefined
  
  var skipRows: js.UndefOr[Double] = js.undefined
  
  var strictColumnHandling: js.UndefOr[Boolean] = js.undefined
  
  var trim: js.UndefOr[Boolean] = js.undefined
}
object PartialFastCsvParserOptio {
  
  inline def apply(): PartialFastCsvParserOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFastCsvParserOptio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialFastCsvParserOptio] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setDiscardUnmappedColumns(value: Boolean): Self = StObject.set(x, "discardUnmappedColumns", value.asInstanceOf[js.Any])
    
    inline def setDiscardUnmappedColumnsUndefined: Self = StObject.set(x, "discardUnmappedColumns", js.undefined)
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setHeaders(value: Boolean | HeaderTransformFunction | HeaderArray): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersFunction1(value: /* headers */ HeaderArray => HeaderArray): Self = StObject.set(x, "headers", js.Any.fromFunction1(value))
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.UndefOr[String | Null])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIgnoreEmpty(value: Boolean): Self = StObject.set(x, "ignoreEmpty", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyUndefined: Self = StObject.set(x, "ignoreEmpty", js.undefined)
    
    inline def setLtrim(value: Boolean): Self = StObject.set(x, "ltrim", value.asInstanceOf[js.Any])
    
    inline def setLtrimUndefined: Self = StObject.set(x, "ltrim", js.undefined)
    
    inline def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
    
    inline def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteNull: Self = StObject.set(x, "quote", null)
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setRenameHeaders(value: Boolean): Self = StObject.set(x, "renameHeaders", value.asInstanceOf[js.Any])
    
    inline def setRenameHeadersUndefined: Self = StObject.set(x, "renameHeaders", js.undefined)
    
    inline def setRtrim(value: Boolean): Self = StObject.set(x, "rtrim", value.asInstanceOf[js.Any])
    
    inline def setRtrimUndefined: Self = StObject.set(x, "rtrim", js.undefined)
    
    inline def setSkipLines(value: Double): Self = StObject.set(x, "skipLines", value.asInstanceOf[js.Any])
    
    inline def setSkipLinesUndefined: Self = StObject.set(x, "skipLines", js.undefined)
    
    inline def setSkipRows(value: Double): Self = StObject.set(x, "skipRows", value.asInstanceOf[js.Any])
    
    inline def setSkipRowsUndefined: Self = StObject.set(x, "skipRows", js.undefined)
    
    inline def setStrictColumnHandling(value: Boolean): Self = StObject.set(x, "strictColumnHandling", value.asInstanceOf[js.Any])
    
    inline def setStrictColumnHandlingUndefined: Self = StObject.set(x, "strictColumnHandling", js.undefined)
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
