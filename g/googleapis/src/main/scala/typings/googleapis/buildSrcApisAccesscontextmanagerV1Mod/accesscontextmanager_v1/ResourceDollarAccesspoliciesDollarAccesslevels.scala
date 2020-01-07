package typings.googleapis.buildSrcApisAccesscontextmanagerV1Mod.accesscontextmanager_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/accesscontextmanager/v1", "accesscontextmanager_v1.Resource$Accesspolicies$Accesslevels")
@js.native
class ResourceDollarAccesspoliciesDollarAccesslevels protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * accesscontextmanager.accessPolicies.accessLevels.create
    * @desc Create an Access Level. The longrunning operation from this RPC
    * will have a successful status once the Access Level has propagated to
    * long-lasting storage. Access Levels containing errors will result in an
    * error response for the first error encountered.
    * @alias accesscontextmanager.accessPolicies.accessLevels.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.parent Required. Resource name for the access policy which owns this Access Level.  Format: `accessPolicies/{policy_id}`
    * @param {().AccessLevel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Operation] = js.native
  def create(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def create(params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarCreate): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarCreate,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarCreate,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def create(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.accessLevels.delete
    * @desc Delete an Access Level by resource name. The longrunning operation
    * from this RPC will have a successful status once the Access Level has
    * been removed from long-lasting storage.
    * @alias accesscontextmanager.accessPolicies.accessLevels.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Access Level.  Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Operation] = js.native
  def delete(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarDelete): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarDelete,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarDelete,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def delete(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.accessLevels.get
    * @desc Get an Access Level by resource name.
    * @alias accesscontextmanager.accessPolicies.accessLevels.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.accessLevelFormat Whether to return `BasicLevels` in the Cloud Common Expression Language rather than as `BasicLevels`. Defaults to AS_DEFINED, where Access Levels are returned as `BasicLevels` or `CustomLevels` based on how they were created. If set to CEL, all Access Levels are returned as `CustomLevels`. In the CEL case, `BasicLevels` are translated to equivalent `CustomLevels`.
    * @param {string} params.name Required. Resource name for the Access Level.  Format: `accessPolicies/{policy_id}/accessLevels/{access_level_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccessLevel] = js.native
  def get(callback: BodyResponseCallback[Schema$AccessLevel]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet): GaxiosPromise[Schema$AccessLevel] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet,
    callback: BodyResponseCallback[Schema$AccessLevel]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet,
    options: BodyResponseCallback[Schema$AccessLevel],
    callback: BodyResponseCallback[Schema$AccessLevel]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$AccessLevel] = js.native
  def get(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccessLevel]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.accessLevels.list
    * @desc List all Access Levels for an access policy.
    * @alias accesscontextmanager.accessPolicies.accessLevels.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.accessLevelFormat Whether to return `BasicLevels` in the Cloud Common Expression language, as `CustomLevels`, rather than as `BasicLevels`. Defaults to returning `AccessLevels` in the format they were defined.
    * @param {integer=} params.pageSize Number of Access Levels to include in the list. Default 100.
    * @param {string=} params.pageToken Next page token for the next batch of Access Level instances. Defaults to the first page of results.
    * @param {string} params.parent Required. Resource name for the access policy to list Access Levels from.  Format: `accessPolicies/{policy_id}`
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListAccessLevelsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListAccessLevelsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList): GaxiosPromise[Schema$ListAccessLevelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList,
    callback: BodyResponseCallback[Schema$ListAccessLevelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList,
    options: BodyResponseCallback[Schema$ListAccessLevelsResponse],
    callback: BodyResponseCallback[Schema$ListAccessLevelsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListAccessLevelsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListAccessLevelsResponse]
  ): Unit = js.native
  /**
    * accesscontextmanager.accessPolicies.accessLevels.patch
    * @desc Update an Access Level. The longrunning operation from this RPC
    * will have a successful status once the changes to the Access Level have
    * propagated to long-lasting storage. Access Levels containing errors will
    * result in an error response for the first error encountered.
    * @alias accesscontextmanager.accessPolicies.accessLevels.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name Required. Resource name for the Access Level. The `short_name` component must begin with a letter and only include alphanumeric and '_'. Format: `accessPolicies/{policy_id}/accessLevels/{short_name}`
    * @param {string=} params.updateMask Required.  Mask to control which fields get updated. Must be non-empty.
    * @param {().AccessLevel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Operation] = js.native
  def patch(callback: BodyResponseCallback[Schema$Operation]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarPatch): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarPatch,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarPatch,
    options: BodyResponseCallback[Schema$Operation],
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$Operation] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccesspoliciesDollarAccesslevelsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Operation]
  ): Unit = js.native
}

