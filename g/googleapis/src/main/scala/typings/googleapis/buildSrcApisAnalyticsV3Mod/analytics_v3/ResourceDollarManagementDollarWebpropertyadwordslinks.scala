package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webpropertyadwordslinks")
@js.native
class ResourceDollarManagementDollarWebpropertyadwordslinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.delete
    * @desc Deletes a web property-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to delete the Google Ads link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.get
    * @desc Returns a web property-Google Ads link to which the user has
    * access.
    * @alias analytics.management.webPropertyAdWordsLinks.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def get(callback: BodyResponseCallback[Schema$EntityAdWordsLink]): Unit = js.native
  def get(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarGet): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarGet,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarGet,
    options: BodyResponseCallback[Schema$EntityAdWordsLink],
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def get(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.insert
    * @desc Creates a webProperty-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the Google Analytics account to create the link for.
    * @param {string} params.webPropertyId Web property ID to create the link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def insert(callback: BodyResponseCallback[Schema$EntityAdWordsLink]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarInsert): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarInsert,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarInsert,
    options: BodyResponseCallback[Schema$EntityAdWordsLink],
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.list
    * @desc Lists webProperty-Google Ads links for a given web property.
    * @alias analytics.management.webPropertyAdWordsLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {integer=} params.max-results The maximum number of webProperty-Google Ads links to include in this response.
    * @param {integer=} params.start-index An index of the first webProperty-Google Ads link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads links for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$EntityAdWordsLinks] = js.native
  def list(callback: BodyResponseCallback[Schema$EntityAdWordsLinks]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarList): GaxiosPromise[Schema$EntityAdWordsLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarList,
    callback: BodyResponseCallback[Schema$EntityAdWordsLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarList,
    options: BodyResponseCallback[Schema$EntityAdWordsLinks],
    callback: BodyResponseCallback[Schema$EntityAdWordsLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityAdWordsLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityAdWordsLinks]
  ): Unit = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.patch
    * @desc Updates an existing webProperty-Google Ads link. This method
    * supports patch semantics.
    * @alias analytics.management.webPropertyAdWordsLinks.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def patch(callback: BodyResponseCallback[Schema$EntityAdWordsLink]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarPatch): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarPatch,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarPatch,
    options: BodyResponseCallback[Schema$EntityAdWordsLink],
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarPatch,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def patch(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  /**
    * analytics.management.webPropertyAdWordsLinks.update
    * @desc Updates an existing webProperty-Google Ads link.
    * @alias analytics.management.webPropertyAdWordsLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId ID of the account which the given web property belongs to.
    * @param {string} params.webPropertyAdWordsLinkId Web property-Google Ads link ID.
    * @param {string} params.webPropertyId Web property ID to retrieve the Google Ads link for.
    * @param {().EntityAdWordsLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def update(callback: BodyResponseCallback[Schema$EntityAdWordsLink]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarUpdate): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarUpdate,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarUpdate,
    options: BodyResponseCallback[Schema$EntityAdWordsLink],
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityAdWordsLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyadwordslinksDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityAdWordsLink]
  ): Unit = js.native
}

