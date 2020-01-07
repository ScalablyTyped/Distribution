package typings.googleapis.buildSrcApisJobsV2Mod.jobs_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/jobs/v2", "jobs_v2.Resource$Jobs")
@js.native
class Resource$Jobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * jobs.jobs.batchDelete
    * @desc Deletes a list of Job postings by filter.
    * @alias jobs.jobs.batchDelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().BatchDeleteJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def batchDelete(): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarJobsDollarBatchdelete): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarJobsDollarBatchdelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarJobsDollarBatchdelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def batchDelete(params: ParamsDollarResourceDollarJobsDollarBatchdelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def batchDelete(
    params: ParamsDollarResourceDollarJobsDollarBatchdelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.jobs.create
    * @desc Creates a new job.  Typically, the job becomes searchable within 10
    * seconds, but it may take up to 5 minutes.
    * @alias jobs.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().CreateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Job] = js.native
  def create(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def create(params: ParamsDollarResourceDollarJobsDollarCreate): GaxiosPromise[Schema$Job] = js.native
  def create(params: ParamsDollarResourceDollarJobsDollarCreate, callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarJobsDollarCreate,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarJobsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def create(
    params: ParamsDollarResourceDollarJobsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.jobs.delete
    * @desc Deletes the specified job.  Typically, the job becomes unsearchable
    * within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.disableFastProcess Deprecated. This field is not working anymore.  Optional.  If set to true, this call waits for all processing steps to complete before the job is cleaned up. Otherwise, the call returns while some steps are still taking place asynchronously, hence faster.
    * @param {string} params.name Required.  The resource name of the job to be deleted, such as "jobs/11111111".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarJobsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(params: ParamsDollarResourceDollarJobsDollarDelete, callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarJobsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarJobsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarJobsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.jobs.deleteByFilter
    * @desc Deprecated. Use BatchDeleteJobs instead.  Deletes the specified job
    * by filter. You can specify whether to synchronously wait for validation,
    * indexing, and general processing to be completed before the response is
    * returned.
    * @alias jobs.jobs.deleteByFilter
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().DeleteJobsByFilterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def deleteByFilter(): GaxiosPromise[Schema$Empty] = js.native
  def deleteByFilter(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def deleteByFilter(params: ParamsDollarResourceDollarJobsDollarDeletebyfilter): GaxiosPromise[Schema$Empty] = js.native
  def deleteByFilter(
    params: ParamsDollarResourceDollarJobsDollarDeletebyfilter,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deleteByFilter(
    params: ParamsDollarResourceDollarJobsDollarDeletebyfilter,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def deleteByFilter(params: ParamsDollarResourceDollarJobsDollarDeletebyfilter, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def deleteByFilter(
    params: ParamsDollarResourceDollarJobsDollarDeletebyfilter,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * jobs.jobs.get
    * @desc Retrieves the specified job, whose status is OPEN or recently
    * EXPIRED within the last 90 days.
    * @alias jobs.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required.  The resource name of the job to retrieve, such as "jobs/11111111".
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Job] = js.native
  def get(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def get(params: ParamsDollarResourceDollarJobsDollarGet): GaxiosPromise[Schema$Job] = js.native
  def get(params: ParamsDollarResourceDollarJobsDollarGet, callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarJobsDollarGet,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarJobsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def get(
    params: ParamsDollarResourceDollarJobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.jobs.histogram
    * @desc Deprecated. Use SearchJobsRequest.histogram_facets instead to make
    * a single call with both search and histogram.  Retrieves a histogram for
    * the given GetHistogramRequest. This call provides a structured count of
    * jobs that match against the search query, grouped by specified facets.
    * This call constrains the visibility of jobs present in the database, and
    * only counts jobs the caller has permission to search against.  For
    * example, use this call to generate the number of jobs in the U.S. by
    * state.
    * @alias jobs.jobs.histogram
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().GetHistogramRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def histogram(): GaxiosPromise[Schema$GetHistogramResponse] = js.native
  def histogram(callback: BodyResponseCallback[Schema$GetHistogramResponse]): Unit = js.native
  def histogram(params: ParamsDollarResourceDollarJobsDollarHistogram): GaxiosPromise[Schema$GetHistogramResponse] = js.native
  def histogram(
    params: ParamsDollarResourceDollarJobsDollarHistogram,
    callback: BodyResponseCallback[Schema$GetHistogramResponse]
  ): Unit = js.native
  def histogram(
    params: ParamsDollarResourceDollarJobsDollarHistogram,
    options: BodyResponseCallback[Schema$GetHistogramResponse],
    callback: BodyResponseCallback[Schema$GetHistogramResponse]
  ): Unit = js.native
  def histogram(params: ParamsDollarResourceDollarJobsDollarHistogram, options: MethodOptions): GaxiosPromise[Schema$GetHistogramResponse] = js.native
  def histogram(
    params: ParamsDollarResourceDollarJobsDollarHistogram,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GetHistogramResponse]
  ): Unit = js.native
  /**
    * jobs.jobs.list
    * @desc Lists jobs by filter.
    * @alias jobs.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Required.  The filter string specifies the jobs to be enumerated.  Supported operator: =, AND  The fields eligible for filtering are:  * `companyName` (Required) * `requisitionId` (Optional)  Sample Query:  * companyName = "companies/123" * companyName = "companies/123" AND requisitionId = "req-1"
    * @param {boolean=} params.idsOnly Optional.  If set to `true`, only Job.name, Job.requisition_id and Job.language_code will be returned.  A typical use case is to synchronize job repositories.  Defaults to false.
    * @param {integer=} params.pageSize Optional.  The maximum number of jobs to be returned per page of results.  If ids_only is set to true, the maximum allowed page size is 1000. Otherwise, the maximum allowed page size is 100.  Default is 100 if empty or a number < 1 is specified.
    * @param {string=} params.pageToken Optional.  The starting point of a query result.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarJobsDollarList): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarList,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarList,
    options: BodyResponseCallback[Schema$ListJobsResponse],
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarJobsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarJobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListJobsResponse]
  ): Unit = js.native
  /**
    * jobs.jobs.patch
    * @desc Updates specified job.  Typically, updated contents become visible
    * in search results within 10 seconds, but it may take up to 5 minutes.
    * @alias jobs.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required during job update.  Resource name assigned to a job by the API, for example, "/jobs/foo". Use of this field in job queries and API calls is preferred over the use of requisition_id since this value is unique.
    * @param {().UpdateJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Job] = js.native
  def patch(callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarJobsDollarPatch): GaxiosPromise[Schema$Job] = js.native
  def patch(params: ParamsDollarResourceDollarJobsDollarPatch, callback: BodyResponseCallback[Schema$Job]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarJobsDollarPatch,
    options: BodyResponseCallback[Schema$Job],
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarJobsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarJobsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Job]
  ): Unit = js.native
  /**
    * jobs.jobs.search
    * @desc Searches for jobs using the provided SearchJobsRequest.  This call
    * constrains the visibility of jobs present in the database, and only
    * returns jobs that the caller has permission to search against.
    * @alias jobs.jobs.search
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def search(): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(callback: BodyResponseCallback[Schema$SearchJobsResponse]): Unit = js.native
  def search(params: ParamsDollarResourceDollarJobsDollarSearch): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarJobsDollarSearch,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def search(
    params: ParamsDollarResourceDollarJobsDollarSearch,
    options: BodyResponseCallback[Schema$SearchJobsResponse],
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def search(params: ParamsDollarResourceDollarJobsDollarSearch, options: MethodOptions): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def search(
    params: ParamsDollarResourceDollarJobsDollarSearch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  /**
    * jobs.jobs.searchForAlert
    * @desc Searches for jobs using the provided SearchJobsRequest.  This API
    * call is intended for the use case of targeting passive job seekers (for
    * example, job seekers who have signed up to receive email alerts about
    * potential job opportunities), and has different algorithmic adjustments
    * that are targeted to passive job seekers.  This call constrains the
    * visibility of jobs present in the database, and only returns jobs the
    * caller has permission to search against.
    * @alias jobs.jobs.searchForAlert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().SearchJobsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def searchForAlert(): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(callback: BodyResponseCallback[Schema$SearchJobsResponse]): Unit = js.native
  def searchForAlert(params: ParamsDollarResourceDollarJobsDollarSearchforalert): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarJobsDollarSearchforalert,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarJobsDollarSearchforalert,
    options: BodyResponseCallback[Schema$SearchJobsResponse],
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
  def searchForAlert(params: ParamsDollarResourceDollarJobsDollarSearchforalert, options: MethodOptions): GaxiosPromise[Schema$SearchJobsResponse] = js.native
  def searchForAlert(
    params: ParamsDollarResourceDollarJobsDollarSearchforalert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$SearchJobsResponse]
  ): Unit = js.native
}

