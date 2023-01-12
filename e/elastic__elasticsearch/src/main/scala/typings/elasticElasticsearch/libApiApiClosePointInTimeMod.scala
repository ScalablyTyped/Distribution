package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ClosePointInTimeRequest
import typings.elasticElasticsearch.libApiTypesMod.ClosePointInTimeResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiClosePointInTimeMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/close_point_in_time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: ClosePointInTimeRequest): js.Promise[ClosePointInTimeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  inline def default(params: ClosePointInTimeRequest, options: TransportRequestOptions): js.Promise[ClosePointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  inline def default(params: ClosePointInTimeRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClosePointInTimeResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ClosePointInTimeResponse, Any]]]
  inline def default(params: ClosePointInTimeRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClosePointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest): js.Promise[ClosePointInTimeResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptions
  ): js.Promise[ClosePointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ClosePointInTimeResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ClosePointInTimeResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClosePointInTimeRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ClosePointInTimeResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClosePointInTimeResponse]]
  
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
