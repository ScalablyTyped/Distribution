package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.SlmDeleteLifecycleRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmDeleteLifecycleResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmExecuteLifecycleRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmExecuteLifecycleResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmExecuteRetentionRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmExecuteRetentionResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmGetLifecycleRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmGetLifecycleResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmGetStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmGetStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmGetStatusRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmGetStatusResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmPutLifecycleRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmPutLifecycleResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmStartRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmStartResponse
import typings.elasticElasticsearch.libApiTypesMod.SlmStopRequest
import typings.elasticElasticsearch.libApiTypesMod.SlmStopResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiSlmMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/slm", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Slm {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Slm extends StObject {
    
    def deleteLifecycle(params: SlmDeleteLifecycleRequest): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(params: SlmDeleteLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmDeleteLifecycleResponse] = js.native
    def deleteLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmDeleteLifecycleResponse, Any]] = js.native
    def deleteLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmDeleteLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmDeleteLifecycleResponse] = js.native
    
    def executeLifecycle(params: SlmExecuteLifecycleRequest): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteLifecycleResponse, Any]] = js.native
    def executeLifecycle(params: SlmExecuteLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmExecuteLifecycleResponse] = js.native
    def executeLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmExecuteLifecycleResponse, Any]] = js.native
    def executeLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmExecuteLifecycleResponse] = js.native
    
    def executeRetention(): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptions): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptions): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(params: SlmExecuteRetentionRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmExecuteRetentionResponse] = js.native
    def executeRetention(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmExecuteRetentionResponse, Any]] = js.native
    def executeRetention(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmExecuteRetentionRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmExecuteRetentionResponse] = js.native
    
    def getLifecycle(): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(params: SlmGetLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetLifecycleResponse] = js.native
    def getLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetLifecycleResponse, Any]] = js.native
    def getLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetLifecycleResponse] = js.native
    
    def getStats(): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptions): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(params: SlmGetStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetStatsResponse] = js.native
    def getStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetStatsResponse, Any]] = js.native
    def getStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetStatsResponse] = js.native
    
    def getStatus(): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptions): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptions): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(params: SlmGetStatusRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmGetStatusResponse] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmGetStatusResponse, Any]] = js.native
    def getStatus(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmGetStatusRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmGetStatusResponse] = js.native
    
    def putLifecycle(params: SlmPutLifecycleRequest): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptions): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(params: SlmPutLifecycleRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmPutLifecycleResponse] = js.native
    def putLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmPutLifecycleResponse, Any]] = js.native
    def putLifecycle(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmPutLifecycleRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmPutLifecycleResponse] = js.native
    
    def start(): js.Promise[SlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptions): js.Promise[SlmStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptions): js.Promise[SlmStartResponse] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(params: SlmStartRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStartResponse] = js.native
    def start(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest): js.Promise[SlmStartResponse] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmStartResponse] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmStartResponse, Any]] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStartRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmStartResponse] = js.native
    
    def stop(): js.Promise[SlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptions): js.Promise[SlmStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptions): js.Promise[SlmStopResponse] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(params: SlmStopRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[SlmStopResponse] = js.native
    def stop(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest): js.Promise[SlmStopResponse] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptions
    ): js.Promise[SlmStopResponse] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[SlmStopResponse, Any]] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SlmStopRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[SlmStopResponse] = js.native
    
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
