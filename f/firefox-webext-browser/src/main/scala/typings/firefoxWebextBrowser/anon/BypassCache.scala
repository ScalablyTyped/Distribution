package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BypassCache extends js.Object {
  /** Whether using any local cache. Default is false. */
  var bypassCache: js.UndefOr[Boolean] = js.undefined
}

object BypassCache {
  @scala.inline
  def apply(bypassCache: js.UndefOr[Boolean] = js.undefined): BypassCache = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bypassCache)) __obj.updateDynamic("bypassCache")(bypassCache.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BypassCache]
  }
}

