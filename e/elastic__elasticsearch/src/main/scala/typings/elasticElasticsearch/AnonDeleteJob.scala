package typings.elasticElasticsearch

import typings.elasticElasticsearch.mod.ApiMethod
import typings.elasticElasticsearch.mod.callbackFn
import typings.elasticElasticsearch.requestParamsMod.RollupDeleteJob
import typings.elasticElasticsearch.requestParamsMod.RollupGetJobs
import typings.elasticElasticsearch.requestParamsMod.RollupGetRollupCaps
import typings.elasticElasticsearch.requestParamsMod.RollupGetRollupIndexCaps
import typings.elasticElasticsearch.requestParamsMod.RollupPutJob
import typings.elasticElasticsearch.requestParamsMod.RollupRollupSearch
import typings.elasticElasticsearch.requestParamsMod.RollupStartJob
import typings.elasticElasticsearch.requestParamsMod.RollupStopJob
import typings.elasticElasticsearch.transportMod.ApiResponse
import typings.elasticElasticsearch.transportMod.TransportRequestCallback
import typings.elasticElasticsearch.transportMod.TransportRequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeleteJob extends js.Object {
  @JSName("deleteJob")
  var deleteJob_Original: ApiMethod[RollupDeleteJob, _] = js.native
  @JSName("delete_job")
  var delete_job_Original: ApiMethod[RollupDeleteJob, _] = js.native
  @JSName("getJobs")
  var getJobs_Original: ApiMethod[RollupGetJobs, _] = js.native
  @JSName("getRollupCaps")
  var getRollupCaps_Original: ApiMethod[RollupGetRollupCaps, _] = js.native
  @JSName("getRollupIndexCaps")
  var getRollupIndexCaps_Original: ApiMethod[RollupGetRollupIndexCaps, _] = js.native
  @JSName("get_jobs")
  var get_jobs_Original: ApiMethod[RollupGetJobs, _] = js.native
  @JSName("get_rollup_caps")
  var get_rollup_caps_Original: ApiMethod[RollupGetRollupCaps, _] = js.native
  @JSName("get_rollup_index_caps")
  var get_rollup_index_caps_Original: ApiMethod[RollupGetRollupIndexCaps, _] = js.native
  @JSName("putJob")
  var putJob_Original: ApiMethod[RollupPutJob[_], _] = js.native
  @JSName("put_job")
  var put_job_Original: ApiMethod[RollupPutJob[_], _] = js.native
  @JSName("rollupSearch")
  var rollupSearch_Original: ApiMethod[RollupRollupSearch[_], _] = js.native
  @JSName("rollup_search")
  var rollup_search_Original: ApiMethod[RollupRollupSearch[_], _] = js.native
  @JSName("startJob")
  var startJob_Original: ApiMethod[RollupStartJob, _] = js.native
  @JSName("start_job")
  var start_job_Original: ApiMethod[RollupStartJob, _] = js.native
  @JSName("stopJob")
  var stopJob_Original: ApiMethod[RollupStopJob, _] = js.native
  @JSName("stop_job")
  var stop_job_Original: ApiMethod[RollupStopJob, _] = js.native
  // Promise API
  def deleteJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def deleteJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteJob(params: RollupDeleteJob): js.Promise[ApiResponse[_, _]] = js.native
  def deleteJob(params: RollupDeleteJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def deleteJob(params: RollupDeleteJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def deleteJob(params: RollupDeleteJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def delete_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def delete_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_job(params: RollupDeleteJob): js.Promise[ApiResponse[_, _]] = js.native
  def delete_job(params: RollupDeleteJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def delete_job(params: RollupDeleteJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def delete_job(params: RollupDeleteJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getJobs(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getJobs(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobs(params: RollupGetJobs): js.Promise[ApiResponse[_, _]] = js.native
  def getJobs(params: RollupGetJobs, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getJobs(params: RollupGetJobs, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getJobs(params: RollupGetJobs, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRollupCaps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRollupCaps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRollupCaps(params: RollupGetRollupCaps): js.Promise[ApiResponse[_, _]] = js.native
  def getRollupCaps(params: RollupGetRollupCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRollupCaps(params: RollupGetRollupCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRollupCaps(params: RollupGetRollupCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def getRollupIndexCaps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def getRollupIndexCaps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRollupIndexCaps(params: RollupGetRollupIndexCaps): js.Promise[ApiResponse[_, _]] = js.native
  def getRollupIndexCaps(params: RollupGetRollupIndexCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def getRollupIndexCaps(params: RollupGetRollupIndexCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def getRollupIndexCaps(params: RollupGetRollupIndexCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_jobs(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_jobs(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_jobs(params: RollupGetJobs): js.Promise[ApiResponse[_, _]] = js.native
  def get_jobs(params: RollupGetJobs, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_jobs(params: RollupGetJobs, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_jobs(params: RollupGetJobs, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_rollup_caps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_rollup_caps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_rollup_caps(params: RollupGetRollupCaps): js.Promise[ApiResponse[_, _]] = js.native
  def get_rollup_caps(params: RollupGetRollupCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_rollup_caps(params: RollupGetRollupCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_rollup_caps(params: RollupGetRollupCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def get_rollup_index_caps(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def get_rollup_index_caps(callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_rollup_index_caps(params: RollupGetRollupIndexCaps): js.Promise[ApiResponse[_, _]] = js.native
  def get_rollup_index_caps(params: RollupGetRollupIndexCaps, callback: callbackFn[_]): TransportRequestCallback = js.native
  def get_rollup_index_caps(params: RollupGetRollupIndexCaps, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def get_rollup_index_caps(params: RollupGetRollupIndexCaps, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def putJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def putJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def putJob(params: RollupPutJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def putJob(params: RollupPutJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def putJob(params: RollupPutJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def putJob(params: RollupPutJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def put_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def put_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_job(params: RollupPutJob[_]): js.Promise[ApiResponse[_, _]] = js.native
  def put_job(params: RollupPutJob[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def put_job(params: RollupPutJob[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def put_job(params: RollupPutJob[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def rollupSearch(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def rollupSearch(callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollupSearch(params: RollupRollupSearch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def rollupSearch(params: RollupRollupSearch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollupSearch(params: RollupRollupSearch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def rollupSearch(params: RollupRollupSearch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def rollup_search(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def rollup_search(callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollup_search(params: RollupRollupSearch[_]): js.Promise[ApiResponse[_, _]] = js.native
  def rollup_search(params: RollupRollupSearch[_], callback: callbackFn[_]): TransportRequestCallback = js.native
  def rollup_search(params: RollupRollupSearch[_], options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def rollup_search(params: RollupRollupSearch[_], options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def startJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def startJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def startJob(params: RollupStartJob): js.Promise[ApiResponse[_, _]] = js.native
  def startJob(params: RollupStartJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def startJob(params: RollupStartJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def startJob(params: RollupStartJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def start_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def start_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_job(params: RollupStartJob): js.Promise[ApiResponse[_, _]] = js.native
  def start_job(params: RollupStartJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def start_job(params: RollupStartJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def start_job(params: RollupStartJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stopJob(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stopJob(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopJob(params: RollupStopJob): js.Promise[ApiResponse[_, _]] = js.native
  def stopJob(params: RollupStopJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stopJob(params: RollupStopJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stopJob(params: RollupStopJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
  // Promise API
  def stop_job(): js.Promise[ApiResponse[_, _]] = js.native
  // Callback API
  def stop_job(callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_job(params: RollupStopJob): js.Promise[ApiResponse[_, _]] = js.native
  def stop_job(params: RollupStopJob, callback: callbackFn[_]): TransportRequestCallback = js.native
  def stop_job(params: RollupStopJob, options: TransportRequestOptions): js.Promise[ApiResponse[_, _]] = js.native
  def stop_job(params: RollupStopJob, options: TransportRequestOptions, callback: callbackFn[_]): TransportRequestCallback = js.native
}

