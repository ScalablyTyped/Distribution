package typings.googleapis.buildSrcApisDriveV2Mod.drive_v2

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/drive/v2", "drive_v2.Resource$Teamdrives")
@js.native
class Resource$Teamdrives protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * drive.teamdrives.delete
    * @desc Permanently deletes a Team Drive for which the user is an
    * organizer. The Team Drive cannot contain any untrashed items.
    * @alias drive.teamdrives.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTeamdrivesDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarTeamdrivesDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarTeamdrivesDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarTeamdrivesDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarTeamdrivesDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * drive.teamdrives.get
    * @desc Gets a Team Drive's metadata by ID.
    * @alias drive.teamdrives.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$TeamDrive] = js.native
  def get(callback: BodyResponseCallback[Schema$TeamDrive]): Unit = js.native
  def get(params: ParamsDollarResourceDollarTeamdrivesDollarGet): GaxiosPromise[Schema$TeamDrive] = js.native
  def get(
    params: ParamsDollarResourceDollarTeamdrivesDollarGet,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarTeamdrivesDollarGet,
    options: BodyResponseCallback[Schema$TeamDrive],
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarTeamdrivesDollarGet, options: MethodOptions): GaxiosPromise[Schema$TeamDrive] = js.native
  def get(
    params: ParamsDollarResourceDollarTeamdrivesDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  /**
    * drive.teamdrives.insert
    * @desc Creates a new Team Drive.
    * @alias drive.teamdrives.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.requestId An ID, such as a random UUID, which uniquely identifies this user's request for idempotent creation of a Team Drive. A repeated request by the same user and with the same request ID will avoid creating duplicates by attempting to create the same Team Drive. If the Team Drive already exists a 409 error will be returned.
    * @param {().TeamDrive} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$TeamDrive] = js.native
  def insert(callback: BodyResponseCallback[Schema$TeamDrive]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTeamdrivesDollarInsert): GaxiosPromise[Schema$TeamDrive] = js.native
  def insert(
    params: ParamsDollarResourceDollarTeamdrivesDollarInsert,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarTeamdrivesDollarInsert,
    options: BodyResponseCallback[Schema$TeamDrive],
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarTeamdrivesDollarInsert, options: MethodOptions): GaxiosPromise[Schema$TeamDrive] = js.native
  def insert(
    params: ParamsDollarResourceDollarTeamdrivesDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  /**
    * drive.teamdrives.list
    * @desc Lists the user's Team Drives.
    * @alias drive.teamdrives.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {integer=} params.maxResults Maximum number of Team Drives to return.
    * @param {string=} params.pageToken Page token for Team Drives.
    * @param {string=} params.q Query string for searching Team Drives.
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then all Team Drives of the domain in which the requester is an administrator are returned.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$TeamDriveList] = js.native
  def list(callback: BodyResponseCallback[Schema$TeamDriveList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarTeamdrivesDollarList): GaxiosPromise[Schema$TeamDriveList] = js.native
  def list(
    params: ParamsDollarResourceDollarTeamdrivesDollarList,
    callback: BodyResponseCallback[Schema$TeamDriveList]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarTeamdrivesDollarList,
    options: BodyResponseCallback[Schema$TeamDriveList],
    callback: BodyResponseCallback[Schema$TeamDriveList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarTeamdrivesDollarList, options: MethodOptions): GaxiosPromise[Schema$TeamDriveList] = js.native
  def list(
    params: ParamsDollarResourceDollarTeamdrivesDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TeamDriveList]
  ): Unit = js.native
  /**
    * drive.teamdrives.update
    * @desc Updates a Team Drive's metadata
    * @alias drive.teamdrives.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.teamDriveId The ID of the Team Drive
    * @param {boolean=} params.useDomainAdminAccess Issue the request as a domain administrator; if set to true, then the requester will be granted access if they are an administrator of the domain to which the Team Drive belongs.
    * @param {().TeamDrive} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$TeamDrive] = js.native
  def update(callback: BodyResponseCallback[Schema$TeamDrive]): Unit = js.native
  def update(params: ParamsDollarResourceDollarTeamdrivesDollarUpdate): GaxiosPromise[Schema$TeamDrive] = js.native
  def update(
    params: ParamsDollarResourceDollarTeamdrivesDollarUpdate,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarTeamdrivesDollarUpdate,
    options: BodyResponseCallback[Schema$TeamDrive],
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarTeamdrivesDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$TeamDrive] = js.native
  def update(
    params: ParamsDollarResourceDollarTeamdrivesDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TeamDrive]
  ): Unit = js.native
}

