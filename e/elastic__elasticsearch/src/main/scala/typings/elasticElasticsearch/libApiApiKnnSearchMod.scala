package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.KnnSearchRequest
import typings.elasticElasticsearch.libApiTypesMod.KnnSearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiKnnSearchMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/knn_search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument](params: KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KnnSearchResponse[TDocument]]]
  inline def default[TDocument](params: KnnSearchRequest, options: TransportRequestOptions): js.Promise[KnnSearchResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KnnSearchResponse[TDocument]]]
  inline def default[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest): js.Promise[KnnSearchResponse[TDocument]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[KnnSearchResponse[TDocument]]]
  inline def default[TDocument](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.KnnSearchRequest,
    options: TransportRequestOptions
  ): js.Promise[KnnSearchResponse[TDocument]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[KnnSearchResponse[TDocument]]]
  
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
