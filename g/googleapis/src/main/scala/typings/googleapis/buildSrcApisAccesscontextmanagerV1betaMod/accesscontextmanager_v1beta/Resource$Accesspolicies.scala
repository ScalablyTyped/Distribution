package typings.googleapis.buildSrcApisAccesscontextmanagerV1betaMod.accesscontextmanager_v1beta

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1beta", "accesscontextmanager_v1beta.Resource$Accesspolicies")
@js.native
class Resource$Accesspolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var accessLevels: ResourceDollarAccesspoliciesDollarAccesslevels = js.native
  var context: APIRequestContext = js.native
  var servicePerimeters: ResourceDollarAccesspoliciesDollarServiceperimeters = js.native
  /**
    * accesscontextmanager.accessPolicies.create
    * @desc Create an `AccessPolicy`. Fails if this organization already has a
    * `AccessPolicy`. The longrunning Operation will have a successful status
    * once the `AccessPolicy` has propagated to long-lasting storage. Syntactic
    * and basic semantic errors will be returned in `metadata` as a BadRequest
    * proto.
    * @alias accesscontextmanager.accessPolicies.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().AccessPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccesspoliciesDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccesspoliciesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.delete
    * @desc Delete an AccessPolicy by resource name. The longrunning Operation
    * will have a successful status once the AccessPolicy has been removed from
    * long-lasting storage.
    * @alias accesscontextmanager.accessPolicies.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the access policy to delete.  Format `accessPolicies/{policy_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccesspoliciesDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccesspoliciesDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.get
    * @desc Get an AccessPolicy by name.
    * @alias accesscontextmanager.accessPolicies.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the access policy to get.  Format `accessPolicies/{policy_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccessPolicy] = js.native
  def get(callback: BodyResponseCallback[Schema$AccessPolicy]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccesspoliciesDollarGet): GaxiosPromise[Schema$AccessPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarGet,
    callback: BodyResponseCallback[Schema$AccessPolicy]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarGet,
    options: BodyResponseCallback[Schema$AccessPolicy],
    callback: BodyResponseCallback[Schema$AccessPolicy]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccesspoliciesDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccessPolicy] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccessPolicy]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.list
    * @desc List all AccessPolicies under a container.
    * @alias accesscontextmanager.accessPolicies.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Number of AccessPolicy instances to include in the list. Default 100.
    * @param {string=} params.pageToken Next page token for the next batch of AccessPolicy instances. Defaults to the first page of results.
    * @param {string=} params.parent Required. Resource name for the container to list AccessPolicy instances from.  Format: `organizations/{org_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAccessPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAccessPoliciesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccesspoliciesDollarList): GaxiosPromise[Schema$ListAccessPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarList,
    callback: BodyResponseCallback[Schema$ListAccessPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarList,
    options: BodyResponseCallback[Schema$ListAccessPoliciesResponse],
    callback: BodyResponseCallback[Schema$ListAccessPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccesspoliciesDollarList, options: MethodOptions): GaxiosPromise[Schema$ListAccessPoliciesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAccessPoliciesResponse]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.patch
    * @desc Update an AccessPolicy. The longrunning Operation from this RPC
    * will have a successful status once the changes to the AccessPolicy have
    * propagated to long-lasting storage. Syntactic and basic semantic errors
    * will be returned in `metadata` as a BadRequest proto.
    * @alias accesscontextmanager.accessPolicies.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Output only. Resource name of the `AccessPolicy`. Format: `accessPolicies/{policy_id}`
    * @param {string=} params.updateMask Required. Mask to control which fields get updated. Must be non-empty.
    * @param {().AccessPolicy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccesspoliciesDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccesspoliciesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

