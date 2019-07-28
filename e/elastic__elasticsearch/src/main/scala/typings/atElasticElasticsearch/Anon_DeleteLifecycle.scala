package typings.atElasticElasticsearch

import typings.atElasticElasticsearch.apiRequestParamsMod.IlmDeleteLifecycle
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmExplainLifecycle
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmGetLifecycle
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmGetStatus
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmMoveToStep
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmPutLifecycle
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmRemovePolicy
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmRetry
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmStart
import typings.atElasticElasticsearch.apiRequestParamsMod.IlmStop
import typings.atElasticElasticsearch.atElasticElasticsearchMod.ApiMethod
import typings.atElasticElasticsearch.atElasticElasticsearchMod.callbackFn
import typings.atElasticElasticsearch.libTransportMod.ApiResponse
import typings.atElasticElasticsearch.libTransportMod.TransportRequestCallback
import typings.atElasticElasticsearch.libTransportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DeleteLifecycle extends js.Object {
  @JSName("deleteLifecycle")
  var deleteLifecycle_Original: ApiMethod[IlmDeleteLifecycle, _] = js.native
  @JSName("delete_lifecycle")
  var delete_lifecycle_Original: ApiMethod[IlmDeleteLifecycle, _] = js.native
  @JSName("explainLifecycle")
  var explainLifecycle_Original: ApiMethod[IlmExplainLifecycle, _] = js.native
  @JSName("explain_lifecycle")
  var explain_lifecycle_Original: ApiMethod[IlmExplainLifecycle, _] = js.native
  @JSName("getLifecycle")
  var getLifecycle_Original: ApiMethod[IlmGetLifecycle, _] = js.native
  @JSName("getStatus")
  var getStatus_Original: ApiMethod[IlmGetStatus, _] = js.native
  @JSName("get_lifecycle")
  var get_lifecycle_Original: ApiMethod[IlmGetLifecycle, _] = js.native
  @JSName("get_status")
  var get_status_Original: ApiMethod[IlmGetStatus, _] = js.native
  @JSName("moveToStep")
  var moveToStep_Original: ApiMethod[IlmMoveToStep[_], _] = js.native
  @JSName("move_to_step")
  var move_to_step_Original: ApiMethod[IlmMoveToStep[_], _] = js.native
  @JSName("putLifecycle")
  var putLifecycle_Original: ApiMethod[IlmPutLifecycle[_], _] = js.native
  @JSName("put_lifecycle")
  var put_lifecycle_Original: ApiMethod[IlmPutLifecycle[_], _] = js.native
  @JSName("removePolicy")
  var removePolicy_Original: ApiMethod[IlmRemovePolicy, _] = js.native
  @JSName("remove_policy")
  var remove_policy_Original: ApiMethod[IlmRemovePolicy, _] = js.native
  @JSName("retry")
  var retry_Original: ApiMethod[IlmRetry, _] = js.native
  @JSName("start")
  var start_Original: ApiMethod[IlmStart, _] = js.native
  @JSName("stop")
  var stop_Original: ApiMethod[IlmStop, _] = js.native
  // Promise API
  def deleteLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteLifecycle(params: IlmDeleteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def deleteLifecycle(params: IlmDeleteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteLifecycle(params: IlmDeleteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteLifecycle(params: IlmDeleteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_lifecycle(params: IlmDeleteLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def delete_lifecycle(params: IlmDeleteLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_lifecycle(params: IlmDeleteLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_lifecycle(params: IlmDeleteLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def explainLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explainLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explainLifecycle(params: IlmExplainLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def explainLifecycle(params: IlmExplainLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def explainLifecycle(params: IlmExplainLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explainLifecycle(params: IlmExplainLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def explain_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def explain_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain_lifecycle(params: IlmExplainLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def explain_lifecycle(params: IlmExplainLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def explain_lifecycle(params: IlmExplainLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def explain_lifecycle(params: IlmExplainLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getLifecycle(params: IlmGetLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def getLifecycle(params: IlmGetLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getLifecycle(params: IlmGetLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getLifecycle(params: IlmGetLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getStatus(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getStatus(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStatus(params: IlmGetStatus): js.Promise[ApiResponse[_, _]] = js.native
  def getStatus(params: IlmGetStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getStatus(params: IlmGetStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getStatus(params: IlmGetStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_lifecycle(params: IlmGetLifecycle): js.Promise[ApiResponse[_, _]] = js.native
  def get_lifecycle(params: IlmGetLifecycle, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_lifecycle(params: IlmGetLifecycle, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_lifecycle(params: IlmGetLifecycle, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_status(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_status(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_status(params: IlmGetStatus): js.Promise[ApiResponse[_, _]] = js.native
  def get_status(params: IlmGetStatus, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_status(params: IlmGetStatus, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_status(params: IlmGetStatus, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def moveToStep(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def moveToStep(callback: callbackFn[_]): TransportRequestCallback = js.native
  def moveToStep(params: IlmMoveToStep[_]): js.Promise[ApiResponse[_, _]] = js.native
  def moveToStep(params: IlmMoveToStep[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def moveToStep(params: IlmMoveToStep[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def moveToStep(params: IlmMoveToStep[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def move_to_step(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def move_to_step(callback: callbackFn[_]): TransportRequestCallback = js.native
  def move_to_step(params: IlmMoveToStep[_]): js.Promise[ApiResponse[_, _]] = js.native
  def move_to_step(params: IlmMoveToStep[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def move_to_step(params: IlmMoveToStep[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def move_to_step(params: IlmMoveToStep[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putLifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putLifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putLifecycle(params: IlmPutLifecycle[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putLifecycle(params: IlmPutLifecycle[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putLifecycle(params: IlmPutLifecycle[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putLifecycle(params: IlmPutLifecycle[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_lifecycle(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_lifecycle(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_lifecycle(params: IlmPutLifecycle[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_lifecycle(params: IlmPutLifecycle[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_lifecycle(params: IlmPutLifecycle[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_lifecycle(params: IlmPutLifecycle[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def removePolicy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def removePolicy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def removePolicy(params: IlmRemovePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def removePolicy(params: IlmRemovePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def removePolicy(params: IlmRemovePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def removePolicy(params: IlmRemovePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def remove_policy(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def remove_policy(callback: callbackFn[_]): TransportRequestCallback = js.native
  def remove_policy(params: IlmRemovePolicy): js.Promise[ApiResponse[_, _]] = js.native
  def remove_policy(params: IlmRemovePolicy, callback: callbackFn[_]): TransportRequestCallback = js.native
  def remove_policy(params: IlmRemovePolicy, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def remove_policy(params: IlmRemovePolicy, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def retry(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def retry(callback: callbackFn[_]): TransportRequestCallback = js.native
  def retry(params: IlmRetry): js.Promise[ApiResponse[_, _]] = js.native
  def retry(params: IlmRetry, callback: callbackFn[_]): TransportRequestCallback = js.native
  def retry(params: IlmRetry, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def retry(params: IlmRetry, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: IlmStart): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: IlmStart, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start(params: IlmStart, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start(params: IlmStart, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: IlmStop): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: IlmStop, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop(params: IlmStop, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop(params: IlmStop, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

