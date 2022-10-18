package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ReindexRequest
import typings.elasticElasticsearch.libApiTypesMod.ReindexResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiReindexMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/reindex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ReindexRequest): js.Promise[ReindexResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReindexResponse]]
  inline def default(params: ReindexRequest, options: TransportRequestOptions): js.Promise[ReindexResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReindexResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest): js.Promise[ReindexResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReindexResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexRequest,
    options: TransportRequestOptions
  ): js.Promise[ReindexResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReindexResponse]]
  
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
