package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Children")
@js.native
class Resource$Children protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.children.delete
    * @desc Removes a child from a folder.
    * @alias drive.children.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.childId The ID of the child.
    * @param {string} params.folderId The ID of the folder.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarChildrenDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarChildrenDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarChildrenDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarChildrenDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarChildrenDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.children.get
    * @desc Gets a specific child reference.
    * @alias drive.children.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.childId The ID of the child.
    * @param {string} params.folderId The ID of the folder.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$ChildReference] = js.native
  def get(callback: BodyResponseCallback[Schema$ChildReference]): Unit = js.native
  def get(params: ParamsDollarResourceDollarChildrenDollarGet): GaxiosPromise[Schema$ChildReference] = js.native
  def get(
    params: ParamsDollarResourceDollarChildrenDollarGet,
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarChildrenDollarGet,
    options: BodyResponseCallback[Schema$ChildReference],
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarChildrenDollarGet, options: MethodOptions): GaxiosPromise[Schema$ChildReference] = js.native
  def get(
    params: ParamsDollarResourceDollarChildrenDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  /**
    * drive.children.insert
    * @desc Inserts a file into a folder.
    * @alias drive.children.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.folderId The ID of the folder.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().ChildReference} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$ChildReference] = js.native
  def insert(callback: BodyResponseCallback[Schema$ChildReference]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarChildrenDollarInsert): GaxiosPromise[Schema$ChildReference] = js.native
  def insert(
    params: ParamsDollarResourceDollarChildrenDollarInsert,
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarChildrenDollarInsert,
    options: BodyResponseCallback[Schema$ChildReference],
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarChildrenDollarInsert, options: MethodOptions): GaxiosPromise[Schema$ChildReference] = js.native
  def insert(
    params: ParamsDollarResourceDollarChildrenDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChildReference]
  ): Unit = js.native
  /**
    * drive.children.list
    * @desc Lists a folder's children.
    * @alias drive.children.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.folderId The ID of the folder.
    * @param {integer=} params.maxResults Maximum number of children to return.
    * @param {string=} params.orderBy A comma-separated list of sort keys. Valid keys are 'createdDate', 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate', 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', and 'title'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    * @param {string=} params.pageToken Page token for children.
    * @param {string=} params.q Query string for searching children.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ChildList] = js.native
  def list(callback: BodyResponseCallback[Schema$ChildList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarChildrenDollarList): GaxiosPromise[Schema$ChildList] = js.native
  def list(
    params: ParamsDollarResourceDollarChildrenDollarList,
    callback: BodyResponseCallback[Schema$ChildList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarChildrenDollarList,
    options: BodyResponseCallback[Schema$ChildList],
    callback: BodyResponseCallback[Schema$ChildList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarChildrenDollarList, options: MethodOptions): GaxiosPromise[Schema$ChildList] = js.native
  def list(
    params: ParamsDollarResourceDollarChildrenDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ChildList]
  ): Unit = js.native
}

