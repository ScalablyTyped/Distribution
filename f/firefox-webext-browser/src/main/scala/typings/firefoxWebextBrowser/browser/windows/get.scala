package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.get")
@js.native
object get extends js.Object {
  /* windows functions */
  /** Gets details about a window. */
  def apply(windowId: Double): js.Promise[Window] = js.native
  def apply(windowId: Double, getInfo: GetInfo): js.Promise[Window] = js.native
}

