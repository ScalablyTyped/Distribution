package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.AutoscalingDeleteAutoscalingPolicyRequest
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingDeleteAutoscalingPolicyResponse
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingGetAutoscalingCapacityRequest
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingGetAutoscalingCapacityResponse
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingGetAutoscalingPolicyRequest
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingGetAutoscalingPolicyResponse
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingPutAutoscalingPolicyRequest
import typings.elasticElasticsearch.libApiTypesMod.AutoscalingPutAutoscalingPolicyResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiAutoscalingMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/autoscaling", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Autoscaling {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Autoscaling extends StObject {
    
    def deleteAutoscalingPolicy(params: AutoscalingDeleteAutoscalingPolicyRequest): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    def deleteAutoscalingPolicy(params: AutoscalingDeleteAutoscalingPolicyRequest, options: TransportRequestOptions): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    def deleteAutoscalingPolicy(params: AutoscalingDeleteAutoscalingPolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AutoscalingDeleteAutoscalingPolicyResponse, Any]] = js.native
    def deleteAutoscalingPolicy(params: AutoscalingDeleteAutoscalingPolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    def deleteAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingDeleteAutoscalingPolicyRequest
    ): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    def deleteAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingDeleteAutoscalingPolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    def deleteAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingDeleteAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AutoscalingDeleteAutoscalingPolicyResponse, Any]] = js.native
    def deleteAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingDeleteAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AutoscalingDeleteAutoscalingPolicyResponse] = js.native
    
    def getAutoscalingCapacity(): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(params: Unit, options: TransportRequestOptions): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AutoscalingGetAutoscalingCapacityResponse, Any]] = js.native
    def getAutoscalingCapacity(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(params: AutoscalingGetAutoscalingCapacityRequest): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(params: AutoscalingGetAutoscalingCapacityRequest, options: TransportRequestOptions): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(params: AutoscalingGetAutoscalingCapacityRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AutoscalingGetAutoscalingCapacityResponse, Any]] = js.native
    def getAutoscalingCapacity(params: AutoscalingGetAutoscalingCapacityRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingCapacityRequest
    ): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingCapacityRequest,
      options: TransportRequestOptions
    ): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    def getAutoscalingCapacity(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingCapacityRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AutoscalingGetAutoscalingCapacityResponse, Any]] = js.native
    def getAutoscalingCapacity(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingCapacityRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AutoscalingGetAutoscalingCapacityResponse] = js.native
    
    def getAutoscalingPolicy(params: AutoscalingGetAutoscalingPolicyRequest): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    def getAutoscalingPolicy(params: AutoscalingGetAutoscalingPolicyRequest, options: TransportRequestOptions): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    def getAutoscalingPolicy(params: AutoscalingGetAutoscalingPolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AutoscalingGetAutoscalingPolicyResponse, Any]] = js.native
    def getAutoscalingPolicy(params: AutoscalingGetAutoscalingPolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    def getAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingPolicyRequest
    ): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    def getAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingPolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    def getAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AutoscalingGetAutoscalingPolicyResponse, Any]] = js.native
    def getAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingGetAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AutoscalingGetAutoscalingPolicyResponse] = js.native
    
    def putAutoscalingPolicy(params: AutoscalingPutAutoscalingPolicyRequest): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    def putAutoscalingPolicy(params: AutoscalingPutAutoscalingPolicyRequest, options: TransportRequestOptions): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    def putAutoscalingPolicy(params: AutoscalingPutAutoscalingPolicyRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[AutoscalingPutAutoscalingPolicyResponse, Any]] = js.native
    def putAutoscalingPolicy(params: AutoscalingPutAutoscalingPolicyRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    def putAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingPutAutoscalingPolicyRequest
    ): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    def putAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingPutAutoscalingPolicyRequest,
      options: TransportRequestOptions
    ): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    def putAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingPutAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[AutoscalingPutAutoscalingPolicyResponse, Any]] = js.native
    def putAutoscalingPolicy(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AutoscalingPutAutoscalingPolicyRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[AutoscalingPutAutoscalingPolicyResponse] = js.native
    
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
