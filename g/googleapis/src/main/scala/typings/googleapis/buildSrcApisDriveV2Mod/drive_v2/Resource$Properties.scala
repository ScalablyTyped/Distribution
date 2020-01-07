package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Properties")
@js.native
class Resource$Properties protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.properties.delete
    * @desc Deletes a property.
    * @alias drive.properties.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPropertiesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPropertiesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPropertiesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPropertiesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPropertiesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.properties.get
    * @desc Gets a property by its key.
    * @alias drive.properties.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Property] = js.native
  def get(callback: BodyResponseCallback[Schema$Property]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPropertiesDollarGet): GaxiosPromise[Schema$Property] = js.native
  def get(
    params: ParamsDollarResourceDollarPropertiesDollarGet,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPropertiesDollarGet,
    options: BodyResponseCallback[Schema$Property],
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPropertiesDollarGet, options: MethodOptions): GaxiosPromise[Schema$Property] = js.native
  def get(
    params: ParamsDollarResourceDollarPropertiesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  /**
    * drive.properties.insert
    * @desc Adds a property to a file, or updates it if it already exists.
    * @alias drive.properties.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Property] = js.native
  def insert(callback: BodyResponseCallback[Schema$Property]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPropertiesDollarInsert): GaxiosPromise[Schema$Property] = js.native
  def insert(
    params: ParamsDollarResourceDollarPropertiesDollarInsert,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPropertiesDollarInsert,
    options: BodyResponseCallback[Schema$Property],
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPropertiesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Property] = js.native
  def insert(
    params: ParamsDollarResourceDollarPropertiesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  /**
    * drive.properties.list
    * @desc Lists a file's properties.
    * @alias drive.properties.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PropertyList] = js.native
  def list(callback: BodyResponseCallback[Schema$PropertyList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPropertiesDollarList): GaxiosPromise[Schema$PropertyList] = js.native
  def list(
    params: ParamsDollarResourceDollarPropertiesDollarList,
    callback: BodyResponseCallback[Schema$PropertyList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPropertiesDollarList,
    options: BodyResponseCallback[Schema$PropertyList],
    callback: BodyResponseCallback[Schema$PropertyList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPropertiesDollarList, options: MethodOptions): GaxiosPromise[Schema$PropertyList] = js.native
  def list(
    params: ParamsDollarResourceDollarPropertiesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PropertyList]
  ): Unit = js.native
  /**
    * drive.properties.patch
    * @desc Updates a property.
    * @alias drive.properties.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Property] = js.native
  def patch(callback: BodyResponseCallback[Schema$Property]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPropertiesDollarPatch): GaxiosPromise[Schema$Property] = js.native
  def patch(
    params: ParamsDollarResourceDollarPropertiesDollarPatch,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPropertiesDollarPatch,
    options: BodyResponseCallback[Schema$Property],
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPropertiesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Property] = js.native
  def patch(
    params: ParamsDollarResourceDollarPropertiesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  /**
    * drive.properties.update
    * @desc Updates a property.
    * @alias drive.properties.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.propertyKey The key of the property.
    * @param {string=} params.visibility The visibility of the property. Allowed values are PRIVATE and PUBLIC. (Default: PRIVATE)
    * @param {().Property} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Property] = js.native
  def update(callback: BodyResponseCallback[Schema$Property]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPropertiesDollarUpdate): GaxiosPromise[Schema$Property] = js.native
  def update(
    params: ParamsDollarResourceDollarPropertiesDollarUpdate,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPropertiesDollarUpdate,
    options: BodyResponseCallback[Schema$Property],
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPropertiesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Property] = js.native
  def update(
    params: ParamsDollarResourceDollarPropertiesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Property]
  ): Unit = js.native
}

