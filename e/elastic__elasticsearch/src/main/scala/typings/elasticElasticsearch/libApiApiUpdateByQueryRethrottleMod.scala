package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.UpdateByQueryRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiUpdateByQueryRethrottleMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/update_by_query_rethrottle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: UpdateByQueryRethrottleRequest): js.Promise[UpdateByQueryRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  inline def default(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptions): js.Promise[UpdateByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  inline def default(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]]]
  inline def default(params: UpdateByQueryRethrottleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[UpdateByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest): js.Promise[UpdateByQueryRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[UpdateByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[UpdateByQueryRethrottleResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.UpdateByQueryRethrottleRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[UpdateByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpdateByQueryRethrottleResponse]]
  
  trait That extends StObject {
    
    var transport: Transport
  }
  object That {
    
    inline def apply(transport: Transport): That = {
      val __obj = js.Dynamic.literal(transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[That]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
