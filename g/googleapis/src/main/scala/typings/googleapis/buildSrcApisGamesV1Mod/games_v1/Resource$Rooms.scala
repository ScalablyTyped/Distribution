package typings.googleapis.buildSrcApisGamesV1Mod.games_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/games/v1", "games_v1.Resource$Rooms")
@js.native
class Resource$Rooms protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * games.rooms.create
    * @desc Create a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {().RoomCreateRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Room] = js.native
  def create(callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def create(params: ParamsDollarResourceDollarRoomsDollarCreate): GaxiosPromise[Schema$Room] = js.native
  def create(params: ParamsDollarResourceDollarRoomsDollarCreate, callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarRoomsDollarCreate,
    options: BodyResponseCallback[Schema$Room],
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarRoomsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Room] = js.native
  def create(
    params: ParamsDollarResourceDollarRoomsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  /**
    * games.rooms.decline
    * @desc Decline an invitation to join a room. For internal use by the Games
    * SDK only. Calling this method directly is unsupported.
    * @alias games.rooms.decline
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def decline(): GaxiosPromise[Schema$Room] = js.native
  def decline(callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def decline(params: ParamsDollarResourceDollarRoomsDollarDecline): GaxiosPromise[Schema$Room] = js.native
  def decline(params: ParamsDollarResourceDollarRoomsDollarDecline, callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def decline(
    params: ParamsDollarResourceDollarRoomsDollarDecline,
    options: BodyResponseCallback[Schema$Room],
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  def decline(params: ParamsDollarResourceDollarRoomsDollarDecline, options: MethodOptions): GaxiosPromise[Schema$Room] = js.native
  def decline(
    params: ParamsDollarResourceDollarRoomsDollarDecline,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  /**
    * games.rooms.dismiss
    * @desc Dismiss an invitation to join a room. For internal use by the Games
    * SDK only. Calling this method directly is unsupported.
    * @alias games.rooms.dismiss
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def dismiss(): GaxiosPromise[Unit] = js.native
  def dismiss(callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(params: ParamsDollarResourceDollarRoomsDollarDismiss): GaxiosPromise[Unit] = js.native
  def dismiss(params: ParamsDollarResourceDollarRoomsDollarDismiss, callback: BodyResponseCallback[Unit]): Unit = js.native
  def dismiss(
    params: ParamsDollarResourceDollarRoomsDollarDismiss,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def dismiss(params: ParamsDollarResourceDollarRoomsDollarDismiss, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def dismiss(
    params: ParamsDollarResourceDollarRoomsDollarDismiss,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * games.rooms.get
    * @desc Get the data for a room.
    * @alias games.rooms.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Room] = js.native
  def get(callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def get(params: ParamsDollarResourceDollarRoomsDollarGet): GaxiosPromise[Schema$Room] = js.native
  def get(params: ParamsDollarResourceDollarRoomsDollarGet, callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarRoomsDollarGet,
    options: BodyResponseCallback[Schema$Room],
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarRoomsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Room] = js.native
  def get(
    params: ParamsDollarResourceDollarRoomsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  /**
    * games.rooms.join
    * @desc Join a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.join
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomJoinRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def join(): GaxiosPromise[Schema$Room] = js.native
  def join(callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def join(params: ParamsDollarResourceDollarRoomsDollarJoin): GaxiosPromise[Schema$Room] = js.native
  def join(params: ParamsDollarResourceDollarRoomsDollarJoin, callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def join(
    params: ParamsDollarResourceDollarRoomsDollarJoin,
    options: BodyResponseCallback[Schema$Room],
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  def join(params: ParamsDollarResourceDollarRoomsDollarJoin, options: MethodOptions): GaxiosPromise[Schema$Room] = js.native
  def join(
    params: ParamsDollarResourceDollarRoomsDollarJoin,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  /**
    * games.rooms.leave
    * @desc Leave a room. For internal use by the Games SDK only. Calling this
    * method directly is unsupported.
    * @alias games.rooms.leave
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomLeaveRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def leave(): GaxiosPromise[Schema$Room] = js.native
  def leave(callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def leave(params: ParamsDollarResourceDollarRoomsDollarLeave): GaxiosPromise[Schema$Room] = js.native
  def leave(params: ParamsDollarResourceDollarRoomsDollarLeave, callback: BodyResponseCallback[Schema$Room]): Unit = js.native
  def leave(
    params: ParamsDollarResourceDollarRoomsDollarLeave,
    options: BodyResponseCallback[Schema$Room],
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  def leave(params: ParamsDollarResourceDollarRoomsDollarLeave, options: MethodOptions): GaxiosPromise[Schema$Room] = js.native
  def leave(
    params: ParamsDollarResourceDollarRoomsDollarLeave,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Room]
  ): Unit = js.native
  /**
    * games.rooms.list
    * @desc Returns invitations to join rooms.
    * @alias games.rooms.list
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {integer=} params.maxResults The maximum number of rooms to return in the response, used for paging. For any response, the actual number of rooms to return may be less than the specified maxResults.
    * @param {string=} params.pageToken The token returned by the previous request.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$RoomList] = js.native
  def list(callback: BodyResponseCallback[Schema$RoomList]): Unit = js.native
  def list(params: ParamsDollarResourceDollarRoomsDollarList): GaxiosPromise[Schema$RoomList] = js.native
  def list(params: ParamsDollarResourceDollarRoomsDollarList, callback: BodyResponseCallback[Schema$RoomList]): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarRoomsDollarList,
    options: BodyResponseCallback[Schema$RoomList],
    callback: BodyResponseCallback[Schema$RoomList]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarRoomsDollarList, options: MethodOptions): GaxiosPromise[Schema$RoomList] = js.native
  def list(
    params: ParamsDollarResourceDollarRoomsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RoomList]
  ): Unit = js.native
  /**
    * games.rooms.reportStatus
    * @desc Updates sent by a client reporting the status of peers in a room.
    * For internal use by the Games SDK only. Calling this method directly is
    * unsupported.
    * @alias games.rooms.reportStatus
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string=} params.language The preferred language to use for strings returned by this method.
    * @param {string} params.roomId The ID of the room.
    * @param {().RoomP2PStatuses} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reportStatus(): GaxiosPromise[Schema$RoomStatus] = js.native
  def reportStatus(callback: BodyResponseCallback[Schema$RoomStatus]): Unit = js.native
  def reportStatus(params: ParamsDollarResourceDollarRoomsDollarReportstatus): GaxiosPromise[Schema$RoomStatus] = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarRoomsDollarReportstatus,
    callback: BodyResponseCallback[Schema$RoomStatus]
  ): Unit = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarRoomsDollarReportstatus,
    options: BodyResponseCallback[Schema$RoomStatus],
    callback: BodyResponseCallback[Schema$RoomStatus]
  ): Unit = js.native
  def reportStatus(params: ParamsDollarResourceDollarRoomsDollarReportstatus, options: MethodOptions): GaxiosPromise[Schema$RoomStatus] = js.native
  def reportStatus(
    params: ParamsDollarResourceDollarRoomsDollarReportstatus,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RoomStatus]
  ): Unit = js.native
}

