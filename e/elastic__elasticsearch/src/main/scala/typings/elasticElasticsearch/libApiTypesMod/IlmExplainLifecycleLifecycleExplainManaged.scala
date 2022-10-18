package typings.elasticElasticsearch.libApiTypesMod

import typings.elasticElasticsearch.elasticElasticsearchBooleans.`true`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycleLifecycleExplainManaged
  extends StObject
     with IlmExplainLifecycleLifecycleExplain {
  
  var action: js.UndefOr[Name] = js.undefined
  
  var action_time: js.UndefOr[DateTime] = js.undefined
  
  var action_time_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var age: js.UndefOr[Duration] = js.undefined
  
  var failed_step: js.UndefOr[Name] = js.undefined
  
  var failed_step_retry_count: js.UndefOr[integer] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var index_creation_date: js.UndefOr[DateTime] = js.undefined
  
  var index_creation_date_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var is_auto_retryable_error: js.UndefOr[Boolean] = js.undefined
  
  var lifecycle_date: js.UndefOr[DateTime] = js.undefined
  
  var lifecycle_date_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var managed: `true`
  
  var phase: Name
  
  var phase_execution: js.UndefOr[IlmExplainLifecycleLifecycleExplainPhaseExecution] = js.undefined
  
  var phase_time: js.UndefOr[DateTime] = js.undefined
  
  var phase_time_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var policy: Name
  
  var step: js.UndefOr[Name] = js.undefined
  
  var step_info: js.UndefOr[Record[String, Any]] = js.undefined
  
  var step_time: js.UndefOr[DateTime] = js.undefined
  
  var step_time_millis: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var time_since_index_creation: js.UndefOr[Duration] = js.undefined
}
object IlmExplainLifecycleLifecycleExplainManaged {
  
  inline def apply(phase: Name, policy: Name): IlmExplainLifecycleLifecycleExplainManaged = {
    val __obj = js.Dynamic.literal(managed = true, phase = phase.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycleLifecycleExplainManaged]
  }
  
  extension [Self <: IlmExplainLifecycleLifecycleExplainManaged](x: Self) {
    
    inline def setAction(value: Name): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAction_time(value: DateTime): Self = StObject.set(x, "action_time", value.asInstanceOf[js.Any])
    
    inline def setAction_timeUndefined: Self = StObject.set(x, "action_time", js.undefined)
    
    inline def setAction_time_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "action_time_millis", value.asInstanceOf[js.Any])
    
    inline def setAction_time_millisUndefined: Self = StObject.set(x, "action_time_millis", js.undefined)
    
    inline def setAge(value: Duration): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setFailed_step(value: Name): Self = StObject.set(x, "failed_step", value.asInstanceOf[js.Any])
    
    inline def setFailed_stepUndefined: Self = StObject.set(x, "failed_step", js.undefined)
    
    inline def setFailed_step_retry_count(value: integer): Self = StObject.set(x, "failed_step_retry_count", value.asInstanceOf[js.Any])
    
    inline def setFailed_step_retry_countUndefined: Self = StObject.set(x, "failed_step_retry_count", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_creation_date(value: DateTime): Self = StObject.set(x, "index_creation_date", value.asInstanceOf[js.Any])
    
    inline def setIndex_creation_dateUndefined: Self = StObject.set(x, "index_creation_date", js.undefined)
    
    inline def setIndex_creation_date_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "index_creation_date_millis", value.asInstanceOf[js.Any])
    
    inline def setIndex_creation_date_millisUndefined: Self = StObject.set(x, "index_creation_date_millis", js.undefined)
    
    inline def setIs_auto_retryable_error(value: Boolean): Self = StObject.set(x, "is_auto_retryable_error", value.asInstanceOf[js.Any])
    
    inline def setIs_auto_retryable_errorUndefined: Self = StObject.set(x, "is_auto_retryable_error", js.undefined)
    
    inline def setLifecycle_date(value: DateTime): Self = StObject.set(x, "lifecycle_date", value.asInstanceOf[js.Any])
    
    inline def setLifecycle_dateUndefined: Self = StObject.set(x, "lifecycle_date", js.undefined)
    
    inline def setLifecycle_date_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "lifecycle_date_millis", value.asInstanceOf[js.Any])
    
    inline def setLifecycle_date_millisUndefined: Self = StObject.set(x, "lifecycle_date_millis", js.undefined)
    
    inline def setManaged(value: `true`): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
    
    inline def setPhase(value: Name): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhase_execution(value: IlmExplainLifecycleLifecycleExplainPhaseExecution): Self = StObject.set(x, "phase_execution", value.asInstanceOf[js.Any])
    
    inline def setPhase_executionUndefined: Self = StObject.set(x, "phase_execution", js.undefined)
    
    inline def setPhase_time(value: DateTime): Self = StObject.set(x, "phase_time", value.asInstanceOf[js.Any])
    
    inline def setPhase_timeUndefined: Self = StObject.set(x, "phase_time", js.undefined)
    
    inline def setPhase_time_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "phase_time_millis", value.asInstanceOf[js.Any])
    
    inline def setPhase_time_millisUndefined: Self = StObject.set(x, "phase_time_millis", js.undefined)
    
    inline def setPolicy(value: Name): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setStep(value: Name): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setStep_info(value: Record[String, Any]): Self = StObject.set(x, "step_info", value.asInstanceOf[js.Any])
    
    inline def setStep_infoUndefined: Self = StObject.set(x, "step_info", js.undefined)
    
    inline def setStep_time(value: DateTime): Self = StObject.set(x, "step_time", value.asInstanceOf[js.Any])
    
    inline def setStep_timeUndefined: Self = StObject.set(x, "step_time", js.undefined)
    
    inline def setStep_time_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "step_time_millis", value.asInstanceOf[js.Any])
    
    inline def setStep_time_millisUndefined: Self = StObject.set(x, "step_time_millis", js.undefined)
    
    inline def setTime_since_index_creation(value: Duration): Self = StObject.set(x, "time_since_index_creation", value.asInstanceOf[js.Any])
    
    inline def setTime_since_index_creationUndefined: Self = StObject.set(x, "time_since_index_creation", js.undefined)
  }
}
