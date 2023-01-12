package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterIndices extends StObject {
  
  var analysis: ClusterStatsCharFilterTypes
  
  var completion: CompletionStats
  
  var count: long
  
  var docs: DocStats
  
  var fielddata: FielddataStats
  
  var mappings: ClusterStatsFieldTypesMappings
  
  var query_cache: QueryCacheStats
  
  var segments: SegmentsStats
  
  var shards: ClusterStatsClusterIndicesShards
  
  var store: StoreStats
  
  var versions: js.UndefOr[js.Array[ClusterStatsIndicesVersions]] = js.undefined
}
object ClusterStatsClusterIndices {
  
  inline def apply(
    analysis: ClusterStatsCharFilterTypes,
    completion: CompletionStats,
    count: long,
    docs: DocStats,
    fielddata: FielddataStats,
    mappings: ClusterStatsFieldTypesMappings,
    query_cache: QueryCacheStats,
    segments: SegmentsStats,
    shards: ClusterStatsClusterIndicesShards,
    store: StoreStats
  ): ClusterStatsClusterIndices = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], completion = completion.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any], fielddata = fielddata.asInstanceOf[js.Any], mappings = mappings.asInstanceOf[js.Any], query_cache = query_cache.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterIndices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterIndices] (val x: Self) extends AnyVal {
    
    inline def setAnalysis(value: ClusterStatsCharFilterTypes): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setCompletion(value: CompletionStats): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDocs(value: DocStats): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setFielddata(value: FielddataStats): Self = StObject.set(x, "fielddata", value.asInstanceOf[js.Any])
    
    inline def setMappings(value: ClusterStatsFieldTypesMappings): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setQuery_cache(value: QueryCacheStats): Self = StObject.set(x, "query_cache", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: SegmentsStats): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setShards(value: ClusterStatsClusterIndicesShards): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
    
    inline def setStore(value: StoreStats): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
    
    inline def setVersions(value: js.Array[ClusterStatsIndicesVersions]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: ClusterStatsIndicesVersions*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
