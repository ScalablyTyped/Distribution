package typings.googleapis.buildSrcApisDataprocV1beta2Mod.dataproc_v1beta2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dataproc/v1beta2", "dataproc_v1beta2.Resource$Projects$Regions$Autoscalingpolicies")
@js.native
class ResourceDollarProjectsDollarRegionsDollarAutoscalingpolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.create
    * @desc Creates new autoscaling policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.create
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
  def create(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarCreate): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarCreate,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarCreate,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.delete
    * @desc Deletes an autoscaling policy. It is an error to delete an
    * autoscaling policy that is in use by one or more clusters.
    * @alias dataproc.projects.regions.autoscalingPolicies.delete
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
  def delete(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.get
    * @desc Retrieves autoscaling policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.get
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
  def get(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGet): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGet,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGet,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @alias dataproc.projects.regions.autoscalingPolicies.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().GetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.list
    * @desc Lists autoscaling policies in the project.
    * @alias dataproc.projects.regions.autoscalingPolicies.list
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
  def list(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarList): GaxiosPromise[Schema$ListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarList,
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarList,
    options: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAutoscalingPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAutoscalingPoliciesResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @alias dataproc.projects.regions.autoscalingPolicies.setIamPolicy
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
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: MethodOptions
  ): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.Note: This operation is designed to be
    * used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @alias dataproc.projects.regions.autoscalingPolicies.testIamPermissions
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
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarTestiampermissions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * dataproc.projects.regions.autoscalingPolicies.update
    * @desc Updates (replaces) autoscaling policy.Disabled check for
    * update_mask, because all updates will be full replacements.
    * @alias dataproc.projects.regions.autoscalingPolicies.update
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
  def update(params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarUpdate): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarUpdate,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarUpdate,
    options: BodyResponseCallback[Schema$AutoscalingPolicy],
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$AutoscalingPolicy] = js.native
  def update(
    params: ParamsDollarResourceDollarProjectsDollarRegionsDollarAutoscalingpoliciesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AutoscalingPolicy]
  ): Unit = js.native
}

