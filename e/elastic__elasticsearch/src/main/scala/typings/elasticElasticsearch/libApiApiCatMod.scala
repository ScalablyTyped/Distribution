package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.CatAliasesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatAliasesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatAllocationRequest
import typings.elasticElasticsearch.libApiTypesMod.CatAllocationResponse
import typings.elasticElasticsearch.libApiTypesMod.CatComponentTemplatesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatComponentTemplatesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatCountRequest
import typings.elasticElasticsearch.libApiTypesMod.CatCountResponse
import typings.elasticElasticsearch.libApiTypesMod.CatFielddataRequest
import typings.elasticElasticsearch.libApiTypesMod.CatFielddataResponse
import typings.elasticElasticsearch.libApiTypesMod.CatHealthRequest
import typings.elasticElasticsearch.libApiTypesMod.CatHealthResponse
import typings.elasticElasticsearch.libApiTypesMod.CatHelpRequest
import typings.elasticElasticsearch.libApiTypesMod.CatHelpResponse
import typings.elasticElasticsearch.libApiTypesMod.CatIndicesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatIndicesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatMasterRequest
import typings.elasticElasticsearch.libApiTypesMod.CatMasterResponse
import typings.elasticElasticsearch.libApiTypesMod.CatMlDataFrameAnalyticsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatMlDataFrameAnalyticsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatMlDatafeedsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatMlDatafeedsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatMlJobsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatMlJobsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatMlTrainedModelsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatMlTrainedModelsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatNodeattrsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatNodeattrsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatNodesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatNodesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatPendingTasksRequest
import typings.elasticElasticsearch.libApiTypesMod.CatPendingTasksResponse
import typings.elasticElasticsearch.libApiTypesMod.CatPluginsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatPluginsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatRecoveryRequest
import typings.elasticElasticsearch.libApiTypesMod.CatRecoveryResponse
import typings.elasticElasticsearch.libApiTypesMod.CatRepositoriesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatRepositoriesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatSegmentsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatSegmentsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatShardsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatShardsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatSnapshotsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatSnapshotsResponse
import typings.elasticElasticsearch.libApiTypesMod.CatTasksRequest
import typings.elasticElasticsearch.libApiTypesMod.CatTasksResponse
import typings.elasticElasticsearch.libApiTypesMod.CatTemplatesRequest
import typings.elasticElasticsearch.libApiTypesMod.CatTemplatesResponse
import typings.elasticElasticsearch.libApiTypesMod.CatThreadPoolRequest
import typings.elasticElasticsearch.libApiTypesMod.CatThreadPoolResponse
import typings.elasticElasticsearch.libApiTypesMod.CatTransformsRequest
import typings.elasticElasticsearch.libApiTypesMod.CatTransformsResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiCatMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/cat", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Cat {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Cat extends StObject {
    
    def aliases(): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: Unit, options: TransportRequestOptions): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatAliasesResponse, Any]] = js.native
    def aliases(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: CatAliasesRequest): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: CatAliasesRequest, options: TransportRequestOptions): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: CatAliasesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatAliasesResponse, Any]] = js.native
    def aliases(params: CatAliasesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatAliasesResponse] = js.native
    def aliases(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAliasesRequest): js.Promise[CatAliasesResponse] = js.native
    def aliases(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAliasesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatAliasesResponse] = js.native
    def aliases(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAliasesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatAliasesResponse, Any]] = js.native
    def aliases(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAliasesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatAliasesResponse] = js.native
    
    def allocation(): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: Unit, options: TransportRequestOptions): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatAllocationResponse, Any]] = js.native
    def allocation(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: CatAllocationRequest): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: CatAllocationRequest, options: TransportRequestOptions): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: CatAllocationRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatAllocationResponse, Any]] = js.native
    def allocation(params: CatAllocationRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatAllocationResponse] = js.native
    def allocation(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAllocationRequest): js.Promise[CatAllocationResponse] = js.native
    def allocation(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAllocationRequest,
      options: TransportRequestOptions
    ): js.Promise[CatAllocationResponse] = js.native
    def allocation(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAllocationRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatAllocationResponse, Any]] = js.native
    def allocation(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatAllocationRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatAllocationResponse] = js.native
    
    def componentTemplates(): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: Unit, options: TransportRequestOptions): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatComponentTemplatesResponse, Any]] = js.native
    def componentTemplates(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: CatComponentTemplatesRequest): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: CatComponentTemplatesRequest, options: TransportRequestOptions): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: CatComponentTemplatesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatComponentTemplatesResponse, Any]] = js.native
    def componentTemplates(params: CatComponentTemplatesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatComponentTemplatesRequest): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatComponentTemplatesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatComponentTemplatesResponse] = js.native
    def componentTemplates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatComponentTemplatesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatComponentTemplatesResponse, Any]] = js.native
    def componentTemplates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatComponentTemplatesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatComponentTemplatesResponse] = js.native
    
    def count(): js.Promise[CatCountResponse] = js.native
    def count(params: Unit, options: TransportRequestOptions): js.Promise[CatCountResponse] = js.native
    def count(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatCountResponse, Any]] = js.native
    def count(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatCountResponse] = js.native
    def count(params: CatCountRequest): js.Promise[CatCountResponse] = js.native
    def count(params: CatCountRequest, options: TransportRequestOptions): js.Promise[CatCountResponse] = js.native
    def count(params: CatCountRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatCountResponse, Any]] = js.native
    def count(params: CatCountRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatCountResponse] = js.native
    def count(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatCountRequest): js.Promise[CatCountResponse] = js.native
    def count(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatCountRequest,
      options: TransportRequestOptions
    ): js.Promise[CatCountResponse] = js.native
    def count(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatCountRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatCountResponse, Any]] = js.native
    def count(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatCountRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatCountResponse] = js.native
    
    def fielddata(): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: Unit, options: TransportRequestOptions): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatFielddataResponse, Any]] = js.native
    def fielddata(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: CatFielddataRequest): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: CatFielddataRequest, options: TransportRequestOptions): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: CatFielddataRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatFielddataResponse, Any]] = js.native
    def fielddata(params: CatFielddataRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatFielddataResponse] = js.native
    def fielddata(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatFielddataRequest): js.Promise[CatFielddataResponse] = js.native
    def fielddata(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatFielddataRequest,
      options: TransportRequestOptions
    ): js.Promise[CatFielddataResponse] = js.native
    def fielddata(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatFielddataRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatFielddataResponse, Any]] = js.native
    def fielddata(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatFielddataRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatFielddataResponse] = js.native
    
    def health(): js.Promise[CatHealthResponse] = js.native
    def health(params: Unit, options: TransportRequestOptions): js.Promise[CatHealthResponse] = js.native
    def health(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatHealthResponse, Any]] = js.native
    def health(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatHealthResponse] = js.native
    def health(params: CatHealthRequest): js.Promise[CatHealthResponse] = js.native
    def health(params: CatHealthRequest, options: TransportRequestOptions): js.Promise[CatHealthResponse] = js.native
    def health(params: CatHealthRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatHealthResponse, Any]] = js.native
    def health(params: CatHealthRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatHealthResponse] = js.native
    def health(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHealthRequest): js.Promise[CatHealthResponse] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHealthRequest,
      options: TransportRequestOptions
    ): js.Promise[CatHealthResponse] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHealthRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatHealthResponse, Any]] = js.native
    def health(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHealthRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatHealthResponse] = js.native
    
    def help(): js.Promise[CatHelpResponse] = js.native
    def help(params: Unit, options: TransportRequestOptions): js.Promise[CatHelpResponse] = js.native
    def help(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatHelpResponse, Any]] = js.native
    def help(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatHelpResponse] = js.native
    def help(params: CatHelpRequest): js.Promise[CatHelpResponse] = js.native
    def help(params: CatHelpRequest, options: TransportRequestOptions): js.Promise[CatHelpResponse] = js.native
    def help(params: CatHelpRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatHelpResponse, Any]] = js.native
    def help(params: CatHelpRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatHelpResponse] = js.native
    def help(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHelpRequest): js.Promise[CatHelpResponse] = js.native
    def help(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHelpRequest,
      options: TransportRequestOptions
    ): js.Promise[CatHelpResponse] = js.native
    def help(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHelpRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatHelpResponse, Any]] = js.native
    def help(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatHelpRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatHelpResponse] = js.native
    
    def indices(): js.Promise[CatIndicesResponse] = js.native
    def indices(params: Unit, options: TransportRequestOptions): js.Promise[CatIndicesResponse] = js.native
    def indices(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatIndicesResponse, Any]] = js.native
    def indices(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatIndicesResponse] = js.native
    def indices(params: CatIndicesRequest): js.Promise[CatIndicesResponse] = js.native
    def indices(params: CatIndicesRequest, options: TransportRequestOptions): js.Promise[CatIndicesResponse] = js.native
    def indices(params: CatIndicesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatIndicesResponse, Any]] = js.native
    def indices(params: CatIndicesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatIndicesResponse] = js.native
    def indices(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatIndicesRequest): js.Promise[CatIndicesResponse] = js.native
    def indices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatIndicesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatIndicesResponse] = js.native
    def indices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatIndicesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatIndicesResponse, Any]] = js.native
    def indices(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatIndicesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatIndicesResponse] = js.native
    
    def master(): js.Promise[CatMasterResponse] = js.native
    def master(params: Unit, options: TransportRequestOptions): js.Promise[CatMasterResponse] = js.native
    def master(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMasterResponse, Any]] = js.native
    def master(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMasterResponse] = js.native
    def master(params: CatMasterRequest): js.Promise[CatMasterResponse] = js.native
    def master(params: CatMasterRequest, options: TransportRequestOptions): js.Promise[CatMasterResponse] = js.native
    def master(params: CatMasterRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMasterResponse, Any]] = js.native
    def master(params: CatMasterRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMasterResponse] = js.native
    def master(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMasterRequest): js.Promise[CatMasterResponse] = js.native
    def master(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMasterRequest,
      options: TransportRequestOptions
    ): js.Promise[CatMasterResponse] = js.native
    def master(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMasterRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatMasterResponse, Any]] = js.native
    def master(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMasterRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatMasterResponse] = js.native
    
    def mlDataFrameAnalytics(): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: Unit, options: TransportRequestOptions): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlDataFrameAnalyticsResponse, Any]] = js.native
    def mlDataFrameAnalytics(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: CatMlDataFrameAnalyticsRequest): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: CatMlDataFrameAnalyticsRequest, options: TransportRequestOptions): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: CatMlDataFrameAnalyticsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlDataFrameAnalyticsResponse, Any]] = js.native
    def mlDataFrameAnalytics(params: CatMlDataFrameAnalyticsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDataFrameAnalyticsRequest): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDataFrameAnalyticsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    def mlDataFrameAnalytics(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDataFrameAnalyticsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatMlDataFrameAnalyticsResponse, Any]] = js.native
    def mlDataFrameAnalytics(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDataFrameAnalyticsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatMlDataFrameAnalyticsResponse] = js.native
    
    def mlDatafeeds(): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: Unit, options: TransportRequestOptions): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlDatafeedsResponse, Any]] = js.native
    def mlDatafeeds(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: CatMlDatafeedsRequest): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: CatMlDatafeedsRequest, options: TransportRequestOptions): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: CatMlDatafeedsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlDatafeedsResponse, Any]] = js.native
    def mlDatafeeds(params: CatMlDatafeedsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDatafeedsRequest): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDatafeedsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatMlDatafeedsResponse] = js.native
    def mlDatafeeds(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDatafeedsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatMlDatafeedsResponse, Any]] = js.native
    def mlDatafeeds(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlDatafeedsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatMlDatafeedsResponse] = js.native
    
    def mlJobs(): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: Unit, options: TransportRequestOptions): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlJobsResponse, Any]] = js.native
    def mlJobs(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: CatMlJobsRequest): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: CatMlJobsRequest, options: TransportRequestOptions): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: CatMlJobsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlJobsResponse, Any]] = js.native
    def mlJobs(params: CatMlJobsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlJobsRequest): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlJobsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatMlJobsResponse] = js.native
    def mlJobs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlJobsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatMlJobsResponse, Any]] = js.native
    def mlJobs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlJobsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatMlJobsResponse] = js.native
    
    def mlTrainedModels(): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: Unit, options: TransportRequestOptions): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlTrainedModelsResponse, Any]] = js.native
    def mlTrainedModels(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: CatMlTrainedModelsRequest): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: CatMlTrainedModelsRequest, options: TransportRequestOptions): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: CatMlTrainedModelsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatMlTrainedModelsResponse, Any]] = js.native
    def mlTrainedModels(params: CatMlTrainedModelsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlTrainedModelsRequest): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlTrainedModelsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatMlTrainedModelsResponse] = js.native
    def mlTrainedModels(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlTrainedModelsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatMlTrainedModelsResponse, Any]] = js.native
    def mlTrainedModels(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatMlTrainedModelsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatMlTrainedModelsResponse] = js.native
    
    def nodeattrs(): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: Unit, options: TransportRequestOptions): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatNodeattrsResponse, Any]] = js.native
    def nodeattrs(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: CatNodeattrsRequest): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: CatNodeattrsRequest, options: TransportRequestOptions): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: CatNodeattrsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatNodeattrsResponse, Any]] = js.native
    def nodeattrs(params: CatNodeattrsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodeattrsRequest): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodeattrsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatNodeattrsResponse] = js.native
    def nodeattrs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodeattrsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatNodeattrsResponse, Any]] = js.native
    def nodeattrs(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodeattrsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatNodeattrsResponse] = js.native
    
    def nodes(): js.Promise[CatNodesResponse] = js.native
    def nodes(params: Unit, options: TransportRequestOptions): js.Promise[CatNodesResponse] = js.native
    def nodes(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatNodesResponse, Any]] = js.native
    def nodes(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatNodesResponse] = js.native
    def nodes(params: CatNodesRequest): js.Promise[CatNodesResponse] = js.native
    def nodes(params: CatNodesRequest, options: TransportRequestOptions): js.Promise[CatNodesResponse] = js.native
    def nodes(params: CatNodesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatNodesResponse, Any]] = js.native
    def nodes(params: CatNodesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatNodesResponse] = js.native
    def nodes(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodesRequest): js.Promise[CatNodesResponse] = js.native
    def nodes(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatNodesResponse] = js.native
    def nodes(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatNodesResponse, Any]] = js.native
    def nodes(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatNodesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatNodesResponse] = js.native
    
    def pendingTasks(): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptions): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatPendingTasksResponse, Any]] = js.native
    def pendingTasks(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: CatPendingTasksRequest): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: CatPendingTasksRequest, options: TransportRequestOptions): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: CatPendingTasksRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatPendingTasksResponse, Any]] = js.native
    def pendingTasks(params: CatPendingTasksRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPendingTasksRequest): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPendingTasksRequest,
      options: TransportRequestOptions
    ): js.Promise[CatPendingTasksResponse] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPendingTasksRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatPendingTasksResponse, Any]] = js.native
    def pendingTasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPendingTasksRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatPendingTasksResponse] = js.native
    
    def plugins(): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: Unit, options: TransportRequestOptions): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatPluginsResponse, Any]] = js.native
    def plugins(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: CatPluginsRequest): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: CatPluginsRequest, options: TransportRequestOptions): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: CatPluginsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatPluginsResponse, Any]] = js.native
    def plugins(params: CatPluginsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatPluginsResponse] = js.native
    def plugins(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPluginsRequest): js.Promise[CatPluginsResponse] = js.native
    def plugins(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPluginsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatPluginsResponse] = js.native
    def plugins(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPluginsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatPluginsResponse, Any]] = js.native
    def plugins(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatPluginsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatPluginsResponse] = js.native
    
    def recovery(): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: Unit, options: TransportRequestOptions): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatRecoveryResponse, Any]] = js.native
    def recovery(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: CatRecoveryRequest): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: CatRecoveryRequest, options: TransportRequestOptions): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: CatRecoveryRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatRecoveryResponse, Any]] = js.native
    def recovery(params: CatRecoveryRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatRecoveryResponse] = js.native
    def recovery(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRecoveryRequest): js.Promise[CatRecoveryResponse] = js.native
    def recovery(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRecoveryRequest,
      options: TransportRequestOptions
    ): js.Promise[CatRecoveryResponse] = js.native
    def recovery(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRecoveryRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatRecoveryResponse, Any]] = js.native
    def recovery(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRecoveryRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatRecoveryResponse] = js.native
    
    def repositories(): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: Unit, options: TransportRequestOptions): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatRepositoriesResponse, Any]] = js.native
    def repositories(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: CatRepositoriesRequest): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: CatRepositoriesRequest, options: TransportRequestOptions): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: CatRepositoriesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatRepositoriesResponse, Any]] = js.native
    def repositories(params: CatRepositoriesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRepositoriesRequest): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRepositoriesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatRepositoriesResponse] = js.native
    def repositories(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRepositoriesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatRepositoriesResponse, Any]] = js.native
    def repositories(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatRepositoriesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatRepositoriesResponse] = js.native
    
    def segments(): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: Unit, options: TransportRequestOptions): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatSegmentsResponse, Any]] = js.native
    def segments(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: CatSegmentsRequest): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: CatSegmentsRequest, options: TransportRequestOptions): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: CatSegmentsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatSegmentsResponse, Any]] = js.native
    def segments(params: CatSegmentsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatSegmentsResponse] = js.native
    def segments(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSegmentsRequest): js.Promise[CatSegmentsResponse] = js.native
    def segments(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSegmentsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatSegmentsResponse] = js.native
    def segments(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSegmentsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatSegmentsResponse, Any]] = js.native
    def segments(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSegmentsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatSegmentsResponse] = js.native
    
    def shards(): js.Promise[CatShardsResponse] = js.native
    def shards(params: Unit, options: TransportRequestOptions): js.Promise[CatShardsResponse] = js.native
    def shards(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatShardsResponse, Any]] = js.native
    def shards(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatShardsResponse] = js.native
    def shards(params: CatShardsRequest): js.Promise[CatShardsResponse] = js.native
    def shards(params: CatShardsRequest, options: TransportRequestOptions): js.Promise[CatShardsResponse] = js.native
    def shards(params: CatShardsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatShardsResponse, Any]] = js.native
    def shards(params: CatShardsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatShardsResponse] = js.native
    def shards(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatShardsRequest): js.Promise[CatShardsResponse] = js.native
    def shards(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatShardsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatShardsResponse] = js.native
    def shards(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatShardsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatShardsResponse, Any]] = js.native
    def shards(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatShardsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatShardsResponse] = js.native
    
    def snapshots(): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: Unit, options: TransportRequestOptions): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatSnapshotsResponse, Any]] = js.native
    def snapshots(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: CatSnapshotsRequest): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: CatSnapshotsRequest, options: TransportRequestOptions): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: CatSnapshotsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatSnapshotsResponse, Any]] = js.native
    def snapshots(params: CatSnapshotsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSnapshotsRequest): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSnapshotsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatSnapshotsResponse] = js.native
    def snapshots(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSnapshotsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatSnapshotsResponse, Any]] = js.native
    def snapshots(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatSnapshotsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatSnapshotsResponse] = js.native
    
    def tasks(): js.Promise[CatTasksResponse] = js.native
    def tasks(params: Unit, options: TransportRequestOptions): js.Promise[CatTasksResponse] = js.native
    def tasks(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTasksResponse, Any]] = js.native
    def tasks(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTasksResponse] = js.native
    def tasks(params: CatTasksRequest): js.Promise[CatTasksResponse] = js.native
    def tasks(params: CatTasksRequest, options: TransportRequestOptions): js.Promise[CatTasksResponse] = js.native
    def tasks(params: CatTasksRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTasksResponse, Any]] = js.native
    def tasks(params: CatTasksRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTasksResponse] = js.native
    def tasks(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTasksRequest): js.Promise[CatTasksResponse] = js.native
    def tasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTasksRequest,
      options: TransportRequestOptions
    ): js.Promise[CatTasksResponse] = js.native
    def tasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTasksRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatTasksResponse, Any]] = js.native
    def tasks(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTasksRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatTasksResponse] = js.native
    
    def templates(): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: Unit, options: TransportRequestOptions): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTemplatesResponse, Any]] = js.native
    def templates(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: CatTemplatesRequest): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: CatTemplatesRequest, options: TransportRequestOptions): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: CatTemplatesRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTemplatesResponse, Any]] = js.native
    def templates(params: CatTemplatesRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTemplatesResponse] = js.native
    def templates(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTemplatesRequest): js.Promise[CatTemplatesResponse] = js.native
    def templates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTemplatesRequest,
      options: TransportRequestOptions
    ): js.Promise[CatTemplatesResponse] = js.native
    def templates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTemplatesRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatTemplatesResponse, Any]] = js.native
    def templates(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTemplatesRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatTemplatesResponse] = js.native
    
    def threadPool(): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: Unit, options: TransportRequestOptions): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatThreadPoolResponse, Any]] = js.native
    def threadPool(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: CatThreadPoolRequest): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: CatThreadPoolRequest, options: TransportRequestOptions): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: CatThreadPoolRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatThreadPoolResponse, Any]] = js.native
    def threadPool(params: CatThreadPoolRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatThreadPoolRequest): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatThreadPoolRequest,
      options: TransportRequestOptions
    ): js.Promise[CatThreadPoolResponse] = js.native
    def threadPool(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatThreadPoolRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatThreadPoolResponse, Any]] = js.native
    def threadPool(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatThreadPoolRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatThreadPoolResponse] = js.native
    
    def transforms(): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: Unit, options: TransportRequestOptions): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTransformsResponse, Any]] = js.native
    def transforms(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: CatTransformsRequest): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: CatTransformsRequest, options: TransportRequestOptions): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: CatTransformsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CatTransformsResponse, Any]] = js.native
    def transforms(params: CatTransformsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CatTransformsResponse] = js.native
    def transforms(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTransformsRequest): js.Promise[CatTransformsResponse] = js.native
    def transforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTransformsRequest,
      options: TransportRequestOptions
    ): js.Promise[CatTransformsResponse] = js.native
    def transforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTransformsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CatTransformsResponse, Any]] = js.native
    def transforms(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CatTransformsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CatTransformsResponse] = js.native
    
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
