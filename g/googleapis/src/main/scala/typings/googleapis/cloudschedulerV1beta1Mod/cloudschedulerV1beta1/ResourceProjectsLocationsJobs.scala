package typings.googleapis.cloudschedulerV1beta1Mod.cloudschedulerV1beta1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/cloudscheduler/v1beta1", "cloudscheduler_v1beta1.Resource$Projects$Locations$Jobs")
@js.native
class ResourceProjectsLocationsJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * cloudscheduler.projects.locations.jobs.create
    * @desc Creates a job.
    * @alias cloudscheduler.projects.locations.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[SchemaJob] = js.native
  def create(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsJobsCreate): GaxiosPromise[SchemaJob] = js.native
  def create(params: ParamsResourceProjectsLocationsJobsCreate, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobsCreate,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def create(params: ParamsResourceProjectsLocationsJobsCreate, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def create(
    params: ParamsResourceProjectsLocationsJobsCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.delete
    * @desc Deletes a job.
    * @alias cloudscheduler.projects.locations.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsJobsDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceProjectsLocationsJobsDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceProjectsLocationsJobsDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceProjectsLocationsJobsDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.get
    * @desc Gets a job.
    * @alias cloudscheduler.projects.locations.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaJob] = js.native
  def get(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsLocationsJobsGet): GaxiosPromise[SchemaJob] = js.native
  def get(params: ParamsResourceProjectsLocationsJobsGet, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsGet,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def get(params: ParamsResourceProjectsLocationsJobsGet, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def get(
    params: ParamsResourceProjectsLocationsJobsGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.list
    * @desc Lists jobs.
    * @alias cloudscheduler.projects.locations.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Requested page size.  The maximum page size is 500. If unspecified, the page size will be the maximum. Fewer jobs than requested might be returned, even if more jobs exist; use next_page_token to determine if more jobs exist.
    * @param {string=} params.pageToken A token identifying a page of results the server will return. To request the first page results, page_token must be empty. To request the next page of results, page_token must be the value of next_page_token returned from the previous call to ListJobs. It is an error to switch the value of filter or order_by while iterating through pages.
    * @param {string} params.parent Required.  The location name. For example: `projects/PROJECT_ID/locations/LOCATION_ID`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListJobsResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(params: ParamsResourceProjectsLocationsJobsList): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsList,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsList,
    options: BodyResponseCallback[SchemaListJobsResponse],
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsResourceProjectsLocationsJobsList, options: MethodOptions): GaxiosPromise[SchemaListJobsResponse] = js.native
  def list(
    params: ParamsResourceProjectsLocationsJobsList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListJobsResponse]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.patch
    * @desc Updates a job.  If successful, the updated Job is returned. If the
    * job does not exist, `NOT_FOUND` is returned.  If UpdateJob does not
    * successfully return, it is possible for the job to be in an
    * Job.State.UPDATE_FAILED state. A job in this state may not be executed.
    * If this happens, retry the UpdateJob request until a successful response
    * is received.
    * @alias cloudscheduler.projects.locations.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Optionally caller-specified in CreateJob, after which it becomes output only.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.  * `PROJECT_ID` can contain letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), colons (:), or periods (.).    For more information, see    [Identifying    projects](https://cloud.google.com/resource-manager/docs/creating-managing-projects#identifying_projects) * `LOCATION_ID` is the canonical ID for the job's location.    The list of available locations can be obtained by calling    ListLocations.    For more information, see https://cloud.google.com/about/locations/. * `JOB_ID` can contain only letters ([A-Za-z]), numbers ([0-9]),    hyphens (-), or underscores (_). The maximum length is 500 characters.
    * @param {string=} params.updateMask A  mask used to specify which fields of the job are being updated.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaJob] = js.native
  def patch(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsLocationsJobsPatch): GaxiosPromise[SchemaJob] = js.native
  def patch(params: ParamsResourceProjectsLocationsJobsPatch, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def patch(
    params: ParamsResourceProjectsLocationsJobsPatch,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def patch(params: ParamsResourceProjectsLocationsJobsPatch, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def patch(
    params: ParamsResourceProjectsLocationsJobsPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.pause
    * @desc Pauses a job.  If a job is paused then the system will stop
    * executing the job until it is re-enabled via ResumeJob. The state of the
    * job is stored in state; if paused it will be set to Job.State.PAUSED. A
    * job must be in Job.State.ENABLED to be paused.
    * @alias cloudscheduler.projects.locations.jobs.pause
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    * @param {().PauseJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def pause(): GaxiosPromise[SchemaJob] = js.native
  def pause(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def pause(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def pause(params: ParamsResourceProjectsLocationsJobsPause): GaxiosPromise[SchemaJob] = js.native
  def pause(params: ParamsResourceProjectsLocationsJobsPause, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def pause(
    params: ParamsResourceProjectsLocationsJobsPause,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def pause(params: ParamsResourceProjectsLocationsJobsPause, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def pause(
    params: ParamsResourceProjectsLocationsJobsPause,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.resume
    * @desc Resume a job.  This method reenables a job after it has been
    * Job.State.PAUSED. The state of a job is stored in Job.state; after
    * calling this method it will be set to Job.State.ENABLED. A job must be in
    * Job.State.PAUSED to be resumed.
    * @alias cloudscheduler.projects.locations.jobs.resume
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    * @param {().ResumeJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resume(): GaxiosPromise[SchemaJob] = js.native
  def resume(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def resume(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def resume(params: ParamsResourceProjectsLocationsJobsResume): GaxiosPromise[SchemaJob] = js.native
  def resume(params: ParamsResourceProjectsLocationsJobsResume, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def resume(
    params: ParamsResourceProjectsLocationsJobsResume,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def resume(params: ParamsResourceProjectsLocationsJobsResume, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def resume(
    params: ParamsResourceProjectsLocationsJobsResume,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  /**
    * cloudscheduler.projects.locations.jobs.run
    * @desc Forces a job to run now.  When this method is called, Cloud
    * Scheduler will dispatch the job, even if the job is already running.
    * @alias cloudscheduler.projects.locations.jobs.run
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The job name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/jobs/JOB_ID`.
    * @param {().RunJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def run(): GaxiosPromise[SchemaJob] = js.native
  def run(callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def run(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def run(params: ParamsResourceProjectsLocationsJobsRun): GaxiosPromise[SchemaJob] = js.native
  def run(params: ParamsResourceProjectsLocationsJobsRun, callback: BodyResponseCallback[SchemaJob]): Unit = js.native
  def run(
    params: ParamsResourceProjectsLocationsJobsRun,
    options: BodyResponseCallback[SchemaJob],
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
  def run(params: ParamsResourceProjectsLocationsJobsRun, options: MethodOptions): GaxiosPromise[SchemaJob] = js.native
  def run(
    params: ParamsResourceProjectsLocationsJobsRun,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaJob]
  ): Unit = js.native
}

