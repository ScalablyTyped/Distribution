package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.LogstashDeletePipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.LogstashDeletePipelineResponse
import typings.elasticElasticsearch.libApiTypesMod.LogstashGetPipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.LogstashGetPipelineResponse
import typings.elasticElasticsearch.libApiTypesMod.LogstashPutPipelineRequest
import typings.elasticElasticsearch.libApiTypesMod.LogstashPutPipelineResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiLogstashMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/logstash", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Logstash {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Logstash extends StObject {
    
    def deletePipeline(params: LogstashDeletePipelineRequest): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptions): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashDeletePipelineResponse, Any]] = js.native
    def deletePipeline(params: LogstashDeletePipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashDeletePipelineResponse] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashDeletePipelineResponse, Any]] = js.native
    def deletePipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashDeletePipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashDeletePipelineResponse] = js.native
    
    def getPipeline(params: LogstashGetPipelineRequest): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptions): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashGetPipelineResponse, Any]] = js.native
    def getPipeline(params: LogstashGetPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashGetPipelineResponse] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashGetPipelineResponse, Any]] = js.native
    def getPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashGetPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashGetPipelineResponse] = js.native
    
    def putPipeline(params: LogstashPutPipelineRequest): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptions): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[LogstashPutPipelineResponse, Any]] = js.native
    def putPipeline(params: LogstashPutPipelineRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptions
    ): js.Promise[LogstashPutPipelineResponse] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[LogstashPutPipelineResponse, Any]] = js.native
    def putPipeline(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.LogstashPutPipelineRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[LogstashPutPipelineResponse] = js.native
    
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
