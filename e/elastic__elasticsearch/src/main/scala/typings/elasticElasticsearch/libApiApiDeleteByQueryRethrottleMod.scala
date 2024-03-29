package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRethrottleResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
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
  inline def default(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]]]
  inline def default(params: DeleteByQueryRethrottleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest): js.Promise[DeleteByQueryRethrottleResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteByQueryRethrottleResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRethrottleRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteByQueryRethrottleResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryRethrottleResponse]]
  
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
