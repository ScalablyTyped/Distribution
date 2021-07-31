package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.RollupDeleteJob
import typings.elasticElasticsearch.requestParamsMod.RollupGetJobs
import typings.elasticElasticsearch.requestParamsMod.RollupGetRollupCaps
import typings.elasticElasticsearch.requestParamsMod.RollupGetRollupIndexCaps
import typings.elasticElasticsearch.requestParamsMod.RollupPutJob
import typings.elasticElasticsearch.requestParamsMod.RollupRollupSearch
import typings.elasticElasticsearch.requestParamsMod.RollupStartJob
import typings.elasticElasticsearch.requestParamsMod.RollupStopJob
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteJob_ extends StObject {
  
  def deleteJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteJob[TResponse, TContext](params: RollupDeleteJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getJobs[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getJobs[TResponse, TContext](params: RollupGetJobs, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRollupCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupCaps[TResponse, TContext](params: RollupGetRollupCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def getRollupIndexCaps[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRollupIndexCaps[TResponse, TContext](params: RollupGetRollupIndexCaps, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: RollupPutJob[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def putJob[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: RollupPutJob[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: RollupRollupSearch[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def rollupSearch[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: RollupRollupSearch[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def startJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: RollupStartJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def startJob[TResponse, TContext](params: RollupStartJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stopJob[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stopJob[TResponse, TContext](params: RollupStopJob, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
