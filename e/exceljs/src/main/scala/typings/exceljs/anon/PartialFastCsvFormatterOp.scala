package typings.exceljs.anon

import typings.exceljs.mod.QuoteColumns
import typings.exceljs.mod.RowTransformFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.FastCsvFormatterOptionsArgs> */
@js.native
trait PartialFastCsvFormatterOp extends StObject {
  
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
  implicit class PartialFastCsvFormatterOpMutableBuilder[Self <: PartialFastCsvFormatterOp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlwaysWriteHeaders(value: Boolean): Self = StObject.set(x, "alwaysWriteHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysWriteHeadersUndefined: Self = StObject.set(x, "alwaysWriteHeaders", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setEscape(value: String): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
    
    @scala.inline
    def setHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setIncludeEndRowDelimiter(value: Boolean): Self = StObject.set(x, "includeEndRowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeEndRowDelimiterUndefined: Self = StObject.set(x, "includeEndRowDelimiter", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setQuote(value: String | Boolean): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteColumns(value: QuoteColumns): Self = StObject.set(x, "quoteColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteColumnsUndefined: Self = StObject.set(x, "quoteColumns", js.undefined)
    
    @scala.inline
    def setQuoteColumnsVarargs(value: Boolean*): Self = StObject.set(x, "quoteColumns", js.Array(value :_*))
    
    @scala.inline
    def setQuoteHeaders(value: QuoteColumns): Self = StObject.set(x, "quoteHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteHeadersUndefined: Self = StObject.set(x, "quoteHeaders", js.undefined)
    
    @scala.inline
    def setQuoteHeadersVarargs(value: Boolean*): Self = StObject.set(x, "quoteHeaders", js.Array(value :_*))
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    @scala.inline
    def setRowDelimiter(value: String): Self = StObject.set(x, "rowDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowDelimiterUndefined: Self = StObject.set(x, "rowDelimiter", js.undefined)
    
    @scala.inline
    def setTransform(value: RowTransformFunction): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setWriteBOM(value: Boolean): Self = StObject.set(x, "writeBOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteBOMUndefined: Self = StObject.set(x, "writeBOM", js.undefined)
  }
}
