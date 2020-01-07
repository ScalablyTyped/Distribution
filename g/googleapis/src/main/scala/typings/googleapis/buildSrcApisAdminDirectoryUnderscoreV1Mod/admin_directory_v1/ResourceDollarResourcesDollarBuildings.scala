package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/admin/directory_v1", "admin_directory_v1.Resource$Resources$Buildings")
@js.native
class ResourceDollarResourcesDollarBuildings protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * directory.resources.buildings.delete
    * @desc Deletes a building.
    * @alias directory.resources.buildings.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to delete.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarDelete,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * directory.resources.buildings.get
    * @desc Retrieves a building.
    * @alias directory.resources.buildings.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The unique ID of the building to retrieve.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Building] = js.native
  def get(callback: BodyResponseCallback[Schema$Building]): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarGet): GaxiosPromise[Schema$Building] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarGet,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarGet,
    options: BodyResponseCallback[Schema$Building],
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Building] = js.native
  def get(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  /**
    * directory.resources.buildings.insert
    * @desc Inserts a building.
    * @alias directory.resources.buildings.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Building] = js.native
  def insert(callback: BodyResponseCallback[Schema$Building]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarInsert): GaxiosPromise[Schema$Building] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarInsert,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarInsert,
    options: BodyResponseCallback[Schema$Building],
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Building] = js.native
  def insert(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  /**
    * directory.resources.buildings.list
    * @desc Retrieves a list of buildings for an account.
    * @alias directory.resources.buildings.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {integer=} params.maxResults Maximum number of results to return.
    * @param {string=} params.pageToken Token to specify the next page in the list.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Buildings] = js.native
  def list(callback: BodyResponseCallback[Schema$Buildings]): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarList): GaxiosPromise[Schema$Buildings] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarList,
    callback: BodyResponseCallback[Schema$Buildings]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarList,
    options: BodyResponseCallback[Schema$Buildings],
    callback: BodyResponseCallback[Schema$Buildings]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarList, options: MethodOptions): GaxiosPromise[Schema$Buildings] = js.native
  def list(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Buildings]
  ): Unit = js.native
  /**
    * directory.resources.buildings.patch
    * @desc Updates a building. This method supports patch semantics.
    * @alias directory.resources.buildings.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to update.
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Building] = js.native
  def patch(callback: BodyResponseCallback[Schema$Building]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarPatch): GaxiosPromise[Schema$Building] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarPatch,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarPatch,
    options: BodyResponseCallback[Schema$Building],
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Building] = js.native
  def patch(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  /**
    * directory.resources.buildings.update
    * @desc Updates a building.
    * @alias directory.resources.buildings.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.buildingId The ID of the building to update.
    * @param {string=} params.coordinatesSource Source from which Building.coordinates are derived.
    * @param {string} params.customer The unique ID for the customer's G Suite account. As an account administrator, you can also use the my_customer alias to represent your account's customer ID.
    * @param {().Building} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Building] = js.native
  def update(callback: BodyResponseCallback[Schema$Building]): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarUpdate): GaxiosPromise[Schema$Building] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarUpdate,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarUpdate,
    options: BodyResponseCallback[Schema$Building],
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Building] = js.native
  def update(
    params: ParamsDollarResourceDollarResourcesDollarBuildingsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Building]
  ): Unit = js.native
}

