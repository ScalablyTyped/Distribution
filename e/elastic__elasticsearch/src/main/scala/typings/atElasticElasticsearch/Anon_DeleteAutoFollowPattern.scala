package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.CcrDeleteAutoFollowPattern
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrFollow
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrFollowInfo
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrFollowStats
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrForgetFollower
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrGetAutoFollowPattern
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrPauseAutoFollowPattern
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrPauseFollow
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrPutAutoFollowPattern
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrResumeAutoFollowPattern
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrResumeFollow
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrStats
import typings.atElasticElasticsearch.apiRequestParamsMod.CcrUnfollow
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteAutoFollowPattern extends js.Object {
  @JSName("deleteAutoFollowPattern")
  var deleteAutoFollowPattern_Original: ApiMethod[CcrDeleteAutoFollowPattern, _] = js.native
  @JSName("delete_auto_follow_pattern")
  var delete_auto_follow_pattern_Original: ApiMethod[CcrDeleteAutoFollowPattern, _] = js.native
  @JSName("followInfo")
  var followInfo_Original: ApiMethod[CcrFollowInfo, _] = js.native
  @JSName("followStats")
  var followStats_Original: ApiMethod[CcrFollowStats, _] = js.native
  @JSName("follow")
  var follow_Original: ApiMethod[CcrFollow[_], _] = js.native
  @JSName("follow_info")
  var follow_info_Original: ApiMethod[CcrFollowInfo, _] = js.native
  @JSName("follow_stats")
  var follow_stats_Original: ApiMethod[CcrFollowStats, _] = js.native
  @JSName("forgetFollower")
  var forgetFollower_Original: ApiMethod[CcrForgetFollower[_], _] = js.native
  @JSName("forget_follower")
  var forget_follower_Original: ApiMethod[CcrForgetFollower[_], _] = js.native
  @JSName("getAutoFollowPattern")
  var getAutoFollowPattern_Original: ApiMethod[CcrGetAutoFollowPattern, _] = js.native
  @JSName("get_auto_follow_pattern")
  var get_auto_follow_pattern_Original: ApiMethod[CcrGetAutoFollowPattern, _] = js.native
  @JSName("pauseAutoFollowPattern")
  var pauseAutoFollowPattern_Original: ApiMethod[CcrPauseAutoFollowPattern, _] = js.native
  @JSName("pauseFollow")
  var pauseFollow_Original: ApiMethod[CcrPauseFollow, _] = js.native
  @JSName("pause_auto_follow_pattern")
  var pause_auto_follow_pattern_Original: ApiMethod[CcrPauseAutoFollowPattern, _] = js.native
  @JSName("pause_follow")
  var pause_follow_Original: ApiMethod[CcrPauseFollow, _] = js.native
  @JSName("putAutoFollowPattern")
  var putAutoFollowPattern_Original: ApiMethod[CcrPutAutoFollowPattern[_], _] = js.native
  @JSName("put_auto_follow_pattern")
  var put_auto_follow_pattern_Original: ApiMethod[CcrPutAutoFollowPattern[_], _] = js.native
  @JSName("resumeAutoFollowPattern")
  var resumeAutoFollowPattern_Original: ApiMethod[CcrResumeAutoFollowPattern, _] = js.native
  @JSName("resumeFollow")
  var resumeFollow_Original: ApiMethod[CcrResumeFollow[_], _] = js.native
  @JSName("resume_auto_follow_pattern")
  var resume_auto_follow_pattern_Original: ApiMethod[CcrResumeAutoFollowPattern, _] = js.native
  @JSName("resume_follow")
  var resume_follow_Original: ApiMethod[CcrResumeFollow[_], _] = js.native
  @JSName("stats")
  var stats_Original: ApiMethod[CcrStats, _] = js.native
  @JSName("unfollow")
  var unfollow_Original: ApiMethod[CcrUnfollow, _] = js.native
  // Promise API
  def deleteAutoFollowPattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteAutoFollowPattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteAutoFollowPattern(params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_auto_follow_pattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_auto_follow_pattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern(params: CcrDeleteAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def delete_auto_follow_pattern(params: CcrDeleteAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern(params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_auto_follow_pattern(params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def follow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def follow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow(params: CcrFollow[_]): js.Promise[ApiResponse[_, _]] = js.native
  def follow(params: CcrFollow[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow(params: CcrFollow[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def follow(params: CcrFollow[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def followInfo(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def followInfo(callback: callbackFn[_]): TransportRequestCallback = js.native
  def followInfo(params: CcrFollowInfo): js.Promise[ApiResponse[_, _]] = js.native
  def followInfo(params: CcrFollowInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def followInfo(params: CcrFollowInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def followInfo(params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def followStats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def followStats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def followStats(params: CcrFollowStats): js.Promise[ApiResponse[_, _]] = js.native
  def followStats(params: CcrFollowStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def followStats(params: CcrFollowStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def followStats(params: CcrFollowStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def follow_info(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def follow_info(callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow_info(params: CcrFollowInfo): js.Promise[ApiResponse[_, _]] = js.native
  def follow_info(params: CcrFollowInfo, callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow_info(params: CcrFollowInfo, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def follow_info(params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def follow_stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def follow_stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow_stats(params: CcrFollowStats): js.Promise[ApiResponse[_, _]] = js.native
  def follow_stats(params: CcrFollowStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def follow_stats(params: CcrFollowStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def follow_stats(params: CcrFollowStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def forgetFollower(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def forgetFollower(callback: callbackFn[_]): TransportRequestCallback = js.native
  def forgetFollower(params: CcrForgetFollower[_]): js.Promise[ApiResponse[_, _]] = js.native
  def forgetFollower(params: CcrForgetFollower[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def forgetFollower(params: CcrForgetFollower[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def forgetFollower(params: CcrForgetFollower[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def forget_follower(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def forget_follower(callback: callbackFn[_]): TransportRequestCallback = js.native
  def forget_follower(params: CcrForgetFollower[_]): js.Promise[ApiResponse[_, _]] = js.native
  def forget_follower(params: CcrForgetFollower[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def forget_follower(params: CcrForgetFollower[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def forget_follower(params: CcrForgetFollower[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getAutoFollowPattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getAutoFollowPattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getAutoFollowPattern(params: CcrGetAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def getAutoFollowPattern(params: CcrGetAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getAutoFollowPattern(params: CcrGetAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getAutoFollowPattern(params: CcrGetAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_auto_follow_pattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_auto_follow_pattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_auto_follow_pattern(params: CcrGetAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def get_auto_follow_pattern(params: CcrGetAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_auto_follow_pattern(params: CcrGetAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_auto_follow_pattern(params: CcrGetAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pauseAutoFollowPattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pauseAutoFollowPattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern(params: CcrPauseAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def pauseAutoFollowPattern(params: CcrPauseAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern(params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pauseAutoFollowPattern(params: CcrPauseAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pauseFollow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pauseFollow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pauseFollow(params: CcrPauseFollow): js.Promise[ApiResponse[_, _]] = js.native
  def pauseFollow(params: CcrPauseFollow, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pauseFollow(params: CcrPauseFollow, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pauseFollow(params: CcrPauseFollow, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pause_auto_follow_pattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pause_auto_follow_pattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern(params: CcrPauseAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def pause_auto_follow_pattern(params: CcrPauseAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern(params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pause_auto_follow_pattern(params: CcrPauseAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def pause_follow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def pause_follow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def pause_follow(params: CcrPauseFollow): js.Promise[ApiResponse[_, _]] = js.native
  def pause_follow(params: CcrPauseFollow, callback: callbackFn[_]): TransportRequestCallback = js.native
  def pause_follow(params: CcrPauseFollow, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def pause_follow(params: CcrPauseFollow, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putAutoFollowPattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putAutoFollowPattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putAutoFollowPattern(params: CcrPutAutoFollowPattern[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putAutoFollowPattern(params: CcrPutAutoFollowPattern[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putAutoFollowPattern(params: CcrPutAutoFollowPattern[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putAutoFollowPattern(params: CcrPutAutoFollowPattern[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_auto_follow_pattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_auto_follow_pattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_auto_follow_pattern(params: CcrPutAutoFollowPattern[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_auto_follow_pattern(params: CcrPutAutoFollowPattern[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_auto_follow_pattern(params: CcrPutAutoFollowPattern[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_auto_follow_pattern(params: CcrPutAutoFollowPattern[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def resumeAutoFollowPattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def resumeAutoFollowPattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern(params: CcrResumeAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def resumeAutoFollowPattern(params: CcrResumeAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern(params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def resumeAutoFollowPattern(params: CcrResumeAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def resumeFollow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def resumeFollow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def resumeFollow(params: CcrResumeFollow[_]): js.Promise[ApiResponse[_, _]] = js.native
  def resumeFollow(params: CcrResumeFollow[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def resumeFollow(params: CcrResumeFollow[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def resumeFollow(params: CcrResumeFollow[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def resume_auto_follow_pattern(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def resume_auto_follow_pattern(callback: callbackFn[_]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern(params: CcrResumeAutoFollowPattern): js.Promise[ApiResponse[_, _]] = js.native
  def resume_auto_follow_pattern(params: CcrResumeAutoFollowPattern, callback: callbackFn[_]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern(params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def resume_auto_follow_pattern(params: CcrResumeAutoFollowPattern, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def resume_follow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def resume_follow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def resume_follow(params: CcrResumeFollow[_]): js.Promise[ApiResponse[_, _]] = js.native
  def resume_follow(params: CcrResumeFollow[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def resume_follow(params: CcrResumeFollow[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def resume_follow(params: CcrResumeFollow[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: CcrStats): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: CcrStats, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stats(params: CcrStats, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stats(params: CcrStats, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def unfollow(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def unfollow(callback: callbackFn[_]): TransportRequestCallback = js.native
  def unfollow(params: CcrUnfollow): js.Promise[ApiResponse[_, _]] = js.native
  def unfollow(params: CcrUnfollow, callback: callbackFn[_]): TransportRequestCallback = js.native
  def unfollow(params: CcrUnfollow, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def unfollow(params: CcrUnfollow, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

