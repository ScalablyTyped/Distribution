package typings.googleapis.buildSrcApisDriveV3Mod.drive_v3

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v3", "drive_v3.Resource$Permissions")
@js.native
class Resource$Permissions protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.permissions.create
    * @desc Creates a permission for a file or Team Drive.
    * @alias drive.permissions.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.emailMessage A plain text custom message to include in the notification email.
    * @param {string} params.fileId The ID of the file or Team Drive.
    * @param {boolean=} params.sendNotificationEmail Whether to send a notification email when sharing to users or groups. This defaults to true for users and groups, and is not allowed for other requests. It must not be disabled for ownership transfers.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the item belongs.
    * @param {().Permission} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Permission] = js.native
  def create(callback: BodyResponseCallback[Schema$Permission]): Unit = js.native
  def create(params: ParamsDollarResourceDollarPermissionsDollarCreate): GaxiosPromise[Schema$Permission] = js.native
  def create(
    params: ParamsDollarResourceDollarPermissionsDollarCreate,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarPermissionsDollarCreate,
    options: BodyResponseCallback[Schema$Permission],
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarPermissionsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Permission] = js.native
  def create(
    params: ParamsDollarResourceDollarPermissionsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Permission]
  ): Unit = js.native
  /**
    * drive.permissions.delete
    * @desc Deletes a permission.
    * @alias drive.permissions.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file or Team Drive.
    * @param {string} params.permissionId The ID of the permission.
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
    * @param {string} params.fileId The ID of the file.
    * @param {string} params.permissionId The ID of the permission.
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
    * drive.permissions.list
    * @desc Lists a file's or Team Drive's permissions.
    * @alias drive.permissions.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file or Team Drive.
    * @param {integer=} params.pageSize The maximum number of permissions to return per page. When not set for files in a Team Drive, at most 100 results will be returned. When not set for files that are not in a Team Drive, the entire list will be returned.
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
    * drive.permissions.update
    * @desc Updates a permission with patch semantics.
    * @alias drive.permissions.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.fileId The ID of the file or Team Drive.
    * @param {string} params.permissionId The ID of the permission.
    * @param {boolean=} params.removeExpiration Whether to remove the expiration date.
    * @param {boolean=} params.supportsTeamDrives Whether the requesting application supports Team Drives.
    * @param {boolean=} params.transferOwnership Whether to transfer ownership to the specified user and downgrade the current owner to a writer. This parameter is required as an acknowledgement of the side effect.
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

