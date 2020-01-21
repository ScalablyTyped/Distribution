package typings.firefoxWebextBrowser.browser.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.runtime.openOptionsPage")
@js.native
object openOptionsPage extends js.Object {
  /**
    * Open your Extension's options page, if possible.
    *
    * The precise behavior may depend on your manifest's `options_ui` or `options_page` key, or what the browser
    * happens to support at the time.
    *
    * If your Extension does not declare an options page, or the browser failed to create one for some other reason,
    * the callback will set `lastError`.
    */
  def apply(): js.Promise[Unit] = js.native
}

