package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmDeleteLifecycleRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IlmDeleteLifecycleRequest {
  
  inline def apply(name: Name): IlmDeleteLifecycleRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IlmDeleteLifecycleRequest]
  }
  
  extension [Self <: IlmDeleteLifecycleRequest](x: Self) {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
