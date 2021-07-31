package typings.elasticElasticsearch.anon

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
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAutoFollowPattern_ extends StObject {
  
  def deleteAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteAutoFollowPattern[TResponse, TContext](params: CcrDeleteAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def follow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def followInfo[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followInfo[TResponse, TContext](params: CcrFollowInfo, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def followStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def followStats[TResponse, TContext](params: CcrFollowStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrForgetFollower[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def forgetFollower[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrForgetFollower[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getAutoFollowPattern[TResponse, TContext](params: CcrGetAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def pauseAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseAutoFollowPattern[TResponse, TContext](params: CcrPauseAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def pauseFollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def pauseFollow[TResponse, TContext](params: CcrPauseFollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putAutoFollowPattern[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrPutAutoFollowPattern[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def resumeAutoFollowPattern[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeAutoFollowPattern[TResponse, TContext](params: CcrResumeAutoFollowPattern, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrResumeFollow[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def resumeFollow[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: CcrResumeFollow[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: CcrStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def unfollow[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def unfollow[TResponse, TContext](params: CcrUnfollow, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
