package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDeleteByQueryRethrottleMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/delete_by_query_rethrottle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: DeleteByQueryRethrottleRequest): js.Promise[DeleteByQueryRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptions): js.Promise[DeleteByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest): js.Promise[DeleteByQueryRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
