package typings.facebookInstantGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.setSessionData")
@js.native
object setSessionData extends js.Object {
  /**
    * Sets the data associated with the individual gameplay session for the current context.
    *
    * This function should be called whenever the game would like to update the current session data.
    * This session data may be used to populate a variety of payloads, such as game play webhooks.
    *
    * @param sessionData An arbitrary data object, which must be less than or equal to 1000 characters when stringified.
    */
  def apply(sessionData: js.Any): Unit = js.native
}

