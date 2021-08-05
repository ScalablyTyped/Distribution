package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.delimited
import typings.elasticElasticsearch.elasticElasticsearchStrings.ndjson
import typings.elasticElasticsearch.elasticElasticsearchStrings.semi_structured_text
import typings.elasticElasticsearch.elasticElasticsearchStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlFindFileStructure[T]
  extends StObject
     with Generic {
  
  var body: T
  
  var charset: js.UndefOr[String] = js.undefined
  
  var column_names: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var explain: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[ndjson | xml | delimited | semi_structured_text] = js.undefined
  
  var grok_pattern: js.UndefOr[String] = js.undefined
  
  var has_header_row: js.UndefOr[Boolean] = js.undefined
  
  var line_merge_size_limit: js.UndefOr[Double] = js.undefined
  
  var lines_to_sample: js.UndefOr[Double] = js.undefined
  
  var quote: js.UndefOr[String] = js.undefined
  
  var should_trim_fields: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[String] = js.undefined
  
  var timestamp_field: js.UndefOr[String] = js.undefined
  
  var timestamp_format: js.UndefOr[String] = js.undefined
}
object MlFindFileStructure {
  
  inline def apply[T](body: T): MlFindFileStructure[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFindFileStructure[T]]
  }
  
  extension [Self <: MlFindFileStructure[?], T](x: Self & MlFindFileStructure[T]) {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setColumn_names(value: String | js.Array[String]): Self = StObject.set(x, "column_names", value.asInstanceOf[js.Any])
    
    inline def setColumn_namesUndefined: Self = StObject.set(x, "column_names", js.undefined)
    
    inline def setColumn_namesVarargs(value: String*): Self = StObject.set(x, "column_names", js.Array(value :_*))
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    inline def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    inline def setFormat(value: ndjson | xml | delimited | semi_structured_text): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGrok_pattern(value: String): Self = StObject.set(x, "grok_pattern", value.asInstanceOf[js.Any])
    
    inline def setGrok_patternUndefined: Self = StObject.set(x, "grok_pattern", js.undefined)
    
    inline def setHas_header_row(value: Boolean): Self = StObject.set(x, "has_header_row", value.asInstanceOf[js.Any])
    
    inline def setHas_header_rowUndefined: Self = StObject.set(x, "has_header_row", js.undefined)
    
    inline def setLine_merge_size_limit(value: Double): Self = StObject.set(x, "line_merge_size_limit", value.asInstanceOf[js.Any])
    
    inline def setLine_merge_size_limitUndefined: Self = StObject.set(x, "line_merge_size_limit", js.undefined)
    
    inline def setLines_to_sample(value: Double): Self = StObject.set(x, "lines_to_sample", value.asInstanceOf[js.Any])
    
    inline def setLines_to_sampleUndefined: Self = StObject.set(x, "lines_to_sample", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setShould_trim_fields(value: Boolean): Self = StObject.set(x, "should_trim_fields", value.asInstanceOf[js.Any])
    
    inline def setShould_trim_fieldsUndefined: Self = StObject.set(x, "should_trim_fields", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTimestamp_field(value: String): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_fieldUndefined: Self = StObject.set(x, "timestamp_field", js.undefined)
    
    inline def setTimestamp_format(value: String): Self = StObject.set(x, "timestamp_format", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_formatUndefined: Self = StObject.set(x, "timestamp_format", js.undefined)
  }
}
