package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.elasticElasticsearch.anon.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlmPutLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  /** @deprecated The use of the 'body' key has been deprecated, move the nested keys to the top level object. */
  var body: js.UndefOr[Repository] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var policy_id: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object SlmPutLifecycleRequest {
  
  inline def apply(policy_id: Name): SlmPutLifecycleRequest = {
    val __obj = js.Dynamic.literal(policy_id = policy_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlmPutLifecycleRequest]
  }
  
  extension [Self <: SlmPutLifecycleRequest](x: Self) {
    
    inline def setBody(value: Repository): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setPolicy_id(value: Name): Self = StObject.set(x, "policy_id", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
