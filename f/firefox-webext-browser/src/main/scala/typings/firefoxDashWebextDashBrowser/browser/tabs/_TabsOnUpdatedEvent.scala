package typings.firefoxDashWebextDashBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _TabsOnUpdatedEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback): Unit = js.native
  def addListener(cb: TCallback, filter: UpdateFilter): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

