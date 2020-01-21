package typings.googleapis.accesscontextmanagerV1Mod.accesscontextmanagerV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Resource$Accesspolicies")
@js.native
class ResourceAccesspolicies protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var accessLevels: ResourceAccesspoliciesAccesslevels = js.native
  var context: APIRequestContext = js.native
  var servicePerimeters: ResourceAccesspoliciesServiceperimeters = js.native
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
  def create(): GaxiosPromise[SchemaOperation] = js.native
  def create(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(params: ParamsResourceAccesspoliciesCreate): GaxiosPromise[SchemaOperation] = js.native
  def create(params: ParamsResourceAccesspoliciesCreate, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def create(
    params: ParamsResourceAccesspoliciesCreate,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def create(params: ParamsResourceAccesspoliciesCreate, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def create(
    params: ParamsResourceAccesspoliciesCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def delete(): GaxiosPromise[SchemaOperation] = js.native
  def delete(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(params: ParamsResourceAccesspoliciesDelete): GaxiosPromise[SchemaOperation] = js.native
  def delete(params: ParamsResourceAccesspoliciesDelete, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def delete(
    params: ParamsResourceAccesspoliciesDelete,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def delete(params: ParamsResourceAccesspoliciesDelete, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def delete(
    params: ParamsResourceAccesspoliciesDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
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
  def get(): GaxiosPromise[SchemaAccessPolicy] = js.native
  def get(callback: BodyResponseCallback[SchemaAccessPolicy]): Unit = js.native
  def get(params: ParamsResourceAccesspoliciesGet): GaxiosPromise[SchemaAccessPolicy] = js.native
  def get(params: ParamsResourceAccesspoliciesGet, callback: BodyResponseCallback[SchemaAccessPolicy]): Unit = js.native
  def get(
    params: ParamsResourceAccesspoliciesGet,
    options: BodyResponseCallback[SchemaAccessPolicy],
    callback: BodyResponseCallback[SchemaAccessPolicy]
  ): Unit = js.native
  def get(params: ParamsResourceAccesspoliciesGet, options: MethodOptions): GaxiosPromise[SchemaAccessPolicy] = js.native
  def get(
    params: ParamsResourceAccesspoliciesGet,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAccessPolicy]
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
  def list(): GaxiosPromise[SchemaListAccessPoliciesResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaListAccessPoliciesResponse]): Unit = js.native
  def list(params: ParamsResourceAccesspoliciesList): GaxiosPromise[SchemaListAccessPoliciesResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesList,
    callback: BodyResponseCallback[SchemaListAccessPoliciesResponse]
  ): Unit = js.native
  def list(
    params: ParamsResourceAccesspoliciesList,
    options: BodyResponseCallback[SchemaListAccessPoliciesResponse],
    callback: BodyResponseCallback[SchemaListAccessPoliciesResponse]
  ): Unit = js.native
  def list(params: ParamsResourceAccesspoliciesList, options: MethodOptions): GaxiosPromise[SchemaListAccessPoliciesResponse] = js.native
  def list(
    params: ParamsResourceAccesspoliciesList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaListAccessPoliciesResponse]
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
  def patch(): GaxiosPromise[SchemaOperation] = js.native
  def patch(callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(params: ParamsResourceAccesspoliciesPatch): GaxiosPromise[SchemaOperation] = js.native
  def patch(params: ParamsResourceAccesspoliciesPatch, callback: BodyResponseCallback[SchemaOperation]): Unit = js.native
  def patch(
    params: ParamsResourceAccesspoliciesPatch,
    options: BodyResponseCallback[SchemaOperation],
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
  def patch(params: ParamsResourceAccesspoliciesPatch, options: MethodOptions): GaxiosPromise[SchemaOperation] = js.native
  def patch(
    params: ParamsResourceAccesspoliciesPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaOperation]
  ): Unit = js.native
}

