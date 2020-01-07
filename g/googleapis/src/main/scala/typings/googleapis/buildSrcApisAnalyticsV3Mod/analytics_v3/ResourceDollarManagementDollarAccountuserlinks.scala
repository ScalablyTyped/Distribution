package typings.googleapis.buildSrcApisAnalyticsV3Mod.analytics_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/analytics/v3", "analytics_v3.Resource$Management$Accountuserlinks")
@js.native
class ResourceDollarManagementDollarAccountuserlinks protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * analytics.management.accountUserLinks.delete
    * @desc Removes a user from the given account.
    * @alias analytics.management.accountUserLinks.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to delete the user link for.
    * @param {string} params.linkId Link ID to delete the user link for.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.insert
    * @desc Adds a new user to the given account.
    * @alias analytics.management.accountUserLinks.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to create the user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(callback: BodyResponseCallback[Schema$EntityUserLink]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarInsert): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarInsert,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarInsert,
    options: BodyResponseCallback[Schema$EntityUserLink],
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarInsert,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLink] = js.native
  def insert(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.list
    * @desc Lists account-user links for a given account.
    * @alias analytics.management.accountUserLinks.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to retrieve the user links for.
    * @param {integer=} params.max-results The maximum number of account-user links to include in this response.
    * @param {integer=} params.start-index An index of the first account-user link to retrieve. Use this parameter as a pagination mechanism along with the max-results parameter.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(callback: BodyResponseCallback[Schema$EntityUserLinks]): Unit = js.native
  def list(params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarList): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarList,
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarList,
    options: BodyResponseCallback[Schema$EntityUserLinks],
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLinks] = js.native
  def list(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLinks]
  ): Unit = js.native
  /**
    * analytics.management.accountUserLinks.update
    * @desc Updates permissions for an existing user on the given account.
    * @alias analytics.management.accountUserLinks.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.accountId Account ID to update the account-user link for.
    * @param {string} params.linkId Link ID to update the account-user link for.
    * @param {().EntityUserLink} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(callback: BodyResponseCallback[Schema$EntityUserLink]): Unit = js.native
  def update(params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarUpdate): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarUpdate,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarUpdate,
    options: BodyResponseCallback[Schema$EntityUserLink],
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarUpdate,
    options: MethodOptions
  ): GaxiosPromise[Schema$EntityUserLink] = js.native
  def update(
    params: ParamsDollarResourceDollarManagementDollarAccountuserlinksDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$EntityUserLink]
  ): Unit = js.native
}

