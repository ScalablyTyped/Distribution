package typings.extjs.ExtNs.resizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBorderSplitter extends ISplitter

object IBorderSplitter {
  @scala.inline
  def apply(ISplitter: ISplitter = null, collapseTarget: js.Any = null, getTrackerConfig: () => Unit = null): IBorderSplitter = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ISplitter)
    if (collapseTarget != null) __obj.updateDynamic("collapseTarget")(collapseTarget)
    if (getTrackerConfig != null) __obj.updateDynamic("getTrackerConfig")(js.Any.fromFunction0(getTrackerConfig))
    __obj.asInstanceOf[IBorderSplitter]
  }
}

