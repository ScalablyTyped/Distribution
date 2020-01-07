package typings.googleapis.buildSrcApisGamesManagementV1managementMod.gamesManagement_v1management

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/gamesManagement/v1management", "gamesManagement_v1management.Resource$Turnbasedmatches")
@js.native
class Resource$Turnbasedmatches protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * gamesManagement.turnBasedMatches.reset
    * @desc Reset all turn-based match data for a user. This method is only
    * accessible to whitelisted tester accounts for your application.
    * @alias gamesManagement.turnBasedMatches.reset
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def reset(): GaxiosPromise[Unit] = js.native
  def reset(callback: BodyResponseCallback[Unit]): Unit = js.native
  def reset(params: ParamsDollarResourceDollarTurnbasedmatchesDollarReset): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarReset,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarReset,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def reset(params: ParamsDollarResourceDollarTurnbasedmatchesDollarReset, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def reset(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarReset,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * gamesManagement.turnBasedMatches.resetForAllPlayers
    * @desc Deletes turn-based matches where the only match participants are
    * from whitelisted tester accounts for your application. This method is
    * only available to user accounts for your developer console.
    * @alias gamesManagement.turnBasedMatches.resetForAllPlayers
    * @memberOf! ()
    *
    * @param {object=} params Parameters for request
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def resetForAllPlayers(): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(callback: BodyResponseCallback[Unit]): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarTurnbasedmatchesDollarResetforallplayers): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarResetforallplayers,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarResetforallplayers,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def resetForAllPlayers(params: ParamsDollarResourceDollarTurnbasedmatchesDollarResetforallplayers, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def resetForAllPlayers(
    params: ParamsDollarResourceDollarTurnbasedmatchesDollarResetforallplayers,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
}

