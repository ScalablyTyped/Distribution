package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageResponse extends StObject {
  
  var aggregate_metric: XpackUsageBase
  
  var analytics: XpackUsageAnalytics
  
  var archive: XpackUsageArchive
  
  var ccr: XpackUsageCcr
  
  var data_frame: js.UndefOr[XpackUsageBase] = js.undefined
  
  var data_science: js.UndefOr[XpackUsageBase] = js.undefined
  
  var data_streams: js.UndefOr[XpackUsageDataStreams] = js.undefined
  
  var data_tiers: XpackUsageDataTiers
  
  var enrich: js.UndefOr[XpackUsageBase] = js.undefined
  
  var eql: XpackUsageEql
  
  var flattened: js.UndefOr[XpackUsageFlattened] = js.undefined
  
  var frozen_indices: XpackUsageFrozenIndices
  
  var graph: XpackUsageBase
  
  var ilm: XpackUsageIlm
  
  var logstash: XpackUsageBase
  
  var ml: XpackUsageMachineLearning
  
  var monitoring: XpackUsageMonitoring
  
  var rollup: XpackUsageBase
  
  var runtime_fields: js.UndefOr[XpackUsageRuntimeFieldTypes] = js.undefined
  
  var searchable_snapshots: XpackUsageSearchableSnapshots
  
  var security: XpackUsageSecurity
  
  var slm: XpackUsageSlm
  
  var spatial: XpackUsageBase
  
  var sql: XpackUsageSql
  
  var transform: XpackUsageBase
  
  var vectors: js.UndefOr[XpackUsageVector] = js.undefined
  
  var voting_only: XpackUsageBase
  
  var watcher: XpackUsageWatcher
}
object XpackUsageResponse {
  
  inline def apply(
    aggregate_metric: XpackUsageBase,
    analytics: XpackUsageAnalytics,
    archive: XpackUsageArchive,
    ccr: XpackUsageCcr,
    data_tiers: XpackUsageDataTiers,
    eql: XpackUsageEql,
    frozen_indices: XpackUsageFrozenIndices,
    graph: XpackUsageBase,
    ilm: XpackUsageIlm,
    logstash: XpackUsageBase,
    ml: XpackUsageMachineLearning,
    monitoring: XpackUsageMonitoring,
    rollup: XpackUsageBase,
    searchable_snapshots: XpackUsageSearchableSnapshots,
    security: XpackUsageSecurity,
    slm: XpackUsageSlm,
    spatial: XpackUsageBase,
    sql: XpackUsageSql,
    transform: XpackUsageBase,
    voting_only: XpackUsageBase,
    watcher: XpackUsageWatcher
  ): XpackUsageResponse = {
    val __obj = js.Dynamic.literal(aggregate_metric = aggregate_metric.asInstanceOf[js.Any], analytics = analytics.asInstanceOf[js.Any], archive = archive.asInstanceOf[js.Any], ccr = ccr.asInstanceOf[js.Any], data_tiers = data_tiers.asInstanceOf[js.Any], eql = eql.asInstanceOf[js.Any], frozen_indices = frozen_indices.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], ilm = ilm.asInstanceOf[js.Any], logstash = logstash.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], rollup = rollup.asInstanceOf[js.Any], searchable_snapshots = searchable_snapshots.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], voting_only = voting_only.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregate_metric(value: XpackUsageBase): Self = StObject.set(x, "aggregate_metric", value.asInstanceOf[js.Any])
    
    inline def setAnalytics(value: XpackUsageAnalytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setArchive(value: XpackUsageArchive): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setCcr(value: XpackUsageCcr): Self = StObject.set(x, "ccr", value.asInstanceOf[js.Any])
    
    inline def setData_frame(value: XpackUsageBase): Self = StObject.set(x, "data_frame", value.asInstanceOf[js.Any])
    
    inline def setData_frameUndefined: Self = StObject.set(x, "data_frame", js.undefined)
    
    inline def setData_science(value: XpackUsageBase): Self = StObject.set(x, "data_science", value.asInstanceOf[js.Any])
    
    inline def setData_scienceUndefined: Self = StObject.set(x, "data_science", js.undefined)
    
    inline def setData_streams(value: XpackUsageDataStreams): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_streamsUndefined: Self = StObject.set(x, "data_streams", js.undefined)
    
    inline def setData_tiers(value: XpackUsageDataTiers): Self = StObject.set(x, "data_tiers", value.asInstanceOf[js.Any])
    
    inline def setEnrich(value: XpackUsageBase): Self = StObject.set(x, "enrich", value.asInstanceOf[js.Any])
    
    inline def setEnrichUndefined: Self = StObject.set(x, "enrich", js.undefined)
    
    inline def setEql(value: XpackUsageEql): Self = StObject.set(x, "eql", value.asInstanceOf[js.Any])
    
    inline def setFlattened(value: XpackUsageFlattened): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    inline def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    inline def setFrozen_indices(value: XpackUsageFrozenIndices): Self = StObject.set(x, "frozen_indices", value.asInstanceOf[js.Any])
    
    inline def setGraph(value: XpackUsageBase): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setIlm(value: XpackUsageIlm): Self = StObject.set(x, "ilm", value.asInstanceOf[js.Any])
    
    inline def setLogstash(value: XpackUsageBase): Self = StObject.set(x, "logstash", value.asInstanceOf[js.Any])
    
    inline def setMl(value: XpackUsageMachineLearning): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMonitoring(value: XpackUsageMonitoring): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setRollup(value: XpackUsageBase): Self = StObject.set(x, "rollup", value.asInstanceOf[js.Any])
    
    inline def setRuntime_fields(value: XpackUsageRuntimeFieldTypes): Self = StObject.set(x, "runtime_fields", value.asInstanceOf[js.Any])
    
    inline def setRuntime_fieldsUndefined: Self = StObject.set(x, "runtime_fields", js.undefined)
    
    inline def setSearchable_snapshots(value: XpackUsageSearchableSnapshots): Self = StObject.set(x, "searchable_snapshots", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: XpackUsageSecurity): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSlm(value: XpackUsageSlm): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
    
    inline def setSpatial(value: XpackUsageBase): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
    
    inline def setSql(value: XpackUsageSql): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: XpackUsageBase): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setVectors(value: XpackUsageVector): Self = StObject.set(x, "vectors", value.asInstanceOf[js.Any])
    
    inline def setVectorsUndefined: Self = StObject.set(x, "vectors", js.undefined)
    
    inline def setVoting_only(value: XpackUsageBase): Self = StObject.set(x, "voting_only", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: XpackUsageWatcher): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
