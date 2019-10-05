package typings.firefoxDashWebextDashBrowser.browser.devtools.panels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.devtools.panels.openResource")
@js.native
object openResource extends js.Object {
  /**
    * Requests DevTools to open a URL in a Developer Tools panel.
    * @param url The URL of the resource to open.
    * @param lineNumber Specifies the line number to scroll to when the resource is loaded.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(url: String, lineNumber: Double): js.Promise[Unit] = js.native
}

