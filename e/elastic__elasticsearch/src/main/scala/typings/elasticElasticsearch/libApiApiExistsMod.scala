package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ExistsRequest
import typings.elasticElasticsearch.libApiTypesMod.ExistsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiExistsMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/exists", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ExistsRequest): js.Promise[ExistsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExistsResponse]]
  inline def default(params: ExistsRequest, options: TransportRequestOptions): js.Promise[ExistsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest): js.Promise[ExistsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExistsResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsRequest,
    options: TransportRequestOptions
  ): js.Promise[ExistsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsResponse]]
  
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
