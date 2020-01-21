package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.startGameAsync")
@js.native
object startGameAsync extends js.Object {
  /**
    * This indicates that the game has finished initial loading and is ready to start.
    * Context information will be up-to-date when the returned promise resolves.
    *
    * @returns A promise that resolves when the game should start.
    * @throws INVALID_PARAM
    * @throws CLIENT_UNSUPPORTED_OPERATION
    */
  def apply(): js.Promise[Unit] = js.native
}

