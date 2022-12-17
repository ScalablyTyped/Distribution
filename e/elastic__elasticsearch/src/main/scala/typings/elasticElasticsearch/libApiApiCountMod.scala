package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.CountRequest
import typings.elasticElasticsearch.libApiTypesMod.CountResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiCountMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/count", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[CountResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CountResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[CountResponse, Any]]]
  inline def default(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: CountRequest): js.Promise[CountResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: CountRequest, options: TransportRequestOptions): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: CountRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CountResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[CountResponse, Any]]]
  inline def default(params: CountRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest): js.Promise[CountResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[CountResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptions
  ): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[CountResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[CountResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CountRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[CountResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[CountResponse]]
  
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
