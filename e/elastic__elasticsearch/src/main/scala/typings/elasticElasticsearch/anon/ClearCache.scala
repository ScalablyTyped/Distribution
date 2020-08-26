package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsClearCache
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsMount
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsRepositoryStats
import typings.elasticElasticsearch.requestParamsMod.SearchableSnapshotsStats
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.RequestBody
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import typings.elasticElasticsearch.transportMod.TransportRequestPromise
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearCache extends js.Object {
  def clearCache[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCache[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: SearchableSnapshotsClearCache): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](params: SearchableSnapshotsClearCache, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clearCache[TResponse, TContext](params: SearchableSnapshotsClearCache, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clearCache[TResponse, TContext](
    params: SearchableSnapshotsClearCache,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def clear_cache[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cache[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cache[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cache[TResponse, TContext](params: SearchableSnapshotsClearCache): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cache[TResponse, TContext](params: SearchableSnapshotsClearCache, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clear_cache[TResponse, TContext](params: SearchableSnapshotsClearCache, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clear_cache[TResponse, TContext](
    params: SearchableSnapshotsClearCache,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchableSnapshotsMount[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchableSnapshotsMount[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SearchableSnapshotsMount[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def mount[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SearchableSnapshotsMount[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def repositoryStats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repositoryStats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repositoryStats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repositoryStats[TResponse, TContext](
    params: SearchableSnapshotsRepositoryStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def repository_stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repository_stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repository_stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repository_stats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repository_stats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def repository_stats[TResponse, TContext](params: SearchableSnapshotsRepositoryStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def repository_stats[TResponse, TContext](
    params: SearchableSnapshotsRepositoryStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  def stats[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: SearchableSnapshotsStats): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](params: SearchableSnapshotsStats, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def stats[TResponse, TContext](params: SearchableSnapshotsStats, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def stats[TResponse, TContext](
    params: SearchableSnapshotsStats,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}

