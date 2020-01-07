package typings.googleapis.buildSrcApisAndroidmanagementV1Mod.androidmanagement_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidmanagement/v1", "androidmanagement_v1.Resource$Enterprises$Policies")
@js.native
class ResourceDollarEnterprisesDollarPolicies protected () extends js.Object {
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
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
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
  def get(): GaxiosPromise[Schema$Policy] = js.native
  def get(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarGet): GaxiosPromise[Schema$Policy] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarGet,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarGet,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def get(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
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
  def list(): GaxiosPromise[Schema$ListPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListPoliciesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarList): GaxiosPromise[Schema$ListPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarList,
    callback: BodyResponseCallback[Schema$ListPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarList,
    options: BodyResponseCallback[Schema$ListPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListPoliciesResponse]
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
  def patch(): GaxiosPromise[Schema$Policy] = js.native
  def patch(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarPatch): GaxiosPromise[Schema$Policy] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarPatch,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarPatch,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def patch(
    params: ParamsDollarResourceDollarEnterprisesDollarPoliciesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
}

