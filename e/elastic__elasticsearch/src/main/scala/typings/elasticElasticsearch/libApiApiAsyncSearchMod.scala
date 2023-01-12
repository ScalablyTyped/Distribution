package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchDeleteRequest
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchDeleteResponse
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchGetRequest
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchGetResponse
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchStatusRequest
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchStatusResponse
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchSubmitRequest
import typings.elasticElasticsearch.libApiTypesMod.AsyncSearchSubmitResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiAsyncSearchMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/async_search", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AsyncSearch {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait AsyncSearch extends StObject {
    
    def delete(params: AsyncSearchDeleteRequest): js.Promise[AsyncSearchDeleteResponse] = js.native
    def delete(params: AsyncSearchDeleteRequest, options: TransportRequestOptions): js.Promise[AsyncSearchDeleteResponse] = js.native
    def delete(params: AsyncSearchDeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AsyncSearchDeleteResponse, Any]] = js.native
    def delete(params: AsyncSearchDeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AsyncSearchDeleteResponse] = js.native
    def delete(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchDeleteRequest): js.Promise[AsyncSearchDeleteResponse] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchDeleteRequest,
      options: TransportRequestOptions
    ): js.Promise[AsyncSearchDeleteResponse] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchDeleteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AsyncSearchDeleteResponse, Any]] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchDeleteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AsyncSearchDeleteResponse] = js.native
    
    def get[TDocument, TAggregations](params: AsyncSearchGetRequest): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    def get[TDocument, TAggregations](params: AsyncSearchGetRequest, options: TransportRequestOptions): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    def get[TDocument, TAggregations](params: AsyncSearchGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AsyncSearchGetResponse[TDocument, TAggregations], Any]] = js.native
    def get[TDocument, TAggregations](params: AsyncSearchGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    def get[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchGetRequest): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    def get[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchGetRequest,
      options: TransportRequestOptions
    ): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    def get[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AsyncSearchGetResponse[TDocument, TAggregations], Any]] = js.native
    def get[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AsyncSearchGetResponse[TDocument, TAggregations]] = js.native
    
    def status(params: AsyncSearchStatusRequest): js.Promise[AsyncSearchStatusResponse] = js.native
    def status(params: AsyncSearchStatusRequest, options: TransportRequestOptions): js.Promise[AsyncSearchStatusResponse] = js.native
    def status(params: AsyncSearchStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AsyncSearchStatusResponse, Any]] = js.native
    def status(params: AsyncSearchStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AsyncSearchStatusResponse] = js.native
    def status(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchStatusRequest): js.Promise[AsyncSearchStatusResponse] = js.native
    def status(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[AsyncSearchStatusResponse] = js.native
    def status(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AsyncSearchStatusResponse, Any]] = js.native
    def status(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AsyncSearchStatusResponse] = js.native
    
    def submit[TDocument, TAggregations](): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: Unit, options: TransportRequestOptions): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AsyncSearchSubmitResponse[TDocument, TAggregations], Any]] = js.native
    def submit[TDocument, TAggregations](params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: AsyncSearchSubmitRequest): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: AsyncSearchSubmitRequest, options: TransportRequestOptions): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: AsyncSearchSubmitRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AsyncSearchSubmitResponse[TDocument, TAggregations], Any]] = js.native
    def submit[TDocument, TAggregations](params: AsyncSearchSubmitRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchSubmitRequest): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchSubmitRequest,
      options: TransportRequestOptions
    ): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    def submit[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchSubmitRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AsyncSearchSubmitResponse[TDocument, TAggregations], Any]] = js.native
    def submit[TDocument, TAggregations](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AsyncSearchSubmitRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AsyncSearchSubmitResponse[TDocument, TAggregations]] = js.native
    
    var transport: Transport = js.native
  }
  
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
