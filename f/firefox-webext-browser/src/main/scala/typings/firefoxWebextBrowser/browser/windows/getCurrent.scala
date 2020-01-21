package typings.firefoxWebextBrowser.browser.windows

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.windows.getCurrent")
@js.native
object getCurrent extends js.Object {
  /** Gets the current window. */
  def apply(): js.Promise[Window] = js.native
  def apply(getInfo: GetInfo): js.Promise[Window] = js.native
}

