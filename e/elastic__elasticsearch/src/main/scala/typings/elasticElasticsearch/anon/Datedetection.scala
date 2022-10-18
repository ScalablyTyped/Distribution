package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDynamicMapping
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingDynamicTemplate
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingFieldNamesField
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingProperty
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRoutingField
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingSourceField
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.PropertyName
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Datedetection extends StObject {
  
  var _field_names: js.UndefOr[MappingFieldNamesField] = js.undefined
  
  var _meta: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var _routing: js.UndefOr[MappingRoutingField] = js.undefined
  
  var _source: js.UndefOr[MappingSourceField] = js.undefined
  
  var date_detection: js.UndefOr[Boolean] = js.undefined
  
  var dynamic: js.UndefOr[MappingDynamicMapping] = js.undefined
  
  var dynamic_date_formats: js.UndefOr[js.Array[String]] = js.undefined
  
  var dynamic_templates: js.UndefOr[
    (Record[String, MappingDynamicTemplate]) | (js.Array[Record[String, MappingDynamicTemplate]])
  ] = js.undefined
  
  var numeric_detection: js.UndefOr[Boolean] = js.undefined
  
  var properties: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
  
  var runtime: js.UndefOr[MappingRuntimeFields] = js.undefined
}
object Datedetection {
  
  inline def apply(): Datedetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Datedetection]
  }
  
  extension [Self <: Datedetection](x: Self) {
    
    inline def setDate_detection(value: Boolean): Self = StObject.set(x, "date_detection", value.asInstanceOf[js.Any])
    
    inline def setDate_detectionUndefined: Self = StObject.set(x, "date_detection", js.undefined)
    
    inline def setDynamic(value: MappingDynamicMapping): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
    
    inline def setDynamicUndefined: Self = StObject.set(x, "dynamic", js.undefined)
    
    inline def setDynamic_date_formats(value: js.Array[String]): Self = StObject.set(x, "dynamic_date_formats", value.asInstanceOf[js.Any])
    
    inline def setDynamic_date_formatsUndefined: Self = StObject.set(x, "dynamic_date_formats", js.undefined)
    
    inline def setDynamic_date_formatsVarargs(value: String*): Self = StObject.set(x, "dynamic_date_formats", js.Array(value*))
    
    inline def setDynamic_templates(
      value: (Record[String, MappingDynamicTemplate]) | (js.Array[Record[String, MappingDynamicTemplate]])
    ): Self = StObject.set(x, "dynamic_templates", value.asInstanceOf[js.Any])
    
    inline def setDynamic_templatesUndefined: Self = StObject.set(x, "dynamic_templates", js.undefined)
    
    inline def setDynamic_templatesVarargs(value: (Record[String, MappingDynamicTemplate])*): Self = StObject.set(x, "dynamic_templates", js.Array(value*))
    
    inline def setNumeric_detection(value: Boolean): Self = StObject.set(x, "numeric_detection", value.asInstanceOf[js.Any])
    
    inline def setNumeric_detectionUndefined: Self = StObject.set(x, "numeric_detection", js.undefined)
    
    inline def setProperties(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRuntime(value: MappingRuntimeFields): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def set_field_names(value: MappingFieldNamesField): Self = StObject.set(x, "_field_names", value.asInstanceOf[js.Any])
    
    inline def set_field_namesUndefined: Self = StObject.set(x, "_field_names", js.undefined)
    
    inline def set_meta(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
    
    inline def set_routing(value: MappingRoutingField): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_source(value: MappingSourceField): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
