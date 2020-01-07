package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gmail/v1", "gmail_v1.Resource$Users$Settings$Forwardingaddresses")
@js.native
class ResourceDollarUsersDollarSettingsDollarForwardingaddresses protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gmail.users.settings.forwardingAddresses.create
    * @desc Creates a forwarding address. If ownership verification is
    * required, a message will be sent to the recipient and the resource's
    * verification status will be set to pending; otherwise, the resource will
    * be created with verification status set to accepted.  This method is only
    * available to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.forwardingAddresses.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {().ForwardingAddress} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def create(callback: BodyResponseCallback[Schema$ForwardingAddress]): Unit = js.native
  def create(params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarCreate): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarCreate,
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarCreate,
    options: BodyResponseCallback[Schema$ForwardingAddress],
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarCreate,
    options: MethodOptions
  ): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def create(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.delete
    * @desc Deletes the specified forwarding address and revokes any
    * verification that may have been required.  This method is only available
    * to service account clients that have been delegated domain-wide
    * authority.
    * @alias gmail.users.settings.forwardingAddresses.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingEmail The forwarding address to be deleted.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarDelete,
    options: MethodOptions
  ): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.get
    * @desc Gets the specified forwarding address.
    * @alias gmail.users.settings.forwardingAddresses.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.forwardingEmail The forwarding address to be retrieved.
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def get(callback: BodyResponseCallback[Schema$ForwardingAddress]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarGet): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarGet,
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarGet,
    options: BodyResponseCallback[Schema$ForwardingAddress],
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarGet,
    options: MethodOptions
  ): GaxiosPromise[Schema$ForwardingAddress] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ForwardingAddress]
  ): Unit = js.native
  /**
    * gmail.users.settings.forwardingAddresses.list
    * @desc Lists the forwarding addresses for the specified account.
    * @alias gmail.users.settings.forwardingAddresses.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.userId User's email address. The special value "me" can be used to indicate the authenticated user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListForwardingAddressesResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListForwardingAddressesResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarList): GaxiosPromise[Schema$ListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarList,
    callback: BodyResponseCallback[Schema$ListForwardingAddressesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarList,
    options: BodyResponseCallback[Schema$ListForwardingAddressesResponse],
    callback: BodyResponseCallback[Schema$ListForwardingAddressesResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarList,
    options: MethodOptions
  ): GaxiosPromise[Schema$ListForwardingAddressesResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarSettingsDollarForwardingaddressesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListForwardingAddressesResponse]
  ): Unit = js.native
}

