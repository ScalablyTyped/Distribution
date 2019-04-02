package typings
package firefoxDashWebextDashBrowserLib.browserNs.webNavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _WebNavigationOnHistoryStateUpdatedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback): scala.Unit = js.native
  def addListener(cb: TCallback, filters: EventUrlFilters): scala.Unit = js.native
  def hasListener(cb: TCallback): scala.Boolean = js.native
  def removeListener(cb: TCallback): scala.Unit = js.native
}

