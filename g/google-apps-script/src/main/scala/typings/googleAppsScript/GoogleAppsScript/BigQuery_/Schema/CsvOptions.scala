package typings.googleAppsScript.GoogleAppsScript.BigQuery_.Schema

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvOptions extends StObject {
  
  var allowJaggedRows: js.UndefOr[Boolean] = js.undefined
  
  var allowQuotedNewlines: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
  
  var fieldDelimiter: js.UndefOr[String] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
  
  var skipLeadingRows: js.UndefOr[String] = js.undefined
}
object CsvOptions {
  
  @scala.inline
  def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  
  @scala.inline
  implicit class CsvOptionsMutableBuilder[Self <: CsvOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowJaggedRows(value: Boolean): Self = StObject.set(x, "allowJaggedRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowJaggedRowsUndefined: Self = StObject.set(x, "allowJaggedRows", js.undefined)
    
    @scala.inline
    def setAllowQuotedNewlines(value: Boolean): Self = StObject.set(x, "allowQuotedNewlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowQuotedNewlinesUndefined: Self = StObject.set(x, "allowQuotedNewlines", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFieldDelimiter(value: String): Self = StObject.set(x, "fieldDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldDelimiterUndefined: Self = StObject.set(x, "fieldDelimiter", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    @scala.inline
    def setSkipLeadingRows(value: String): Self = StObject.set(x, "skipLeadingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipLeadingRowsUndefined: Self = StObject.set(x, "skipLeadingRows", js.undefined)
  }
}
