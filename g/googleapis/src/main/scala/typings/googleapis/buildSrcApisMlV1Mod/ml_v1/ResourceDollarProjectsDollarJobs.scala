package typings.googleapis.buildSrcApisMlV1Mod.ml_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/ml/v1", "ml_v1.Resource$Projects$Jobs")
@js.native
class ResourceDollarProjectsDollarJobs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * ml.projects.jobs.cancel
    * @desc Cancels a running job.
    * @alias ml.projects.jobs.cancel
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the job to cancel.
    * @param {().GoogleCloudMlV1__CancelJobRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def cancel(): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCancel): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCancel,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCancel,
    options: BodyResponseCallback[Schema$GoogleProtobuf__Empty],
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  def cancel(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCancel, options: MethodOptions): GaxiosPromise[Schema$GoogleProtobuf__Empty] = js.native
  def cancel(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCancel,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleProtobuf__Empty]
  ): Unit = js.native
  /**
    * ml.projects.jobs.create
    * @desc Creates a training or a batch prediction job.
    * @alias ml.projects.jobs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The project name.
    * @param {().GoogleCloudMlV1__Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def create(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Job],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  /**
    * ml.projects.jobs.get
    * @desc Describes a job.
    * @alias ml.projects.jobs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The name of the job to get the description of.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def get(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Job],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  /**
    * ml.projects.jobs.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias ml.projects.jobs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGetiampolicy): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1__Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarJobsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  /**
    * ml.projects.jobs.list
    * @desc Lists the jobs in the project.  If there are no jobs that match the
    * request parameters, the list request returns an empty response body: {}.
    * @alias ml.projects.jobs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.filter Optional. Specifies the subset of jobs to retrieve. You can filter on the value of one or more attributes of the job object. For example, retrieve jobs with a job identifier that starts with 'census': <p><code>gcloud ml-engine jobs list --filter='jobId:census*'</code> <p>List all failed jobs with names that start with 'rnn': <p><code>gcloud ml-engine jobs list --filter='jobId:rnn* AND state:FAILED'</code> <p>For more examples, see the guide to <a href="/ml-engine/docs/tensorflow/monitor-training">monitoring jobs</a>.
    * @param {integer=} params.pageSize Optional. The number of jobs to retrieve per "page" of results. If there are more remaining results than this number, the response message will contain a valid value in the `next_page_token` field.  The default value is 20, and the maximum page size is 100.
    * @param {string=} params.pageToken Optional. A page token to request the next page of results.  You get the token from the `next_page_token` field of the response from the previous call.
    * @param {string} params.parent Required. The name of the project for which to list jobs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$GoogleCloudMlV1__ListJobsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListJobsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarJobsDollarList): GaxiosPromise[Schema$GoogleCloudMlV1__ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListJobsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__ListJobsResponse],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListJobsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarJobsDollarList, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__ListJobsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__ListJobsResponse]
  ): Unit = js.native
  /**
    * ml.projects.jobs.patch
    * @desc Updates a specific job resource.  Currently the only supported
    * fields to update are `labels`.
    * @alias ml.projects.jobs.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The job name.
    * @param {string=} params.updateMask Required. Specifies the path, relative to `Job`, of the field to update. To adopt etag mechanism, include `etag` field in the mask, and include the `etag` value in your job resource.  For example, to change the labels of a job, the `update_mask` parameter would be specified as `labels`, `etag`, and the `PATCH` request body would specify the new value, as follows:     {       "labels": {          "owner": "Google",          "color": "Blue"       }       "etag": "33a64df551425fcc55e4d42a148795d9f25f89d4"     } If `etag` matches the one on the server, the labels of the job will be replaced with the given ones, and the server end `etag` will be recalculated.  Currently the only supported update masks are `labels` and `etag`.
    * @param {().GoogleCloudMlV1__Job} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def patch(callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    options: BodyResponseCallback[Schema$GoogleCloudMlV1__Job],
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$GoogleCloudMlV1__Job] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleCloudMlV1__Job]
  ): Unit = js.native
  /**
    * ml.projects.jobs.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias ml.projects.jobs.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSetiampolicy): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$GoogleIamV1__Policy],
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarJobsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$GoogleIamV1__Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__Policy]
  ): Unit = js.native
  /**
    * ml.projects.jobs.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias ml.projects.jobs.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GoogleIamV1__TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarJobsDollarTestiampermissions): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$GoogleIamV1__TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarJobsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GoogleIamV1__TestIamPermissionsResponse]
  ): Unit = js.native
}

