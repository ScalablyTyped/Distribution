package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ClearScrollRequest
import typings.elasticElasticsearch.libApiTypesMod.ClearScrollResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiClearScrollMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/clear_scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[ClearScrollResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClearScrollResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ClearScrollResponse, Any]]]
  inline def default(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: ClearScrollRequest): js.Promise[ClearScrollResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: ClearScrollRequest, options: TransportRequestOptions): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: ClearScrollRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClearScrollResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ClearScrollResponse, Any]]]
  inline def default(params: ClearScrollRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest): js.Promise[ClearScrollResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptions
  ): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[ClearScrollResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[ClearScrollResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClearScrollRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[ClearScrollResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ClearScrollResponse]]
  
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
