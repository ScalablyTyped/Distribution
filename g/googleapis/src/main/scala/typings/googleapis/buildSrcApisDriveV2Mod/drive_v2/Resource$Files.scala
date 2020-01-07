package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Files")
@js.native
class Resource$Files protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.files.copy
    * @desc Creates a copy of the specified file.
    * @alias drive.files.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.convert Whether to convert this file to the corresponding Google Docs format.
    * @param {string} params.fileId The ID of the file to copy.
    * @param {boolean=} params.ocr Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    * @param {string=} params.ocrLanguage If ocr is true, hints at the language to use. Valid values are BCP 47 codes.
    * @param {boolean=} params.pinned Whether to pin the head revision of the new copy. A file can have a maximum of 200 pinned revisions.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.timedTextLanguage The language of the timed text.
    * @param {string=} params.timedTextTrackName The timed text track name.
    * @param {string=} params.visibility The visibility of the new file. This parameter is only relevant when the source is not a native Google Doc and convert=false.
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
    * drive.files.delete
    * @desc Permanently deletes a file by ID. Skips the trash. The currently
    * authenticated user must own the file or be an organizer on the parent for
    * Team Drive files.
    * @alias drive.files.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file to delete.
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
    * @desc Generates a set of file IDs which can be provided in insert
    * requests.
    * @alias drive.files.generateIds
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of IDs to return.
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
    * @desc Gets a file's metadata by ID.
    * @alias drive.files.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledgeAbuse Whether the user is acknowledging the risk of downloading known malware or other abusive files.
    * @param {string} params.fileId The ID for the file in question.
    * @param {string=} params.projection This parameter is deprecated and has no function.
    * @param {string=} params.revisionId Specifies the Revision ID that should be downloaded. Ignored unless alt=media is specified.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.updateViewedDate Deprecated: Use files.update with modifiedDateBehavior=noChange, updateViewedDate=true and an empty request body.
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
    * drive.files.insert
    * @desc Insert a new file.
    * @alias drive.files.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.convert Whether to convert this file to the corresponding Google Docs format.
    * @param {boolean=} params.ocr Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    * @param {string=} params.ocrLanguage If ocr is true, hints at the language to use. Valid values are BCP 47 codes.
    * @param {boolean=} params.pinned Whether to pin the head revision of the uploaded file. A file can have a maximum of 200 pinned revisions.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.timedTextLanguage The language of the timed text.
    * @param {string=} params.timedTextTrackName The timed text track name.
    * @param {boolean=} params.useContentAsIndexableText Whether to use the content as indexable text.
    * @param {string=} params.visibility The visibility of the new file. This parameter is only relevant when convert=false.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$File] = js.native
  def insert(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFilesDollarInsert): GaxiosPromise[Schema$File] = js.native
  def insert(params: ParamsDollarResourceDollarFilesDollarInsert, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarFilesDollarInsert,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarFilesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def insert(
    params: ParamsDollarResourceDollarFilesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.list
    * @desc Lists the user's files.
    * @alias drive.files.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.corpora Comma-separated list of bodies of items (files/documents) to which the query applies. Supported bodies are 'default', 'domain', 'teamDrive' and 'allTeamDrives'. 'allTeamDrives' must be combined with 'default'; all other values must be used in isolation. Prefer 'default' or 'teamDrive' to 'allTeamDrives' for efficiency.
    * @param {string=} params.corpus The body of items (files/documents) to which the query applies. Deprecated: use 'corpora' instead.
    * @param {boolean=} params.includeTeamDriveItems Whether Team Drive items should be included in results.
    * @param {integer=} params.maxResults The maximum number of files to return per page. Partial or empty result pages are possible even before the end of the files list has been reached.
    * @param {string=} params.orderBy A comma-separated list of sort keys. Valid keys are 'createdDate', 'folder', 'lastViewedByMeDate', 'modifiedByMeDate', 'modifiedDate', 'quotaBytesUsed', 'recency', 'sharedWithMeDate', 'starred', 'title', and 'title_natural'. Each key sorts ascending by default, but may be reversed with the 'desc' modifier. Example usage: ?orderBy=folder,modifiedDate desc,title. Please note that there is a current limitation for users with approximately one million files in which the requested sort order is ignored.
    * @param {string=} params.pageToken Page token for files.
    * @param {string=} params.projection This parameter is deprecated and has no function.
    * @param {string=} params.q Query string for searching files.
    * @param {string=} params.spaces A comma-separated list of spaces to query. Supported values are 'drive', 'appDataFolder' and 'photos'.
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
    * drive.files.patch
    * @desc Updates file metadata and/or content. This method supports patch
    * semantics.
    * @alias drive.files.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.addParents Comma-separated list of parent IDs to add.
    * @param {boolean=} params.convert This parameter is deprecated and has no function.
    * @param {string} params.fileId The ID of the file to update.
    * @param {string=} params.modifiedDateBehavior Determines the behavior in which modifiedDate is updated. This overrides setModifiedDate.
    * @param {boolean=} params.newRevision Whether a blob upload should create a new revision. If false, the blob data in the current head revision is replaced. If true or not set, a new blob is created as head revision, and previous unpinned revisions are preserved for a short period of time. Pinned revisions are stored indefinitely, using additional storage quota, up to a maximum of 200 revisions. For details on how revisions are retained, see the Drive Help Center.
    * @param {boolean=} params.ocr Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    * @param {string=} params.ocrLanguage If ocr is true, hints at the language to use. Valid values are BCP 47 codes.
    * @param {boolean=} params.pinned Whether to pin the new revision. A file can have a maximum of 200 pinned revisions.
    * @param {string=} params.removeParents Comma-separated list of parent IDs to remove.
    * @param {boolean=} params.setModifiedDate Whether to set the modified date using the value supplied in the request body. Setting this field to true is equivalent to modifiedDateBehavior=fromBodyOrNow, and false is equivalent to modifiedDateBehavior=now. To prevent any changes to the modified date set modifiedDateBehavior=noChange.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.timedTextLanguage The language of the timed text.
    * @param {string=} params.timedTextTrackName The timed text track name.
    * @param {boolean=} params.updateViewedDate Whether to update the view date after successfully updating the file.
    * @param {boolean=} params.useContentAsIndexableText Whether to use the content as indexable text.
    * @param {().File} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$File] = js.native
  def patch(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFilesDollarPatch): GaxiosPromise[Schema$File] = js.native
  def patch(params: ParamsDollarResourceDollarFilesDollarPatch, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarFilesDollarPatch,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarFilesDollarPatch, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def patch(
    params: ParamsDollarResourceDollarFilesDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.touch
    * @desc Set the file's updated time to the current server time.
    * @alias drive.files.touch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file to update.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def touch(): GaxiosPromise[Schema$File] = js.native
  def touch(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def touch(params: ParamsDollarResourceDollarFilesDollarTouch): GaxiosPromise[Schema$File] = js.native
  def touch(params: ParamsDollarResourceDollarFilesDollarTouch, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def touch(
    params: ParamsDollarResourceDollarFilesDollarTouch,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def touch(params: ParamsDollarResourceDollarFilesDollarTouch, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def touch(
    params: ParamsDollarResourceDollarFilesDollarTouch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.trash
    * @desc Moves a file to the trash. The currently authenticated user must
    * own the file or be at least a fileOrganizer on the parent for Team Drive
    * files.
    * @alias drive.files.trash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file to trash.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def trash(): GaxiosPromise[Schema$File] = js.native
  def trash(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def trash(params: ParamsDollarResourceDollarFilesDollarTrash): GaxiosPromise[Schema$File] = js.native
  def trash(params: ParamsDollarResourceDollarFilesDollarTrash, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def trash(
    params: ParamsDollarResourceDollarFilesDollarTrash,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def trash(params: ParamsDollarResourceDollarFilesDollarTrash, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def trash(
    params: ParamsDollarResourceDollarFilesDollarTrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.untrash
    * @desc Restores a file from the trash.
    * @alias drive.files.untrash
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file to untrash.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def untrash(): GaxiosPromise[Schema$File] = js.native
  def untrash(callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarFilesDollarUntrash): GaxiosPromise[Schema$File] = js.native
  def untrash(params: ParamsDollarResourceDollarFilesDollarUntrash, callback: BodyResponseCallback[Schema$File]): Unit = js.native
  def untrash(
    params: ParamsDollarResourceDollarFilesDollarUntrash,
    options: BodyResponseCallback[Schema$File],
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  def untrash(params: ParamsDollarResourceDollarFilesDollarUntrash, options: MethodOptions): GaxiosPromise[Schema$File] = js.native
  def untrash(
    params: ParamsDollarResourceDollarFilesDollarUntrash,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$File]
  ): Unit = js.native
  /**
    * drive.files.update
    * @desc Updates file metadata and/or content.
    * @alias drive.files.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.addParents Comma-separated list of parent IDs to add.
    * @param {boolean=} params.convert This parameter is deprecated and has no function.
    * @param {string} params.fileId The ID of the file to update.
    * @param {string=} params.modifiedDateBehavior Determines the behavior in which modifiedDate is updated. This overrides setModifiedDate.
    * @param {boolean=} params.newRevision Whether a blob upload should create a new revision. If false, the blob data in the current head revision is replaced. If true or not set, a new blob is created as head revision, and previous unpinned revisions are preserved for a short period of time. Pinned revisions are stored indefinitely, using additional storage quota, up to a maximum of 200 revisions. For details on how revisions are retained, see the Drive Help Center.
    * @param {boolean=} params.ocr Whether to attempt OCR on .jpg, .png, .gif, or .pdf uploads.
    * @param {string=} params.ocrLanguage If ocr is true, hints at the language to use. Valid values are BCP 47 codes.
    * @param {boolean=} params.pinned Whether to pin the new revision. A file can have a maximum of 200 pinned revisions.
    * @param {string=} params.removeParents Comma-separated list of parent IDs to remove.
    * @param {boolean=} params.setModifiedDate Whether to set the modified date using the value supplied in the request body. Setting this field to true is equivalent to modifiedDateBehavior=fromBodyOrNow, and false is equivalent to modifiedDateBehavior=now. To prevent any changes to the modified date set modifiedDateBehavior=noChange.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {string=} params.timedTextLanguage The language of the timed text.
    * @param {string=} params.timedTextTrackName The timed text track name.
    * @param {boolean=} params.updateViewedDate Whether to update the view date after successfully updating the file.
    * @param {boolean=} params.useContentAsIndexableText Whether to use the content as indexable text.
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
    * @desc Subscribe to changes on a file
    * @alias drive.files.watch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {boolean=} params.acknowledgeAbuse Whether the user is acknowledging the risk of downloading known malware or other abusive files.
    * @param {string} params.fileId The ID for the file in question.
    * @param {string=} params.projection This parameter is deprecated and has no function.
    * @param {string=} params.revisionId Specifies the Revision ID that should be downloaded. Ignored unless alt=media is specified.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.updateViewedDate Deprecated: Use files.update with modifiedDateBehavior=noChange, updateViewedDate=true and an empty request body.
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

