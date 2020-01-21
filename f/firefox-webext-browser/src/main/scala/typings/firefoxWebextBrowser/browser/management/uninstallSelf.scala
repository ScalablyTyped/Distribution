package typings.firefoxWebextBrowser.browser.management

import typings.firefoxWebextBrowser.AnonDialogMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.management.uninstallSelf")
@js.native
object uninstallSelf extends js.Object {
  /**
    * Uninstalls the calling extension. Note: This function can be used without requesting the 'management' permission
    * in the manifest.
    */
  def apply(): js.Promise[Unit] = js.native
  def apply(options: AnonDialogMessage): js.Promise[Unit] = js.native
}

