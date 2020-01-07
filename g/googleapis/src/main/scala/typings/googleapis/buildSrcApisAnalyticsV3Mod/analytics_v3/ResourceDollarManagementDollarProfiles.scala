package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profiles")
@js.native
class ResourceDollarManagementDollarProfiles protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.profiles.delete
    * @desc Deletes a view (profile).
    * @alias analytics.management.profiles.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the view (profile) for.
    * @param {string} params.profileId ID of the view (profile) to be deleted.
    * @param {string} params.webPropertyId Web property ID to delete the view (profile) for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarProfilesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarProfilesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.profiles.get
    * @desc Gets a view (profile) to which the user has access.
    * @alias analytics.management.profiles.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the view (profile) for.
    * @param {string} params.profileId View (Profile) ID to retrieve the view (profile) for.
    * @param {string} params.webPropertyId Web property ID to retrieve the view (profile) for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Profile] = js.native
  def get(callback: BodyResponseCallback[Schema$Profile]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarProfilesDollarGet): GaxiosPromise[Schema$Profile] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarGet,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarGet,
    options: BodyResponseCallback[Schema$Profile],
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarProfilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Profile] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  /**
    * analytics.management.profiles.insert
    * @desc Create a new view (profile).
    * @alias analytics.management.profiles.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the view (profile) for.
    * @param {string} params.webPropertyId Web property ID to create the view (profile) for.
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Profile] = js.native
  def insert(callback: BodyResponseCallback[Schema$Profile]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarProfilesDollarInsert): GaxiosPromise[Schema$Profile] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarInsert,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarInsert,
    options: BodyResponseCallback[Schema$Profile],
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarProfilesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Profile] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  /**
    * analytics.management.profiles.list
    * @desc Lists views (profiles) to which the user has access.
    * @alias analytics.management.profiles.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID for the view (profiles) to retrieve. Can either be a specific account ID or '~all', which refers to all the accounts to which the user has access.
    * @param {integer=} params.max-results The maximum number of views (profiles) to include in this response.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID for the views (profiles) to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties to which the user has access.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Profiles] = js.native
  def list(callback: BodyResponseCallback[Schema$Profiles]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarProfilesDollarList): GaxiosPromise[Schema$Profiles] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    callback: BodyResponseCallback[Schema$Profiles]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    options: BodyResponseCallback[Schema$Profiles],
    callback: BodyResponseCallback[Schema$Profiles]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarProfilesDollarList, options: MethodOptions): GaxiosPromise[Schema$Profiles] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profiles]
  ): Unit = js.native
  /**
    * analytics.management.profiles.patch
    * @desc Updates an existing view (profile). This method supports patch
    * semantics.
    * @alias analytics.management.profiles.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the view (profile) belongs
    * @param {string} params.profileId ID of the view (profile) to be updated.
    * @param {string} params.webPropertyId Web property ID to which the view (profile) belongs
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Profile] = js.native
  def patch(callback: BodyResponseCallback[Schema$Profile]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarProfilesDollarPatch): GaxiosPromise[Schema$Profile] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarPatch,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarPatch,
    options: BodyResponseCallback[Schema$Profile],
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarProfilesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Profile] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  /**
    * analytics.management.profiles.update
    * @desc Updates an existing view (profile).
    * @alias analytics.management.profiles.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the view (profile) belongs
    * @param {string} params.profileId ID of the view (profile) to be updated.
    * @param {string} params.webPropertyId Web property ID to which the view (profile) belongs
    * @param {().Profile} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Profile] = js.native
  def update(callback: BodyResponseCallback[Schema$Profile]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarProfilesDollarUpdate): GaxiosPromise[Schema$Profile] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarUpdate,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarUpdate,
    options: BodyResponseCallback[Schema$Profile],
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarProfilesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Profile] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Profile]
  ): Unit = js.native
}

