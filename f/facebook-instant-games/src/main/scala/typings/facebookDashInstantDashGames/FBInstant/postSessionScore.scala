package typings.facebookDashInstantDashGames.FBInstant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FBInstant.postSessionScore")
@js.native
object postSessionScore extends js.Object {
  /**
    * Posts the player's best score for the session to Facebook.
    * This API should be called whenever the player achieves their best score in a session, preferably at the end of an activity
    * Scores posted using this API should be consistent & comparable across game sessions.
    *
    * @param score An integer value representing the player's best score in a session.
    * @returns void
    */
  def apply(score: Double): Unit = js.native
}

