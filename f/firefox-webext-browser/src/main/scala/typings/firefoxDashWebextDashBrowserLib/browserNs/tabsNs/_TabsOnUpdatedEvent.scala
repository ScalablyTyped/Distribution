package typings
package firefoxDashWebextDashBrowserLib.browserNs.tabsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _TabsOnUpdatedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback): scala.Unit = js.native
  def addListener(cb: TCallback, filter: UpdateFilter): scala.Unit = js.native
  def hasListener(cb: TCallback): scala.Boolean = js.native
  def removeListener(cb: TCallback): scala.Unit = js.native
}

