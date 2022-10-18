package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var index: IndexName
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var only_errors: js.UndefOr[Boolean] = js.undefined
  
  var only_managed: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IlmExplainLifecycleRequest {
  
  inline def apply(index: IndexName): IlmExplainLifecycleRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmExplainLifecycleRequest]
  }
  
  extension [Self <: IlmExplainLifecycleRequest](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setOnly_errors(value: Boolean): Self = StObject.set(x, "only_errors", value.asInstanceOf[js.Any])
    
    inline def setOnly_errorsUndefined: Self = StObject.set(x, "only_errors", js.undefined)
    
    inline def setOnly_managed(value: Boolean): Self = StObject.set(x, "only_managed", value.asInstanceOf[js.Any])
    
    inline def setOnly_managedUndefined: Self = StObject.set(x, "only_managed", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
