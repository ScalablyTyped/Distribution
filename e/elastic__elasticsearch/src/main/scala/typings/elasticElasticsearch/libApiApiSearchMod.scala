package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.SearchRequest
import typings.elasticElasticsearch.libApiTypesMod.SearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSearchMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TAggregations](): js.Promise[SearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: Unit, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]]]
  inline def default[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptions): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]]]
  inline def default[TDocument, TAggregations](params: SearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest): js.Promise[SearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptions
  ): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[SearchResponse[TDocument, TAggregations], Any]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[SearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[SearchResponse[TDocument, TAggregations]]]
  
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
