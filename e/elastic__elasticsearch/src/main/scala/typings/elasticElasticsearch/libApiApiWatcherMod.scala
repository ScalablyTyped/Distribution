package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.WatcherAckWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherAckWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherActivateWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherActivateWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherDeactivateWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherDeactivateWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherDeleteWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherDeleteWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherExecuteWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherExecuteWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherGetWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherGetWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherPutWatchRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherPutWatchResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherQueryWatchesRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherQueryWatchesResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherStartRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherStartResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.WatcherStopRequest
import typings.elasticElasticsearch.libApiTypesMod.WatcherStopResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiWatcherMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/watcher", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Watcher {
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: That] (val x: Self) extends AnyVal {
      
      inline def setTransport(value: Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Watcher extends StObject {
    
    def ackWatch(params: WatcherAckWatchRequest): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptions): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherAckWatchResponse, Any]] = js.native
    def ackWatch(params: WatcherAckWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherAckWatchResponse] = js.native
    def ackWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherAckWatchResponse, Any]] = js.native
    def ackWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherAckWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherAckWatchResponse] = js.native
    
    def activateWatch(params: WatcherActivateWatchRequest): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptions): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherActivateWatchResponse, Any]] = js.native
    def activateWatch(params: WatcherActivateWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherActivateWatchResponse] = js.native
    def activateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherActivateWatchResponse, Any]] = js.native
    def activateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherActivateWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherActivateWatchResponse] = js.native
    
    def deactivateWatch(params: WatcherDeactivateWatchRequest): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptions): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherDeactivateWatchResponse, Any]] = js.native
    def deactivateWatch(params: WatcherDeactivateWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherDeactivateWatchResponse] = js.native
    def deactivateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherDeactivateWatchResponse, Any]] = js.native
    def deactivateWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeactivateWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherDeactivateWatchResponse] = js.native
    
    def deleteWatch(params: WatcherDeleteWatchRequest): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptions): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherDeleteWatchResponse, Any]] = js.native
    def deleteWatch(params: WatcherDeleteWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherDeleteWatchResponse] = js.native
    def deleteWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherDeleteWatchResponse, Any]] = js.native
    def deleteWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherDeleteWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherDeleteWatchResponse] = js.native
    
    def executeWatch(): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptions): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptions): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(params: WatcherExecuteWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherExecuteWatchResponse] = js.native
    def executeWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherExecuteWatchResponse, Any]] = js.native
    def executeWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherExecuteWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherExecuteWatchResponse] = js.native
    
    def getWatch(params: WatcherGetWatchRequest): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptions): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherGetWatchResponse, Any]] = js.native
    def getWatch(params: WatcherGetWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherGetWatchResponse] = js.native
    def getWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherGetWatchResponse, Any]] = js.native
    def getWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherGetWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherGetWatchResponse] = js.native
    
    def putWatch(params: WatcherPutWatchRequest): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptions): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherPutWatchResponse, Any]] = js.native
    def putWatch(params: WatcherPutWatchRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherPutWatchResponse] = js.native
    def putWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherPutWatchResponse, Any]] = js.native
    def putWatch(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherPutWatchRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherPutWatchResponse] = js.native
    
    def queryWatches(): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptions): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptions): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(params: WatcherQueryWatchesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherQueryWatchesResponse] = js.native
    def queryWatches(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherQueryWatchesResponse, Any]] = js.native
    def queryWatches(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherQueryWatchesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherQueryWatchesResponse] = js.native
    
    def start(): js.Promise[WatcherStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStartResponse] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptions): js.Promise[WatcherStartResponse] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(params: WatcherStartRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStartResponse] = js.native
    def start(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest): js.Promise[WatcherStartResponse] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStartResponse] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStartResponse, Any]] = js.native
    def start(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStartRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStartResponse] = js.native
    
    def stats(): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptions): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(params: WatcherStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStatsResponse] = js.native
    def stats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest): js.Promise[WatcherStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStatsResponse, Any]] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStatsResponse] = js.native
    
    def stop(): js.Promise[WatcherStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptions): js.Promise[WatcherStopResponse] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptions): js.Promise[WatcherStopResponse] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(params: WatcherStopRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[WatcherStopResponse] = js.native
    def stop(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest): js.Promise[WatcherStopResponse] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptions
    ): js.Promise[WatcherStopResponse] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[WatcherStopResponse, Any]] = js.native
    def stop(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.WatcherStopRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[WatcherStopResponse] = js.native
    
    var transport: Transport = js.native
  }
}
