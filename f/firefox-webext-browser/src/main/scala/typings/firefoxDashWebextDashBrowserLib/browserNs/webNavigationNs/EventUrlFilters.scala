package typings
package firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventUrlFilters extends js.Object {
  var url: js.Array[firefoxDashWebextDashBrowserLib.browserNs.eventsNs.UrlFilter]
}

object EventUrlFilters {
  @scala.inline
  def apply(url: js.Array[firefoxDashWebextDashBrowserLib.browserNs.eventsNs.UrlFilter]): EventUrlFilters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[EventUrlFilters]
  }
}

