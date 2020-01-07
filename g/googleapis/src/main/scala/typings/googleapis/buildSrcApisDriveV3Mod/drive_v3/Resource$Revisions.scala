package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Revisions")
@js.native
class Resource$Revisions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.revisions.delete
    * @desc Permanently deletes a file version. You can only delete revisions
    * for files with binary content, like images or videos. Revisions for other
    * files, like Google Docs or Sheets, and the last remaining file version
    * can't be deleted.
    * @alias drive.revisions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.revisionId The ID of the revision.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRevisionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarRevisionsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarRevisionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarRevisionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarRevisionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.revisions.get
    * @desc Gets a revision's metadata or content by ID.
    * @alias drive.revisions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledgeAbuse Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.revisionId The ID of the revision.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Revision] = js.native
  def get(callback: BodyResponseCallback[Schema$Revision]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRevisionsDollarGet): GaxiosPromise[Schema$Revision] = js.native
  def get(
    params: ParamsDollarResourceDollarRevisionsDollarGet,
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRevisionsDollarGet,
    options: BodyResponseCallback[Schema$Revision],
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRevisionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Revision] = js.native
  def get(
    params: ParamsDollarResourceDollarRevisionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
  /**
    * drive.revisions.list
    * @desc Lists a file's revisions.
    * @alias drive.revisions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {integer=} params.pageSize The maximum number of revisions to return per page.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RevisionList] = js.native
  def list(callback: BodyResponseCallback[Schema$RevisionList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRevisionsDollarList): GaxiosPromise[Schema$RevisionList] = js.native
  def list(
    params: ParamsDollarResourceDollarRevisionsDollarList,
    callback: BodyResponseCallback[Schema$RevisionList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRevisionsDollarList,
    options: BodyResponseCallback[Schema$RevisionList],
    callback: BodyResponseCallback[Schema$RevisionList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRevisionsDollarList, options: MethodOptions): GaxiosPromise[Schema$RevisionList] = js.native
  def list(
    params: ParamsDollarResourceDollarRevisionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RevisionList]
  ): Unit = js.native
  /**
    * drive.revisions.update
    * @desc Updates a revision with patch semantics.
    * @alias drive.revisions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.revisionId The ID of the revision.
    * @param {().Revision} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Revision] = js.native
  def update(callback: BodyResponseCallback[Schema$Revision]): Unit = js.native
  def update(params: ParamsDollarResourceDollarRevisionsDollarUpdate): GaxiosPromise[Schema$Revision] = js.native
  def update(
    params: ParamsDollarResourceDollarRevisionsDollarUpdate,
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarRevisionsDollarUpdate,
    options: BodyResponseCallback[Schema$Revision],
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarRevisionsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Revision] = js.native
  def update(
    params: ParamsDollarResourceDollarRevisionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Revision]
  ): Unit = js.native
}

