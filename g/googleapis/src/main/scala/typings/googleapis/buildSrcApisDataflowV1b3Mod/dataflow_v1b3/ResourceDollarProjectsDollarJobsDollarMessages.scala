package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataflow/v1b3", "dataflow_v1b3.Resource$Projects$Jobs$Messages")
@js.native
class ResourceDollarProjectsDollarJobsDollarMessages protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataflow.projects.jobs.messages.list
    * @desc Request the job status.  To request the status of a job, we
    * recommend using `projects.locations.jobs.messages.list` with a [regional
    * endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints).
    * Using `projects.jobs.messages.list` is not recommended, as you can only
    * request the status of jobs that are running in `us-central1`.
    * @alias dataflow.projects.jobs.messages.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.endTime Return only messages with timestamps < end_time. The default is now (i.e. return up to the latest messages available).
    * @param {string} params.jobId The job to get messages about.
    * @param {string=} params.location The [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that contains the job specified by job_id.
    * @param {string=} params.minimumImportance Filter to only get messages with importance >= level
    * @param {integer=} params.pageSize If specified, determines the maximum number of messages to return.  If unspecified, the service may choose an appropriate default, or may return an arbitrarily large number of results.
    * @param {string=} params.pageToken If supplied, this should be the value of next_page_token returned by an earlier call. This will cause the next page of results to be returned.
    * @param {string} params.projectId A project id.
    * @param {string=} params.startTime If specified, return only messages with timestamps >= start_time. The default is the job creation time (i.e. beginning of messages).
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListJobMessagesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListJobMessagesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList): GaxiosPromise[Schema$ListJobMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList,
    callback: BodyResponseCallback[Schema$ListJobMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList,
    options: BodyResponseCallback[Schema$ListJobMessagesResponse],
    callback: BodyResponseCallback[Schema$ListJobMessagesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListJobMessagesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarMessagesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListJobMessagesResponse]
  ): Unit = js.native
}

