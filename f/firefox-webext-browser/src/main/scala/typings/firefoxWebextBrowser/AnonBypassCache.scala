package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBypassCache extends js.Object {
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}

object AnonBypassCache {
  @scala.inline
  def apply(bypassCache: js.UndefOr[Boolean] = js.undefined): AnonBypassCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassCache)) __obj.updateDynamic("bypassCache")(bypassCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBypassCache]
  }
}

