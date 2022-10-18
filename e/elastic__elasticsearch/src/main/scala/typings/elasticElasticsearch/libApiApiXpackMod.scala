package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.XpackInfoRequest
import typings.elasticElasticsearch.libApiTypesMod.XpackInfoResponse
import typings.elasticElasticsearch.libApiTypesMod.XpackUsageRequest
import typings.elasticElasticsearch.libApiTypesMod.XpackUsageResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiXpackMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/xpack", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Xpack {
    def this(transport: Transport) = this()
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
  
  @js.native
  trait Xpack extends StObject {
    
    def info(): js.Promise[XpackInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptions): js.Promise[XpackInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptions): js.Promise[XpackInfoResponse] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(params: XpackInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackInfoResponse] = js.native
    def info(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest): js.Promise[XpackInfoResponse] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[XpackInfoResponse] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[XpackInfoResponse, Any]] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[XpackInfoResponse] = js.native
    
    var transport: Transport = js.native
    
    def usage(): js.Promise[XpackUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptions): js.Promise[XpackUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptions): js.Promise[XpackUsageResponse] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(params: XpackUsageRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[XpackUsageResponse] = js.native
    def usage(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest): js.Promise[XpackUsageResponse] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptions
    ): js.Promise[XpackUsageResponse] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[XpackUsageResponse, Any]] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.XpackUsageRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[XpackUsageResponse] = js.native
  }
}
