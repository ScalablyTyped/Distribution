package typings.firefoxDashWebextDashBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.getBrowserInfo")
@js.native
object getBrowserInfo extends js.Object {
  /** Returns information about the current browser. */
  def apply(): js.Promise[BrowserInfo] = js.native
}

