package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.IngestDeletePipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestDeletePipelineResponse
import typings.elasticElasticsearch.libApiTypesMod.IngestGeoIpStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestGeoIpStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.IngestGetPipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestGetPipelineResponse
import typings.elasticElasticsearch.libApiTypesMod.IngestProcessorGrokRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestProcessorGrokResponse
import typings.elasticElasticsearch.libApiTypesMod.IngestPutPipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestPutPipelineResponse
import typings.elasticElasticsearch.libApiTypesMod.IngestSimulateRequest
import typings.elasticElasticsearch.libApiTypesMod.IngestSimulateResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiIngestMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ingest", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ingest {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ingest extends StObject {
    
    def deletePipeline(params: IngestDeletePipelineRequest): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptions): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestDeletePipelineResponse, Any]] = js.native
    def deletePipeline(params: IngestDeletePipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestDeletePipelineResponse, Any]] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestDeletePipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestDeletePipelineResponse] = js.native
    
    def geoIpStats(): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptions): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptions): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(params: IngestGeoIpStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestGeoIpStatsResponse] = js.native
    def geoIpStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestGeoIpStatsResponse, Any]] = js.native
    def geoIpStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGeoIpStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestGeoIpStatsResponse] = js.native
    
    def getPipeline(): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptions): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptions): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(params: IngestGetPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestGetPipelineResponse] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestGetPipelineResponse, Any]] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestGetPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestGetPipelineResponse] = js.native
    
    def processorGrok(): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptions): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptions): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(params: IngestProcessorGrokRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestProcessorGrokResponse] = js.native
    def processorGrok(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestProcessorGrokResponse, Any]] = js.native
    def processorGrok(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestProcessorGrokRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestProcessorGrokResponse] = js.native
    
    def putPipeline(params: IngestPutPipelineRequest): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptions): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestPutPipelineResponse, Any]] = js.native
    def putPipeline(params: IngestPutPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestPutPipelineResponse] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestPutPipelineResponse, Any]] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestPutPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestPutPipelineResponse] = js.native
    
    def simulate(): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: Unit, options: TransportRequestOptions): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptions): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(params: IngestSimulateRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[IngestSimulateResponse] = js.native
    def simulate(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest): js.Promise[IngestSimulateResponse] = js.native
    def simulate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptions
    ): js.Promise[IngestSimulateResponse] = js.native
    def simulate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[IngestSimulateResponse, Any]] = js.native
    def simulate(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IngestSimulateRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[IngestSimulateResponse] = js.native
    
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
