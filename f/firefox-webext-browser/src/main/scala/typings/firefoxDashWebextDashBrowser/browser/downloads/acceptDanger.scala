package typings.firefoxDashWebextDashBrowser.browser.downloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.downloads.acceptDanger")
@js.native
object acceptDanger extends js.Object {
  /**
    * Prompt the user to either accept or cancel a dangerous download. `acceptDanger()` does not automatically accept
    * dangerous downloads.
    * @deprecated Unsupported on Firefox at this time.
    */
  def apply(downloadId: Double): js.Promise[Unit] = js.native
}

