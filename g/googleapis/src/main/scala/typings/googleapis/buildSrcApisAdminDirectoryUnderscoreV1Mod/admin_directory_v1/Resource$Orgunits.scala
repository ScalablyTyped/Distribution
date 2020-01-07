package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Orgunits")
@js.native
class Resource$Orgunits protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.orgunits.delete
    * @desc Remove organizational unit
    * @alias directory.orgunits.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOrgunitsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarOrgunitsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarOrgunitsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarOrgunitsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarOrgunitsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.orgunits.get
    * @desc Retrieve organizational unit
    * @alias directory.orgunits.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$OrgUnit] = js.native
  def get(callback: BodyResponseCallback[Schema$OrgUnit]): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrgunitsDollarGet): GaxiosPromise[Schema$OrgUnit] = js.native
  def get(
    params: ParamsDollarResourceDollarOrgunitsDollarGet,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarOrgunitsDollarGet,
    options: BodyResponseCallback[Schema$OrgUnit],
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarOrgunitsDollarGet, options: MethodOptions): GaxiosPromise[Schema$OrgUnit] = js.native
  def get(
    params: ParamsDollarResourceDollarOrgunitsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.insert
    * @desc Add organizational unit
    * @alias directory.orgunits.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$OrgUnit] = js.native
  def insert(callback: BodyResponseCallback[Schema$OrgUnit]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarOrgunitsDollarInsert): GaxiosPromise[Schema$OrgUnit] = js.native
  def insert(
    params: ParamsDollarResourceDollarOrgunitsDollarInsert,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarOrgunitsDollarInsert,
    options: BodyResponseCallback[Schema$OrgUnit],
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarOrgunitsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$OrgUnit] = js.native
  def insert(
    params: ParamsDollarResourceDollarOrgunitsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.list
    * @desc Retrieve all organizational units
    * @alias directory.orgunits.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string=} params.orgUnitPath the URL-encoded organizational unit's path or its ID
    * @param {string=} params.type Whether to return all sub-organizations or just immediate children
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$OrgUnits] = js.native
  def list(callback: BodyResponseCallback[Schema$OrgUnits]): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrgunitsDollarList): GaxiosPromise[Schema$OrgUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarOrgunitsDollarList,
    callback: BodyResponseCallback[Schema$OrgUnits]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarOrgunitsDollarList,
    options: BodyResponseCallback[Schema$OrgUnits],
    callback: BodyResponseCallback[Schema$OrgUnits]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarOrgunitsDollarList, options: MethodOptions): GaxiosPromise[Schema$OrgUnits] = js.native
  def list(
    params: ParamsDollarResourceDollarOrgunitsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgUnits]
  ): Unit = js.native
  /**
    * directory.orgunits.patch
    * @desc Update organizational unit. This method supports patch semantics.
    * @alias directory.orgunits.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$OrgUnit] = js.native
  def patch(callback: BodyResponseCallback[Schema$OrgUnit]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrgunitsDollarPatch): GaxiosPromise[Schema$OrgUnit] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrgunitsDollarPatch,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarOrgunitsDollarPatch,
    options: BodyResponseCallback[Schema$OrgUnit],
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarOrgunitsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$OrgUnit] = js.native
  def patch(
    params: ParamsDollarResourceDollarOrgunitsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  /**
    * directory.orgunits.update
    * @desc Update organizational unit
    * @alias directory.orgunits.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customerId Immutable ID of the G Suite account
    * @param {string} params.orgUnitPath Full path of the organizational unit or its ID
    * @param {().OrgUnit} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$OrgUnit] = js.native
  def update(callback: BodyResponseCallback[Schema$OrgUnit]): Unit = js.native
  def update(params: ParamsDollarResourceDollarOrgunitsDollarUpdate): GaxiosPromise[Schema$OrgUnit] = js.native
  def update(
    params: ParamsDollarResourceDollarOrgunitsDollarUpdate,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarOrgunitsDollarUpdate,
    options: BodyResponseCallback[Schema$OrgUnit],
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarOrgunitsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$OrgUnit] = js.native
  def update(
    params: ParamsDollarResourceDollarOrgunitsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$OrgUnit]
  ): Unit = js.native
}

