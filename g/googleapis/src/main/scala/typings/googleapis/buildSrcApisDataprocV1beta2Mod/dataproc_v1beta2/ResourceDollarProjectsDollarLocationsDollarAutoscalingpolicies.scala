package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Locations$Autoscalingpolicies")
@js.native
class ResourceDollarProjectsDollarLocationsDollarAutoscalingpolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.create
    * @desc Creates new autoscaling policy.
    * @alias dataproc.projects.locations.autoscalingPolicies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}.
    * @param {().AutoscalingPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def create(callback: BodyResponseCallback[Schema$AutoscalingPolicy]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarCreate): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarCreate,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarCreate,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.delete
    * @desc Deletes an autoscaling policy. It is an error to delete an
    * autoscaling policy that is in use by one or more clusters.
    * @alias dataproc.projects.locations.autoscalingPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.get
    * @desc Retrieves autoscaling policy.
    * @alias dataproc.projects.locations.autoscalingPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. The "resource name" of the autoscaling policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def get(callback: BodyResponseCallback[Schema$AutoscalingPolicy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGet): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGet,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGet,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.locations.autoscalingPolicies.getIamPolicy
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
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.list
    * @desc Lists autoscaling policies in the project.
    * @alias dataproc.projects.locations.autoscalingPolicies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Optional. The maximum number of results to return in each response.
    * @param {string=} params.pageToken Optional. The page token, returned by a previous call, to request the next page of results.
    * @param {string} params.parent Required. The "resource name" of the region, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAutoscalingPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarList): GaxiosPromise[Schema$ListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarList,
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarList,
    options: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.locations.autoscalingPolicies.setIamPolicy
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
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarSetiampolicy
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.locations.autoscalingPolicies.testIamPermissions
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
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.locations.autoscalingPolicies.update
    * @desc Updates (replaces) autoscaling policy.Disabled check for
    * update_mask, because all updates will be full replacements.
    * @alias dataproc.projects.locations.autoscalingPolicies.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. The "resource name" of the policy, as described in https://cloud.google.com/apis/design/resource_names of the form projects/{project_id}/regions/{region}/autoscalingPolicies/{policy_id}.
    * @param {().AutoscalingPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def update(callback: BodyResponseCallback[Schema$AutoscalingPolicy]): Unit = js.native
  def update(params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarUpdate): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarUpdate,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarUpdate,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarLocationsDollarAutoscalingpoliciesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
}

