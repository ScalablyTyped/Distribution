package typings.googleapis.buildSrcApisVaultV1Mod.vault_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/vault/v1", "vault_v1.Resource$Matters")
@js.native
class Resource$Matters protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var exports: ResourceDollarMattersDollarExports = js.native
  var holds: ResourceDollarMattersDollarHolds = js.native
  var savedQueries: ResourceDollarMattersDollarSavedqueries = js.native
  /**
    * vault.matters.addPermissions
    * @desc Adds an account as a matter collaborator.
    * @alias vault.matters.addPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().AddMatterPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def addPermissions(): GaxiosPromise[Schema$MatterPermission] = js.native
  def addPermissions(callback: BodyResponseCallback[Schema$MatterPermission]): Unit = js.native
  def addPermissions(params: ParamsDollarResourceDollarMattersDollarAddpermissions): GaxiosPromise[Schema$MatterPermission] = js.native
  def addPermissions(
    params: ParamsDollarResourceDollarMattersDollarAddpermissions,
    callback: BodyResponseCallback[Schema$MatterPermission]
  ): Unit = js.native
  def addPermissions(
    params: ParamsDollarResourceDollarMattersDollarAddpermissions,
    options: BodyResponseCallback[Schema$MatterPermission],
    callback: BodyResponseCallback[Schema$MatterPermission]
  ): Unit = js.native
  def addPermissions(params: ParamsDollarResourceDollarMattersDollarAddpermissions, options: MethodOptions): GaxiosPromise[Schema$MatterPermission] = js.native
  def addPermissions(
    params: ParamsDollarResourceDollarMattersDollarAddpermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$MatterPermission]
  ): Unit = js.native
  /**
    * vault.matters.close
    * @desc Closes the specified matter. Returns matter with updated state.
    * @alias vault.matters.close
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().CloseMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def close(): GaxiosPromise[Schema$CloseMatterResponse] = js.native
  def close(callback: BodyResponseCallback[Schema$CloseMatterResponse]): Unit = js.native
  def close(params: ParamsDollarResourceDollarMattersDollarClose): GaxiosPromise[Schema$CloseMatterResponse] = js.native
  def close(
    params: ParamsDollarResourceDollarMattersDollarClose,
    callback: BodyResponseCallback[Schema$CloseMatterResponse]
  ): Unit = js.native
  def close(
    params: ParamsDollarResourceDollarMattersDollarClose,
    options: BodyResponseCallback[Schema$CloseMatterResponse],
    callback: BodyResponseCallback[Schema$CloseMatterResponse]
  ): Unit = js.native
  def close(params: ParamsDollarResourceDollarMattersDollarClose, options: MethodOptions): GaxiosPromise[Schema$CloseMatterResponse] = js.native
  def close(
    params: ParamsDollarResourceDollarMattersDollarClose,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$CloseMatterResponse]
  ): Unit = js.native
  /**
    * vault.matters.create
    * @desc Creates a new matter with the given name and description. The
    * initial state is open, and the owner is the method caller. Returns the
    * created matter with default view.
    * @alias vault.matters.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {().Matter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Matter] = js.native
  def create(callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarCreate): GaxiosPromise[Schema$Matter] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarCreate,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarCreate,
    options: BodyResponseCallback[Schema$Matter],
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarMattersDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Matter] = js.native
  def create(
    params: ParamsDollarResourceDollarMattersDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  /**
    * vault.matters.delete
    * @desc Deletes the specified matter. Returns matter with updated state.
    * @alias vault.matters.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Matter] = js.native
  def delete(callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarDelete): GaxiosPromise[Schema$Matter] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarDelete,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarDelete,
    options: BodyResponseCallback[Schema$Matter],
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarMattersDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Matter] = js.native
  def delete(
    params: ParamsDollarResourceDollarMattersDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  /**
    * vault.matters.get
    * @desc Gets the specified matter.
    * @alias vault.matters.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {string=} params.view Specifies which parts of the Matter to return in the response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Matter] = js.native
  def get(callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarGet): GaxiosPromise[Schema$Matter] = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarGet, callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarGet,
    options: BodyResponseCallback[Schema$Matter],
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarMattersDollarGet, options: MethodOptions): GaxiosPromise[Schema$Matter] = js.native
  def get(
    params: ParamsDollarResourceDollarMattersDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  /**
    * vault.matters.list
    * @desc Lists matters the user has access to.
    * @alias vault.matters.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize The number of matters to return in the response. Default and maximum are 100.
    * @param {string=} params.pageToken The pagination token as returned in the response.
    * @param {string=} params.state If set, list only matters with that specific state. The default is listing matters of all states.
    * @param {string=} params.view Specifies which parts of the matter to return in response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListMattersResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListMattersResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarList): GaxiosPromise[Schema$ListMattersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarList,
    callback: BodyResponseCallback[Schema$ListMattersResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarList,
    options: BodyResponseCallback[Schema$ListMattersResponse],
    callback: BodyResponseCallback[Schema$ListMattersResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarMattersDollarList, options: MethodOptions): GaxiosPromise[Schema$ListMattersResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarMattersDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListMattersResponse]
  ): Unit = js.native
  /**
    * vault.matters.removePermissions
    * @desc Removes an account as a matter collaborator.
    * @alias vault.matters.removePermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().RemoveMatterPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def removePermissions(): GaxiosPromise[Schema$Empty] = js.native
  def removePermissions(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def removePermissions(params: ParamsDollarResourceDollarMattersDollarRemovepermissions): GaxiosPromise[Schema$Empty] = js.native
  def removePermissions(
    params: ParamsDollarResourceDollarMattersDollarRemovepermissions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removePermissions(
    params: ParamsDollarResourceDollarMattersDollarRemovepermissions,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def removePermissions(params: ParamsDollarResourceDollarMattersDollarRemovepermissions, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def removePermissions(
    params: ParamsDollarResourceDollarMattersDollarRemovepermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * vault.matters.reopen
    * @desc Reopens the specified matter. Returns matter with updated state.
    * @alias vault.matters.reopen
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().ReopenMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reopen(): GaxiosPromise[Schema$ReopenMatterResponse] = js.native
  def reopen(callback: BodyResponseCallback[Schema$ReopenMatterResponse]): Unit = js.native
  def reopen(params: ParamsDollarResourceDollarMattersDollarReopen): GaxiosPromise[Schema$ReopenMatterResponse] = js.native
  def reopen(
    params: ParamsDollarResourceDollarMattersDollarReopen,
    callback: BodyResponseCallback[Schema$ReopenMatterResponse]
  ): Unit = js.native
  def reopen(
    params: ParamsDollarResourceDollarMattersDollarReopen,
    options: BodyResponseCallback[Schema$ReopenMatterResponse],
    callback: BodyResponseCallback[Schema$ReopenMatterResponse]
  ): Unit = js.native
  def reopen(params: ParamsDollarResourceDollarMattersDollarReopen, options: MethodOptions): GaxiosPromise[Schema$ReopenMatterResponse] = js.native
  def reopen(
    params: ParamsDollarResourceDollarMattersDollarReopen,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ReopenMatterResponse]
  ): Unit = js.native
  /**
    * vault.matters.undelete
    * @desc Undeletes the specified matter. Returns matter with updated state.
    * @alias vault.matters.undelete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().UndeleteMatterRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def undelete(): GaxiosPromise[Schema$Matter] = js.native
  def undelete(callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarMattersDollarUndelete): GaxiosPromise[Schema$Matter] = js.native
  def undelete(
    params: ParamsDollarResourceDollarMattersDollarUndelete,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def undelete(
    params: ParamsDollarResourceDollarMattersDollarUndelete,
    options: BodyResponseCallback[Schema$Matter],
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def undelete(params: ParamsDollarResourceDollarMattersDollarUndelete, options: MethodOptions): GaxiosPromise[Schema$Matter] = js.native
  def undelete(
    params: ParamsDollarResourceDollarMattersDollarUndelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  /**
    * vault.matters.update
    * @desc Updates the specified matter. This updates only the name and
    * description of the matter, identified by matter id. Changes to any other
    * fields are ignored. Returns the default view of the matter.
    * @alias vault.matters.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.matterId The matter ID.
    * @param {().Matter} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Matter] = js.native
  def update(callback: BodyResponseCallback[Schema$Matter]): Unit = js.native
  def update(params: ParamsDollarResourceDollarMattersDollarUpdate): GaxiosPromise[Schema$Matter] = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarUpdate,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarUpdate,
    options: BodyResponseCallback[Schema$Matter],
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarMattersDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Matter] = js.native
  def update(
    params: ParamsDollarResourceDollarMattersDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Matter]
  ): Unit = js.native
}

