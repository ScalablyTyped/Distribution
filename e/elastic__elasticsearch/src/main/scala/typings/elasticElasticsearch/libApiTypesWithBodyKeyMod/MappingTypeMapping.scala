package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingTypeMapping extends StObject {
  
  var _data_stream_timestamp: js.UndefOr[MappingDataStreamTimestamp] = js.undefined
  
  var _field_names: js.UndefOr[MappingFieldNamesField] = js.undefined
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var _routing: js.UndefOr[MappingRoutingField] = js.undefined
  
  var _size: js.UndefOr[MappingSizeField] = js.undefined
  
  var _source: js.UndefOr[MappingSourceField] = js.undefined
  
  var all_field: js.UndefOr[MappingAllField] = js.undefined
  
  var date_detection: js.UndefOr[Boolean] = js.undefined
  
  var dynamic: js.UndefOr[MappingDynamicMapping] = js.undefined
  
  var dynamic_date_formats: js.UndefOr[js.Array[String]] = js.undefined
  
  var dynamic_templates: js.UndefOr[
    (Record[String, MappingDynamicTemplate]) | (js.Array[Record[String, MappingDynamicTemplate]])
  ] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var index_field: js.UndefOr[MappingIndexField] = js.undefined
  
  var numeric_detection: js.UndefOr[Boolean] = js.undefined
  
  var properties: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
  
  var runtime: js.UndefOr[Record[String, MappingRuntimeField]] = js.undefined
}
object MappingTypeMapping {
  
  inline def apply(): MappingTypeMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MappingTypeMapping]
  }
  
  extension [Self <: MappingTypeMapping](x: Self) {
    
    inline def setAll_field(value: MappingAllField): Self = StObject.set(x, "all_field", value.asInstanceOf[js.Any])
    
    inline def setAll_fieldUndefined: Self = StObject.set(x, "all_field", js.undefined)
    
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
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setIndex_field(value: MappingIndexField): Self = StObject.set(x, "index_field", value.asInstanceOf[js.Any])
    
    inline def setIndex_fieldUndefined: Self = StObject.set(x, "index_field", js.undefined)
    
    inline def setNumeric_detection(value: Boolean): Self = StObject.set(x, "numeric_detection", value.asInstanceOf[js.Any])
    
    inline def setNumeric_detectionUndefined: Self = StObject.set(x, "numeric_detection", js.undefined)
    
    inline def setProperties(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRuntime(value: Record[String, MappingRuntimeField]): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def set_data_stream_timestamp(value: MappingDataStreamTimestamp): Self = StObject.set(x, "_data_stream_timestamp", value.asInstanceOf[js.Any])
    
    inline def set_data_stream_timestampUndefined: Self = StObject.set(x, "_data_stream_timestamp", js.undefined)
    
    inline def set_field_names(value: MappingFieldNamesField): Self = StObject.set(x, "_field_names", value.asInstanceOf[js.Any])
    
    inline def set_field_namesUndefined: Self = StObject.set(x, "_field_names", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
    
    inline def set_routing(value: MappingRoutingField): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_size(value: MappingSizeField): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    
    inline def set_sizeUndefined: Self = StObject.set(x, "_size", js.undefined)
    
    inline def set_source(value: MappingSourceField): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
