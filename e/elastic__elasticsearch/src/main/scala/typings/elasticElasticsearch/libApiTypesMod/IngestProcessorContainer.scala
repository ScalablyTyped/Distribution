package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestProcessorContainer extends StObject {
  
  var append: js.UndefOr[IngestAppendProcessor] = js.undefined
  
  var attachment: js.UndefOr[IngestAttachmentProcessor] = js.undefined
  
  var bytes: js.UndefOr[IngestBytesProcessor] = js.undefined
  
  var circle: js.UndefOr[IngestCircleProcessor] = js.undefined
  
  var convert: js.UndefOr[IngestConvertProcessor] = js.undefined
  
  var csv: js.UndefOr[IngestCsvProcessor] = js.undefined
  
  var date: js.UndefOr[IngestDateProcessor] = js.undefined
  
  var date_index_name: js.UndefOr[IngestDateIndexNameProcessor] = js.undefined
  
  var dissect: js.UndefOr[IngestDissectProcessor] = js.undefined
  
  var dot_expander: js.UndefOr[IngestDotExpanderProcessor] = js.undefined
  
  var drop: js.UndefOr[IngestDropProcessor] = js.undefined
  
  var enrich: js.UndefOr[IngestEnrichProcessor] = js.undefined
  
  var fail: js.UndefOr[IngestFailProcessor] = js.undefined
  
  var foreach: js.UndefOr[IngestForeachProcessor] = js.undefined
  
  var geoip: js.UndefOr[IngestGeoIpProcessor] = js.undefined
  
  var grok: js.UndefOr[IngestGrokProcessor] = js.undefined
  
  var gsub: js.UndefOr[IngestGsubProcessor] = js.undefined
  
  var inference: js.UndefOr[IngestInferenceProcessor] = js.undefined
  
  var join: js.UndefOr[IngestJoinProcessor] = js.undefined
  
  var json: js.UndefOr[IngestJsonProcessor] = js.undefined
  
  var kv: js.UndefOr[IngestKeyValueProcessor] = js.undefined
  
  var lowercase: js.UndefOr[IngestLowercaseProcessor] = js.undefined
  
  var pipeline: js.UndefOr[IngestPipelineProcessor] = js.undefined
  
  var remove: js.UndefOr[IngestRemoveProcessor] = js.undefined
  
  var rename: js.UndefOr[IngestRenameProcessor] = js.undefined
  
  var script: js.UndefOr[Script] = js.undefined
  
  var set: js.UndefOr[IngestSetProcessor] = js.undefined
  
  var set_security_user: js.UndefOr[IngestSetSecurityUserProcessor] = js.undefined
  
  var sort: js.UndefOr[IngestSortProcessor] = js.undefined
  
  var split: js.UndefOr[IngestSplitProcessor] = js.undefined
  
  var trim: js.UndefOr[IngestTrimProcessor] = js.undefined
  
  var uppercase: js.UndefOr[IngestUppercaseProcessor] = js.undefined
  
  var urldecode: js.UndefOr[IngestUrlDecodeProcessor] = js.undefined
  
  var user_agent: js.UndefOr[IngestUserAgentProcessor] = js.undefined
}
object IngestProcessorContainer {
  
  inline def apply(): IngestProcessorContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestProcessorContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IngestProcessorContainer] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: IngestAppendProcessor): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
    
    inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
    
    inline def setAttachment(value: IngestAttachmentProcessor): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
    
    inline def setBytes(value: IngestBytesProcessor): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setCircle(value: IngestCircleProcessor): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    inline def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    inline def setConvert(value: IngestConvertProcessor): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setConvertUndefined: Self = StObject.set(x, "convert", js.undefined)
    
    inline def setCsv(value: IngestCsvProcessor): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
    
    inline def setDate(value: IngestDateProcessor): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setDate_index_name(value: IngestDateIndexNameProcessor): Self = StObject.set(x, "date_index_name", value.asInstanceOf[js.Any])
    
    inline def setDate_index_nameUndefined: Self = StObject.set(x, "date_index_name", js.undefined)
    
    inline def setDissect(value: IngestDissectProcessor): Self = StObject.set(x, "dissect", value.asInstanceOf[js.Any])
    
    inline def setDissectUndefined: Self = StObject.set(x, "dissect", js.undefined)
    
    inline def setDot_expander(value: IngestDotExpanderProcessor): Self = StObject.set(x, "dot_expander", value.asInstanceOf[js.Any])
    
    inline def setDot_expanderUndefined: Self = StObject.set(x, "dot_expander", js.undefined)
    
    inline def setDrop(value: IngestDropProcessor): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setEnrich(value: IngestEnrichProcessor): Self = StObject.set(x, "enrich", value.asInstanceOf[js.Any])
    
    inline def setEnrichUndefined: Self = StObject.set(x, "enrich", js.undefined)
    
    inline def setFail(value: IngestFailProcessor): Self = StObject.set(x, "fail", value.asInstanceOf[js.Any])
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setForeach(value: IngestForeachProcessor): Self = StObject.set(x, "foreach", value.asInstanceOf[js.Any])
    
    inline def setForeachUndefined: Self = StObject.set(x, "foreach", js.undefined)
    
    inline def setGeoip(value: IngestGeoIpProcessor): Self = StObject.set(x, "geoip", value.asInstanceOf[js.Any])
    
    inline def setGeoipUndefined: Self = StObject.set(x, "geoip", js.undefined)
    
    inline def setGrok(value: IngestGrokProcessor): Self = StObject.set(x, "grok", value.asInstanceOf[js.Any])
    
    inline def setGrokUndefined: Self = StObject.set(x, "grok", js.undefined)
    
    inline def setGsub(value: IngestGsubProcessor): Self = StObject.set(x, "gsub", value.asInstanceOf[js.Any])
    
    inline def setGsubUndefined: Self = StObject.set(x, "gsub", js.undefined)
    
    inline def setInference(value: IngestInferenceProcessor): Self = StObject.set(x, "inference", value.asInstanceOf[js.Any])
    
    inline def setInferenceUndefined: Self = StObject.set(x, "inference", js.undefined)
    
    inline def setJoin(value: IngestJoinProcessor): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setJson(value: IngestJsonProcessor): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setKv(value: IngestKeyValueProcessor): Self = StObject.set(x, "kv", value.asInstanceOf[js.Any])
    
    inline def setKvUndefined: Self = StObject.set(x, "kv", js.undefined)
    
    inline def setLowercase(value: IngestLowercaseProcessor): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
    
    inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
    
    inline def setPipeline(value: IngestPipelineProcessor): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setRemove(value: IngestRemoveProcessor): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRename(value: IngestRenameProcessor): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    inline def setRenameUndefined: Self = StObject.set(x, "rename", js.undefined)
    
    inline def setScript(value: Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSet(value: IngestSetProcessor): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    inline def setSet_security_user(value: IngestSetSecurityUserProcessor): Self = StObject.set(x, "set_security_user", value.asInstanceOf[js.Any])
    
    inline def setSet_security_userUndefined: Self = StObject.set(x, "set_security_user", js.undefined)
    
    inline def setSort(value: IngestSortProcessor): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSplit(value: IngestSplitProcessor): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setTrim(value: IngestTrimProcessor): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    inline def setUppercase(value: IngestUppercaseProcessor): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
    
    inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    
    inline def setUrldecode(value: IngestUrlDecodeProcessor): Self = StObject.set(x, "urldecode", value.asInstanceOf[js.Any])
    
    inline def setUrldecodeUndefined: Self = StObject.set(x, "urldecode", js.undefined)
    
    inline def setUser_agent(value: IngestUserAgentProcessor): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
    
    inline def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
  }
}
