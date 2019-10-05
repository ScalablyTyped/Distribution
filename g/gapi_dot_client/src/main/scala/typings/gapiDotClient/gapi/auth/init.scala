package typings.gapiDotClient.gapi.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth.init")
@js.native
object init extends js.Object {
  /**
    * Initializes the authorization feature. Call this when the client loads to prevent popup blockers from blocking the auth window on gapi.auth.authorize calls.
    * @param callback A callback to execute when the auth feature is ready to make authorization calls.
    */
  def apply(callback: js.Function0[_]): Unit = js.native
}

