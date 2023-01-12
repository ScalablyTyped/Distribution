package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.TermvectorsRequest
import typings.elasticElasticsearch.libApiTypesMod.TermvectorsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiTermvectorsMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/termvectors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](params: TermvectorsRequest[TDocument]): js.Promise[TermvectorsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TermvectorsResponse]]
  inline def default[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptions): js.Promise[TermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermvectorsResponse]]
  inline def default[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[TermvectorsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[TermvectorsResponse, Any]]]
  inline def default[TDocument](params: TermvectorsRequest[TDocument], options: TransportRequestOptionsWithOutMeta): js.Promise[TermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermvectorsResponse]]
  inline def default[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument]): js.Promise[TermvectorsResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TermvectorsResponse]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptions
  ): js.Promise[TermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermvectorsResponse]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[TermvectorsResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[TermvectorsResponse, Any]]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.TermvectorsRequest[TDocument],
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[TermvectorsResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TermvectorsResponse]]
  
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
