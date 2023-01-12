package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryRequest
import typings.elasticElasticsearch.libApiTypesMod.DeleteByQueryResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiDeleteByQueryMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/delete_by_query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(params: DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(params: DeleteByQueryRequest, options: TransportRequestOptions): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(params: DeleteByQueryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[DeleteByQueryResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteByQueryResponse, Any]]]
  inline def default(params: DeleteByQueryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest): js.Promise[DeleteByQueryResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptions
  ): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptionsWithMeta
  ): js.Promise[TransportResult[DeleteByQueryResponse, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TransportResult[DeleteByQueryResponse, Any]]]
  inline def default(
    params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.DeleteByQueryRequest,
    options: TransportRequestOptionsWithOutMeta
  ): js.Promise[DeleteByQueryResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[DeleteByQueryResponse]]
  
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
