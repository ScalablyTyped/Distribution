package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Policies")
@js.native
class ResourceEnterprisesPolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidmanagement.enterprises.policies.delete
    * @desc Deletes a policy. This operation is only permitted if no devices
    * are currently referencing the policy.
    * @alias androidmanagement.enterprises.policies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[SchemaEmpty] = js.native
  def delete(callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete): GaxiosPromise[SchemaEmpty] = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete, callback: BodyResponseCallback[SchemaEmpty]): Unit = js.native
  def delete(
    params: ParamsResourceEnterprisesPoliciesDelete,
    options: BodyResponseCallback[SchemaEmpty],
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  def delete(params: ParamsResourceEnterprisesPoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaEmpty] = js.native
  def delete(
    params: ParamsResourceEnterprisesPoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaEmpty]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.policies.get
    * @desc Gets a policy.
    * @alias androidmanagement.enterprises.policies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[SchemaPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet): GaxiosPromise[SchemaPolicy] = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def get(
    params: ParamsResourceEnterprisesPoliciesGet,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceEnterprisesPoliciesGet, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def get(
    params: ParamsResourceEnterprisesPoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.policies.list
    * @desc Lists policies for a given enterprise.
    * @alias androidmanagement.enterprises.policies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The requested page size. The actual page size may be fixed to a min or max value.
    * @param {string=} params.pageToken A token identifying a page of results returned by the server.
    * @param {string} params.parent The name of the enterprise in the form enterprises/{enterpriseId}.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListPoliciesResponse]): Unit = js.native
  def list(params: ParamsResourceEnterprisesPoliciesList): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    callback: BodyResponseCallback[SchemaListPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    options: BodyResponseCallback[SchemaListPoliciesResponse],
    callback: BodyResponseCallback[SchemaListPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceEnterprisesPoliciesList, options: MethodOptions): GaxiosPromise[SchemaListPoliciesResponse] = js.native
  def list(
    params: ParamsResourceEnterprisesPoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListPoliciesResponse]
  ): Unit = js.native
  /**
    * androidmanagement.enterprises.policies.patch
    * @desc Updates or creates a policy.
    * @alias androidmanagement.enterprises.policies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the policy in the form enterprises/{enterpriseId}/policies/{policyId}.
    * @param {string=} params.updateMask The field mask indicating the fields to update. If not set, all modifiable fields will be modified.
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[SchemaPolicy] = js.native
  def patch(callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch): GaxiosPromise[SchemaPolicy] = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch, callback: BodyResponseCallback[SchemaPolicy]): Unit = js.native
  def patch(
    params: ParamsResourceEnterprisesPoliciesPatch,
    options: BodyResponseCallback[SchemaPolicy],
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
  def patch(params: ParamsResourceEnterprisesPoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaPolicy] = js.native
  def patch(
    params: ParamsResourceEnterprisesPoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaPolicy]
  ): Unit = js.native
}

