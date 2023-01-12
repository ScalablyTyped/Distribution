package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.ClusterAllocationExplainRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterAllocationExplainResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterDeleteComponentTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterDeleteComponentTemplateResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterDeleteVotingConfigExclusionsRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterDeleteVotingConfigExclusionsResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterExistsComponentTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterExistsComponentTemplateResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterGetComponentTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterGetComponentTemplateResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterGetSettingsRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterGetSettingsResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterHealthRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterHealthResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterPendingTasksRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterPendingTasksResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterPostVotingConfigExclusionsRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterPostVotingConfigExclusionsResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterPutComponentTemplateRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterPutComponentTemplateResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterPutSettingsRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterPutSettingsResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterRemoteInfoRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterRemoteInfoResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterRerouteRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterRerouteResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterStateRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterStateResponse
import typings.elasticElasticsearch.libApiTypesMod.ClusterStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.ClusterStatsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiClusterMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/cluster", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cluster {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Cluster extends StObject {
    
    def allocationExplain(): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: Unit, options: TransportRequestOptions): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterAllocationExplainResponse, Any]] = js.native
    def allocationExplain(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: ClusterAllocationExplainRequest): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: ClusterAllocationExplainRequest, options: TransportRequestOptions): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: ClusterAllocationExplainRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterAllocationExplainResponse, Any]] = js.native
    def allocationExplain(params: ClusterAllocationExplainRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterAllocationExplainRequest): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterAllocationExplainRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterAllocationExplainResponse] = js.native
    def allocationExplain(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterAllocationExplainRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterAllocationExplainResponse, Any]] = js.native
    def allocationExplain(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterAllocationExplainRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterAllocationExplainResponse] = js.native
    
    def deleteComponentTemplate(params: ClusterDeleteComponentTemplateRequest): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    def deleteComponentTemplate(params: ClusterDeleteComponentTemplateRequest, options: TransportRequestOptions): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    def deleteComponentTemplate(params: ClusterDeleteComponentTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterDeleteComponentTemplateResponse, Any]] = js.native
    def deleteComponentTemplate(params: ClusterDeleteComponentTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    def deleteComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteComponentTemplateRequest
    ): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    def deleteComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteComponentTemplateRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    def deleteComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteComponentTemplateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterDeleteComponentTemplateResponse, Any]] = js.native
    def deleteComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteComponentTemplateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterDeleteComponentTemplateResponse] = js.native
    
    def deleteVotingConfigExclusions(): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(params: Unit, options: TransportRequestOptions): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterDeleteVotingConfigExclusionsResponse, Any]] = js.native
    def deleteVotingConfigExclusions(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(params: ClusterDeleteVotingConfigExclusionsRequest): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(params: ClusterDeleteVotingConfigExclusionsRequest, options: TransportRequestOptions): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(params: ClusterDeleteVotingConfigExclusionsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterDeleteVotingConfigExclusionsResponse, Any]] = js.native
    def deleteVotingConfigExclusions(params: ClusterDeleteVotingConfigExclusionsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteVotingConfigExclusionsRequest
    ): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteVotingConfigExclusionsRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    def deleteVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteVotingConfigExclusionsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterDeleteVotingConfigExclusionsResponse, Any]] = js.native
    def deleteVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterDeleteVotingConfigExclusionsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterDeleteVotingConfigExclusionsResponse] = js.native
    
    def existsComponentTemplate(params: ClusterExistsComponentTemplateRequest): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    def existsComponentTemplate(params: ClusterExistsComponentTemplateRequest, options: TransportRequestOptions): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    def existsComponentTemplate(params: ClusterExistsComponentTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterExistsComponentTemplateResponse, Any]] = js.native
    def existsComponentTemplate(params: ClusterExistsComponentTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    def existsComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterExistsComponentTemplateRequest
    ): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    def existsComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterExistsComponentTemplateRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    def existsComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterExistsComponentTemplateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterExistsComponentTemplateResponse, Any]] = js.native
    def existsComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterExistsComponentTemplateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterExistsComponentTemplateResponse] = js.native
    
    def getComponentTemplate(): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: Unit, options: TransportRequestOptions): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterGetComponentTemplateResponse, Any]] = js.native
    def getComponentTemplate(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: ClusterGetComponentTemplateRequest): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: ClusterGetComponentTemplateRequest, options: TransportRequestOptions): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: ClusterGetComponentTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterGetComponentTemplateResponse, Any]] = js.native
    def getComponentTemplate(params: ClusterGetComponentTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetComponentTemplateRequest): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetComponentTemplateRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    def getComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetComponentTemplateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterGetComponentTemplateResponse, Any]] = js.native
    def getComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetComponentTemplateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterGetComponentTemplateResponse] = js.native
    
    def getSettings(): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: Unit, options: TransportRequestOptions): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterGetSettingsResponse, Any]] = js.native
    def getSettings(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: ClusterGetSettingsRequest): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: ClusterGetSettingsRequest, options: TransportRequestOptions): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: ClusterGetSettingsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterGetSettingsResponse, Any]] = js.native
    def getSettings(params: ClusterGetSettingsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetSettingsRequest): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetSettingsRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterGetSettingsResponse] = js.native
    def getSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetSettingsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterGetSettingsResponse, Any]] = js.native
    def getSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterGetSettingsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterGetSettingsResponse] = js.native
    
    def health(): js.Promise[ClusterHealthResponse] = js.native
    def health(params: Unit, options: TransportRequestOptions): js.Promise[ClusterHealthResponse] = js.native
    def health(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterHealthResponse, Any]] = js.native
    def health(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterHealthResponse] = js.native
    def health(params: ClusterHealthRequest): js.Promise[ClusterHealthResponse] = js.native
    def health(params: ClusterHealthRequest, options: TransportRequestOptions): js.Promise[ClusterHealthResponse] = js.native
    def health(params: ClusterHealthRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterHealthResponse, Any]] = js.native
    def health(params: ClusterHealthRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterHealthResponse] = js.native
    def health(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterHealthRequest): js.Promise[ClusterHealthResponse] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterHealthRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterHealthResponse] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterHealthRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterHealthResponse, Any]] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterHealthRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterHealthResponse] = js.native
    
    def pendingTasks(): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptions): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPendingTasksResponse, Any]] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: ClusterPendingTasksRequest): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: ClusterPendingTasksRequest, options: TransportRequestOptions): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: ClusterPendingTasksRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPendingTasksResponse, Any]] = js.native
    def pendingTasks(params: ClusterPendingTasksRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPendingTasksRequest): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPendingTasksRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterPendingTasksResponse] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPendingTasksRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterPendingTasksResponse, Any]] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPendingTasksRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterPendingTasksResponse] = js.native
    
    def postVotingConfigExclusions(): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(params: Unit, options: TransportRequestOptions): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPostVotingConfigExclusionsResponse, Any]] = js.native
    def postVotingConfigExclusions(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(params: ClusterPostVotingConfigExclusionsRequest): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(params: ClusterPostVotingConfigExclusionsRequest, options: TransportRequestOptions): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(params: ClusterPostVotingConfigExclusionsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPostVotingConfigExclusionsResponse, Any]] = js.native
    def postVotingConfigExclusions(params: ClusterPostVotingConfigExclusionsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPostVotingConfigExclusionsRequest
    ): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPostVotingConfigExclusionsRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    def postVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPostVotingConfigExclusionsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterPostVotingConfigExclusionsResponse, Any]] = js.native
    def postVotingConfigExclusions(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPostVotingConfigExclusionsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterPostVotingConfigExclusionsResponse] = js.native
    
    def putComponentTemplate(params: ClusterPutComponentTemplateRequest): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    def putComponentTemplate(params: ClusterPutComponentTemplateRequest, options: TransportRequestOptions): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    def putComponentTemplate(params: ClusterPutComponentTemplateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPutComponentTemplateResponse, Any]] = js.native
    def putComponentTemplate(params: ClusterPutComponentTemplateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    def putComponentTemplate(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutComponentTemplateRequest): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    def putComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutComponentTemplateRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    def putComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutComponentTemplateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterPutComponentTemplateResponse, Any]] = js.native
    def putComponentTemplate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutComponentTemplateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterPutComponentTemplateResponse] = js.native
    
    def putSettings(): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: Unit, options: TransportRequestOptions): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPutSettingsResponse, Any]] = js.native
    def putSettings(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: ClusterPutSettingsRequest): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: ClusterPutSettingsRequest, options: TransportRequestOptions): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: ClusterPutSettingsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterPutSettingsResponse, Any]] = js.native
    def putSettings(params: ClusterPutSettingsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutSettingsRequest): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutSettingsRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterPutSettingsResponse] = js.native
    def putSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutSettingsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterPutSettingsResponse, Any]] = js.native
    def putSettings(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterPutSettingsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterPutSettingsResponse] = js.native
    
    def remoteInfo(): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: Unit, options: TransportRequestOptions): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterRemoteInfoResponse, Any]] = js.native
    def remoteInfo(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: ClusterRemoteInfoRequest): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: ClusterRemoteInfoRequest, options: TransportRequestOptions): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: ClusterRemoteInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterRemoteInfoResponse, Any]] = js.native
    def remoteInfo(params: ClusterRemoteInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoRequest): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterRemoteInfoResponse] = js.native
    def remoteInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterRemoteInfoResponse, Any]] = js.native
    def remoteInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRemoteInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterRemoteInfoResponse] = js.native
    
    def reroute(): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: Unit, options: TransportRequestOptions): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterRerouteResponse, Any]] = js.native
    def reroute(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: ClusterRerouteRequest): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: ClusterRerouteRequest, options: TransportRequestOptions): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: ClusterRerouteRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterRerouteResponse, Any]] = js.native
    def reroute(params: ClusterRerouteRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRerouteRequest): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRerouteRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterRerouteResponse] = js.native
    def reroute(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRerouteRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterRerouteResponse, Any]] = js.native
    def reroute(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterRerouteRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterRerouteResponse] = js.native
    
    def state(): js.Promise[ClusterStateResponse] = js.native
    def state(params: Unit, options: TransportRequestOptions): js.Promise[ClusterStateResponse] = js.native
    def state(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterStateResponse, Any]] = js.native
    def state(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterStateResponse] = js.native
    def state(params: ClusterStateRequest): js.Promise[ClusterStateResponse] = js.native
    def state(params: ClusterStateRequest, options: TransportRequestOptions): js.Promise[ClusterStateResponse] = js.native
    def state(params: ClusterStateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterStateResponse, Any]] = js.native
    def state(params: ClusterStateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterStateResponse] = js.native
    def state(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStateRequest): js.Promise[ClusterStateResponse] = js.native
    def state(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStateRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterStateResponse] = js.native
    def state(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterStateResponse, Any]] = js.native
    def state(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterStateResponse] = js.native
    
    def stats(): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: ClusterStatsRequest): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: ClusterStatsRequest, options: TransportRequestOptions): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: ClusterStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[ClusterStatsResponse, Any]] = js.native
    def stats(params: ClusterStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[ClusterStatsResponse] = js.native
    def stats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStatsRequest): js.Promise[ClusterStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[ClusterStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[ClusterStatsResponse, Any]] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ClusterStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[ClusterStatsResponse] = js.native
    
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
