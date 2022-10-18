package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ReindexRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.ReindexRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiReindexRethrottleMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/reindex_rethrottle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ReindexRethrottleRequest): js.Promise[ReindexRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReindexRethrottleResponse]]
  inline def default(params: ReindexRethrottleRequest, options: TransportRequestOptions): js.Promise[ReindexRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReindexRethrottleResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest): js.Promise[ReindexRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReindexRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[ReindexRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReindexRethrottleResponse]]
  
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
