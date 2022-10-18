package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.NodesClearRepositoriesMeteringArchiveRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesClearRepositoriesMeteringArchiveResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesGetRepositoriesMeteringInfoRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesGetRepositoriesMeteringInfoResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesHotThreadsRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesHotThreadsResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesInfoRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesInfoResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesReloadSecureSettingsRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesReloadSecureSettingsResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.NodesUsageRequest
import typings.elasticElasticsearch.libApiTypesMod.NodesUsageResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiNodesMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/nodes", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Nodes {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Nodes extends StObject {
    
    def clearRepositoriesMeteringArchive(params: NodesClearRepositoriesMeteringArchiveRequest): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    def clearRepositoriesMeteringArchive(params: NodesClearRepositoriesMeteringArchiveRequest, options: TransportRequestOptions): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    def clearRepositoriesMeteringArchive(params: NodesClearRepositoriesMeteringArchiveRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesClearRepositoriesMeteringArchiveResponse, Any]] = js.native
    def clearRepositoriesMeteringArchive(params: NodesClearRepositoriesMeteringArchiveRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    def clearRepositoriesMeteringArchive(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesClearRepositoriesMeteringArchiveRequest
    ): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    def clearRepositoriesMeteringArchive(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesClearRepositoriesMeteringArchiveRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    def clearRepositoriesMeteringArchive(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesClearRepositoriesMeteringArchiveRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesClearRepositoriesMeteringArchiveResponse, Any]] = js.native
    def clearRepositoriesMeteringArchive(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesClearRepositoriesMeteringArchiveRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesClearRepositoriesMeteringArchiveResponse] = js.native
    
    def getRepositoriesMeteringInfo(params: NodesGetRepositoriesMeteringInfoRequest): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    def getRepositoriesMeteringInfo(params: NodesGetRepositoriesMeteringInfoRequest, options: TransportRequestOptions): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    def getRepositoriesMeteringInfo(params: NodesGetRepositoriesMeteringInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesGetRepositoriesMeteringInfoResponse, Any]] = js.native
    def getRepositoriesMeteringInfo(params: NodesGetRepositoriesMeteringInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    def getRepositoriesMeteringInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesGetRepositoriesMeteringInfoRequest
    ): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    def getRepositoriesMeteringInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesGetRepositoriesMeteringInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    def getRepositoriesMeteringInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesGetRepositoriesMeteringInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesGetRepositoriesMeteringInfoResponse, Any]] = js.native
    def getRepositoriesMeteringInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesGetRepositoriesMeteringInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesGetRepositoriesMeteringInfoResponse] = js.native
    
    def hotThreads(): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: Unit, options: TransportRequestOptions): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesHotThreadsResponse, Any]] = js.native
    def hotThreads(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: NodesHotThreadsRequest): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: NodesHotThreadsRequest, options: TransportRequestOptions): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: NodesHotThreadsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesHotThreadsResponse, Any]] = js.native
    def hotThreads(params: NodesHotThreadsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesHotThreadsRequest): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesHotThreadsRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesHotThreadsResponse] = js.native
    def hotThreads(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesHotThreadsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesHotThreadsResponse, Any]] = js.native
    def hotThreads(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesHotThreadsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesHotThreadsResponse] = js.native
    
    def info(): js.Promise[NodesInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptions): js.Promise[NodesInfoResponse] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesInfoResponse, Any]] = js.native
    def info(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesInfoResponse] = js.native
    def info(params: NodesInfoRequest): js.Promise[NodesInfoResponse] = js.native
    def info(params: NodesInfoRequest, options: TransportRequestOptions): js.Promise[NodesInfoResponse] = js.native
    def info(params: NodesInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesInfoResponse, Any]] = js.native
    def info(params: NodesInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesInfoResponse] = js.native
    def info(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesInfoRequest): js.Promise[NodesInfoResponse] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesInfoResponse] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesInfoResponse, Any]] = js.native
    def info(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesInfoResponse] = js.native
    
    def reloadSecureSettings(): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: Unit, options: TransportRequestOptions): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesReloadSecureSettingsResponse, Any]] = js.native
    def reloadSecureSettings(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: NodesReloadSecureSettingsRequest): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: NodesReloadSecureSettingsRequest, options: TransportRequestOptions): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: NodesReloadSecureSettingsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesReloadSecureSettingsResponse, Any]] = js.native
    def reloadSecureSettings(params: NodesReloadSecureSettingsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesReloadSecureSettingsRequest): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesReloadSecureSettingsRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    def reloadSecureSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesReloadSecureSettingsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesReloadSecureSettingsResponse, Any]] = js.native
    def reloadSecureSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesReloadSecureSettingsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesReloadSecureSettingsResponse] = js.native
    
    def stats(): js.Promise[NodesStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[NodesStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesStatsResponse] = js.native
    def stats(params: NodesStatsRequest): js.Promise[NodesStatsResponse] = js.native
    def stats(params: NodesStatsRequest, options: TransportRequestOptions): js.Promise[NodesStatsResponse] = js.native
    def stats(params: NodesStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesStatsResponse, Any]] = js.native
    def stats(params: NodesStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesStatsResponse] = js.native
    def stats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesStatsRequest): js.Promise[NodesStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesStatsResponse, Any]] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesStatsResponse] = js.native
    
    var transport: Transport = js.native
    
    def usage(): js.Promise[NodesUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptions): js.Promise[NodesUsageResponse] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesUsageResponse, Any]] = js.native
    def usage(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesUsageResponse] = js.native
    def usage(params: NodesUsageRequest): js.Promise[NodesUsageResponse] = js.native
    def usage(params: NodesUsageRequest, options: TransportRequestOptions): js.Promise[NodesUsageResponse] = js.native
    def usage(params: NodesUsageRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[NodesUsageResponse, Any]] = js.native
    def usage(params: NodesUsageRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[NodesUsageResponse] = js.native
    def usage(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesUsageRequest): js.Promise[NodesUsageResponse] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesUsageRequest,
      options: TransportRequestOptions
    ): js.Promise[NodesUsageResponse] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesUsageRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[NodesUsageResponse, Any]] = js.native
    def usage(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.NodesUsageRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[NodesUsageResponse] = js.native
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
