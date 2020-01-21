package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.getEntryPointAsync")
@js.native
object getEntryPointAsync extends js.Object {
  /**
    * Returns the entry point that the game was launched from.
    * This function should be called after FBInstant.startGameAsync() resolves.
    *
    * @returns The name of the entry point from which the user started the game.
    */
  def apply(): js.Promise[String] = js.native
}

