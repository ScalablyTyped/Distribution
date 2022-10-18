package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldCapsFieldCapability extends StObject {
  
  var aggregatable: Boolean
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var meta: js.UndefOr[Metadata] = js.undefined
  
  var metadata_field: js.UndefOr[Boolean] = js.undefined
  
  var metric_conflicts_indices: js.UndefOr[js.Array[IndexName]] = js.undefined
  
  var non_aggregatable_indices: js.UndefOr[Indices] = js.undefined
  
  var non_dimension_indices: js.UndefOr[js.Array[IndexName]] = js.undefined
  
  var non_searchable_indices: js.UndefOr[Indices] = js.undefined
  
  var searchable: Boolean
  
  var time_series_dimension: js.UndefOr[Boolean] = js.undefined
  
  var time_series_metric: js.UndefOr[MappingTimeSeriesMetricType] = js.undefined
  
  var `type`: String
}
object FieldCapsFieldCapability {
  
  inline def apply(aggregatable: Boolean, searchable: Boolean, `type`: String): FieldCapsFieldCapability = {
    val __obj = js.Dynamic.literal(aggregatable = aggregatable.asInstanceOf[js.Any], searchable = searchable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldCapsFieldCapability]
  }
  
  extension [Self <: FieldCapsFieldCapability](x: Self) {
    
    inline def setAggregatable(value: Boolean): Self = StObject.set(x, "aggregatable", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setMeta(value: Metadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setMetadata_field(value: Boolean): Self = StObject.set(x, "metadata_field", value.asInstanceOf[js.Any])
    
    inline def setMetadata_fieldUndefined: Self = StObject.set(x, "metadata_field", js.undefined)
    
    inline def setMetric_conflicts_indices(value: js.Array[IndexName]): Self = StObject.set(x, "metric_conflicts_indices", value.asInstanceOf[js.Any])
    
    inline def setMetric_conflicts_indicesUndefined: Self = StObject.set(x, "metric_conflicts_indices", js.undefined)
    
    inline def setMetric_conflicts_indicesVarargs(value: IndexName*): Self = StObject.set(x, "metric_conflicts_indices", js.Array(value*))
    
    inline def setNon_aggregatable_indices(value: Indices): Self = StObject.set(x, "non_aggregatable_indices", value.asInstanceOf[js.Any])
    
    inline def setNon_aggregatable_indicesUndefined: Self = StObject.set(x, "non_aggregatable_indices", js.undefined)
    
    inline def setNon_aggregatable_indicesVarargs(value: IndexName*): Self = StObject.set(x, "non_aggregatable_indices", js.Array(value*))
    
    inline def setNon_dimension_indices(value: js.Array[IndexName]): Self = StObject.set(x, "non_dimension_indices", value.asInstanceOf[js.Any])
    
    inline def setNon_dimension_indicesUndefined: Self = StObject.set(x, "non_dimension_indices", js.undefined)
    
    inline def setNon_dimension_indicesVarargs(value: IndexName*): Self = StObject.set(x, "non_dimension_indices", js.Array(value*))
    
    inline def setNon_searchable_indices(value: Indices): Self = StObject.set(x, "non_searchable_indices", value.asInstanceOf[js.Any])
    
    inline def setNon_searchable_indicesUndefined: Self = StObject.set(x, "non_searchable_indices", js.undefined)
    
    inline def setNon_searchable_indicesVarargs(value: IndexName*): Self = StObject.set(x, "non_searchable_indices", js.Array(value*))
    
    inline def setSearchable(value: Boolean): Self = StObject.set(x, "searchable", value.asInstanceOf[js.Any])
    
    inline def setTime_series_dimension(value: Boolean): Self = StObject.set(x, "time_series_dimension", value.asInstanceOf[js.Any])
    
    inline def setTime_series_dimensionUndefined: Self = StObject.set(x, "time_series_dimension", js.undefined)
    
    inline def setTime_series_metric(value: MappingTimeSeriesMetricType): Self = StObject.set(x, "time_series_metric", value.asInstanceOf[js.Any])
    
    inline def setTime_series_metricUndefined: Self = StObject.set(x, "time_series_metric", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
