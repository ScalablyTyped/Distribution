package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmStartRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IlmStartRequest {
  
  inline def apply(): IlmStartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmStartRequest]
  }
  
  extension [Self <: IlmStartRequest](x: Self) {
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
