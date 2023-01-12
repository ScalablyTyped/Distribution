package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmSnapshotLifecycle extends StObject {
  
  var in_progress: js.UndefOr[SlmInProgress] = js.undefined
  
  var last_failure: js.UndefOr[SlmInvocation] = js.undefined
  
  var last_success: js.UndefOr[SlmInvocation] = js.undefined
  
  var modified_date: js.UndefOr[DateTime] = js.undefined
  
  var modified_date_millis: EpochTime[UnitMillis]
  
  var next_execution: js.UndefOr[DateTime] = js.undefined
  
  var next_execution_millis: EpochTime[UnitMillis]
  
  var policy: SlmPolicy
  
  var stats: SlmStatistics
  
  var version: VersionNumber
}
object SlmSnapshotLifecycle {
  
  inline def apply(
    modified_date_millis: EpochTime[UnitMillis],
    next_execution_millis: EpochTime[UnitMillis],
    policy: SlmPolicy,
    stats: SlmStatistics,
    version: VersionNumber
  ): SlmSnapshotLifecycle = {
    val __obj = js.Dynamic.literal(modified_date_millis = modified_date_millis.asInstanceOf[js.Any], next_execution_millis = next_execution_millis.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmSnapshotLifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlmSnapshotLifecycle] (val x: Self) extends AnyVal {
    
    inline def setIn_progress(value: SlmInProgress): Self = StObject.set(x, "in_progress", value.asInstanceOf[js.Any])
    
    inline def setIn_progressUndefined: Self = StObject.set(x, "in_progress", js.undefined)
    
    inline def setLast_failure(value: SlmInvocation): Self = StObject.set(x, "last_failure", value.asInstanceOf[js.Any])
    
    inline def setLast_failureUndefined: Self = StObject.set(x, "last_failure", js.undefined)
    
    inline def setLast_success(value: SlmInvocation): Self = StObject.set(x, "last_success", value.asInstanceOf[js.Any])
    
    inline def setLast_successUndefined: Self = StObject.set(x, "last_success", js.undefined)
    
    inline def setModified_date(value: DateTime): Self = StObject.set(x, "modified_date", value.asInstanceOf[js.Any])
    
    inline def setModified_dateUndefined: Self = StObject.set(x, "modified_date", js.undefined)
    
    inline def setModified_date_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "modified_date_millis", value.asInstanceOf[js.Any])
    
    inline def setNext_execution(value: DateTime): Self = StObject.set(x, "next_execution", value.asInstanceOf[js.Any])
    
    inline def setNext_executionUndefined: Self = StObject.set(x, "next_execution", js.undefined)
    
    inline def setNext_execution_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "next_execution_millis", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: SlmPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setStats(value: SlmStatistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
