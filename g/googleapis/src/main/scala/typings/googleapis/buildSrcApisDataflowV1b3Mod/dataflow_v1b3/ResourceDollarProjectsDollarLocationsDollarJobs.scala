package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Locations$Jobs")
@js.native
class ResourceDollarProjectsDollarLocationsDollarJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var debug: ResourceDollarProjectsDollarLocationsDollarJobsDollarDebug = js.native
  var messages: ResourceDollarProjectsDollarLocationsDollarJobsDollarMessages = js.native
  var workItems: ResourceDollarProjectsDollarLocationsDollarJobsDollarWorkitems = js.native
  /**
    * dataflow.projects.locations.jobs.create
    * @desc Creates a Cloud Dataflow job.  To create a job, we recommend using
    * `projects.locations.jobs.create` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.create` is not recommended, as your job will always
    * start in `us-central1`.
    * @alias dataflow.projects.locations.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.replaceJobId Deprecated. This field is now in the Job message.
    * @param {string=} params.view The level of information requested in response.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Job] = js.native
  def create(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.get
    * @desc Gets the state of the specified Cloud Dataflow job.  To get the
    * state of a job, we recommend using `projects.locations.jobs.get` with a
    * [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.get` is not recommended, as you can only get the
    * state of jobs that are running in `us-central1`.
    * @alias dataflow.projects.locations.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job ID.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {string=} params.view The level of information requested in response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Job] = js.native
  def get(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGet): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGet,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGet,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.getMetrics
    * @desc Request the job status.  To request the status of a job, we
    * recommend using `projects.locations.jobs.getMetrics` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.getMetrics` is not recommended, as you can only
    * request the status of jobs that are running in `us-central1`.
    * @alias dataflow.projects.locations.jobs.getMetrics
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job to get messages for.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string} params.projectId A project id.
    * @param {string=} params.startTime Return only metric data that has changed since this time. Default is to return all information about all metrics for the job.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getMetrics(): GaxiosPromise[Schema$JobMetrics] = js.native
  def getMetrics(callback: BodyResponseCallback[Schema$JobMetrics]): Unit = js.native
  def getMetrics(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGetmetrics): GaxiosPromise[Schema$JobMetrics] = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGetmetrics,
    callback: BodyResponseCallback[Schema$JobMetrics]
  ): Unit = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGetmetrics,
    options: BodyResponseCallback[Schema$JobMetrics],
    callback: BodyResponseCallback[Schema$JobMetrics]
  ): Unit = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGetmetrics,
    options: MethodOptions
  ): GaxiosPromise[Schema$JobMetrics] = js.native
  def getMetrics(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarGetmetrics,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$JobMetrics]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.list
    * @desc List the jobs of a project.  To list the jobs of a project in a
    * region, we recommend using `projects.locations.jobs.get` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). To
    * list the all jobs across all regions, use `projects.jobs.aggregated`.
    * Using `projects.jobs.list` is not recommended, as you can only get the
    * list of jobs that are running in `us-central1`.
    * @alias dataflow.projects.locations.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter The kind of filter to use.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {integer=} params.pageSize If there are many jobs, limit response to at most this many. The actual number of jobs returned will be the lesser of max_responses and an unspecified server-defined limit.
    * @param {string=} params.pageToken Set this to the 'next_page_token' field of a previous response to request additional results in a long list.
    * @param {string} params.projectId The project which owns the jobs.
    * @param {string=} params.view Level of information requested in response. Default is `JOB_VIEW_SUMMARY`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList,
    options: BodyResponseCallback[Schema$ListJobsResponse],
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.snapshot
    * @desc Snapshot the state of a streaming job.
    * @alias dataflow.projects.locations.jobs.snapshot
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job to be snapshotted.
    * @param {string} params.location The location that contains this job.
    * @param {string} params.projectId The project which owns the job to be snapshotted.
    * @param {().SnapshotJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def snapshot(): GaxiosPromise[Schema$Snapshot] = js.native
  def snapshot(callback: BodyResponseCallback[Schema$Snapshot]): Unit = js.native
  def snapshot(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarSnapshot): GaxiosPromise[Schema$Snapshot] = js.native
  def snapshot(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarSnapshot,
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  def snapshot(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarSnapshot,
    options: BodyResponseCallback[Schema$Snapshot],
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  def snapshot(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarSnapshot,
    options: MethodOptions
  ): GaxiosPromise[Schema$Snapshot] = js.native
  def snapshot(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarSnapshot,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Snapshot]
  ): Unit = js.native
  /**
    * dataflow.projects.locations.jobs.update
    * @desc Updates the state of an existing Cloud Dataflow job.  To update the
    * state of an existing job, we recommend using
    * `projects.locations.jobs.update` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.update` is not recommended, as you can only update
    * the state of jobs that are running in `us-central1`.
    * @alias dataflow.projects.locations.jobs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The job ID.
    * @param {string} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains this job.
    * @param {string} params.projectId The ID of the Cloud Platform project that the job belongs to.
    * @param {().Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Job] = js.native
  def update(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarUpdate): GaxiosPromise[Schema$Job] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarUpdate,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarUpdate,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Job] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarJobsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
}

