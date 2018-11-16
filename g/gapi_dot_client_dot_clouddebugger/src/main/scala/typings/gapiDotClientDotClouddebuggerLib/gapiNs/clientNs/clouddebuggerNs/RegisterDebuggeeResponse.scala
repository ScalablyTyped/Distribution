package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RegisterDebuggeeResponse extends js.Object {
  /**
               * Debuggee resource.
               * The field `id` is guranteed to be set (in addition to the echoed fields).
               * If the field `is_disabled` is set to `true`, the agent should disable
               * itself by removing all breakpoints and detaching from the application.
               * It should however continue to poll `RegisterDebuggee` until reenabled.
               */
  var debuggee: js.UndefOr[Debuggee] = js.undefined
}

