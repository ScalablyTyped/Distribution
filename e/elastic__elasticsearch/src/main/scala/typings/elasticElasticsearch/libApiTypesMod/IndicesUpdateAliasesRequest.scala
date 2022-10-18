package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var actions: js.UndefOr[js.Array[IndicesUpdateAliasesAction]] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IndicesUpdateAliasesRequest {
  
  inline def apply(): IndicesUpdateAliasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesRequest]
  }
  
  extension [Self <: IndicesUpdateAliasesRequest](x: Self) {
    
    inline def setActions(value: js.Array[IndicesUpdateAliasesAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: IndicesUpdateAliasesAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
