package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Rooms")
@js.native
class Resource$Rooms protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.rooms.reset
    * @desc Reset all rooms for the currently authenticated player for your
    * application. This method is only accessible to whitelisted tester
    * accounts for your application.
    * @alias gamesManagement.rooms.reset
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarRoomsDollarReset): GaxiosPromise[Unit] = js.native
  def reset(params: ParamsDollarResourceDollarRoomsDollarReset, callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarRoomsDollarReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarRoomsDollarReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsDollarResourceDollarRoomsDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.rooms.resetForAllPlayers
    * @desc Deletes rooms where the only room participants are from whitelisted
    * tester accounts for your application. This method is only available to
    * user accounts for your developer console.
    * @alias gamesManagement.rooms.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarRoomsDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarRoomsDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarRoomsDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarRoomsDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarRoomsDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

