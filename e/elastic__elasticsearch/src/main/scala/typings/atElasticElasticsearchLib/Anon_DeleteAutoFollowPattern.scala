package typings
package atElasticElasticsearchLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteAutoFollowPattern extends js.Object {
  @JSName("deleteAutoFollowPattern")
  var deleteAutoFollowPattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern, _] = js.native
  @JSName("delete_auto_follow_pattern")
  var delete_auto_follow_pattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern, _] = js.native
  @JSName("followInfo")
  var followInfo_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo, _] = js.native
  @JSName("followStats")
  var followStats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats, _] = js.native
  @JSName("follow")
  var follow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrFollow[_], _] = js.native
  @JSName("follow_info")
  var follow_info_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo, _] = js.native
  @JSName("follow_stats")
  var follow_stats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats, _] = js.native
  @JSName("forgetFollower")
  var forgetFollower_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_], _] = js.native
  @JSName("forget_follower")
  var forget_follower_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_], _] = js.native
  @JSName("getAutoFollowPattern")
  var getAutoFollowPattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern, _] = js.native
  @JSName("get_auto_follow_pattern")
  var get_auto_follow_pattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern, _] = js.native
  @JSName("pauseFollow")
  var pauseFollow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow, _] = js.native
  @JSName("pause_follow")
  var pause_follow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow, _] = js.native
  @JSName("putAutoFollowPattern")
  var putAutoFollowPattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_], _] = js.native
  @JSName("put_auto_follow_pattern")
  var put_auto_follow_pattern_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_], _] = js.native
  @JSName("resumeFollow")
  var resumeFollow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_], _] = js.native
  @JSName("resume_follow")
  var resume_follow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_], _] = js.native
  @JSName("stats")
  var stats_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrStats, _] = js.native
  @JSName("unfollow")
  var unfollow_Original: atElasticElasticsearchLib.atElasticElasticsearchMod.ApiMethod[atElasticElasticsearchLib.apiRequestParamsMod.CcrUnfollow, _] = js.native
  // Promise API
  def deleteAutoFollowPattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def deleteAutoFollowPattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteAutoFollowPattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def deleteAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def deleteAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def delete_auto_follow_pattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def delete_auto_follow_pattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_auto_follow_pattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def delete_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def delete_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrDeleteAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def follow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def follow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollow[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollow[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def followInfo(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def followInfo(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def followInfo(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def followInfo(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def followInfo(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def followInfo(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def followStats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def followStats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def followStats(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def followStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def followStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def followStats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def follow_info(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def follow_info(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow_info(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow_info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow_info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow_info(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowInfo,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def follow_stats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def follow_stats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow_stats(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def follow_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def follow_stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrFollowStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def forgetFollower(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def forgetFollower(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def forgetFollower(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def forgetFollower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def forgetFollower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def forgetFollower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def forget_follower(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def forget_follower(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def forget_follower(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def forget_follower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def forget_follower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def forget_follower(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrForgetFollower[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def getAutoFollowPattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def getAutoFollowPattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getAutoFollowPattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def getAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def getAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def get_auto_follow_pattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def get_auto_follow_pattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_auto_follow_pattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def get_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def get_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrGetAutoFollowPattern,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def pauseFollow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def pauseFollow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def pauseFollow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def pauseFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def pauseFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def pauseFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def pause_follow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def pause_follow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def pause_follow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def pause_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def pause_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def pause_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPauseFollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def putAutoFollowPattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def putAutoFollowPattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putAutoFollowPattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def putAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def putAutoFollowPattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def put_auto_follow_pattern(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def put_auto_follow_pattern(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_auto_follow_pattern(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def put_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def put_auto_follow_pattern(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrPutAutoFollowPattern[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def resumeFollow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def resumeFollow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def resumeFollow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def resumeFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def resumeFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def resumeFollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def resume_follow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def resume_follow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def resume_follow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_]): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def resume_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def resume_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def resume_follow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrResumeFollow[_],
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def stats(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def stats(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stats(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrStats): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrStats,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def stats(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrStats,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  // Promise API
  def unfollow(): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  // Callback API
  def unfollow(callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def unfollow(params: atElasticElasticsearchLib.apiRequestParamsMod.CcrUnfollow): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def unfollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrUnfollow,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
  def unfollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrUnfollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions
  ): js.Promise[atElasticElasticsearchLib.libTransportMod.ApiResponse[_, _]] = js.native
  def unfollow(
    params: atElasticElasticsearchLib.apiRequestParamsMod.CcrUnfollow,
    options: atElasticElasticsearchLib.libTransportMod.TransportRequestOptions,
    callback: atElasticElasticsearchLib.atElasticElasticsearchMod.callbackFn[_]
  ): atElasticElasticsearchLib.libTransportMod.TransportRequestCallback = js.native
}

