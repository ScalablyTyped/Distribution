package typings.googleapis.buildSrcApisClouddebuggerV2Mod.clouddebugger_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing debuggees.
  */
@js.native
trait Schema$ListDebuggeesResponse extends js.Object {
  /**
    * List of debuggees accessible to the calling user. The fields
    * `debuggee.id` and `description` are guaranteed to be set. The
    * `description` field is a human readable field provided by agents and can
    * be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[Schema$Debuggee]] = js.native
}

object Schema$ListDebuggeesResponse {
  @scala.inline
  def apply(debuggees: js.Array[Schema$Debuggee] = null): Schema$ListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    if (debuggees != null) __obj.updateDynamic("debuggees")(debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListDebuggeesResponse]
  }
}

