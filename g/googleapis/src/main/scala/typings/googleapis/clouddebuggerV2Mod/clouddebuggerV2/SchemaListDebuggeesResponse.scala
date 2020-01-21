package typings.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for listing debuggees.
  */
@js.native
trait SchemaListDebuggeesResponse extends js.Object {
  /**
    * List of debuggees accessible to the calling user. The fields
    * `debuggee.id` and `description` are guaranteed to be set. The
    * `description` field is a human readable field provided by agents and can
    * be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[SchemaDebuggee]] = js.native
}

object SchemaListDebuggeesResponse {
  @scala.inline
  def apply(debuggees: js.Array[SchemaDebuggee] = null): SchemaListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    if (debuggees != null) __obj.updateDynamic("debuggees")(debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDebuggeesResponse]
  }
}

