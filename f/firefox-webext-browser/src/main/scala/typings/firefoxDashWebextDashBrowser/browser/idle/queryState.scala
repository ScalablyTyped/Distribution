package typings.firefoxDashWebextDashBrowser.browser.idle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.idle.queryState")
@js.native
object queryState extends js.Object {
  /* idle functions */
  /**
    * Returns "idle" if the user has not generated any input for a specified number of seconds, or "active" otherwise.
    * @param detectionIntervalInSeconds The system is considered idle if detectionIntervalInSeconds seconds have
    *     elapsed since the last user input detected.
    */
  def apply(detectionIntervalInSeconds: Double): js.Promise[IdleState] = js.native
}

