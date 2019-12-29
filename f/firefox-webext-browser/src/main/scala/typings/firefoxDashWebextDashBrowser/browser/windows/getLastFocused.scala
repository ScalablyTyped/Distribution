package typings.firefoxDashWebextDashBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.getLastFocused")
@js.native
object getLastFocused extends js.Object {
  /** Gets the window that was most recently focused — typically the window 'on top'. */
  def apply(): js.Promise[Window] = js.native
  def apply(getInfo: GetInfo): js.Promise[Window] = js.native
}

