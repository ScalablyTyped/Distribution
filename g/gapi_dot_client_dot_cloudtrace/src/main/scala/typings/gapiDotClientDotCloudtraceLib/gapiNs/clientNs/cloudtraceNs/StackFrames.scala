package typings
package gapiDotClientDotCloudtraceLib.gapiNs.clientNs.cloudtraceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StackFrames extends js.Object {
  /**
               * The number of stack frames that were dropped because there
               * were too many stack frames.
               * If this value is 0, then no stack frames were dropped.
               */
  var droppedFramesCount: js.UndefOr[scala.Double] = js.undefined
  /** Stack frames in this call stack. */
  var frame: js.UndefOr[js.Array[StackFrame]] = js.undefined
}

