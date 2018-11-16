package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

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

