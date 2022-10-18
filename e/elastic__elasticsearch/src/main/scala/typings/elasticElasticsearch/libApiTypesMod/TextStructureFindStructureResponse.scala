package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStructureFindStructureResponse extends StObject {
  
  var charset: String
  
  var column_names: js.UndefOr[js.Array[String]] = js.undefined
  
  var delimiter: js.UndefOr[String] = js.undefined
  
  var exclude_lines_pattern: js.UndefOr[String] = js.undefined
  
  var explanation: js.UndefOr[js.Array[String]] = js.undefined
  
  var field_stats: Record[Field, TextStructureFindStructureFieldStat]
  
  var format: String
  
  var grok_pattern: js.UndefOr[String] = js.undefined
  
  var has_byte_order_marker: Boolean
  
  var has_header_row: js.UndefOr[Boolean] = js.undefined
  
  var ingest_pipeline: IngestPipelineConfig
  
  var java_timestamp_formats: js.UndefOr[js.Array[String]] = js.undefined
  
  var joda_timestamp_formats: js.UndefOr[js.Array[String]] = js.undefined
  
  var mappings: MappingTypeMapping
  
  var multiline_start_pattern: js.UndefOr[String] = js.undefined
  
  var need_client_timezone: Boolean
  
  var num_lines_analyzed: integer
  
  var num_messages_analyzed: integer
  
  var quote: js.UndefOr[String] = js.undefined
  
  var sample_start: String
  
  var should_trim_fields: js.UndefOr[Boolean] = js.undefined
  
  var timestamp_field: js.UndefOr[Field] = js.undefined
}
object TextStructureFindStructureResponse {
  
  inline def apply(
    charset: String,
    field_stats: Record[Field, TextStructureFindStructureFieldStat],
    format: String,
    has_byte_order_marker: Boolean,
    ingest_pipeline: IngestPipelineConfig,
    mappings: MappingTypeMapping,
    need_client_timezone: Boolean,
    num_lines_analyzed: integer,
    num_messages_analyzed: integer,
    sample_start: String
  ): TextStructureFindStructureResponse = {
    val __obj = js.Dynamic.literal(charset = charset.asInstanceOf[js.Any], field_stats = field_stats.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], has_byte_order_marker = has_byte_order_marker.asInstanceOf[js.Any], ingest_pipeline = ingest_pipeline.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], need_client_timezone = need_client_timezone.asInstanceOf[js.Any], num_lines_analyzed = num_lines_analyzed.asInstanceOf[js.Any], num_messages_analyzed = num_messages_analyzed.asInstanceOf[js.Any], sample_start = sample_start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStructureFindStructureResponse]
  }
  
  extension [Self <: TextStructureFindStructureResponse](x: Self) {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setColumn_names(value: js.Array[String]): Self = StObject.set(x, "column_names", value.asInstanceOf[js.Any])
    
    inline def setColumn_namesUndefined: Self = StObject.set(x, "column_names", js.undefined)
    
    inline def setColumn_namesVarargs(value: String*): Self = StObject.set(x, "column_names", js.Array(value*))
    
    inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
    
    inline def setExclude_lines_pattern(value: String): Self = StObject.set(x, "exclude_lines_pattern", value.asInstanceOf[js.Any])
    
    inline def setExclude_lines_patternUndefined: Self = StObject.set(x, "exclude_lines_pattern", js.undefined)
    
    inline def setExplanation(value: js.Array[String]): Self = StObject.set(x, "explanation", value.asInstanceOf[js.Any])
    
    inline def setExplanationUndefined: Self = StObject.set(x, "explanation", js.undefined)
    
    inline def setExplanationVarargs(value: String*): Self = StObject.set(x, "explanation", js.Array(value*))
    
    inline def setField_stats(value: Record[Field, TextStructureFindStructureFieldStat]): Self = StObject.set(x, "field_stats", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGrok_pattern(value: String): Self = StObject.set(x, "grok_pattern", value.asInstanceOf[js.Any])
    
    inline def setGrok_patternUndefined: Self = StObject.set(x, "grok_pattern", js.undefined)
    
    inline def setHas_byte_order_marker(value: Boolean): Self = StObject.set(x, "has_byte_order_marker", value.asInstanceOf[js.Any])
    
    inline def setHas_header_row(value: Boolean): Self = StObject.set(x, "has_header_row", value.asInstanceOf[js.Any])
    
    inline def setHas_header_rowUndefined: Self = StObject.set(x, "has_header_row", js.undefined)
    
    inline def setIngest_pipeline(value: IngestPipelineConfig): Self = StObject.set(x, "ingest_pipeline", value.asInstanceOf[js.Any])
    
    inline def setJava_timestamp_formats(value: js.Array[String]): Self = StObject.set(x, "java_timestamp_formats", value.asInstanceOf[js.Any])
    
    inline def setJava_timestamp_formatsUndefined: Self = StObject.set(x, "java_timestamp_formats", js.undefined)
    
    inline def setJava_timestamp_formatsVarargs(value: String*): Self = StObject.set(x, "java_timestamp_formats", js.Array(value*))
    
    inline def setJoda_timestamp_formats(value: js.Array[String]): Self = StObject.set(x, "joda_timestamp_formats", value.asInstanceOf[js.Any])
    
    inline def setJoda_timestamp_formatsUndefined: Self = StObject.set(x, "joda_timestamp_formats", js.undefined)
    
    inline def setJoda_timestamp_formatsVarargs(value: String*): Self = StObject.set(x, "joda_timestamp_formats", js.Array(value*))
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMultiline_start_pattern(value: String): Self = StObject.set(x, "multiline_start_pattern", value.asInstanceOf[js.Any])
    
    inline def setMultiline_start_patternUndefined: Self = StObject.set(x, "multiline_start_pattern", js.undefined)
    
    inline def setNeed_client_timezone(value: Boolean): Self = StObject.set(x, "need_client_timezone", value.asInstanceOf[js.Any])
    
    inline def setNum_lines_analyzed(value: integer): Self = StObject.set(x, "num_lines_analyzed", value.asInstanceOf[js.Any])
    
    inline def setNum_messages_analyzed(value: integer): Self = StObject.set(x, "num_messages_analyzed", value.asInstanceOf[js.Any])
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
    
    inline def setSample_start(value: String): Self = StObject.set(x, "sample_start", value.asInstanceOf[js.Any])
    
    inline def setShould_trim_fields(value: Boolean): Self = StObject.set(x, "should_trim_fields", value.asInstanceOf[js.Any])
    
    inline def setShould_trim_fieldsUndefined: Self = StObject.set(x, "should_trim_fields", js.undefined)
    
    inline def setTimestamp_field(value: Field): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_fieldUndefined: Self = StObject.set(x, "timestamp_field", js.undefined)
  }
}
