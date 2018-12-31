package typings
package gapiDotClientDotClouddebuggerLib.gapiNs.clientNs.clouddebuggerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * Set of arguments passed to this function.
    * Note that this might not be populated for all stack frames.
    */
  var arguments: js.UndefOr[js.Array[Variable]] = js.undefined
  /** Demangled function name at the call site. */
  var function: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Set of local variables at the stack frame location.
    * Note that this might not be populated for all stack frames.
    */
  var locals: js.UndefOr[js.Array[Variable]] = js.undefined
  /** Source location of the call site. */
  var location: js.UndefOr[SourceLocation] = js.undefined
}

