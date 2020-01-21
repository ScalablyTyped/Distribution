package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.matchPlayerAsync")
@js.native
object matchPlayerAsync extends js.Object {
  /**
    * Attempts to match the current player with other users looking for people to play with. If successful, a new Messenger group
    * thread will be created containing the matched players and the player will be context switched to that thread.
    * The default minimum and maximum number of players in one matched thread are 2 and 20 respectively, depending on how many players
    * are trying to get matched around the same time. The values can be changed in fbapp-config.json. See the
    * [Bundle Config documentation]https://developers.facebook.com/docs/games/instant-games/bundle-config for documentation about fbapp-config.json.
    *
    * @param matchTag Optional extra information about the player used to group them with similar players. Players will only be grouped with other players with exactly the same tag.
    * The tag must only include letters, numbers, and underscores and be 100 characters or less in length.
    * @param switchContextWhenMatched Optional extra parameter that specifies whether the player should be immediately switched to the new context when a match is found.
    * By default this will be false which will mean the player needs explicitly press play after being matched to switch to the new context.
    * @param offlineMatch Optional extra parameter that specifies whether to start a match asynchronously. By default this will be false which means the game will start a match synchronously.
    * @returns A promise that resolves when the player has been added to a group thread and switched into the thread's context.
    * @throws INVALID_PARAM
    * @throws NETWORK_FAILURE
    * @throws USER_INPUT
    * @throws PENDING_REQUEST
    * @throws CLIENT_UNSUPPORTED_OPERATION
    * @throws INVALID_OPERATION
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(matchTag: String): js.Promise[Unit] = js.native
  def apply(matchTag: String, switchContextWhenMatched: Boolean): js.Promise[Unit] = js.native
  def apply(matchTag: String, switchContextWhenMatched: Boolean, offlineMatch: Boolean): js.Promise[Unit] = js.native
}

