package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/dfareporting/v3.2", "dfareporting_v3_2.Resource$Accountuserprofiles")
@js.native
class Resource$Accountuserprofiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * dfareporting.accountUserProfiles.get
    * @desc Gets one account user profile by ID.
    * @alias dfareporting.accountUserProfiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User profile ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def get(callback: BodyResponseCallback[Schema$AccountUserProfile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountuserprofilesDollarGet): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarGet,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarGet,
    options: BodyResponseCallback[Schema$AccountUserProfile],
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarAccountuserprofilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def get(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.insert
    * @desc Inserts a new account user profile.
    * @alias dfareporting.accountUserProfiles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def insert(callback: BodyResponseCallback[Schema$AccountUserProfile]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountuserprofilesDollarInsert): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarInsert,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarInsert,
    options: BodyResponseCallback[Schema$AccountUserProfile],
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarAccountuserprofilesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def insert(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.list
    * @desc Retrieves a list of account user profiles, possibly filtered. This
    * method supports paging.
    * @alias dfareporting.accountUserProfiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.active Select only active user profiles.
    * @param {string=} params.ids Select only user profiles with these IDs.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Value of the nextPageToken from the previous result page.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {string=} params.searchString Allows searching for objects by name, ID or email. Wildcards (*) are allowed. For example, "user profile*2015" will return objects with names like "user profile June 2015", "user profile April 2015", or simply "user profile 2015". Most of the searches also add wildcards implicitly at the start and the end of the search string. For example, a search string of "user profile" will match objects with name "my user profile", "user profile 2015", or simply "user profile".
    * @param {string=} params.sortField Field by which to sort the list.
    * @param {string=} params.sortOrder Order of sorted results.
    * @param {string=} params.subaccountId Select only user profiles with the specified subaccount ID.
    * @param {string=} params.userRoleId Select only user profiles with the specified user role ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$AccountUserProfilesListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$AccountUserProfilesListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountuserprofilesDollarList): GaxiosPromise[Schema$AccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarList,
    callback: BodyResponseCallback[Schema$AccountUserProfilesListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarList,
    options: BodyResponseCallback[Schema$AccountUserProfilesListResponse],
    callback: BodyResponseCallback[Schema$AccountUserProfilesListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarAccountuserprofilesDollarList, options: MethodOptions): GaxiosPromise[Schema$AccountUserProfilesListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountUserProfilesListResponse]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.patch
    * @desc Updates an existing account user profile. This method supports
    * patch semantics.
    * @alias dfareporting.accountUserProfiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.id User profile ID.
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def patch(callback: BodyResponseCallback[Schema$AccountUserProfile]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountuserprofilesDollarPatch): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarPatch,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarPatch,
    options: BodyResponseCallback[Schema$AccountUserProfile],
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarAccountuserprofilesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def patch(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  /**
    * dfareporting.accountUserProfiles.update
    * @desc Updates an existing account user profile.
    * @alias dfareporting.accountUserProfiles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.profileId User profile ID associated with this request.
    * @param {().AccountUserProfile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def update(callback: BodyResponseCallback[Schema$AccountUserProfile]): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountuserprofilesDollarUpdate): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarUpdate,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarUpdate,
    options: BodyResponseCallback[Schema$AccountUserProfile],
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarAccountuserprofilesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$AccountUserProfile] = js.native
  def update(
    params: ParamsDollarResourceDollarAccountuserprofilesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AccountUserProfile]
  ): Unit = js.native
}

