package typings
package gapiDotClientDotCloudtasksLib.gapiNs.clientNs.cloudtasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullTaskTarget extends js.Object {
  /** Deprecated. Use PullMessage.payload. */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /** Deprecated. Use PullMessage.tag. */
  var tag: js.UndefOr[java.lang.String] = js.undefined
}

object PullTaskTarget {
  @scala.inline
  def apply(payload: java.lang.String = null, tag: java.lang.String = null): PullTaskTarget = {
    val __obj = js.Dynamic.literal()
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[PullTaskTarget]
  }
}

