package typings.googleapis.buildSrcApisFirebasedynamiclinksV1Mod.firebasedynamiclinks_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic Link event stat.
  */
@js.native
trait Schema$DynamicLinkEventStat extends js.Object {
  /**
    * The number of times this event occurred.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Link event.
    */
  var event: js.UndefOr[String] = js.native
  /**
    * Requested platform.
    */
  var platform: js.UndefOr[String] = js.native
}

object Schema$DynamicLinkEventStat {
  @scala.inline
  def apply(count: String = null, event: String = null, platform: String = null): Schema$DynamicLinkEventStat = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DynamicLinkEventStat]
  }
}

