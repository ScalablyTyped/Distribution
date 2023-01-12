package typings.elasticElasticsearch

import typings.elasticElasticsearch.libApiTypesMod.CcrDeleteAutoFollowPatternRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrDeleteAutoFollowPatternResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowInfoRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowInfoResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrFollowStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrForgetFollowerRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrForgetFollowerResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrGetAutoFollowPatternRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrGetAutoFollowPatternResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrPauseAutoFollowPatternRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrPauseAutoFollowPatternResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrPauseFollowRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrPauseFollowResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrPutAutoFollowPatternRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrPutAutoFollowPatternResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrResumeAutoFollowPatternRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrResumeAutoFollowPatternResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrResumeFollowRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrResumeFollowResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrStatsRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrStatsResponse
import typings.elasticElasticsearch.libApiTypesMod.CcrUnfollowRequest
import typings.elasticElasticsearch.libApiTypesMod.CcrUnfollowResponse
import typings.elasticTransport.libTransportMod.TransportRequestOptions
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithMeta
import typings.elasticTransport.libTransportMod.TransportRequestOptionsWithOutMeta
import typings.elasticTransport.libTypesMod.TransportResult
import typings.elasticTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApiApiCcrMod {
  
  @JSImport("@elastic/elasticsearch/lib/api/api/ccr", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Ccr {
    def this(transport: Transport) = this()
  }
  
  @js.native
  trait Ccr extends StObject {
    
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrDeleteAutoFollowPatternResponse, Any]] = js.native
    def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    def deleteAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrDeleteAutoFollowPatternResponse, Any]] = js.native
    def deleteAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrDeleteAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrDeleteAutoFollowPatternResponse] = js.native
    
    def follow(params: CcrFollowRequest): js.Promise[CcrFollowResponse] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptions): js.Promise[CcrFollowResponse] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowResponse, Any]] = js.native
    def follow(params: CcrFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowResponse] = js.native
    def follow(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest): js.Promise[CcrFollowResponse] = js.native
    def follow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowResponse] = js.native
    def follow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowResponse, Any]] = js.native
    def follow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowResponse] = js.native
    
    def followInfo(params: CcrFollowInfoRequest): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptions): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowInfoResponse, Any]] = js.native
    def followInfo(params: CcrFollowInfoRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowInfoResponse] = js.native
    def followInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowInfoResponse, Any]] = js.native
    def followInfo(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowInfoRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowInfoResponse] = js.native
    
    def followStats(params: CcrFollowStatsRequest): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptions): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrFollowStatsResponse, Any]] = js.native
    def followStats(params: CcrFollowStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrFollowStatsResponse] = js.native
    def followStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrFollowStatsResponse, Any]] = js.native
    def followStats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrFollowStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrFollowStatsResponse] = js.native
    
    def forgetFollower(params: CcrForgetFollowerRequest): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptions): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrForgetFollowerResponse, Any]] = js.native
    def forgetFollower(params: CcrForgetFollowerRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrForgetFollowerResponse] = js.native
    def forgetFollower(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrForgetFollowerResponse, Any]] = js.native
    def forgetFollower(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrForgetFollowerRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrForgetFollowerResponse] = js.native
    
    def getAutoFollowPattern(): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptions): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(params: CcrGetAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    def getAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrGetAutoFollowPatternResponse, Any]] = js.native
    def getAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrGetAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrGetAutoFollowPatternResponse] = js.native
    
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPauseAutoFollowPatternResponse, Any]] = js.native
    def pauseAutoFollowPattern(params: CcrPauseAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    def pauseAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPauseAutoFollowPatternResponse, Any]] = js.native
    def pauseAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPauseAutoFollowPatternResponse] = js.native
    
    def pauseFollow(params: CcrPauseFollowRequest): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptions): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPauseFollowResponse, Any]] = js.native
    def pauseFollow(params: CcrPauseFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPauseFollowResponse] = js.native
    def pauseFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPauseFollowResponse, Any]] = js.native
    def pauseFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPauseFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPauseFollowResponse] = js.native
    
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrPutAutoFollowPatternResponse, Any]] = js.native
    def putAutoFollowPattern(params: CcrPutAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    def putAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrPutAutoFollowPatternResponse, Any]] = js.native
    def putAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrPutAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrPutAutoFollowPatternResponse] = js.native
    
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptions): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrResumeAutoFollowPatternResponse, Any]] = js.native
    def resumeAutoFollowPattern(params: CcrResumeAutoFollowPatternRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    def resumeAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrResumeAutoFollowPatternResponse, Any]] = js.native
    def resumeAutoFollowPattern(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeAutoFollowPatternRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrResumeAutoFollowPatternResponse] = js.native
    
    def resumeFollow(params: CcrResumeFollowRequest): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptions): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrResumeFollowResponse, Any]] = js.native
    def resumeFollow(params: CcrResumeFollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrResumeFollowResponse] = js.native
    def resumeFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrResumeFollowResponse, Any]] = js.native
    def resumeFollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrResumeFollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrResumeFollowResponse] = js.native
    
    def stats(): js.Promise[CcrStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptions): js.Promise[CcrStatsResponse] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(params: Unit, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptions): js.Promise[CcrStatsResponse] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(params: CcrStatsRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrStatsResponse] = js.native
    def stats(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest): js.Promise[CcrStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrStatsResponse] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrStatsResponse, Any]] = js.native
    def stats(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrStatsRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrStatsResponse] = js.native
    
    var transport: Transport = js.native
    
    def unfollow(params: CcrUnfollowRequest): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptions): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptionsWithMeta): js.Promise[TransportResult[CcrUnfollowResponse, Any]] = js.native
    def unfollow(params: CcrUnfollowRequest, options: TransportRequestOptionsWithOutMeta): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptions
    ): js.Promise[CcrUnfollowResponse] = js.native
    def unfollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptionsWithMeta
    ): js.Promise[TransportResult[CcrUnfollowResponse, Any]] = js.native
    def unfollow(
      params: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.CcrUnfollowRequest,
      options: TransportRequestOptionsWithOutMeta
    ): js.Promise[CcrUnfollowResponse] = js.native
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
