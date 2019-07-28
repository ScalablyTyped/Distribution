package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotCreate
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotCreateRepository
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotDelete
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotDeleteRepository
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotGet
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotGetRepository
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotRestore
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotStatus
import typings.atElasticElasticsearch.apiRequestParamsMod.SnapshotVerifyRepository
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Create extends js.Object {
  @JSName("createRepository")
  var createRepository_Original: ApiMethod[SnapshotCreateRepository[_], _] = js.native
  @JSName("create")
  var create_Original: ApiMethod[SnapshotCreate[_], _] = js.native
  @JSName("create_repository")
  var create_repository_Original: ApiMethod[SnapshotCreateRepository[_], _] = js.native
  @JSName("deleteRepository")
  var deleteRepository_Original: ApiMethod[SnapshotDeleteRepository, _] = js.native
  @JSName("delete")
  var delete_Original: ApiMethod[SnapshotDelete, _] = js.native
  @JSName("delete_repository")
  var delete_repository_Original: ApiMethod[SnapshotDeleteRepository, _] = js.native
  @JSName("getRepository")
  var getRepository_Original: ApiMethod[SnapshotGetRepository, _] = js.native
  @JSName("get")
  var get_Original: ApiMethod[SnapshotGet, _] = js.native
  @JSName("get_repository")
  var get_repository_Original: ApiMethod[SnapshotGetRepository, _] = js.native
  @JSName("restore")
  var restore_Original: ApiMethod[SnapshotRestore[_], _] = js.native
  @JSName("status")
  var status_Original: ApiMethod[SnapshotStatus, _] = js.native
  @JSName("verifyRepository")
  var verifyRepository_Original: ApiMethod[SnapshotVerifyRepository, _] = js.native
  @JSName("verify_repository")
  var verify_repository_Original: ApiMethod[SnapshotVerifyRepository, _] = js.native
  // Promise API
  def create(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def create(callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: SnapshotCreate[_]): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: SnapshotCreate[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def create(params: SnapshotCreate[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def create(params: SnapshotCreate[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def createRepository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def createRepository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def createRepository(params: SnapshotCreateRepository[_]): js.Promise[ApiResponse[_, _]] = js.native
  def createRepository(params: SnapshotCreateRepository[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def createRepository(params: SnapshotCreateRepository[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def createRepository(params: SnapshotCreateRepository[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def create_repository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def create_repository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def create_repository(params: SnapshotCreateRepository[_]): js.Promise[ApiResponse[_, _]] = js.native
  def create_repository(params: SnapshotCreateRepository[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def create_repository(params: SnapshotCreateRepository[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def create_repository(params: SnapshotCreateRepository[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: SnapshotDelete): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: SnapshotDelete, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete(params: SnapshotDelete, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete(params: SnapshotDelete, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def deleteRepository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteRepository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRepository(params: SnapshotDeleteRepository): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRepository(params: SnapshotDeleteRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteRepository(params: SnapshotDeleteRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteRepository(params: SnapshotDeleteRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_repository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_repository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_repository(params: SnapshotDeleteRepository): js.Promise[ApiResponse[_, _]] = js.native
  def delete_repository(params: SnapshotDeleteRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_repository(params: SnapshotDeleteRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_repository(params: SnapshotDeleteRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: SnapshotGet): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: SnapshotGet, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get(params: SnapshotGet, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get(params: SnapshotGet, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRepository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRepository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRepository(params: SnapshotGetRepository): js.Promise[ApiResponse[_, _]] = js.native
  def getRepository(params: SnapshotGetRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRepository(params: SnapshotGetRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRepository(params: SnapshotGetRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_repository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_repository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_repository(params: SnapshotGetRepository): js.Promise[ApiResponse[_, _]] = js.native
  def get_repository(params: SnapshotGetRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_repository(params: SnapshotGetRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_repository(params: SnapshotGetRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def restore(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def restore(callback: callbackFn[_]): TransportRequestCallback = js.native
  def restore(params: SnapshotRestore[_]): js.Promise[ApiResponse[_, _]] = js.native
  def restore(params: SnapshotRestore[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def restore(params: SnapshotRestore[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def restore(params: SnapshotRestore[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def status(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def status(callback: callbackFn[_]): TransportRequestCallback = js.native
  def status(params: SnapshotStatus): js.Promise[ApiResponse[_, _]] = js.native
  def status(params: SnapshotStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def status(params: SnapshotStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def status(params: SnapshotStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def verifyRepository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def verifyRepository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def verifyRepository(params: SnapshotVerifyRepository): js.Promise[ApiResponse[_, _]] = js.native
  def verifyRepository(params: SnapshotVerifyRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def verifyRepository(params: SnapshotVerifyRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def verifyRepository(params: SnapshotVerifyRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def verify_repository(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def verify_repository(callback: callbackFn[_]): TransportRequestCallback = js.native
  def verify_repository(params: SnapshotVerifyRepository): js.Promise[ApiResponse[_, _]] = js.native
  def verify_repository(params: SnapshotVerifyRepository, callback: callbackFn[_]): TransportRequestCallback = js.native
  def verify_repository(params: SnapshotVerifyRepository, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def verify_repository(params: SnapshotVerifyRepository, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

