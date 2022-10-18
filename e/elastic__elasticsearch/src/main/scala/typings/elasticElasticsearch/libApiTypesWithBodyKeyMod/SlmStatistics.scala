package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmStatistics extends StObject {
  
  var policy: js.UndefOr[Id] = js.undefined
  
  var retention_deletion_time: js.UndefOr[Duration] = js.undefined
  
  var retention_deletion_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var retention_failed: js.UndefOr[long] = js.undefined
  
  var retention_runs: js.UndefOr[long] = js.undefined
  
  var retention_timed_out: js.UndefOr[long] = js.undefined
  
  var snapshot_deletion_failures: js.UndefOr[long] = js.undefined
  
  var snapshots_deleted: js.UndefOr[long] = js.undefined
  
  var snapshots_failed: js.UndefOr[long] = js.undefined
  
  var snapshots_taken: js.UndefOr[long] = js.undefined
  
  var total_snapshot_deletion_failures: js.UndefOr[long] = js.undefined
  
  var total_snapshots_deleted: js.UndefOr[long] = js.undefined
  
  var total_snapshots_failed: js.UndefOr[long] = js.undefined
  
  var total_snapshots_taken: js.UndefOr[long] = js.undefined
}
object SlmStatistics {
  
  inline def apply(): SlmStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlmStatistics]
  }
  
  extension [Self <: SlmStatistics](x: Self) {
    
    inline def setPolicy(value: Id): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setRetention_deletion_time(value: Duration): Self = StObject.set(x, "retention_deletion_time", value.asInstanceOf[js.Any])
    
    inline def setRetention_deletion_timeUndefined: Self = StObject.set(x, "retention_deletion_time", js.undefined)
    
    inline def setRetention_deletion_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "retention_deletion_time_millis", value.asInstanceOf[js.Any])
    
    inline def setRetention_deletion_time_millisUndefined: Self = StObject.set(x, "retention_deletion_time_millis", js.undefined)
    
    inline def setRetention_failed(value: long): Self = StObject.set(x, "retention_failed", value.asInstanceOf[js.Any])
    
    inline def setRetention_failedUndefined: Self = StObject.set(x, "retention_failed", js.undefined)
    
    inline def setRetention_runs(value: long): Self = StObject.set(x, "retention_runs", value.asInstanceOf[js.Any])
    
    inline def setRetention_runsUndefined: Self = StObject.set(x, "retention_runs", js.undefined)
    
    inline def setRetention_timed_out(value: long): Self = StObject.set(x, "retention_timed_out", value.asInstanceOf[js.Any])
    
    inline def setRetention_timed_outUndefined: Self = StObject.set(x, "retention_timed_out", js.undefined)
    
    inline def setSnapshot_deletion_failures(value: long): Self = StObject.set(x, "snapshot_deletion_failures", value.asInstanceOf[js.Any])
    
    inline def setSnapshot_deletion_failuresUndefined: Self = StObject.set(x, "snapshot_deletion_failures", js.undefined)
    
    inline def setSnapshots_deleted(value: long): Self = StObject.set(x, "snapshots_deleted", value.asInstanceOf[js.Any])
    
    inline def setSnapshots_deletedUndefined: Self = StObject.set(x, "snapshots_deleted", js.undefined)
    
    inline def setSnapshots_failed(value: long): Self = StObject.set(x, "snapshots_failed", value.asInstanceOf[js.Any])
    
    inline def setSnapshots_failedUndefined: Self = StObject.set(x, "snapshots_failed", js.undefined)
    
    inline def setSnapshots_taken(value: long): Self = StObject.set(x, "snapshots_taken", value.asInstanceOf[js.Any])
    
    inline def setSnapshots_takenUndefined: Self = StObject.set(x, "snapshots_taken", js.undefined)
    
    inline def setTotal_snapshot_deletion_failures(value: long): Self = StObject.set(x, "total_snapshot_deletion_failures", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshot_deletion_failuresUndefined: Self = StObject.set(x, "total_snapshot_deletion_failures", js.undefined)
    
    inline def setTotal_snapshots_deleted(value: long): Self = StObject.set(x, "total_snapshots_deleted", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_deletedUndefined: Self = StObject.set(x, "total_snapshots_deleted", js.undefined)
    
    inline def setTotal_snapshots_failed(value: long): Self = StObject.set(x, "total_snapshots_failed", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_failedUndefined: Self = StObject.set(x, "total_snapshots_failed", js.undefined)
    
    inline def setTotal_snapshots_taken(value: long): Self = StObject.set(x, "total_snapshots_taken", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_takenUndefined: Self = StObject.set(x, "total_snapshots_taken", js.undefined)
  }
}
