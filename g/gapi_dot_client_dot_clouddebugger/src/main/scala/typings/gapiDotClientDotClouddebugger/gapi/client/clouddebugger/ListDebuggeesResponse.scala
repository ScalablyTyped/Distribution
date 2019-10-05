package typings.gapiDotClientDotClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDebuggeesResponse extends js.Object {
  /**
    * List of debuggees accessible to the calling user.
    * The fields `debuggee.id` and `description` are guaranteed to be set.
    * The `description` field is a human readable field provided by agents and
    * can be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[Debuggee]] = js.undefined
}

object ListDebuggeesResponse {
  @scala.inline
  def apply(debuggees: js.Array[Debuggee] = null): ListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    if (debuggees != null) __obj.updateDynamic("debuggees")(debuggees)
    __obj.asInstanceOf[ListDebuggeesResponse]
  }
}

