package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Players")
@js.native
class Resource$Players protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.players.hide
    * @desc Hide the given player's leaderboard scores from the given
    * application. This method is only available to user accounts for your
    * developer console.
    * @alias gamesManagement.players.hide
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def hide(): GaxiosPromise[Unit] = js.native
  def hide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(params: ParamsDollarResourceDollarPlayersDollarHide): GaxiosPromise[Unit] = js.native
  def hide(params: ParamsDollarResourceDollarPlayersDollarHide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def hide(
    params: ParamsDollarResourceDollarPlayersDollarHide,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def hide(params: ParamsDollarResourceDollarPlayersDollarHide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def hide(
    params: ParamsDollarResourceDollarPlayersDollarHide,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.players.unhide
    * @desc Unhide the given player's leaderboard scores from the given
    * application. This method is only available to user accounts for your
    * developer console.
    * @alias gamesManagement.players.unhide
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.applicationId The application ID from the Google Play developer console.
    * @param {string} params.playerId A player ID. A value of me may be used in place of the authenticated player's ID.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def unhide(): GaxiosPromise[Unit] = js.native
  def unhide(callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(params: ParamsDollarResourceDollarPlayersDollarUnhide): GaxiosPromise[Unit] = js.native
  def unhide(params: ParamsDollarResourceDollarPlayersDollarUnhide, callback: BodyResponseCallback[Unit]): Unit = js.native
  def unhide(
    params: ParamsDollarResourceDollarPlayersDollarUnhide,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def unhide(params: ParamsDollarResourceDollarPlayersDollarUnhide, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def unhide(
    params: ParamsDollarResourceDollarPlayersDollarUnhide,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

