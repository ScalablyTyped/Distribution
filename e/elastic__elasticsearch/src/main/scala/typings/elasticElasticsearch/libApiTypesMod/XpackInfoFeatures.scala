package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackInfoFeatures extends StObject {
  
  var aggregate_metric: XpackInfoFeature
  
  var analytics: XpackInfoFeature
  
  var archive: XpackInfoFeature
  
  var ccr: XpackInfoFeature
  
  var data_frame: js.UndefOr[XpackInfoFeature] = js.undefined
  
  var data_science: js.UndefOr[XpackInfoFeature] = js.undefined
  
  var data_streams: XpackInfoFeature
  
  var data_tiers: XpackInfoFeature
  
  var enrich: XpackInfoFeature
  
  var eql: XpackInfoFeature
  
  var flattened: js.UndefOr[XpackInfoFeature] = js.undefined
  
  var frozen_indices: XpackInfoFeature
  
  var graph: XpackInfoFeature
  
  var ilm: XpackInfoFeature
  
  var logstash: XpackInfoFeature
  
  var ml: XpackInfoFeature
  
  var monitoring: XpackInfoFeature
  
  var rollup: XpackInfoFeature
  
  var runtime_fields: js.UndefOr[XpackInfoFeature] = js.undefined
  
  var searchable_snapshots: XpackInfoFeature
  
  var security: XpackInfoFeature
  
  var slm: XpackInfoFeature
  
  var spatial: XpackInfoFeature
  
  var sql: XpackInfoFeature
  
  var transform: XpackInfoFeature
  
  var vectors: js.UndefOr[XpackInfoFeature] = js.undefined
  
  var voting_only: XpackInfoFeature
  
  var watcher: XpackInfoFeature
}
object XpackInfoFeatures {
  
  inline def apply(
    aggregate_metric: XpackInfoFeature,
    analytics: XpackInfoFeature,
    archive: XpackInfoFeature,
    ccr: XpackInfoFeature,
    data_streams: XpackInfoFeature,
    data_tiers: XpackInfoFeature,
    enrich: XpackInfoFeature,
    eql: XpackInfoFeature,
    frozen_indices: XpackInfoFeature,
    graph: XpackInfoFeature,
    ilm: XpackInfoFeature,
    logstash: XpackInfoFeature,
    ml: XpackInfoFeature,
    monitoring: XpackInfoFeature,
    rollup: XpackInfoFeature,
    searchable_snapshots: XpackInfoFeature,
    security: XpackInfoFeature,
    slm: XpackInfoFeature,
    spatial: XpackInfoFeature,
    sql: XpackInfoFeature,
    transform: XpackInfoFeature,
    voting_only: XpackInfoFeature,
    watcher: XpackInfoFeature
  ): XpackInfoFeatures = {
    val __obj = js.Dynamic.literal(aggregate_metric = aggregate_metric.asInstanceOf[js.Any], analytics = analytics.asInstanceOf[js.Any], archive = archive.asInstanceOf[js.Any], ccr = ccr.asInstanceOf[js.Any], data_streams = data_streams.asInstanceOf[js.Any], data_tiers = data_tiers.asInstanceOf[js.Any], enrich = enrich.asInstanceOf[js.Any], eql = eql.asInstanceOf[js.Any], frozen_indices = frozen_indices.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], ilm = ilm.asInstanceOf[js.Any], logstash = logstash.asInstanceOf[js.Any], ml = ml.asInstanceOf[js.Any], monitoring = monitoring.asInstanceOf[js.Any], rollup = rollup.asInstanceOf[js.Any], searchable_snapshots = searchable_snapshots.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], slm = slm.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any], sql = sql.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], voting_only = voting_only.asInstanceOf[js.Any], watcher = watcher.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackInfoFeatures]
  }
  
  extension [Self <: XpackInfoFeatures](x: Self) {
    
    inline def setAggregate_metric(value: XpackInfoFeature): Self = StObject.set(x, "aggregate_metric", value.asInstanceOf[js.Any])
    
    inline def setAnalytics(value: XpackInfoFeature): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setArchive(value: XpackInfoFeature): Self = StObject.set(x, "archive", value.asInstanceOf[js.Any])
    
    inline def setCcr(value: XpackInfoFeature): Self = StObject.set(x, "ccr", value.asInstanceOf[js.Any])
    
    inline def setData_frame(value: XpackInfoFeature): Self = StObject.set(x, "data_frame", value.asInstanceOf[js.Any])
    
    inline def setData_frameUndefined: Self = StObject.set(x, "data_frame", js.undefined)
    
    inline def setData_science(value: XpackInfoFeature): Self = StObject.set(x, "data_science", value.asInstanceOf[js.Any])
    
    inline def setData_scienceUndefined: Self = StObject.set(x, "data_science", js.undefined)
    
    inline def setData_streams(value: XpackInfoFeature): Self = StObject.set(x, "data_streams", value.asInstanceOf[js.Any])
    
    inline def setData_tiers(value: XpackInfoFeature): Self = StObject.set(x, "data_tiers", value.asInstanceOf[js.Any])
    
    inline def setEnrich(value: XpackInfoFeature): Self = StObject.set(x, "enrich", value.asInstanceOf[js.Any])
    
    inline def setEql(value: XpackInfoFeature): Self = StObject.set(x, "eql", value.asInstanceOf[js.Any])
    
    inline def setFlattened(value: XpackInfoFeature): Self = StObject.set(x, "flattened", value.asInstanceOf[js.Any])
    
    inline def setFlattenedUndefined: Self = StObject.set(x, "flattened", js.undefined)
    
    inline def setFrozen_indices(value: XpackInfoFeature): Self = StObject.set(x, "frozen_indices", value.asInstanceOf[js.Any])
    
    inline def setGraph(value: XpackInfoFeature): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setIlm(value: XpackInfoFeature): Self = StObject.set(x, "ilm", value.asInstanceOf[js.Any])
    
    inline def setLogstash(value: XpackInfoFeature): Self = StObject.set(x, "logstash", value.asInstanceOf[js.Any])
    
    inline def setMl(value: XpackInfoFeature): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
    
    inline def setMonitoring(value: XpackInfoFeature): Self = StObject.set(x, "monitoring", value.asInstanceOf[js.Any])
    
    inline def setRollup(value: XpackInfoFeature): Self = StObject.set(x, "rollup", value.asInstanceOf[js.Any])
    
    inline def setRuntime_fields(value: XpackInfoFeature): Self = StObject.set(x, "runtime_fields", value.asInstanceOf[js.Any])
    
    inline def setRuntime_fieldsUndefined: Self = StObject.set(x, "runtime_fields", js.undefined)
    
    inline def setSearchable_snapshots(value: XpackInfoFeature): Self = StObject.set(x, "searchable_snapshots", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: XpackInfoFeature): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSlm(value: XpackInfoFeature): Self = StObject.set(x, "slm", value.asInstanceOf[js.Any])
    
    inline def setSpatial(value: XpackInfoFeature): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
    
    inline def setSql(value: XpackInfoFeature): Self = StObject.set(x, "sql", value.asInstanceOf[js.Any])
    
    inline def setTransform(value: XpackInfoFeature): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setVectors(value: XpackInfoFeature): Self = StObject.set(x, "vectors", value.asInstanceOf[js.Any])
    
    inline def setVectorsUndefined: Self = StObject.set(x, "vectors", js.undefined)
    
    inline def setVoting_only(value: XpackInfoFeature): Self = StObject.set(x, "voting_only", value.asInstanceOf[js.Any])
    
    inline def setWatcher(value: XpackInfoFeature): Self = StObject.set(x, "watcher", value.asInstanceOf[js.Any])
  }
}
