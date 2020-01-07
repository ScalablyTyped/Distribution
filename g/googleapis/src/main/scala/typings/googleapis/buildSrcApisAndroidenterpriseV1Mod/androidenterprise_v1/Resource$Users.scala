package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Users")
@js.native
class Resource$Users protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * androidenterprise.users.delete
    * @desc Deleted an EMM-managed user.
    * @alias androidenterprise.users.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarUsersDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarUsersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.users.generateAuthenticationToken
    * @desc Generates an authentication token which the device policy client
    * can use to provision the given EMM-managed user account on a device. The
    * generated token is single-use and expires after a few minutes.  You can
    * provision a maximum of 10 devices per user.  This call only works with
    * EMM-managed accounts.
    * @alias androidenterprise.users.generateAuthenticationToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateAuthenticationToken(): GaxiosPromise[Schema$AuthenticationToken] = js.native
  def generateAuthenticationToken(callback: BodyResponseCallback[Schema$AuthenticationToken]): Unit = js.native
  def generateAuthenticationToken(params: ParamsDollarResourceDollarUsersDollarGenerateauthenticationtoken): GaxiosPromise[Schema$AuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsDollarResourceDollarUsersDollarGenerateauthenticationtoken,
    callback: BodyResponseCallback[Schema$AuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(
    params: ParamsDollarResourceDollarUsersDollarGenerateauthenticationtoken,
    options: BodyResponseCallback[Schema$AuthenticationToken],
    callback: BodyResponseCallback[Schema$AuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(params: ParamsDollarResourceDollarUsersDollarGenerateauthenticationtoken, options: MethodOptions): GaxiosPromise[Schema$AuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsDollarResourceDollarUsersDollarGenerateauthenticationtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$AuthenticationToken]
  ): Unit = js.native
  /**
    * androidenterprise.users.generateToken
    * @desc Generates a token (activation code) to allow this user to configure
    * their managed account in the Android Setup Wizard. Revokes any previously
    * generated token.  This call only works with Google managed accounts.
    * @alias androidenterprise.users.generateToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateToken(): GaxiosPromise[Schema$UserToken] = js.native
  def generateToken(callback: BodyResponseCallback[Schema$UserToken]): Unit = js.native
  def generateToken(params: ParamsDollarResourceDollarUsersDollarGeneratetoken): GaxiosPromise[Schema$UserToken] = js.native
  def generateToken(
    params: ParamsDollarResourceDollarUsersDollarGeneratetoken,
    callback: BodyResponseCallback[Schema$UserToken]
  ): Unit = js.native
  def generateToken(
    params: ParamsDollarResourceDollarUsersDollarGeneratetoken,
    options: BodyResponseCallback[Schema$UserToken],
    callback: BodyResponseCallback[Schema$UserToken]
  ): Unit = js.native
  def generateToken(params: ParamsDollarResourceDollarUsersDollarGeneratetoken, options: MethodOptions): GaxiosPromise[Schema$UserToken] = js.native
  def generateToken(
    params: ParamsDollarResourceDollarUsersDollarGeneratetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UserToken]
  ): Unit = js.native
  /**
    * androidenterprise.users.get
    * @desc Retrieves a user's details.
    * @alias androidenterprise.users.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$User] = js.native
  def get(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet): GaxiosPromise[Schema$User] = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarUsersDollarGet, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def get(
    params: ParamsDollarResourceDollarUsersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * androidenterprise.users.getAvailableProductSet
    * @desc Retrieves the set of products a user is entitled to access.
    * @alias androidenterprise.users.getAvailableProductSet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getAvailableProductSet(): GaxiosPromise[Schema$ProductSet] = js.native
  def getAvailableProductSet(callback: BodyResponseCallback[Schema$ProductSet]): Unit = js.native
  def getAvailableProductSet(params: ParamsDollarResourceDollarUsersDollarGetavailableproductset): GaxiosPromise[Schema$ProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarGetavailableproductset,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def getAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarGetavailableproductset,
    options: BodyResponseCallback[Schema$ProductSet],
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def getAvailableProductSet(params: ParamsDollarResourceDollarUsersDollarGetavailableproductset, options: MethodOptions): GaxiosPromise[Schema$ProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarGetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  /**
    * androidenterprise.users.insert
    * @desc Creates a new EMM-managed user.  The Users resource passed in the
    * body of the request should include an accountIdentifier and an
    * accountType. If a corresponding user already exists with the same account
    * identifier, the user will be updated with the resource. In this case only
    * the displayName field can be changed.
    * @alias androidenterprise.users.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$User] = js.native
  def insert(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert): GaxiosPromise[Schema$User] = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarInsert,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarUsersDollarInsert, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def insert(
    params: ParamsDollarResourceDollarUsersDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * androidenterprise.users.list
    * @desc Looks up a user by primary email address. This is only supported
    * for Google-managed users. Lookup of the id is not needed for EMM-managed
    * users because the id is already returned in the result of the
    * Users.insert call.
    * @alias androidenterprise.users.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.email The exact primary email address of the user to look up.
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$UsersListResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$UsersListResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarList): GaxiosPromise[Schema$UsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarList,
    callback: BodyResponseCallback[Schema$UsersListResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarList,
    options: BodyResponseCallback[Schema$UsersListResponse],
    callback: BodyResponseCallback[Schema$UsersListResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarUsersDollarList, options: MethodOptions): GaxiosPromise[Schema$UsersListResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarUsersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$UsersListResponse]
  ): Unit = js.native
  /**
    * androidenterprise.users.patch
    * @desc Updates the details of an EMM-managed user.  Can be used with
    * EMM-managed users only (not Google managed users). Pass the new details
    * in the Users resource in the request body. Only the displayName field can
    * be changed. Other fields must either be unset or have the currently
    * active value. This method supports patch semantics.
    * @alias androidenterprise.users.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$User] = js.native
  def patch(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch): GaxiosPromise[Schema$User] = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPatch,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarUsersDollarPatch, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def patch(
    params: ParamsDollarResourceDollarUsersDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  /**
    * androidenterprise.users.revokeDeviceAccess
    * @desc Revokes access to all devices currently provisioned to the user.
    * The user will no longer be able to use the managed Play store on any of
    * their managed devices.  This call only works with EMM-managed accounts.
    * @alias androidenterprise.users.revokeDeviceAccess
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revokeDeviceAccess(): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeDeviceAccess(params: ParamsDollarResourceDollarUsersDollarRevokedeviceaccess): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(
    params: ParamsDollarResourceDollarUsersDollarRevokedeviceaccess,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revokeDeviceAccess(
    params: ParamsDollarResourceDollarUsersDollarRevokedeviceaccess,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revokeDeviceAccess(params: ParamsDollarResourceDollarUsersDollarRevokedeviceaccess, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(
    params: ParamsDollarResourceDollarUsersDollarRevokedeviceaccess,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.users.revokeToken
    * @desc Revokes a previously generated token (activation code) for the
    * user.
    * @alias androidenterprise.users.revokeToken
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def revokeToken(): GaxiosPromise[Unit] = js.native
  def revokeToken(callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeToken(params: ParamsDollarResourceDollarUsersDollarRevoketoken): GaxiosPromise[Unit] = js.native
  def revokeToken(params: ParamsDollarResourceDollarUsersDollarRevoketoken, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeToken(
    params: ParamsDollarResourceDollarUsersDollarRevoketoken,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revokeToken(params: ParamsDollarResourceDollarUsersDollarRevoketoken, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeToken(
    params: ParamsDollarResourceDollarUsersDollarRevoketoken,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * androidenterprise.users.setAvailableProductSet
    * @desc Modifies the set of products that a user is entitled to access
    * (referred to as whitelisted products). Only products that are approved or
    * products that were previously approved (products with revoked approval)
    * can be whitelisted.
    * @alias androidenterprise.users.setAvailableProductSet
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {().ProductSet} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setAvailableProductSet(): GaxiosPromise[Schema$ProductSet] = js.native
  def setAvailableProductSet(callback: BodyResponseCallback[Schema$ProductSet]): Unit = js.native
  def setAvailableProductSet(params: ParamsDollarResourceDollarUsersDollarSetavailableproductset): GaxiosPromise[Schema$ProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarSetavailableproductset,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def setAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarSetavailableproductset,
    options: BodyResponseCallback[Schema$ProductSet],
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  def setAvailableProductSet(params: ParamsDollarResourceDollarUsersDollarSetavailableproductset, options: MethodOptions): GaxiosPromise[Schema$ProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsDollarResourceDollarUsersDollarSetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ProductSet]
  ): Unit = js.native
  /**
    * androidenterprise.users.update
    * @desc Updates the details of an EMM-managed user.  Can be used with
    * EMM-managed users only (not Google managed users). Pass the new details
    * in the Users resource in the request body. Only the displayName field can
    * be changed. Other fields must either be unset or have the currently
    * active value.
    * @alias androidenterprise.users.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.enterpriseId The ID of the enterprise.
    * @param {string} params.userId The ID of the user.
    * @param {().User} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$User] = js.native
  def update(callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate): GaxiosPromise[Schema$User] = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate, callback: BodyResponseCallback[Schema$User]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarUpdate,
    options: BodyResponseCallback[Schema$User],
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarUsersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$User] = js.native
  def update(
    params: ParamsDollarResourceDollarUsersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$User]
  ): Unit = js.native
}

