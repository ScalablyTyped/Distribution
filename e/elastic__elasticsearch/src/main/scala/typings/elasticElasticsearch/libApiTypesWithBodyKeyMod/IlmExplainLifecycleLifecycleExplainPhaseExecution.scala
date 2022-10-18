package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycleLifecycleExplainPhaseExecution extends StObject {
  
  var modified_date_in_millis: EpochTime[UnitMillis]
  
  var policy: Name
  
  var version: VersionNumber
}
object IlmExplainLifecycleLifecycleExplainPhaseExecution {
  
  inline def apply(modified_date_in_millis: EpochTime[UnitMillis], policy: Name, version: VersionNumber): IlmExplainLifecycleLifecycleExplainPhaseExecution = {
    val __obj = js.Dynamic.literal(modified_date_in_millis = modified_date_in_millis.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycleLifecycleExplainPhaseExecution]
  }
  
  extension [Self <: IlmExplainLifecycleLifecycleExplainPhaseExecution](x: Self) {
    
    inline def setModified_date_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "modified_date_in_millis", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Name): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
