package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.tabsNs.ZoomSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NewZoomFactor extends js.Object {
  var newZoomFactor: Double
  var oldZoomFactor: Double
  var tabId: Double
  var zoomSettings: ZoomSettings
}

object Anon_NewZoomFactor {
  @scala.inline
  def apply(newZoomFactor: Double, oldZoomFactor: Double, tabId: Double, zoomSettings: ZoomSettings): Anon_NewZoomFactor = {
    val __obj = js.Dynamic.literal(newZoomFactor = newZoomFactor, oldZoomFactor = oldZoomFactor, tabId = tabId, zoomSettings = zoomSettings)
  
    __obj.asInstanceOf[Anon_NewZoomFactor]
  }
}

