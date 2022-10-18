package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.FleetGlobalCheckpointsRequest
import typings.elasticElasticsearch.libApiTypesMod.FleetGlobalCheckpointsResponse
import typings.elasticElasticsearch.libApiTypesMod.FleetMsearchRequest
import typings.elasticElasticsearch.libApiTypesMod.FleetMsearchResponse
import typings.elasticElasticsearch.libApiTypesMod.FleetSearchRequest
import typings.elasticElasticsearch.libApiTypesMod.FleetSearchResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiFleetMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/fleet", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Fleet {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Fleet extends StObject {
    
    def globalCheckpoints(params: FleetGlobalCheckpointsRequest): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    def globalCheckpoints(params: FleetGlobalCheckpointsRequest, options: TransportRequestOptions): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    def globalCheckpoints(params: FleetGlobalCheckpointsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FleetGlobalCheckpointsResponse, Any]] = js.native
    def globalCheckpoints(params: FleetGlobalCheckpointsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    def globalCheckpoints(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetGlobalCheckpointsRequest): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    def globalCheckpoints(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetGlobalCheckpointsRequest,
      options: TransportRequestOptions
    ): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    def globalCheckpoints(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetGlobalCheckpointsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FleetGlobalCheckpointsResponse, Any]] = js.native
    def globalCheckpoints(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetGlobalCheckpointsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FleetGlobalCheckpointsResponse] = js.native
    
    def msearch[TDocument](params: FleetMsearchRequest): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    def msearch[TDocument](params: FleetMsearchRequest, options: TransportRequestOptions): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    def msearch[TDocument](params: FleetMsearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FleetMsearchResponse[TDocument], Any]] = js.native
    def msearch[TDocument](params: FleetMsearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    def msearch[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetMsearchRequest): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    def msearch[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetMsearchRequest,
      options: TransportRequestOptions
    ): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    def msearch[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetMsearchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FleetMsearchResponse[TDocument], Any]] = js.native
    def msearch[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetMsearchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FleetMsearchResponse[TDocument]] = js.native
    
    def search[TDocument](params: FleetSearchRequest): js.Promise[FleetSearchResponse[TDocument]] = js.native
    def search[TDocument](params: FleetSearchRequest, options: TransportRequestOptions): js.Promise[FleetSearchResponse[TDocument]] = js.native
    def search[TDocument](params: FleetSearchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[FleetSearchResponse[TDocument], Any]] = js.native
    def search[TDocument](params: FleetSearchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[FleetSearchResponse[TDocument]] = js.native
    def search[TDocument](params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetSearchRequest): js.Promise[FleetSearchResponse[TDocument]] = js.native
    def search[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetSearchRequest,
      options: TransportRequestOptions
    ): js.Promise[FleetSearchResponse[TDocument]] = js.native
    def search[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetSearchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[FleetSearchResponse[TDocument], Any]] = js.native
    def search[TDocument](
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.FleetSearchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[FleetSearchResponse[TDocument]] = js.native
    
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
    
    extension [Self <: That](x: Self) {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
