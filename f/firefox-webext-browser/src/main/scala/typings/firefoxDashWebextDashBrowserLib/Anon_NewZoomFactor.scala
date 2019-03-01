package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewZoomFactor extends js.Object {
  var newZoomFactor: scala.Double
  var oldZoomFactor: scala.Double
  var tabId: scala.Double
  var zoomSettings: firefoxDashWebextDashBrowserLib.browserNs.tabsNs.ZoomSettings
}

object Anon_NewZoomFactor {
  @scala.inline
  def apply(
    newZoomFactor: scala.Double,
    oldZoomFactor: scala.Double,
    tabId: scala.Double,
    zoomSettings: firefoxDashWebextDashBrowserLib.browserNs.tabsNs.ZoomSettings
  ): Anon_NewZoomFactor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newZoomFactor")(newZoomFactor)
    __obj.updateDynamic("oldZoomFactor")(oldZoomFactor)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("zoomSettings")(zoomSettings)
    __obj.asInstanceOf[Anon_NewZoomFactor]
  }
}

