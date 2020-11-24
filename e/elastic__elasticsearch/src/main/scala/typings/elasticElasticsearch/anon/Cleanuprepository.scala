package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.SnapshotCleanupRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotClone
import typings.elasticElasticsearch.requestParamsMod.SnapshotCreate
import typings.elasticElasticsearch.requestParamsMod.SnapshotCreateRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotDelete
import typings.elasticElasticsearch.requestParamsMod.SnapshotDeleteRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotGet
import typings.elasticElasticsearch.requestParamsMod.SnapshotGetRepository
import typings.elasticElasticsearch.requestParamsMod.SnapshotRestore
import typings.elasticElasticsearch.requestParamsMod.SnapshotStatus
import typings.elasticElasticsearch.requestParamsMod.SnapshotVerifyRepository
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
trait Cleanuprepository extends js.Object {
  
  def cleanupRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def cleanupRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def cleanupRepository[TResponse, TContext](params: SnapshotCleanupRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanupRepository[TResponse, TContext](
    params: SnapshotCleanupRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def cleanup_repository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanup_repository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def cleanup_repository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanup_repository[TResponse, TContext](params: SnapshotCleanupRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanup_repository[TResponse, TContext](params: SnapshotCleanupRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def cleanup_repository[TResponse, TContext](params: SnapshotCleanupRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def cleanup_repository[TResponse, TContext](
    params: SnapshotCleanupRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotClone[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotClone[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotClone[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def clone[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SnapshotClone[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreate[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreate[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreate[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SnapshotCreate[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def createRepository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SnapshotCreateRepository[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotCreateRepository[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def create_repository[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SnapshotCreateRepository[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](params: SnapshotDelete, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete[TResponse, TContext](params: SnapshotDelete, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete[TResponse, TContext](
    params: SnapshotDelete,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def deleteRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def deleteRepository[TResponse, TContext](params: SnapshotDeleteRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def deleteRepository[TResponse, TContext](
    params: SnapshotDeleteRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def delete_repository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_repository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_repository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_repository[TResponse, TContext](params: SnapshotDeleteRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_repository[TResponse, TContext](params: SnapshotDeleteRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def delete_repository[TResponse, TContext](params: SnapshotDeleteRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def delete_repository[TResponse, TContext](
    params: SnapshotDeleteRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get[TResponse, TContext](params: SnapshotGet, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get[TResponse, TContext](params: SnapshotGet, options: TransportRequestOptions, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  
  def getRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def getRepository[TResponse, TContext](params: SnapshotGetRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def getRepository[TResponse, TContext](
    params: SnapshotGetRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def get_repository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_repository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_repository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_repository[TResponse, TContext](params: SnapshotGetRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_repository[TResponse, TContext](params: SnapshotGetRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def get_repository[TResponse, TContext](params: SnapshotGetRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def get_repository[TResponse, TContext](
    params: SnapshotGetRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotRestore[TRequestBody]): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotRestore[TRequestBody], callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](params: SnapshotRestore[TRequestBody], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def restore[TResponse, TRequestBody /* <: RequestBody[Record[String, _]] */, TContext](
    params: SnapshotRestore[TRequestBody],
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def status[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def status[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](params: SnapshotStatus, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def status[TResponse, TContext](params: SnapshotStatus, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def status[TResponse, TContext](
    params: SnapshotStatus,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def verifyRepository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def verifyRepository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def verifyRepository[TResponse, TContext](params: SnapshotVerifyRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verifyRepository[TResponse, TContext](
    params: SnapshotVerifyRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
  
  def verify_repository[TResponse, TContext](): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verify_repository[TResponse, TContext](callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def verify_repository[TResponse, TContext](params: js.UndefOr[scala.Nothing], options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verify_repository[TResponse, TContext](params: SnapshotVerifyRepository): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verify_repository[TResponse, TContext](params: SnapshotVerifyRepository, callback: callbackFn[TResponse, TContext]): TransportRequestCallback = js.native
  def verify_repository[TResponse, TContext](params: SnapshotVerifyRepository, options: TransportRequestOptions): TransportRequestPromise[ApiResponse[TResponse, TContext]] = js.native
  def verify_repository[TResponse, TContext](
    params: SnapshotVerifyRepository,
    options: TransportRequestOptions,
    callback: callbackFn[TResponse, TContext]
  ): TransportRequestCallback = js.native
}
