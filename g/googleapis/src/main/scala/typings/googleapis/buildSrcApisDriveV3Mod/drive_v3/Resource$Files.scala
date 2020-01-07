package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Files")
@js.native
class Resource$Files protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.files.copy
    * @desc Creates a copy of a file and applies any requested updates with
    * patch semantics.
    * @alias drive.files.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.ignoreDefaultVisibility Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    * @param {boolean=} params.keepRevisionForever Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Drive.
    * @param {string=} params.ocrLanguage A language hint for OCR processing during image import (ISO 639-1 code).
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().File} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[Schema$File] = js.native
  def copy(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def copy(params: ParamsDollarResourceDollarFilesDollarCopy): GaxiosPromise[Schema$File] = js.native
  def copy(params: ParamsDollarResourceDollarFilesDollarCopy, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def copy(
    params: ParamsDollarResourceDollarFilesDollarCopy,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def copy(params: ParamsDollarResourceDollarFilesDollarCopy, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def copy(
    params: ParamsDollarResourceDollarFilesDollarCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.create
    * @desc Creates a new file.
    * @alias drive.files.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.ignoreDefaultVisibility Whether to ignore the domain's default visibility settings for the created file. Domain administrators can choose to make all uploaded files visible to the domain by default; this parameter bypasses that behavior for the request. Permissions are still inherited from parent folders.
    * @param {boolean=} params.keepRevisionForever Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Drive.
    * @param {string=} params.ocrLanguage A language hint for OCR processing during image import (ISO 639-1 code).
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useContentAsIndexableText Whether to use the uploaded content as indexable text.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$File] = js.native
  def create(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def create(params: ParamsDollarResourceDollarFilesDollarCreate): GaxiosPromise[Schema$File] = js.native
  def create(params: ParamsDollarResourceDollarFilesDollarCreate, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarFilesDollarCreate,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarFilesDollarCreate, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def create(
    params: ParamsDollarResourceDollarFilesDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.delete
    * @desc Permanently deletes a file owned by the user without moving it to
    * the trash. If the file belongs to a Team Drive the user must be an
    * organizer on the parent. If the target is a folder, all descendants owned
    * by the user are also deleted.
    * @alias drive.files.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFilesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarFilesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarFilesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarFilesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarFilesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.files.emptyTrash
    * @desc Permanently deletes all of the user's trashed files.
    * @alias drive.files.emptyTrash
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def emptyTrash(): GaxiosPromise[Unit] = js.native
  def emptyTrash(callback: BodyResponseCallback[Unit]): Unit = js.native
  def emptyTrash(params: ParamsDollarResourceDollarFilesDollarEmptytrash): GaxiosPromise[Unit] = js.native
  def emptyTrash(params: ParamsDollarResourceDollarFilesDollarEmptytrash, callback: BodyResponseCallback[Unit]): Unit = js.native
  def emptyTrash(
    params: ParamsDollarResourceDollarFilesDollarEmptytrash,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def emptyTrash(params: ParamsDollarResourceDollarFilesDollarEmptytrash, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def emptyTrash(
    params: ParamsDollarResourceDollarFilesDollarEmptytrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.files.export
    * @desc Exports a Google Doc to the requested MIME type and returns the
    * exported content. Please note that the exported content is limited to
    * 10MB.
    * @alias drive.files.export
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.mimeType The MIME type of the format requested for this export.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def export(): GaxiosPromise[Unit] = js.native
  def export(callback: BodyResponseCallback[Unit]): Unit = js.native
  def export(params: ParamsDollarResourceDollarFilesDollarExport): GaxiosPromise[Unit] = js.native
  def export(params: ParamsDollarResourceDollarFilesDollarExport, callback: BodyResponseCallback[Unit]): Unit = js.native
  def export(
    params: ParamsDollarResourceDollarFilesDollarExport,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def export(params: ParamsDollarResourceDollarFilesDollarExport, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def export(
    params: ParamsDollarResourceDollarFilesDollarExport,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.files.generateIds
    * @desc Generates a set of file IDs which can be provided in create
    * requests.
    * @alias drive.files.generateIds
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.count The number of IDs to return.
    * @param {string=} params.space The space in which the IDs can be used to create new files. Supported values are 'drive' and 'appDataFolder'.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def generateIds(): GaxiosPromise[Schema$GeneratedIds] = js.native
  def generateIds(callback: BodyResponseCallback[Schema$GeneratedIds]): Unit = js.native
  def generateIds(params: ParamsDollarResourceDollarFilesDollarGenerateids): GaxiosPromise[Schema$GeneratedIds] = js.native
  def generateIds(
    params: ParamsDollarResourceDollarFilesDollarGenerateids,
    callback: BodyResponseCallback[Schema$GeneratedIds]
  ): Unit = js.native
  def generateIds(
    params: ParamsDollarResourceDollarFilesDollarGenerateids,
    options: BodyResponseCallback[Schema$GeneratedIds],
    callback: BodyResponseCallback[Schema$GeneratedIds]
  ): Unit = js.native
  def generateIds(params: ParamsDollarResourceDollarFilesDollarGenerateids, options: MethodOptions): GaxiosPromise[Schema$GeneratedIds] = js.native
  def generateIds(
    params: ParamsDollarResourceDollarFilesDollarGenerateids,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$GeneratedIds]
  ): Unit = js.native
  /**
    * drive.files.get
    * @desc Gets a file's metadata or content by ID.
    * @alias drive.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledgeAbuse Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$File] = js.native
  def get(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet): GaxiosPromise[Schema$File] = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarFilesDollarGet,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarFilesDollarGet, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def get(
    params: ParamsDollarResourceDollarFilesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.list
    * @desc Lists or searches files.
    * @alias drive.files.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.corpora Comma-separated list of bodies of items (files/documents) to which the query applies. Supported bodies are 'user', 'domain', 'teamDrive' and 'allTeamDrives'. 'allTeamDrives' must be combined with 'user'; all other values must be used in isolation. Prefer 'user' or 'teamDrive' to 'allTeamDrives' for efficiency.
    * @param {string=} params.corpus The source of files to list. Deprecated: use 'corpora' instead.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive items should be included in results.
    * @param {string=} params.orderBy A comma-separated list of sort keys. Valid keys are 'createdTime', 'folder', 'modifiedByMeTime', 'modifiedTime', 'name', 'name_natural', 'quotaBytesUsed', 'recency', 'sharedWithMeTime', 'starred', and 'viewedByMeTime'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedTime desc,name. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    * @param {integer=} params.pageSize The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {string=} params.q A query for filtering the file results. See the "Search for Files" guide for supported syntax.
    * @param {string=} params.spaces A comma-separated list of spaces to query within the corpus. Supported values are 'drive', 'appDataFolder' and 'photos'.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.teamDriveId ID of Team Drive to search.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$FileList] = js.native
  def list(callback: BodyResponseCallback[Schema$FileList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList): GaxiosPromise[Schema$FileList] = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList, callback: BodyResponseCallback[Schema$FileList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarFilesDollarList,
    options: BodyResponseCallback[Schema$FileList],
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarFilesDollarList, options: MethodOptions): GaxiosPromise[Schema$FileList] = js.native
  def list(
    params: ParamsDollarResourceDollarFilesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$FileList]
  ): Unit = js.native
  /**
    * drive.files.update
    * @desc Updates a file's metadata and/or content with patch semantics.
    * @alias drive.files.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.addParents A comma-separated list of parent IDs to add.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.keepRevisionForever Whether to set the 'keepForever' field in the new head revision. This is only applicable to files with binary content in Drive.
    * @param {string=} params.ocrLanguage A language hint for OCR processing during image import (ISO 639-1 code).
    * @param {string=} params.removeParents A comma-separated list of parent IDs to remove.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useContentAsIndexableText Whether to use the uploaded content as indexable text.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$File] = js.native
  def update(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def update(params: ParamsDollarResourceDollarFilesDollarUpdate): GaxiosPromise[Schema$File] = js.native
  def update(params: ParamsDollarResourceDollarFilesDollarUpdate, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarFilesDollarUpdate,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarFilesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def update(
    params: ParamsDollarResourceDollarFilesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.watch
    * @desc Subscribes to changes to a file
    * @alias drive.files.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledgeAbuse Whether the user is acknowledging the risk of downloading known malware or other abusive files. This is only applicable when alt=media.
    * @param {string} params.fileId The ID of the file.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watch(): GaxiosPromise[Schema$Channel] = js.native
  def watch(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(params: ParamsDollarResourceDollarFilesDollarWatch): GaxiosPromise[Schema$Channel] = js.native
  def watch(params: ParamsDollarResourceDollarFilesDollarWatch, callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watch(
    params: ParamsDollarResourceDollarFilesDollarWatch,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watch(params: ParamsDollarResourceDollarFilesDollarWatch, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watch(
    params: ParamsDollarResourceDollarFilesDollarWatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

