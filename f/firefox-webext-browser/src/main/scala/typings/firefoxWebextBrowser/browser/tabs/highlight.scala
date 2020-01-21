package typings.firefoxWebextBrowser.browser.tabs

import typings.firefoxWebextBrowser.AnonPopulate
import typings.firefoxWebextBrowser.browser.windows.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.tabs.highlight")
@js.native
object highlight extends js.Object {
  /** Highlights the given tabs. */
  def apply(highlightInfo: AnonPopulate): js.Promise[Window] = js.native
}

