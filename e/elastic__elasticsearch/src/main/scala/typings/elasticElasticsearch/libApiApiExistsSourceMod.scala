package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ExistsSourceRequest
import typings.elasticElasticsearch.libApiTypesMod.ExistsSourceResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiExistsSourceMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/exists_source", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ExistsSourceRequest): js.Promise[ExistsSourceResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExistsSourceResponse]]
  inline def default(params: ExistsSourceRequest, options: TransportRequestOptions): js.Promise[ExistsSourceResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsSourceResponse]]
  inline def default(params: ExistsSourceRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ExistsSourceResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ExistsSourceResponse, Any]]]
  inline def default(params: ExistsSourceRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ExistsSourceResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsSourceResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest): js.Promise[ExistsSourceResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ExistsSourceResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptions
  ): js.Promise[ExistsSourceResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsSourceResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ExistsSourceResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ExistsSourceResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ExistsSourceRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ExistsSourceResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExistsSourceResponse]]
  
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
