package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Parents")
@js.native
class Resource$Parents protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.parents.delete
    * @desc Removes a parent from a file.
    * @alias drive.parents.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.parentId The ID of the parent.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarParentsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarParentsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarParentsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarParentsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarParentsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.parents.get
    * @desc Gets a specific parent reference.
    * @alias drive.parents.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.parentId The ID of the parent.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ParentReference] = js.native
  def get(callback: BodyResponseCallback[Schema$ParentReference]): Unit = js.native
  def get(params: ParamsDollarResourceDollarParentsDollarGet): GaxiosPromise[Schema$ParentReference] = js.native
  def get(
    params: ParamsDollarResourceDollarParentsDollarGet,
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarParentsDollarGet,
    options: BodyResponseCallback[Schema$ParentReference],
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarParentsDollarGet, options: MethodOptions): GaxiosPromise[Schema$ParentReference] = js.native
  def get(
    params: ParamsDollarResourceDollarParentsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  /**
    * drive.parents.insert
    * @desc Adds a parent folder for a file.
    * @alias drive.parents.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().ParentReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ParentReference] = js.native
  def insert(callback: BodyResponseCallback[Schema$ParentReference]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarParentsDollarInsert): GaxiosPromise[Schema$ParentReference] = js.native
  def insert(
    params: ParamsDollarResourceDollarParentsDollarInsert,
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarParentsDollarInsert,
    options: BodyResponseCallback[Schema$ParentReference],
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarParentsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ParentReference] = js.native
  def insert(
    params: ParamsDollarResourceDollarParentsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ParentReference]
  ): Unit = js.native
  /**
    * drive.parents.list
    * @desc Lists a file's parents.
    * @alias drive.parents.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ParentList] = js.native
  def list(callback: BodyResponseCallback[Schema$ParentList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarParentsDollarList): GaxiosPromise[Schema$ParentList] = js.native
  def list(
    params: ParamsDollarResourceDollarParentsDollarList,
    callback: BodyResponseCallback[Schema$ParentList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarParentsDollarList,
    options: BodyResponseCallback[Schema$ParentList],
    callback: BodyResponseCallback[Schema$ParentList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarParentsDollarList, options: MethodOptions): GaxiosPromise[Schema$ParentList] = js.native
  def list(
    params: ParamsDollarResourceDollarParentsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ParentList]
  ): Unit = js.native
}

