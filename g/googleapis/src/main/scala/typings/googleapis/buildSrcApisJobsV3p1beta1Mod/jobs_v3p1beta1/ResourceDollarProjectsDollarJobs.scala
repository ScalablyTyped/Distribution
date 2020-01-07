package typings.googleapis.buildSrcApisJobsV3p1beta1Mod.jobs_v3p1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v3p1beta1", "jobs_v3p1beta1.Resource$Projects$Jobs")
@js.native
class ResourceDollarProjectsDollarJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.projects.jobs.batchDelete
    * @desc Deletes a list of Jobs by filter.
    * @alias jobs.projects.jobs.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().BatchDeleteJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarProjectsDollarJobsDollarBatchdelete): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarBatchdelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarBatchdelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarProjectsDollarJobsDollarBatchdelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.create
    * @desc Creates a new job.  Typically, the job becomes searchable within 10
    * seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().CreateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Job] = js.native
  def create(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.delete
    * @desc Deletes the specified job.  Typically, the job becomes unsearchable
    * within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the job to be deleted.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarJobsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarJobsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.get
    * @desc Retrieves the specified job, whose status is OPEN or recently
    * EXPIRED within the last 90 days.
    * @alias jobs.projects.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the job to retrieve.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Job] = js.native
  def get(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.list
    * @desc Lists jobs by filter.
    * @alias jobs.projects.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Required.  The filter string specifies the jobs to be enumerated.  Supported operator: =, AND  The fields eligible for filtering are:  * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  * companyName = "projects/api-test-project/companies/123" * companyName = "projects/api-test-project/companies/123" AND requisitionId = "req-1"
    * @param {string=} params.jobView Optional.  The desired job attributes returned for jobs in the search response. Defaults to JobView.JOB_VIEW_FULL if no value is specified.
    * @param {integer=} params.pageSize Optional.  The maximum number of jobs to be returned per page of results.  If job_view is set to JobView.JOB_VIEW_ID_ONLY, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100.  Default is 100 if empty or a number < 1 is specified.
    * @param {string=} params.pageToken Optional.  The starting point of a query result.
    * @param {string} params.parent Required.  The resource name of the project under which the job is created.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarJobsDollarList): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    options: BodyResponseCallback[Schema$ListJobsResponse],
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarJobsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.patch
    * @desc Updates specified job.  Typically, updated contents become visible
    * in search results within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.projects.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during job update.  The resource name for the job. This is generated by the service when a job is created.  The format is "projects/{project_id}/jobs/{job_id}", for example, "projects/api-test-project/jobs/1234".  Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    * @param {().UpdateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Job] = js.native
  def patch(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch): GaxiosPromise[Schema$Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.search
    * @desc Searches for jobs using the provided SearchJobsRequest.  This call
    * constrains the visibility of jobs present in the database, and only
    * returns jobs that the caller has permission to search against.
    * @alias jobs.projects.jobs.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project to search within.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchJobsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearch): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearch,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearch,
    options: BodyResponseCallback[Schema$SearchJobsResponse],
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  /**
    * jobs.projects.jobs.searchForAlert
    * @desc Searches for jobs using the provided SearchJobsRequest.  This API
    * call is intended for the use case of targeting passive job seekers (for
    * example, job seekers who have signed up to receive email alerts about
    * potential job opportunities), and has different algorithmic adjustments
    * that are targeted to passive job seekers.  This call constrains the
    * visibility of jobs present in the database, and only returns jobs the
    * caller has permission to search against.
    * @alias jobs.projects.jobs.searchForAlert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required.  The resource name of the project to search within.  The format is "projects/{project_id}", for example, "projects/api-test-project".
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForAlert(): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(callback: BodyResponseCallback[Schema$SearchJobsResponse]): Unit = js.native
  def searchForAlert(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearchforalert): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearchforalert,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearchforalert,
    options: BodyResponseCallback[Schema$SearchJobsResponse],
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearchforalert, options: MethodOptions): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSearchforalert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
}

