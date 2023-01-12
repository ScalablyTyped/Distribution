package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.EqlDeleteRequest
import typings.elasticElasticsearch.libApiTypesMod.EqlDeleteResponse
import typings.elasticElasticsearch.libApiTypesMod.EqlGetRequest
import typings.elasticElasticsearch.libApiTypesMod.EqlGetResponse
import typings.elasticElasticsearch.libApiTypesMod.EqlGetStatusRequest
import typings.elasticElasticsearch.libApiTypesMod.EqlGetStatusResponse
import typings.elasticElasticsearch.libApiTypesMod.EqlSearchRequest
import typings.elasticElasticsearch.libApiTypesMod.EqlSearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiEqlMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/eql", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Eql {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Eql extends StObject {
    
    def delete(params: EqlDeleteRequest): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptions): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlDeleteResponse, Any]] = js.native
    def delete(params: EqlDeleteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlDeleteResponse] = js.native
    def delete(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest): js.Promise[EqlDeleteResponse] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlDeleteResponse] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlDeleteResponse, Any]] = js.native
    def delete(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlDeleteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlDeleteResponse] = js.native
    
    def get[TEvent](params: EqlGetRequest): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptions): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlGetResponse[TEvent], Any]] = js.native
    def get[TEvent](params: EqlGetRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlGetResponse[TEvent]] = js.native
    def get[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlGetResponse[TEvent], Any]] = js.native
    def get[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlGetResponse[TEvent]] = js.native
    
    def getStatus(params: EqlGetStatusRequest): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptions): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlGetStatusResponse, Any]] = js.native
    def getStatus(params: EqlGetStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlGetStatusResponse] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlGetStatusResponse, Any]] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlGetStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlGetStatusResponse] = js.native
    
    def search[TEvent](params: EqlSearchRequest): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptions): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[EqlSearchResponse[TEvent], Any]] = js.native
    def search[TEvent](params: EqlSearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptions
    ): js.Promise[EqlSearchResponse[TEvent]] = js.native
    def search[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[EqlSearchResponse[TEvent], Any]] = js.native
    def search[TEvent](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[EqlSearchResponse[TEvent]] = js.native
    
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
