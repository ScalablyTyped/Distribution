package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.3", "dfareporting_v3_3.Resource$Userroles")
@js.native
class Resource$Userroles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.userRoles.delete
    * @desc Deletes an existing user role.
    * @alias dfareporting.userRoles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUserrolesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarUserrolesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUserrolesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUserrolesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUserrolesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * dfareporting.userRoles.get
    * @desc Gets one user role by ID.
    * @alias dfareporting.userRoles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$UserRole] = js.native
  def get(callback: BodyResponseCallback[Schema$UserRole]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolesDollarGet): GaxiosPromise[Schema$UserRole] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolesDollarGet,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolesDollarGet,
    options: BodyResponseCallback[Schema$UserRole],
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUserrolesDollarGet, options: MethodOptions): GaxiosPromise[Schema$UserRole] = js.native
  def get(
    params: ParamsDollarResourceDollarUserrolesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  /**
    * dfareporting.userRoles.insert
    * @desc Inserts a new user role.
    * @alias dfareporting.userRoles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$UserRole] = js.native
  def insert(callback: BodyResponseCallback[Schema$UserRole]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUserrolesDollarInsert): GaxiosPromise[Schema$UserRole] = js.native
  def insert(
    params: ParamsDollarResourceDollarUserrolesDollarInsert,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUserrolesDollarInsert,
    options: BodyResponseCallback[Schema$UserRole],
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUserrolesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$UserRole] = js.native
  def insert(
    params: ParamsDollarResourceDollarUserrolesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  /**
    * dfareporting.userRoles.list
    * @desc Retrieves a list of user roles, possibly filtered. This method
    * supports paging.
    * @alias dfareporting.userRoles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.accountUserRoleOnly Select only account level user roles not associated with any specific subaccount.
    * @param {string=} params.ids Select only user roles with the specified IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name or ID. Wildcards (*) are allowed. For example, "userrole*2015" will return objects with names like "userrole June 2015", "userrole April 2015", or simply "userrole 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "userrole" will match objects with name "my userrole", "userrole 2015", or simply "userrole".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only user roles that belong to this subaccount.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UserRolesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$UserRolesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolesDollarList): GaxiosPromise[Schema$UserRolesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolesDollarList,
    callback: BodyResponseCallback[Schema$UserRolesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolesDollarList,
    options: BodyResponseCallback[Schema$UserRolesListResponse],
    callback: BodyResponseCallback[Schema$UserRolesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUserrolesDollarList, options: MethodOptions): GaxiosPromise[Schema$UserRolesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUserrolesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRolesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.userRoles.patch
    * @desc Updates an existing user role. This method supports patch
    * semantics.
    * @alias dfareporting.userRoles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User role ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$UserRole] = js.native
  def patch(callback: BodyResponseCallback[Schema$UserRole]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUserrolesDollarPatch): GaxiosPromise[Schema$UserRole] = js.native
  def patch(
    params: ParamsDollarResourceDollarUserrolesDollarPatch,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUserrolesDollarPatch,
    options: BodyResponseCallback[Schema$UserRole],
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUserrolesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$UserRole] = js.native
  def patch(
    params: ParamsDollarResourceDollarUserrolesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  /**
    * dfareporting.userRoles.update
    * @desc Updates an existing user role.
    * @alias dfareporting.userRoles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().UserRole} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$UserRole] = js.native
  def update(callback: BodyResponseCallback[Schema$UserRole]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUserrolesDollarUpdate): GaxiosPromise[Schema$UserRole] = js.native
  def update(
    params: ParamsDollarResourceDollarUserrolesDollarUpdate,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUserrolesDollarUpdate,
    options: BodyResponseCallback[Schema$UserRole],
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUserrolesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$UserRole] = js.native
  def update(
    params: ParamsDollarResourceDollarUserrolesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserRole]
  ): Unit = js.native
}

