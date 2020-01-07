package typings.googleapis.buildSrcApisYoutubereportingV1Mod.youtubereporting_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/youtubereporting/v1", "youtubereporting_v1.Resource$Jobs")
@js.native
class Resource$Jobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var reports: ResourceDollarJobsDollarReports = js.native
  /**
    * youtubereporting.jobs.create
    * @desc Creates a job and returns it.
    * @alias youtubereporting.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {().Job} params.resource Request body data
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
    * youtubereporting.jobs.delete
    * @desc Deletes a job.
    * @alias youtubereporting.jobs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job to delete.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
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
    * youtubereporting.jobs.get
    * @desc Gets a job.
    * @alias youtubereporting.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.jobId The ID of the job to retrieve.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
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
    * youtubereporting.jobs.list
    * @desc Lists jobs.
    * @alias youtubereporting.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.includeSystemManaged If set to true, also system-managed jobs will be returned; otherwise only user-created jobs will be returned. System-managed jobs can neither be modified nor deleted.
    * @param {string=} params.onBehalfOfContentOwner The content owner's external ID on which behalf the user is acting on. If not set, the user is acting for himself (his own channel).
    * @param {integer=} params.pageSize Requested page size. Server may return fewer jobs than requested. If unspecified, server will pick an appropriate default.
    * @param {string=} params.pageToken A token identifying a page of results the server should return. Typically, this is the value of ListReportTypesResponse.next_page_token returned in response to the previous call to the `ListJobs` method.
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
}

