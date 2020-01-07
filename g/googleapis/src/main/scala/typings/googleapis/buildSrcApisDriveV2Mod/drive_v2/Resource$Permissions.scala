package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Permissions")
@js.native
class Resource$Permissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.permissions.delete
    * @desc Deletes a permission from a file or Team Drive.
    * @alias drive.permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPermissionsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarPermissionsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarPermissionsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarPermissionsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarPermissionsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.permissions.get
    * @desc Gets a permission by ID.
    * @alias drive.permissions.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Permission] = js.native
  def get(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def get(params: ParamsDollarResourceDollarPermissionsDollarGet): GaxiosPromise[Schema$Permission] = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarPermissionsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def get(
    params: ParamsDollarResourceDollarPermissionsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  /**
    * drive.permissions.getIdForEmail
    * @desc Returns the permission ID for an email address.
    * @alias drive.permissions.getIdForEmail
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.email The email address for which to return a permission ID
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIdForEmail(): GaxiosPromise[Schema$PermissionId] = js.native
  def getIdForEmail(callback: BodyResponseCallback[Schema$PermissionId]): Unit = js.native
  def getIdForEmail(params: ParamsDollarResourceDollarPermissionsDollarGetidforemail): GaxiosPromise[Schema$PermissionId] = js.native
  def getIdForEmail(
    params: ParamsDollarResourceDollarPermissionsDollarGetidforemail,
    callback: BodyResponseCallback[Schema$PermissionId]
  ): Unit = js.native
  def getIdForEmail(
    params: ParamsDollarResourceDollarPermissionsDollarGetidforemail,
    options: BodyResponseCallback[Schema$PermissionId],
    callback: BodyResponseCallback[Schema$PermissionId]
  ): Unit = js.native
  def getIdForEmail(params: ParamsDollarResourceDollarPermissionsDollarGetidforemail, options: MethodOptions): GaxiosPromise[Schema$PermissionId] = js.native
  def getIdForEmail(
    params: ParamsDollarResourceDollarPermissionsDollarGetidforemail,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PermissionId]
  ): Unit = js.native
  /**
    * drive.permissions.insert
    * @desc Inserts a permission for a file or Team Drive.
    * @alias drive.permissions.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.emailMessage A plain text custom message to include in notification emails.
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {boolean=} params.sendNotificationEmails Whether to send notification emails when sharing to users or groups. This parameter is ignored and an email is sent if the role is owner.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Permission] = js.native
  def insert(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPermissionsDollarInsert): GaxiosPromise[Schema$Permission] = js.native
  def insert(
    params: ParamsDollarResourceDollarPermissionsDollarInsert,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarPermissionsDollarInsert,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarPermissionsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def insert(
    params: ParamsDollarResourceDollarPermissionsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  /**
    * drive.permissions.list
    * @desc Lists a file's or Team Drive's permissions.
    * @alias drive.permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {integer=} params.maxResults The maximum number of permissions to return per page. When not set for files in a Team Drive, at most 100 results will be returned. When not set for files that are not in a Team Drive, the entire list will be returned.
    * @param {string=} params.pageToken The token for continuing a previous list request on the next page. This should be set to the value of 'nextPageToken' from the previous response.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$PermissionList] = js.native
  def list(callback: BodyResponseCallback[Schema$PermissionList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarPermissionsDollarList): GaxiosPromise[Schema$PermissionList] = js.native
  def list(
    params: ParamsDollarResourceDollarPermissionsDollarList,
    callback: BodyResponseCallback[Schema$PermissionList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarPermissionsDollarList,
    options: BodyResponseCallback[Schema$PermissionList],
    callback: BodyResponseCallback[Schema$PermissionList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarPermissionsDollarList, options: MethodOptions): GaxiosPromise[Schema$PermissionList] = js.native
  def list(
    params: ParamsDollarResourceDollarPermissionsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PermissionList]
  ): Unit = js.native
  /**
    * drive.permissions.patch
    * @desc Updates a permission using patch semantics.
    * @alias drive.permissions.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.removeExpiration Whether to remove the expiration date.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether changing a role to 'owner' downgrades the current owners to writers. Does nothing if the specified role is not 'owner'.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Permission] = js.native
  def patch(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPermissionsDollarPatch): GaxiosPromise[Schema$Permission] = js.native
  def patch(
    params: ParamsDollarResourceDollarPermissionsDollarPatch,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarPermissionsDollarPatch,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarPermissionsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def patch(
    params: ParamsDollarResourceDollarPermissionsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  /**
    * drive.permissions.update
    * @desc Updates a permission.
    * @alias drive.permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID for the file or Team Drive.
    * @param {string} params.permissionId The ID for the permission.
    * @param {boolean=} params.removeExpiration Whether to remove the expiration date.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether changing a role to 'owner' downgrades the current owners to writers. Does nothing if the specified role is not 'owner'.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Permission] = js.native
  def update(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def update(params: ParamsDollarResourceDollarPermissionsDollarUpdate): GaxiosPromise[Schema$Permission] = js.native
  def update(
    params: ParamsDollarResourceDollarPermissionsDollarUpdate,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarPermissionsDollarUpdate,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarPermissionsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def update(
    params: ParamsDollarResourceDollarPermissionsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
}

