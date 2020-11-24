package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.CcrDeleteAutoFollowPattern
import typings.elasticElasticsearch.requestParamsMod.CcrFollow
import typings.elasticElasticsearch.requestParamsMod.CcrFollowInfo
import typings.elasticElasticsearch.requestParamsMod.CcrFollowStats
import typings.elasticElasticsearch.requestParamsMod.CcrForgetFollower
import typings.elasticElasticsearch.requestParamsMod.CcrGetAutoFollowPattern
import typings.elasticElasticsearch.requestParamsMod.CcrPauseAutoFollowPattern
import typings.elasticElasticsearch.requestParamsMod.CcrPauseFollow
import typings.elasticElasticsearch.requestParamsMod.CcrPutAutoFollowPattern
import typings.elasticElasticsearch.requestParamsMod.CcrResumeAutoFollowPattern
import typings.elasticElasticsearch.requestParamsMod.CcrResumeFollow
import typings.elasticElasticsearch.requestParamsMod.CcrStats
import typings.elasticElasticsearch.requestParamsMod.CcrUnfollow
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deleteautofollowpattern extends js.Object {
  
  def deleteAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](
    params: CcrDeleteAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_auto_follow_pattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_auto_follow_pattern[TResponse, TContext](
    params: CcrDeleteAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def followInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followInfo[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def followStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](
    params: CcrFollowStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def follow_info[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_info[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_info[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def follow_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def follow_stats[TResponse, TContext](params: CcrFollowStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow_stats[TResponse, TContext](
    params: CcrFollowStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrForgetFollower[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrForgetFollower[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forget_follower[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrForgetFollower[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def getAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](
    params: CcrGetAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_auto_follow_pattern[TResponse, TContext](params: CcrGetAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_auto_follow_pattern[TResponse, TContext](
    params: CcrGetAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pauseAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](
    params: CcrPauseAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pauseFollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseFollow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](
    params: CcrPauseFollow,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pause_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_auto_follow_pattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_auto_follow_pattern[TResponse, TContext](
    params: CcrPauseAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def pause_follow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_follow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def pause_follow[TResponse, TContext](params: CcrPauseFollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pause_follow[TResponse, TContext](
    params: CcrPauseFollow,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrPutAutoFollowPattern[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def put_auto_follow_pattern[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrPutAutoFollowPattern[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resumeAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](
    params: CcrResumeAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrResumeFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resume_auto_follow_pattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_auto_follow_pattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_auto_follow_pattern[TResponse, TContext](
    params: CcrResumeAutoFollowPattern,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: CcrResumeFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resume_follow[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: CcrResumeFollow[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: CcrStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def unfollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def unfollow[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
}
