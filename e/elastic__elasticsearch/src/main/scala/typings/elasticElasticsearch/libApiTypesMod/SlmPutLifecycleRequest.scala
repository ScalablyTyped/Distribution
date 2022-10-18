package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmPutLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var config: js.UndefOr[SlmConfiguration] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: js.UndefOr[Name] = js.undefined
  
  var policy_id: Name
  
  var repository: js.UndefOr[String] = js.undefined
  
  var retention: js.UndefOr[SlmRetention] = js.undefined
  
  var schedule: js.UndefOr[WatcherCronExpression] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object SlmPutLifecycleRequest {
  
  inline def apply(policy_id: Name): SlmPutLifecycleRequest = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPutLifecycleRequest]
  }
  
  extension [Self <: SlmPutLifecycleRequest](x: Self) {
    
    inline def setConfig(value: SlmConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicy_id(value: Name): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setRetention(value: SlmRetention): Self = StObject.set(x, "retention", value.asInstanceOf[js.Any])
    
    inline def setRetentionUndefined: Self = StObject.set(x, "retention", js.undefined)
    
    inline def setSchedule(value: WatcherCronExpression): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
