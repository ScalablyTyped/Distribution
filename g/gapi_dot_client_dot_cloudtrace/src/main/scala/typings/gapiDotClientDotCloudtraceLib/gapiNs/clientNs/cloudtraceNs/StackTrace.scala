package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTrace extends js.Object {
  /** Stack frames in this stack trace. A maximum of 128 frames are allowed. */
  var stackFrames: js.UndefOr[StackFrames] = js.undefined
  /**
    * The hash ID is used to conserve network bandwidth for duplicate
    * stack traces within a single trace.
    *
    * Often multiple spans will have identical stack traces.
    * The first occurrence of a stack trace should contain both the
    * `stackFrame` content and a value in `stackTraceHashId`.
    *
    * Subsequent spans within the same request can refer
    * to that stack trace by only setting `stackTraceHashId`.
    */
  var stackTraceHashId: js.UndefOr[java.lang.String] = js.undefined
}

object StackTrace {
  @scala.inline
  def apply(stackFrames: StackFrames = null, stackTraceHashId: java.lang.String = null): StackTrace = {
    val __obj = js.Dynamic.literal()
    if (stackFrames != null) __obj.updateDynamic("stackFrames")(stackFrames)
    if (stackTraceHashId != null) __obj.updateDynamic("stackTraceHashId")(stackTraceHashId)
    __obj.asInstanceOf[StackTrace]
  }
}

