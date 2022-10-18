package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesSimulateIndexTemplateRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var allow_auto_create: js.UndefOr[Boolean] = js.undefined
  
  var composed_of: js.UndefOr[js.Array[Name]] = js.undefined
  
  var create: js.UndefOr[Boolean] = js.undefined
  
  var data_stream: js.UndefOr[IndicesDataStreamVisibility] = js.undefined
  
  var index_patterns: js.UndefOr[Indices] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var priority: js.UndefOr[integer] = js.undefined
  
  var template: js.UndefOr[IndicesPutIndexTemplateIndexTemplateMapping] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IndicesSimulateIndexTemplateRequest {
  
  inline def apply(name: Name): IndicesSimulateIndexTemplateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesSimulateIndexTemplateRequest]
  }
  
  extension [Self <: IndicesSimulateIndexTemplateRequest](x: Self) {
    
    inline def setAllow_auto_create(value: Boolean): Self = StObject.set(x, "allow_auto_create", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_createUndefined: Self = StObject.set(x, "allow_auto_create", js.undefined)
    
    inline def setComposed_of(value: js.Array[Name]): Self = StObject.set(x, "composed_of", value.asInstanceOf[js.Any])
    
    inline def setComposed_ofUndefined: Self = StObject.set(x, "composed_of", js.undefined)
    
    inline def setComposed_ofVarargs(value: Name*): Self = StObject.set(x, "composed_of", js.Array(value*))
    
    inline def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
    
    inline def setData_stream(value: IndicesDataStreamVisibility): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setIndex_patterns(value: Indices): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsUndefined: Self = StObject.set(x, "index_patterns", js.undefined)
    
    inline def setIndex_patternsVarargs(value: IndexName*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTemplate(value: IndicesPutIndexTemplateIndexTemplateMapping): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
