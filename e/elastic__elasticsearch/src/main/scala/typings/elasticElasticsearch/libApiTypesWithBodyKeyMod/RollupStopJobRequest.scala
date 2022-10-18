package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupStopJobRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var id: Id
  
  var timeout: js.UndefOr[Duration] = js.undefined
  
  var wait_for_completion: js.UndefOr[Boolean] = js.undefined
}
object RollupStopJobRequest {
  
  inline def apply(id: Id): RollupStopJobRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupStopJobRequest]
  }
  
  extension [Self <: RollupStopJobRequest](x: Self) {
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWait_for_completion(value: Boolean): Self = StObject.set(x, "wait_for_completion", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completionUndefined: Self = StObject.set(x, "wait_for_completion", js.undefined)
  }
}
