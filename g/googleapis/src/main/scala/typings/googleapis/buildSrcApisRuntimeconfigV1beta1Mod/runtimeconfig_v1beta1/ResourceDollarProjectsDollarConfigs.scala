package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/runtimeconfig/v1beta1", "runtimeconfig_v1beta1.Resource$Projects$Configs")
@js.native
class ResourceDollarProjectsDollarConfigs protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var operations: ResourceDollarProjectsDollarConfigsDollarOperations = js.native
  var variables: ResourceDollarProjectsDollarConfigsDollarVariables = js.native
  var waiters: ResourceDollarProjectsDollarConfigsDollarWaiters = js.native
  /**
    * runtimeconfig.projects.configs.create
    * @desc Creates a new RuntimeConfig resource. The configuration name must
    * be unique within project.
    * @alias runtimeconfig.projects.configs.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent The [project ID](https://support.google.com/cloud/answer/6158840?hl=en&ref_topic=6158848) for this request, in the format `projects/[PROJECT_ID]`.
    * @param {string=} params.requestId An optional but recommended unique `request_id`. If the server receives two `create()` requests  with the same `request_id`, then the second request will be ignored and the first resource created and stored in the backend is returned. Empty `request_id` fields are ignored.  It is responsibility of the client to ensure uniqueness of the `request_id` strings.  `request_id` strings are limited to 64 characters.
    * @param {().RuntimeConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def create(callback: BodyResponseCallback[Schema$RuntimeConfig]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarCreate): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarCreate,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarCreate,
    options: BodyResponseCallback[Schema$RuntimeConfig],
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.delete
    * @desc Deletes a RuntimeConfig resource.
    * @alias runtimeconfig.projects.configs.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The RuntimeConfig resource to delete, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.get
    * @desc Gets information about a RuntimeConfig resource.
    * @alias runtimeconfig.projects.configs.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the RuntimeConfig resource to retrieve, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def get(callback: BodyResponseCallback[Schema$RuntimeConfig]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGet): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGet,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGet,
    options: BodyResponseCallback[Schema$RuntimeConfig],
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGet, options: MethodOptions): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias runtimeconfig.projects.configs.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.list
    * @desc Lists all the RuntimeConfig resources within project.
    * @alias runtimeconfig.projects.configs.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Specifies the number of results to return per page. If there are fewer elements than the specified number, returns all elements.
    * @param {string=} params.pageToken Specifies a page token to use. Set `pageToken` to a `nextPageToken` returned by a previous list request to get the next page of results.
    * @param {string} params.parent The [project ID](https://support.google.com/cloud/answer/6158840?hl=en&ref_topic=6158848) for this request, in the format `projects/[PROJECT_ID]`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListConfigsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListConfigsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarList): GaxiosPromise[Schema$ListConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarList,
    callback: BodyResponseCallback[Schema$ListConfigsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarList,
    options: BodyResponseCallback[Schema$ListConfigsResponse],
    callback: BodyResponseCallback[Schema$ListConfigsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListConfigsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListConfigsResponse]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias runtimeconfig.projects.configs.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias runtimeconfig.projects.configs.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * runtimeconfig.projects.configs.update
    * @desc Updates a RuntimeConfig resource. The configuration must exist
    * beforehand.
    * @alias runtimeconfig.projects.configs.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the RuntimeConfig resource to update, in the format:  `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    * @param {().RuntimeConfig} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def update(callback: BodyResponseCallback[Schema$RuntimeConfig]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarUpdate): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarUpdate,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarUpdate,
    options: BodyResponseCallback[Schema$RuntimeConfig],
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarConfigsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$RuntimeConfig] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarConfigsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RuntimeConfig]
  ): Unit = js.native
}

