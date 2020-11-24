package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import typings.gaxios.commonMod.GaxiosPromise
import typings.googleapisCommon.apiMod.APIRequestContext
import typings.googleapisCommon.apiMod.BodyResponseCallback
import typings.googleapisCommon.apiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("googleapis/build/src/apis/androidenterprise/v1", "androidenterprise_v1.Resource$Users")
@js.native
class ResourceUsers protected () extends js.Object {
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
  def delete(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsResourceUsersDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsResourceUsersDelete, options: MethodOptions, callback: BodyResponseCallback[Unit]): Unit = js.native
  
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
  def generateAuthenticationToken(): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(callback: BodyResponseCallback[SchemaAuthenticationToken]): Unit = js.native
  def generateAuthenticationToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(params: ParamsResourceUsersGenerateauthenticationtoken): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    callback: BodyResponseCallback[SchemaAuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    options: BodyResponseCallback[SchemaAuthenticationToken],
    callback: BodyResponseCallback[SchemaAuthenticationToken]
  ): Unit = js.native
  def generateAuthenticationToken(params: ParamsResourceUsersGenerateauthenticationtoken, options: MethodOptions): GaxiosPromise[SchemaAuthenticationToken] = js.native
  def generateAuthenticationToken(
    params: ParamsResourceUsersGenerateauthenticationtoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaAuthenticationToken]
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
  def generateToken(): GaxiosPromise[SchemaUserToken] = js.native
  def generateToken(callback: BodyResponseCallback[SchemaUserToken]): Unit = js.native
  def generateToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUserToken] = js.native
  def generateToken(params: ParamsResourceUsersGeneratetoken): GaxiosPromise[SchemaUserToken] = js.native
  def generateToken(params: ParamsResourceUsersGeneratetoken, callback: BodyResponseCallback[SchemaUserToken]): Unit = js.native
  def generateToken(
    params: ParamsResourceUsersGeneratetoken,
    options: BodyResponseCallback[SchemaUserToken],
    callback: BodyResponseCallback[SchemaUserToken]
  ): Unit = js.native
  def generateToken(params: ParamsResourceUsersGeneratetoken, options: MethodOptions): GaxiosPromise[SchemaUserToken] = js.native
  def generateToken(
    params: ParamsResourceUsersGeneratetoken,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUserToken]
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
  def get(): GaxiosPromise[SchemaUser] = js.native
  def get(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def get(
    params: ParamsResourceUsersGet,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def get(params: ParamsResourceUsersGet, options: MethodOptions, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  
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
  def getAvailableProductSet(): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def getAvailableProductSet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(params: ParamsResourceUsersGetavailableproductset): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    options: BodyResponseCallback[SchemaProductSet],
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def getAvailableProductSet(params: ParamsResourceUsersGetavailableproductset, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def getAvailableProductSet(
    params: ParamsResourceUsersGetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
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
  def insert(): GaxiosPromise[SchemaUser] = js.native
  def insert(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert): GaxiosPromise[SchemaUser] = js.native
  def insert(params: ParamsResourceUsersInsert, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def insert(params: ParamsResourceUsersInsert, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def insert(
    params: ParamsResourceUsersInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
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
  def list(): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(params: ParamsResourceUsersList, callback: BodyResponseCallback[SchemaUsersListResponse]): Unit = js.native
  def list(
    params: ParamsResourceUsersList,
    options: BodyResponseCallback[SchemaUsersListResponse],
    callback: BodyResponseCallback[SchemaUsersListResponse]
  ): Unit = js.native
  def list(params: ParamsResourceUsersList, options: MethodOptions): GaxiosPromise[SchemaUsersListResponse] = js.native
  def list(
    params: ParamsResourceUsersList,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUsersListResponse]
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
  def patch(): GaxiosPromise[SchemaUser] = js.native
  def patch(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch): GaxiosPromise[SchemaUser] = js.native
  def patch(params: ParamsResourceUsersPatch, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def patch(params: ParamsResourceUsersPatch, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def patch(
    params: ParamsResourceUsersPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
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
  def revokeDeviceAccess(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeDeviceAccess(
    params: ParamsResourceUsersRevokedeviceaccess,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revokeDeviceAccess(params: ParamsResourceUsersRevokedeviceaccess, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeDeviceAccess(
    params: ParamsResourceUsersRevokedeviceaccess,
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
  def revokeToken(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeToken(params: ParamsResourceUsersRevoketoken): GaxiosPromise[Unit] = js.native
  def revokeToken(params: ParamsResourceUsersRevoketoken, callback: BodyResponseCallback[Unit]): Unit = js.native
  def revokeToken(
    params: ParamsResourceUsersRevoketoken,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def revokeToken(params: ParamsResourceUsersRevoketoken, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def revokeToken(
    params: ParamsResourceUsersRevoketoken,
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
  def setAvailableProductSet(): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(callback: BodyResponseCallback[SchemaProductSet]): Unit = js.native
  def setAvailableProductSet(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(params: ParamsResourceUsersSetavailableproductset): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    options: BodyResponseCallback[SchemaProductSet],
    callback: BodyResponseCallback[SchemaProductSet]
  ): Unit = js.native
  def setAvailableProductSet(params: ParamsResourceUsersSetavailableproductset, options: MethodOptions): GaxiosPromise[SchemaProductSet] = js.native
  def setAvailableProductSet(
    params: ParamsResourceUsersSetavailableproductset,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaProductSet]
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
  def update(): GaxiosPromise[SchemaUser] = js.native
  def update(callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(params: js.UndefOr[scala.Nothing], options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate): GaxiosPromise[SchemaUser] = js.native
  def update(params: ParamsResourceUsersUpdate, callback: BodyResponseCallback[SchemaUser]): Unit = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: BodyResponseCallback[SchemaUser],
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
  def update(params: ParamsResourceUsersUpdate, options: MethodOptions): GaxiosPromise[SchemaUser] = js.native
  def update(
    params: ParamsResourceUsersUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[SchemaUser]
  ): Unit = js.native
}
