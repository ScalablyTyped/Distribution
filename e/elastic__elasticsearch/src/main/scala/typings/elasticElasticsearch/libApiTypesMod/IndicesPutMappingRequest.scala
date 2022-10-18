package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutMappingRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var _field_names: js.UndefOr[MappingFieldNamesField] = js.undefined
  
  var _meta: js.UndefOr[Metadata] = js.undefined
  
  var _routing: js.UndefOr[MappingRoutingField] = js.undefined
  
  var _source: js.UndefOr[MappingSourceField] = js.undefined
  
  var allow_no_indices: js.UndefOr[Boolean] = js.undefined
  
  var date_detection: js.UndefOr[Boolean] = js.undefined
  
  var dynamic: js.UndefOr[MappingDynamicMapping] = js.undefined
  
  var dynamic_date_formats: js.UndefOr[js.Array[String]] = js.undefined
  
  var dynamic_templates: js.UndefOr[
    (Record[String, MappingDynamicTemplate]) | (js.Array[Record[String, MappingDynamicTemplate]])
  ] = js.undefined
  
  var expand_wildcards: js.UndefOr[ExpandWildcards] = js.undefined
  
  var ignore_unavailable: js.UndefOr[Boolean] = js.undefined
  
  var index: Indices
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var numeric_detection: js.UndefOr[Boolean] = js.undefined
  
  var properties: js.UndefOr[Record[PropertyName, MappingProperty]] = js.undefined
  
  var runtime: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var write_index_only: js.UndefOr[Boolean] = js.undefined
}
object IndicesPutMappingRequest {
  
  inline def apply(index: Indices): IndicesPutMappingRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutMappingRequest]
  }
  
  extension [Self <: IndicesPutMappingRequest](x: Self) {
    
    inline def setAllow_no_indices(value: Boolean): Self = StObject.set(x, "allow_no_indices", value.asInstanceOf[js.Any])
    
    inline def setAllow_no_indicesUndefined: Self = StObject.set(x, "allow_no_indices", js.undefined)
    
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
    
    inline def setExpand_wildcards(value: ExpandWildcards): Self = StObject.set(x, "expand_wildcards", value.asInstanceOf[js.Any])
    
    inline def setExpand_wildcardsUndefined: Self = StObject.set(x, "expand_wildcards", js.undefined)
    
    inline def setExpand_wildcardsVarargs(value: ExpandWildcard*): Self = StObject.set(x, "expand_wildcards", js.Array(value*))
    
    inline def setIgnore_unavailable(value: Boolean): Self = StObject.set(x, "ignore_unavailable", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unavailableUndefined: Self = StObject.set(x, "ignore_unavailable", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setNumeric_detection(value: Boolean): Self = StObject.set(x, "numeric_detection", value.asInstanceOf[js.Any])
    
    inline def setNumeric_detectionUndefined: Self = StObject.set(x, "numeric_detection", js.undefined)
    
    inline def setProperties(value: Record[PropertyName, MappingProperty]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRuntime(value: MappingRuntimeFields): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWrite_index_only(value: Boolean): Self = StObject.set(x, "write_index_only", value.asInstanceOf[js.Any])
    
    inline def setWrite_index_onlyUndefined: Self = StObject.set(x, "write_index_only", js.undefined)
    
    inline def set_field_names(value: MappingFieldNamesField): Self = StObject.set(x, "_field_names", value.asInstanceOf[js.Any])
    
    inline def set_field_namesUndefined: Self = StObject.set(x, "_field_names", js.undefined)
    
    inline def set_meta(value: Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
    
    inline def set_routing(value: MappingRoutingField): Self = StObject.set(x, "_routing", value.asInstanceOf[js.Any])
    
    inline def set_routingUndefined: Self = StObject.set(x, "_routing", js.undefined)
    
    inline def set_source(value: MappingSourceField): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
  }
}
