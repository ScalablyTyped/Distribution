package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexTemplate extends StObject {
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var allow_auto_create: js.UndefOr[Boolean] = js.undefined
  
  var composed_of: js.Array[Name]
  
  var data_stream: js.UndefOr[IndicesIndexTemplateDataStreamConfiguration] = js.undefined
  
  var index_patterns: Names
  
  var priority: js.UndefOr[long] = js.undefined
  
  var template: js.UndefOr[IndicesIndexTemplateSummary] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object IndicesIndexTemplate {
  
  inline def apply(composed_of: js.Array[Name], index_patterns: Names): IndicesIndexTemplate = {
    val __obj = js.Dynamic.literal(composed_of = composed_of.asInstanceOf[js.Any], index_patterns = index_patterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesIndexTemplate]
  }
  
  extension [Self <: IndicesIndexTemplate](x: Self) {
    
    inline def setAllow_auto_create(value: Boolean): Self = StObject.set(x, "allow_auto_create", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_createUndefined: Self = StObject.set(x, "allow_auto_create", js.undefined)
    
    inline def setComposed_of(value: js.Array[Name]): Self = StObject.set(x, "composed_of", value.asInstanceOf[js.Any])
    
    inline def setComposed_ofVarargs(value: Name*): Self = StObject.set(x, "composed_of", js.Array(value*))
    
    inline def setData_stream(value: IndicesIndexTemplateDataStreamConfiguration): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setIndex_patterns(value: Names): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsVarargs(value: Name*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setPriority(value: long): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTemplate(value: IndicesIndexTemplateSummary): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
