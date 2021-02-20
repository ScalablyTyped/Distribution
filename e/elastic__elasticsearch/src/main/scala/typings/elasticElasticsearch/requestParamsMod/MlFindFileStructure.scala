package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.delimited
import typings.elasticElasticsearch.elasticElasticsearchStrings.ndjson
import typings.elasticElasticsearch.elasticElasticsearchStrings.semi_structured_text
import typings.elasticElasticsearch.elasticElasticsearchStrings.xml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlFindFileStructure[T] extends Generic {
  
  var body: T = js.native
  
  var charset: js.UndefOr[String] = js.native
  
  var column_names: js.UndefOr[String | js.Array[String]] = js.native
  
  var delimiter: js.UndefOr[String] = js.native
  
  var explain: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[ndjson | xml | delimited | semi_structured_text] = js.native
  
  var grok_pattern: js.UndefOr[String] = js.native
  
  var has_header_row: js.UndefOr[Boolean] = js.native
  
  var line_merge_size_limit: js.UndefOr[Double] = js.native
  
  var lines_to_sample: js.UndefOr[Double] = js.native
  
  var quote: js.UndefOr[String] = js.native
  
  var should_trim_fields: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[String] = js.native
  
  var timestamp_field: js.UndefOr[String] = js.native
  
  var timestamp_format: js.UndefOr[String] = js.native
}
object MlFindFileStructure {
  
  @scala.inline
  def apply[T](body: T): MlFindFileStructure[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlFindFileStructure[T]]
  }
  
  @scala.inline
  implicit class MlFindFileStructureMutableBuilder[Self <: MlFindFileStructure[_], T] (val x: Self with MlFindFileStructure[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    @scala.inline
    def setColumn_names(value: String | js.Array[String]): Self = StObject.set(x, "column_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn_namesUndefined: Self = StObject.set(x, "column_names", js.undefined)
    
    @scala.inline
    def setColumn_namesVarargs(value: String*): Self = StObject.set(x, "column_names", js.Array(value :_*))
    
    @scala.inline
    def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = StObject.set(x, "explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplainUndefined: Self = StObject.set(x, "explain", js.undefined)
    
    @scala.inline
    def setFormat(value: ndjson | xml | delimited | semi_structured_text): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setGrok_pattern(value: String): Self = StObject.set(x, "grok_pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrok_patternUndefined: Self = StObject.set(x, "grok_pattern", js.undefined)
    
    @scala.inline
    def setHas_header_row(value: Boolean): Self = StObject.set(x, "has_header_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas_header_rowUndefined: Self = StObject.set(x, "has_header_row", js.undefined)
    
    @scala.inline
    def setLine_merge_size_limit(value: Double): Self = StObject.set(x, "line_merge_size_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine_merge_size_limitUndefined: Self = StObject.set(x, "line_merge_size_limit", js.undefined)
    
    @scala.inline
    def setLines_to_sample(value: Double): Self = StObject.set(x, "lines_to_sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines_to_sampleUndefined: Self = StObject.set(x, "lines_to_sample", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    @scala.inline
    def setShould_trim_fields(value: Boolean): Self = StObject.set(x, "should_trim_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShould_trim_fieldsUndefined: Self = StObject.set(x, "should_trim_fields", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTimestamp_field(value: String): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp_fieldUndefined: Self = StObject.set(x, "timestamp_field", js.undefined)
    
    @scala.inline
    def setTimestamp_format(value: String): Self = StObject.set(x, "timestamp_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp_formatUndefined: Self = StObject.set(x, "timestamp_format", js.undefined)
  }
}
