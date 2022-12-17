package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.MtermvectorsRequest
import typings.elasticElasticsearch.libApiTypesMod.MtermvectorsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMtermvectorsMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/mtermvectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[MtermvectorsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: Unit, options: TransportRequestOptions): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MtermvectorsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[MtermvectorsResponse, Any]]]
  inline def default(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: MtermvectorsRequest): js.Promise[MtermvectorsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: MtermvectorsRequest, options: TransportRequestOptions): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: MtermvectorsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MtermvectorsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[MtermvectorsResponse, Any]]]
  inline def default(params: MtermvectorsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest): js.Promise[MtermvectorsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptions
  ): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MtermvectorsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[MtermvectorsResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MtermvectorsRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MtermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MtermvectorsResponse]]
  
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
