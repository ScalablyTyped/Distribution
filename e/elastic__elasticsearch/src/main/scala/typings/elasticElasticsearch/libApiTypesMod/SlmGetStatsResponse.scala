package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmGetStatsResponse extends StObject {
  
  var policy_stats: js.Array[String]
  
  var retention_deletion_time: Duration
  
  var retention_deletion_time_millis: DurationValue[UnitMillis]
  
  var retention_failed: long
  
  var retention_runs: long
  
  var retention_timed_out: long
  
  var total_snapshot_deletion_failures: long
  
  var total_snapshots_deleted: long
  
  var total_snapshots_failed: long
  
  var total_snapshots_taken: long
}
object SlmGetStatsResponse {
  
  inline def apply(
    policy_stats: js.Array[String],
    retention_deletion_time: Duration,
    retention_deletion_time_millis: DurationValue[UnitMillis],
    retention_failed: long,
    retention_runs: long,
    retention_timed_out: long,
    total_snapshot_deletion_failures: long,
    total_snapshots_deleted: long,
    total_snapshots_failed: long,
    total_snapshots_taken: long
  ): SlmGetStatsResponse = {
    val __obj = js.Dynamic.literal(policy_stats = policy_stats.asInstanceOf[js.Any], retention_deletion_time = retention_deletion_time.asInstanceOf[js.Any], retention_deletion_time_millis = retention_deletion_time_millis.asInstanceOf[js.Any], retention_failed = retention_failed.asInstanceOf[js.Any], retention_runs = retention_runs.asInstanceOf[js.Any], retention_timed_out = retention_timed_out.asInstanceOf[js.Any], total_snapshot_deletion_failures = total_snapshot_deletion_failures.asInstanceOf[js.Any], total_snapshots_deleted = total_snapshots_deleted.asInstanceOf[js.Any], total_snapshots_failed = total_snapshots_failed.asInstanceOf[js.Any], total_snapshots_taken = total_snapshots_taken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmGetStatsResponse]
  }
  
  extension [Self <: SlmGetStatsResponse](x: Self) {
    
    inline def setPolicy_stats(value: js.Array[String]): Self = StObject.set(x, "policy_stats", value.asInstanceOf[js.Any])
    
    inline def setPolicy_statsVarargs(value: String*): Self = StObject.set(x, "policy_stats", js.Array(value*))
    
    inline def setRetention_deletion_time(value: Duration): Self = StObject.set(x, "retention_deletion_time", value.asInstanceOf[js.Any])
    
    inline def setRetention_deletion_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "retention_deletion_time_millis", value.asInstanceOf[js.Any])
    
    inline def setRetention_failed(value: long): Self = StObject.set(x, "retention_failed", value.asInstanceOf[js.Any])
    
    inline def setRetention_runs(value: long): Self = StObject.set(x, "retention_runs", value.asInstanceOf[js.Any])
    
    inline def setRetention_timed_out(value: long): Self = StObject.set(x, "retention_timed_out", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshot_deletion_failures(value: long): Self = StObject.set(x, "total_snapshot_deletion_failures", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_deleted(value: long): Self = StObject.set(x, "total_snapshots_deleted", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_failed(value: long): Self = StObject.set(x, "total_snapshots_failed", value.asInstanceOf[js.Any])
    
    inline def setTotal_snapshots_taken(value: long): Self = StObject.set(x, "total_snapshots_taken", value.asInstanceOf[js.Any])
  }
}
