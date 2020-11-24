package typings.elasticElasticsearch.requestParamsMod

import typings.elasticElasticsearch.elasticElasticsearchStrings.delimited
import typings.elasticElasticsearch.elasticElasticsearchStrings.ndjson
import typings.elasticElasticsearch.elasticElasticsearchStrings.semi_structured_text
import typings.elasticElasticsearch.elasticElasticsearchStrings.xml
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
  implicit class MlFindFileStructureOps[Self <: MlFindFileStructure[_], T] (val x: Self with MlFindFileStructure[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: T): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharset: Self = this.set("charset", js.undefined)
    
    @scala.inline
    def setColumn_namesVarargs(value: String*): Self = this.set("column_names", js.Array(value :_*))
    
    @scala.inline
    def setColumn_names(value: String | js.Array[String]): Self = this.set("column_names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn_names: Self = this.set("column_names", js.undefined)
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setExplain(value: Boolean): Self = this.set("explain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplain: Self = this.set("explain", js.undefined)
    
    @scala.inline
    def setFormat(value: ndjson | xml | delimited | semi_structured_text): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setGrok_pattern(value: String): Self = this.set("grok_pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrok_pattern: Self = this.set("grok_pattern", js.undefined)
    
    @scala.inline
    def setHas_header_row(value: Boolean): Self = this.set("has_header_row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHas_header_row: Self = this.set("has_header_row", js.undefined)
    
    @scala.inline
    def setLine_merge_size_limit(value: Double): Self = this.set("line_merge_size_limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine_merge_size_limit: Self = this.set("line_merge_size_limit", js.undefined)
    
    @scala.inline
    def setLines_to_sample(value: Double): Self = this.set("lines_to_sample", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLines_to_sample: Self = this.set("lines_to_sample", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = this.set("quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuote: Self = this.set("quote", js.undefined)
    
    @scala.inline
    def setShould_trim_fields(value: Boolean): Self = this.set("should_trim_fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShould_trim_fields: Self = this.set("should_trim_fields", js.undefined)
    
    @scala.inline
    def setTimeout(value: String): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTimestamp_field(value: String): Self = this.set("timestamp_field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp_field: Self = this.set("timestamp_field", js.undefined)
    
    @scala.inline
    def setTimestamp_format(value: String): Self = this.set("timestamp_format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp_format: Self = this.set("timestamp_format", js.undefined)
  }
}
