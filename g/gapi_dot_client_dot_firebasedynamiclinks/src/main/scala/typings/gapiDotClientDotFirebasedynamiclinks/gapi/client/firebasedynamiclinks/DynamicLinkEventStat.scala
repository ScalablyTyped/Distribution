package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicLinkEventStat extends js.Object {
  /** The number of times this event occurred. */
  var count: js.UndefOr[String] = js.undefined
  /** Link event. */
  var event: js.UndefOr[String] = js.undefined
  /** Requested platform. */
  var platform: js.UndefOr[String] = js.undefined
}

object DynamicLinkEventStat {
  @scala.inline
  def apply(count: String = null, event: String = null, platform: String = null): DynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (event != null) __obj.updateDynamic("event")(event)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[DynamicLinkEventStat]
  }
}

