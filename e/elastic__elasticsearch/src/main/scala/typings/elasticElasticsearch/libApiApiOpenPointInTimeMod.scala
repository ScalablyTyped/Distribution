package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.OpenPointInTimeRequest
import typings.elasticElasticsearch.libApiTypesMod.OpenPointInTimeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiOpenPointInTimeMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/open_point_in_time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: OpenPointInTimeRequest): js.Promise[OpenPointInTimeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  inline def default(params: OpenPointInTimeRequest, options: TransportRequestOptions): js.Promise[OpenPointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  inline def default(params: OpenPointInTimeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[OpenPointInTimeResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[OpenPointInTimeResponse, Any]]]
  inline def default(params: OpenPointInTimeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[OpenPointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest): js.Promise[OpenPointInTimeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptions
  ): js.Promise[OpenPointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[OpenPointInTimeResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[OpenPointInTimeResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.OpenPointInTimeRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[OpenPointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OpenPointInTimeResponse]]
  
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
