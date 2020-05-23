package typings.gapiClientCloudtrace.gapi.client.cloudtrace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrames extends js.Object {
  /**
    * The number of stack frames that were dropped because there
    * were too many stack frames.
    * If this value is 0, then no stack frames were dropped.
    */
  var droppedFramesCount: js.UndefOr[Double] = js.undefined
  /** Stack frames in this call stack. */
  var frame: js.UndefOr[js.Array[StackFrame]] = js.undefined
}

object StackFrames {
  @scala.inline
  def apply(droppedFramesCount: js.UndefOr[Double] = js.undefined, frame: js.Array[StackFrame] = null): StackFrames = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(droppedFramesCount)) __obj.updateDynamic("droppedFramesCount")(droppedFramesCount.get.asInstanceOf[js.Any])
    if (frame != null) __obj.updateDynamic("frame")(frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackFrames]
  }
}

