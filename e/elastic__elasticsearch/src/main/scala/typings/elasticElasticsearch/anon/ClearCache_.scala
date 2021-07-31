package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsClearCache
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsMount
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsRepositoryStats
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsStats
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClearCache_ extends StObject {
  
  def clearCache[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: SearchableSnapshotsClearCache): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: SearchableSnapshotsClearCache, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SearchableSnapshotsMount[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, js.Any]] */, TContext](params: SearchableSnapshotsMount[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def repositoryStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: Unit, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: SearchableSnapshotsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: SearchableSnapshotsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
}
