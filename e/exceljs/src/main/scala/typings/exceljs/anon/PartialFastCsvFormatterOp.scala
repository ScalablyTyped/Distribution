package typings.exceljs.anon

import typings.exceljs.mod.QuoteColumns
import typings.exceljs.mod.RowTransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.FastCsvFormatterOptionsArgs> */
trait PartialFastCsvFormatterOp extends StObject {
  
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
  
  var transform: js.UndefOr[RowTransformFunction] = js.undefined
  
  var writeBOM: js.UndefOr[Boolean] = js.undefined
}
object PartialFastCsvFormatterOp {
  
  inline def apply(): PartialFastCsvFormatterOp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFastCsvFormatterOp]
  }
  
  extension [Self <: PartialFastCsvFormatterOp](x: Self) {
    
    inline def setAlwaysWriteHeaders(value: Boolean): Self = StObject.set(x, "alwaysWriteHeaders", value.asInstanceOf[js.Any])
    
    inline def setAlwaysWriteHeadersUndefined: Self = StObject.set(x, "alwaysWriteHeaders", js.undefined)
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    inline def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setIncludeEndRowDelimiter(value: Boolean): Self = StObject.set(x, "includeEndRowDelimiter", value.asInstanceOf[js.Any])
    
    inline def setIncludeEndRowDelimiterUndefined: Self = StObject.set(x, "includeEndRowDelimiter", js.undefined)
    
    inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    inline def setQuote(value: String | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteColumns(value: QuoteColumns): Self = StObject.set(x, "quoteColumns", value.asInstanceOf[js.Any])
    
    inline def setQuoteColumnsUndefined: Self = StObject.set(x, "quoteColumns", js.undefined)
    
    inline def setQuoteColumnsVarargs(value: Boolean*): Self = StObject.set(x, "quoteColumns", js.Array(value :_*))
    
    inline def setQuoteHeaders(value: QuoteColumns): Self = StObject.set(x, "quoteHeaders", value.asInstanceOf[js.Any])
    
    inline def setQuoteHeadersUndefined: Self = StObject.set(x, "quoteHeaders", js.undefined)
    
    inline def setQuoteHeadersVarargs(value: Boolean*): Self = StObject.set(x, "quoteHeaders", js.Array(value :_*))
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
    
    inline def setTransform(value: RowTransformFunction): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    inline def setWriteBOM(value: Boolean): Self = StObject.set(x, "writeBOM", value.asInstanceOf[js.Any])
    
    inline def setWriteBOMUndefined: Self = StObject.set(x, "writeBOM", js.undefined)
  }
}
