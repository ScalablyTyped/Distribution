package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkEventStat extends js.Object {
  /** The number of times this event occurred. */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /** Link event. */
  var event: js.UndefOr[java.lang.String] = js.undefined
  /** Requested platform. */
  var platform: js.UndefOr[java.lang.String] = js.undefined
}

object DynamicLinkEventStat {
  @scala.inline
  def apply(count: java.lang.String = null, event: java.lang.String = null, platform: java.lang.String = null): DynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (event != null) __obj.updateDynamic("event")(event)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[DynamicLinkEventStat]
  }
}

