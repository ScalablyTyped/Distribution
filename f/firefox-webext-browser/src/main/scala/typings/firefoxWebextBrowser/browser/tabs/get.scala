package typings.firefoxWebextBrowser.browser.tabs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.get")
@js.native
object get extends js.Object {
  /* tabs functions */
  /** Retrieves details about the specified tab. */
  def apply(tabId: Double): js.Promise[Tab] = js.native
}

