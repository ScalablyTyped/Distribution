package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.switchGameAsync")
@js.native
object switchGameAsync extends js.Object {
  /**
    * Request that the client switch to a different Instant Game. The API will reject if the switch fails - else, the client will load the new game.
    *
    * @param appID The Application ID of the Instant Game to switch to. The application must be an Instant Game, and must belong to the same business as the current game.
    * To associate different games with the same business, you can use Business Manager: https://developers.facebook.com/docs/apps/business-manager#update-business.
    * @param data An optional data payload. This will be set as the entrypoint data for the game being switched to. Must be less than or equal to 1000 characters when stringified.
    * @throws USER_INPUT
    * @throws INVALID_PARAM
    * @throws PENDING_REQUEST
    * @throws CLIENT_REQUIRES_UPDATE
    */
  def apply(appID: String): js.Promise[Unit] = js.native
  def apply(appID: String, data: js.Any): js.Promise[Unit] = js.native
}

