package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.MsearchRequest
import typings.elasticElasticsearch.libApiTypesMod.MsearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiMsearchMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/msearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TDocument, TAggregations](params: MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptions): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]]]
  inline def default[TDocument, TAggregations](params: MsearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest): js.Promise[MsearchResponse[TDocument, TAggregations]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptions
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[MsearchResponse[TDocument, TAggregations], Any]]]
  inline def default[TDocument, TAggregations](
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MsearchRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[MsearchResponse[TDocument, TAggregations]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[MsearchResponse[TDocument, TAggregations]]]
  
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
