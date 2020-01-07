package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Profilefilterlinks")
@js.native
class ResourceDollarManagementDollarProfilefilterlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.profileFilterLinks.delete
    * @desc Delete a profile filter link.
    * @alias analytics.management.profileFilterLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which the profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to delete.
    * @param {string} params.profileId Profile ID to which the filter link belongs.
    * @param {string} params.webPropertyId Web property Id to which the profile filter link belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.profileFilterLinks.get
    * @desc Returns a single profile filter link.
    * @alias analytics.management.profileFilterLinks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve profile filter link for.
    * @param {string} params.linkId ID of the profile filter link.
    * @param {string} params.profileId Profile ID to retrieve filter link for.
    * @param {string} params.webPropertyId Web property Id to retrieve profile filter link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def get(callback: BodyResponseCallback[Schema$ProfileFilterLink]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarGet): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarGet,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarGet,
    options: BodyResponseCallback[Schema$ProfileFilterLink],
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  /**
    * analytics.management.profileFilterLinks.insert
    * @desc Create a new profile filter link.
    * @alias analytics.management.profileFilterLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create profile filter link for.
    * @param {string} params.profileId Profile ID to create filter link for.
    * @param {string} params.webPropertyId Web property Id to create profile filter link for.
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def insert(callback: BodyResponseCallback[Schema$ProfileFilterLink]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarInsert): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarInsert,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarInsert,
    options: BodyResponseCallback[Schema$ProfileFilterLink],
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  /**
    * analytics.management.profileFilterLinks.list
    * @desc Lists all profile filter links for a profile.
    * @alias analytics.management.profileFilterLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve profile filter links for.
    * @param {integer=} params.max-results The maximum number of profile filter links to include in this response.
    * @param {string} params.profileId Profile ID to retrieve filter links for. Can either be a specific profile ID or '~all', which refers to all the profiles that user has access to.
    * @param {integer=} params.start-index An index of the first entity to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property Id for profile filter links for. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ProfileFilterLinks] = js.native
  def list(callback: BodyResponseCallback[Schema$ProfileFilterLinks]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarList): GaxiosPromise[Schema$ProfileFilterLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarList,
    callback: BodyResponseCallback[Schema$ProfileFilterLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarList,
    options: BodyResponseCallback[Schema$ProfileFilterLinks],
    callback: BodyResponseCallback[Schema$ProfileFilterLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProfileFilterLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProfileFilterLinks]
  ): Unit = js.native
  /**
    * analytics.management.profileFilterLinks.patch
    * @desc Update an existing profile filter link. This method supports patch
    * semantics.
    * @alias analytics.management.profileFilterLinks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to be updated.
    * @param {string} params.profileId Profile ID to which filter link belongs
    * @param {string} params.webPropertyId Web property Id to which profile filter link belongs
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def patch(callback: BodyResponseCallback[Schema$ProfileFilterLink]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarPatch): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarPatch,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarPatch,
    options: BodyResponseCallback[Schema$ProfileFilterLink],
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  /**
    * analytics.management.profileFilterLinks.update
    * @desc Update an existing profile filter link.
    * @alias analytics.management.profileFilterLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to which profile filter link belongs.
    * @param {string} params.linkId ID of the profile filter link to be updated.
    * @param {string} params.profileId Profile ID to which filter link belongs
    * @param {string} params.webPropertyId Web property Id to which profile filter link belongs
    * @param {().ProfileFilterLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def update(callback: BodyResponseCallback[Schema$ProfileFilterLink]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarUpdate): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarUpdate,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarUpdate,
    options: BodyResponseCallback[Schema$ProfileFilterLink],
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ProfileFilterLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarProfilefilterlinksDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProfileFilterLink]
  ): Unit = js.native
}

