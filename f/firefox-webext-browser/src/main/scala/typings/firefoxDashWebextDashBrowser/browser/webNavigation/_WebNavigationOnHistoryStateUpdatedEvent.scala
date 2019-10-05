package typings.firefoxDashWebextDashBrowser.browser.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebNavigationOnHistoryStateUpdatedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback): Unit = js.native
  def addListener(cb: TCallback, filters: EventUrlFilters): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

