package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Webpropertyuserlinks")
@js.native
class ResourceDollarManagementDollarWebpropertyuserlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.webpropertyUserLinks.delete
    * @desc Removes a user from the given web property.
    * @alias analytics.management.webpropertyUserLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the user link for.
    * @param {string} params.linkId Link ID to delete the user link for.
    * @param {string} params.webPropertyId Web Property ID to delete the user link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.webpropertyUserLinks.insert
    * @desc Adds a new user to the given web property.
    * @alias analytics.management.webpropertyUserLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the user link for.
    * @param {string} params.webPropertyId Web Property ID to create the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[Schema$EntityUserLink]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarInsert): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarInsert,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarInsert,
    options: BodyResponseCallback[Schema$EntityUserLink],
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  /**
    * analytics.management.webpropertyUserLinks.list
    * @desc Lists webProperty-user links for a given web property.
    * @alias analytics.management.webpropertyUserLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID which the given web property belongs to.
    * @param {integer=} params.max-results The maximum number of webProperty-user Links to include in this response.
    * @param {integer=} params.start-index An index of the first webProperty-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {string} params.webPropertyId Web Property ID for the webProperty-user links to retrieve. Can either be a specific web property ID or '~all', which refers to all the web properties that user has access to.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[Schema$EntityUserLinks]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarList): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarList,
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarList,
    options: BodyResponseCallback[Schema$EntityUserLinks],
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  /**
    * analytics.management.webpropertyUserLinks.update
    * @desc Updates permissions for an existing user on the given web property.
    * @alias analytics.management.webpropertyUserLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the account-user link for.
    * @param {string} params.linkId Link ID to update the account-user link for.
    * @param {string} params.webPropertyId Web property ID to update the account-user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(callback: BodyResponseCallback[Schema$EntityUserLink]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarUpdate): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarUpdate,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarUpdate,
    options: BodyResponseCallback[Schema$EntityUserLink],
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarWebpropertyuserlinksDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
}

