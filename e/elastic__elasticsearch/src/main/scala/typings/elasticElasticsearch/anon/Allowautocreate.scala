package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesDataStreamVisibility
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesPutIndexTemplateIndexTemplateMapping
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.VersionNumber
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowautocreate extends StObject {
  
  var _meta: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var allow_auto_create: js.UndefOr[Boolean] = js.undefined
  
  var composed_of: js.UndefOr[js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name]] = js.undefined
  
  var data_stream: js.UndefOr[IndicesDataStreamVisibility] = js.undefined
  
  var index_patterns: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices] = js.undefined
  
  var priority: js.UndefOr[integer] = js.undefined
  
  var template: js.UndefOr[IndicesPutIndexTemplateIndexTemplateMapping] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Allowautocreate {
  
  inline def apply(): Allowautocreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allowautocreate]
  }
  
  extension [Self <: Allowautocreate](x: Self) {
    
    inline def setAllow_auto_create(value: Boolean): Self = StObject.set(x, "allow_auto_create", value.asInstanceOf[js.Any])
    
    inline def setAllow_auto_createUndefined: Self = StObject.set(x, "allow_auto_create", js.undefined)
    
    inline def setComposed_of(value: js.Array[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name]): Self = StObject.set(x, "composed_of", value.asInstanceOf[js.Any])
    
    inline def setComposed_ofUndefined: Self = StObject.set(x, "composed_of", js.undefined)
    
    inline def setComposed_ofVarargs(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name*): Self = StObject.set(x, "composed_of", js.Array(value*))
    
    inline def setData_stream(value: IndicesDataStreamVisibility): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setIndex_patterns(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsUndefined: Self = StObject.set(x, "index_patterns", js.undefined)
    
    inline def setIndex_patternsVarargs(value: IndexName*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setPriority(value: integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTemplate(value: IndicesPutIndexTemplateIndexTemplateMapping): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
